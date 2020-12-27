package com.imooc.sell;

import com.imooc.dataobject.ProductCategory;
import com.imooc.service.impl.CategoryServiceImpl;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.stereotype.Service;
import org.springframework.test.context.junit4.SpringRunner;

import javax.annotation.Resource;
import java.util.Arrays;
import java.util.List;


@RunWith(SpringRunner.class)
@SpringBootTest
public class CategoryServiceImplTest {

    @Autowired
    private CategoryServiceImpl categoryService;

    @Test
    public void findOne() {

        ProductCategory one = categoryService.findOne(2);
        System.out.println(one);
    }

    @Test
    public void findAll() {
        List<ProductCategory> all = categoryService.findAll();
        for (ProductCategory productCategory : all) {
            System.out.println(productCategory);
        }
    }

    @Test
    public void findByCategoryTypeIn() {
        List<Integer> type = Arrays.asList(3,6,9);
        List<ProductCategory> byCategoryTypeIn = categoryService.findByCategoryTypeIn(type);
        for (ProductCategory productCategory : byCategoryTypeIn) {
            System.out.println(productCategory);
        }
    }

    @Test
    public void save() {
        ProductCategory productCategory = new ProductCategory("品牌", 8);
        categoryService.save(productCategory);
    }
}