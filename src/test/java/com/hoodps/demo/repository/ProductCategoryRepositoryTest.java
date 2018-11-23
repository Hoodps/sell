package com.hoodps.demo.repository;

import com.hoodps.demo.dataobject.ProductCategory;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.transaction.annotation.Transactional;

import java.util.Arrays;
import java.util.List;

import static org.junit.Assert.*;

@RunWith(SpringRunner.class)
@SpringBootTest
public class ProductCategoryRepositoryTest {

    @Autowired
    private ProductCategoryRepository productCategoryRepository;

    @Test
    public void findOneTest(){
        ProductCategory productCategory = productCategoryRepository.findById(1).orElse(null);
        System.out.println(productCategory.toString());
    }

    @Test
    @Transactional // 测试通过但是不会新增测试数据
    public void saveTest(){
        ProductCategory productCategory = new ProductCategory("热门1", 3);
        ProductCategory result = productCategoryRepository.save(productCategory);
        Assert.assertNotNull(result);
    }

    @Test
    public void findByCategoryTypeInTest() {
        List<Integer> list = Arrays.asList(1,3);

        List<ProductCategory> result = productCategoryRepository.findByCategoryTypeIn(list);
        Assert.assertNotEquals(0, result.size());
    }

    @Test
    public void updateTest(){
        ProductCategory productCategory = new ProductCategory();
        productCategory.setCategoryId(2);
        productCategory.setCategoryName("tt3");
        productCategory.setCategoryType(3);
        productCategoryRepository.save(productCategory);
    }

}