package com.sysc4806.project.controller;

import com.google.gson.Gson;
import com.sysc4806.project.Product;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

/**
 * Controller for handling application index and error endpoints
 */
@Controller
public class IndexController {

    @Autowired
    JdbcTemplate template;

    /**
     * @return The Application index template html
     */
    @GetMapping("/")
    public String index()
    {
        return "index";
    }

    @GetMapping(value = "/data", produces = "application/json")
    @ResponseBody
    public String data(){
        List<Product> products = template.query("SELECT * FROM product", new BeanPropertyRowMapper<>(Product.class));
        Gson gson = new Gson();
        return gson.toJson(products);
    }
}