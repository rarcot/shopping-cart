package com.sapient.controller;

import com.sapient.com.sapient.service.CartService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Created by rarcot on 8/10/2016.
 */

@Controller
public class CartController {

    @Autowired
    private CartService cartService;

    @RequestMapping(value="/cart/add/{catId}/{productId}")
    public HttpEntity<? extends Object> addProductToCart(@PathVariable(value = "catId") String catId,@PathVariable(value = "productId") String productId){
       try{
           return new ResponseEntity<String>(cartService.getCategoryProductDetails(catId,productId), HttpStatus.OK);
       }catch (Exception ex){
           return new HttpEntity<>(HttpStatus.INTERNAL_SERVER_ERROR);
       }
    }
}
