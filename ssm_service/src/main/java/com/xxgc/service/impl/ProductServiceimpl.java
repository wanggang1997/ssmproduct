package com.xxgc.service.impl;

import com.xxgc.mapper.ProductMapper;
import com.xxgc.pojo.Product;
import com.xxgc.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Author:chen
 * Date:2020-10-10-16:18
 * Description:<描述>
 */
@Service
public class ProductServiceimpl implements ProductService {

    @Autowired
    private ProductMapper productMapper;

    @Override
    public List<Product> findall() {
        return productMapper.selectAll();
    }
}
