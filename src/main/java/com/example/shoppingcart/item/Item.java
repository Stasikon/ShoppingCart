package com.example.shoppingcart.item;

public class Item {
    private final Integer item;

    public Item(Integer item) {
        this.item = item;
    }

    public Integer getItem() {
        return item;
    }
    @Override
    public String toString() {
        return "Item{" +
                "item=" + item +
                '}';
    }
}
