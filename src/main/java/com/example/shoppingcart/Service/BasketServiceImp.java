package com.example.shoppingcart.Service;

import com.example.shoppingcart.item.Item;
import org.springframework.stereotype.Service;
import org.springframework.web.context.annotation.SessionScope;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
@Service
@SessionScope
public class BasketServiceImp implements BasketService {

    private final List<Item> items;

    public BasketServiceImp() {
        this.items = new ArrayList<>();
    }
    @Override
    public Item add(Integer item) {
        items.add(new Item(item));
        return null;
    }

    @Override
    public Collection<Item> get() {
        return Collections.unmodifiableCollection(items);

    }

}
