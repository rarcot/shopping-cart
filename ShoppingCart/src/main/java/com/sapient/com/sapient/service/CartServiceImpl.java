package com.sapient.com.sapient.service;

import com.sapient.domain.Category;
import com.sapient.domain.Product;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.client.RestTemplate;

/**
 * Created by rarcot on 8/10/2016.
 */
public class CartServiceImpl implements CartService {

    private String DEFAULT_LOCAL_CATEGORY_SERVICE = "http://localhost:8080/category/";

    @Autowired
    private RestTemplate restTemplate;

    @Override
    public String getCategoryProductDetails(String categoryId, String productId) throws Exception {
        String product = null;
        if(categoryId!=null && productId!=null){
            String productUri = DEFAULT_LOCAL_CATEGORY_SERVICE + productId;
             product = restTemplate.getForObject(productUri, String.class);
        }
        return product;
    }
}
