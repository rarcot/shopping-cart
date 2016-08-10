package com.sapient.com.sapient.service;

import com.sapient.domain.Product;
import org.springframework.stereotype.Service;

/**
 * Created by rarcot on 8/10/2016.
 */
@Service
public interface CartService {

    public String getCategoryProductDetails(String categoryId, String productId) throws Exception;
}
