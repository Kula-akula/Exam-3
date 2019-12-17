package com.company.Task_4;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Task_4 {
    public static void main(String[] args) {
        ArrayList<Book> list=new ArrayList<>();
        Book book=new Book(1965);
        Random random=new Random();
        list.add(book);
        for (int i=0;i<50;i++){
            list.add(new Book(random.nextInt(2020-1900+1)+1900));

        }
        System.out.println(list);
//        for (Book l:list){
//            l.getProduct()
//        }
        for (int i=1;i<=list.size();i++){
            int temp;
            if (list.get(i).getProduct()<list.get(i-1).getProduct()){
                temp=list.indexOf(i);

//                list.get(temp)=list.get(i).setID();
            }

        }
    }
}
class Book{
    private int product;
    private int price;
    private String ID;

    public Book(int product) {
        this.product = product;
    }

    public int getProduct() {
        return product;
    }

    public void setProduct(int product) {
        this.product = product;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public String getID() {
        return ID;
    }

    public void setID(String ID) {
        this.ID = ID;
    }

    @Override
    public String toString() {
        return "\nBook{" +
                "product=" + product +
                '}';
    }
}