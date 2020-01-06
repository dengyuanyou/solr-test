package com.atguigu.test;

import com.atguigu.domain.KeywordsSku;
import com.atguigu.factory.MySqlSessionFactory;
import com.atguigu.mapper.ProductMapper;
import com.atguigu.util.MyPropertyUtil;
import org.apache.ibatis.session.SqlSession;
import org.apache.solr.client.solrj.SolrQuery;
import org.apache.solr.client.solrj.impl.HttpSolrServer;
import org.apache.solr.client.solrj.impl.XMLResponseParser;
import org.apache.solr.client.solrj.response.QueryResponse;

import java.util.List;


public class Test {

    public static void main(String[] args) throws Exception {

        SqlSession sqlSession = MySqlSessionFactory.getSqlSession();
        ProductMapper productMapper = sqlSession.getMapper(ProductMapper.class);
        List<KeywordsSku> list_keys = productMapper.findKeywordsSkuByClassTwoId(28);
        for (KeywordsSku key:list_keys){
            System.out.println(key.getSkuName()+":"+key.getProductImage());
        }

        //向solr中导入数据
        HttpSolrServer solrServer = new HttpSolrServer(MyPropertyUtil.getProperty("solr.properties", "solr_sku1018"));
        solrServer.setParser(new XMLResponseParser());
        solrServer.addBeans(list_keys);
        solrServer.commit();

        System.out.println("------------------------------------");
        //创建查询器
        SolrQuery solrQuery = new SolrQuery();
        //设置搜索的条件
        solrQuery.setQuery("sku_name:*");
        //搜索行数
        solrQuery.setRows(50);

        QueryResponse queryResponse = solrServer.query(solrQuery);
        //将查询的结果转化成对象
        List<KeywordsSku> beans = queryResponse.getBeans(KeywordsSku.class);
        System.out.println(beans);

    }
}
