package common.test.tool.entity;

import java.util.List;


public class Shop {

    private String name;
    private List<Item> itemList;


    public String getName() {

        return name;
    }

    public void setName(String name) {
        this.name = name;
    }


    public List<Item> getItemList() {
        return itemList;
    }

    public void setItemList(List<Item> itemList) {
        this.itemList = itemList;
    }

    @Override
    public String toString() {
        return "Shop{" +
                "name='" + name + '\'' +
                ", itemList=" + itemList +
                '}';
    }
}
