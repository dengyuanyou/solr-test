package com.atguigu.mapper;

import com.atguigu.domain.KeywordsSku;
import com.atguigu.domain.ObjectSku;
import com.atguigu.domain.Product;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface ProductMapper {

    int deleteByPrimaryKey(Integer id);

    int insert(Product product);

    Product selectByPrimaryKey(Integer id);

    List<Product> selectAll();

    int updateByPrimaryKey(Product product);

    List<Product> findByBrandIdAndClassTwoId(@Param("brandId") Integer brandId, @Param("classTwoId") Integer classTwoId);

    void save(Product product);

    List<ObjectSku> findObjectSkuByClassTwoId(Integer classTwoId);

    List<KeywordsSku> findKeywordsSkuByClassTwoId(Integer classTwoId);
}