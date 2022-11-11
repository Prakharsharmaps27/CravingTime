package com.prakharsharma.cravingtime.models;

public class ordermodel {
    int orderimage ;
    String foodname, ordernumber, foodprice , personname , quantityy ;

    public ordermodel() {
        this.orderimage = orderimage;
        this.foodname = foodname;
        this.ordernumber = ordernumber;
        this.foodprice = foodprice;
        this.personname = personname;
        this.quantityy = quantityy;
    }

    public String getQuantityy() {
        return quantityy;
    }

    public void setQuantityy(String quantityy) {
        this.quantityy = quantityy;
    }

    public String getPersonname() {
        return personname;
    }

    public void setPersonname(String personname) {
        this.personname = personname;
    }

    public int getOrderimage() {
        return orderimage;
    }

    public void setOrderimage(int orderimage) {
        this.orderimage = orderimage;
    }

    public String getFoodname() {
        return foodname;
    }

    public void setFoodname(String foodname) {
        this.foodname = foodname;
    }

    public String getOrdernumber() {
        return ordernumber;
    }

    public void setOrdernumber(String ordernumber) {
        this.ordernumber = ordernumber;
    }

    public String getFoodprice() {
        return foodprice;
    }

    public void setFoodprice(String foodprice) {
        this.foodprice = foodprice;
    }
}
