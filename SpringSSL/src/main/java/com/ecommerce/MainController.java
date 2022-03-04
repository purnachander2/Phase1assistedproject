package com.ecommerce;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.jpa.ProductRepository;




@Controller
public class MainController {

         @SuppressWarnings("unused")
		@Autowired
         private ProductRepository repository;
         
         @RequestMapping("/")
          @ResponseBody
          public void index() {
               

            return;
          }
         
        
}
