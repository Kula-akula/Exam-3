package com.company.Task_5;

import java.util.ArrayList;
import java.util.List;

public class Task_5 {
    public static void main(String[] args) {

    }
}
abstract class Clothes{
    private ArrayList<Zvenyashee> leviyKarman;
    private ArrayList<Bumajnoe> praviyKarman;

    public Clothes(ArrayList<Zvenyashee> leviyKarman, ArrayList<Bumajnoe> praviyKarman) {
        this.leviyKarman = leviyKarman;
        this.praviyKarman = praviyKarman;
    }

    public ArrayList<Zvenyashee> getLeviyKarman() {
        return leviyKarman;
    }

    public void setLeviyKarman(ArrayList<Zvenyashee> leviyKarman) {
        this.leviyKarman = leviyKarman;
    }

    public ArrayList<Bumajnoe> getPraviyKarman() {
        return praviyKarman;
    }

    public void setPraviyKarman(ArrayList<Bumajnoe> praviyKarman) {
        this.praviyKarman = praviyKarman;
    }
}
interface Zvenyashee{

}
interface Bumajnoe{

}