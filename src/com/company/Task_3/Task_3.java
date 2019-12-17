package com.company.Task_3;

import com.company.Task_3.Enums.Ploskoe;
import com.company.Task_3.Enums.Tsilindricheskoe;
import com.company.Task_3.Interfaces.Kruglie;
import com.company.Task_3.Interfaces.Ploskie;
import com.company.Task_3.Interfaces.Tsilindricheskie;
import com.company.Task_3.Enums.Krugloe;

import java.util.ArrayList;

public class Task_3 {
    public static void main(String[] args) {
        Ball [] balls=new Ball[50];
        Ball[]balls3=new Ball[3];
        Apple[]apples1=new Apple[20];
        Apple[]apples2=new Apple[10];
        Cola[] cola1={new Cola(true)};
        Cola[] cola2={new Cola(false)};
        BottleOfWater[] water={new BottleOfWater(true)};
        Papka[] papka1={new Papka()};
        Papka[] papka2={new Papka()};
        Book[] book={new Book()};
        ArrayList<Object> bags1=new ArrayList<>();
        ArrayList<Object> bags2=new ArrayList<>();
        ArrayList<Object> bags3=new ArrayList<>();
        bags1.add(apples1);
        bags1.add(book);
        bags1.add(cola1);
        bags2.add(balls);
        bags2.add(papka1);
        bags2.add(water);
        bags3.add(apples2);
        bags3.add(balls3);
        bags3.add(papka2);
        bags3.add(cola2);
    }
}
class Bag implements Ploskie, Tsilindricheskie, Kruglie {
    Ploskie[] ploskie;
    Tsilindricheskie[] tsilindricheskie;
    Kruglie[] kruglie;


    public Bag() {
    }


    public Bag(Ploskie[] ploskie, Tsilindricheskie[] tsilindricheskie, Kruglie[] kruglie) {
        this.ploskie = ploskie;
        this.tsilindricheskie = tsilindricheskie;
        this.kruglie = kruglie;
    }

    public Ploskie[] getPloskie() {
        return ploskie;
    }

    public void setPloskie(Ploskie[] ploskie) {
        this.ploskie = ploskie;
    }

    public Tsilindricheskie[] getTsilindricheskie() {
        return tsilindricheskie;
    }

    public void setTsilindricheskie(Tsilindricheskie[] tsilindricheskie) {
        this.tsilindricheskie = tsilindricheskie;
    }

    public Kruglie[] getKruglie() {
        return kruglie;
    }

    public void setKruglie(Kruglie[] kruglie) {
        this.kruglie = kruglie;
    }

    @Override
    public String toString() {
        return "Bag{" +
                "ploskie=" + ploskie +
                ", tsilindricheskie=" + tsilindricheskie +
                ", kruglie=" + kruglie +
                '}';
    }
}
class Apple implements Kruglie{
    String color;

    public Apple(String color) {
        this.color = color;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }
}
class Ball implements Kruglie{
    boolean withAir;

    public Ball(boolean withAir) {
        this.withAir = withAir;
    }

    public boolean isWithAir() {
        return withAir;
    }

    public void setWithAir(boolean withAir) {
        this.withAir = withAir;
    }
}
class BottleOfWater implements Tsilindricheskie{
    boolean haveWater;

    public BottleOfWater(boolean haveWater) {
        this.haveWater = haveWater;
    }

    public boolean isHaveWater() {
        return haveWater;
    }

    public void setHaveWater(boolean haveWater) {
        this.haveWater = haveWater;
    }
}
class Cola implements Tsilindricheskie{
    boolean haveCola;

    public Cola(boolean haveCola) {
        this.haveCola = haveCola;
    }

    public boolean isHaveCola() {
        return haveCola;
    }

    public void setHaveCola(boolean haveCola) {
        this.haveCola = haveCola;
    }
}
class Book implements Ploskie{

}
class Papka implements Ploskie{

}