package com.company;

public class oop {
    public static void main(String[] args) {
        student suyash  = new student();
        System.out.println(suyash.fullName);
        car toyota = new car();
        System.out.println(toyota.isElectric);
    }

}
class student {
    String fullName;
    int rollNo;
    float percentage;
    boolean isTop10;

    student (){
        this.fullName = "suyash panthi";
        this.rollNo =23;
        this.percentage =92.4f;
        this.isTop10 = true;
    }
}
class car {
    String fullName;
    int modelNo;
    float mileage;
    boolean isElectric;

    car (){
        this.fullName = "toyota camry";
        this.modelNo =345;
        this.mileage =32.4f;
        this.isElectric = false;
    }




}


