package com.example.shoppingcart.Controller;


import com.example.shoppingcart.Service.BasketService;
import com.example.shoppingcart.item.Item;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.Collection;

@RestController
@RequestMapping("/order")
public class BasketController {
    private final BasketService service;


    public BasketController(BasketService service) {
        this.service = service;
    }

    @RequestMapping("/add")
    public Item addItem(@RequestParam Integer item) {
        return service.add(item);
    }

    @RequestMapping("/get")
    public Collection<Item> getItem() {
        return service.get();
    }
}
