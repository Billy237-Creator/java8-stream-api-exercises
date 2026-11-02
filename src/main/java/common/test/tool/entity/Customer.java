package common.test.tool.entity;

import java.util.List;


public class Customer {

    private String name;
    private Integer age;
    private Integer budget;
    private List<Item> wantToBuy;


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }


    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }


    public Integer getBudget() {
        return budget;
    }

    public void setBudget(Integer budget) {
        this.budget = budget;
    }


    public List<Item> getWantToBuy() {
        return wantToBuy;
    }

    public void setWantToBuy(List<Item> wantToBuy) {
        this.wantToBuy = wantToBuy;
    }

    @Override
    public String toString() {
        return "Customer{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", budget=" + budget +
                ", wantToBuy=" + wantToBuy +
                '}';
    }
}
