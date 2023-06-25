package com.example.shoppingcart.Service;

import com.example.shoppingcart.item.Item;

import java.util.Collection;

public interface BasketService {
    Item add(Integer item);

    Collection<Item> get();
}
