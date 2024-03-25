package com.dev.explorer.restful;

public class Store {

    private String item;
    public Store(String item) {
        this.item=item;
    }

    public String getItem() {
        return item;
    }

    public void setItem(String item) {
        this.item = item;
    }

    @Override
    public String toString() {
        return "items["+item+"]";
    }
}
