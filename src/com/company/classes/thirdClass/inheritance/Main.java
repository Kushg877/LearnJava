package com.company.classes.thirdClass.inheritance;

public class Main {
    public static void main(String[] args) {
//        Box box = new Box(2);
//        System.out.println(box.l + " " + box.h + " " + box.w);
//
//        BoxWeight box2 = new BoxWeight(2,3);
//        System.out.println(box2.l + " " + box2.weight);// here we cannot use l for child class if l is private
//        // because l is the element of parent class i.e. Box
//
//        BoxWeight box3 = new BoxWeight(2,3);

//        A m=new a();
//        System.out.println(m.name());

        Box box4 = new BoxWeight();
//        System.out.println(box4.l); //----> Here we cannot access weight variable because
//        box4 is the type of reference variable i.e. Box and not the type of object i.e. BoxWeight
//        that determines what members can be accessed
//        i.e. you will have access to only those parts which are defined in super class which BOX.

//        BoxWeight box5 = new Box(2,3,4); //-----> while above statement is correct this wrong
//        reason:
//        there are many variables in both parent and child class
//        you are given access to variables that are in the ref type i.e. BoxWeight
//        hence, you should have access to weight variable
//        this also means, that the ones you are trying to access should be initialized
//        but here, when the obj itself is of type parent class, how will you call the constructor of child class
        BoxPrice box6 = new BoxPrice(1,2,3,4,5); //-----> If you want to know everything about super keyword then debug this statement
        System.out.println(box6.h);

        BoxPrice box7 = new BoxPrice(box6);
        System.out.println(box7.h); // -----> This print statement and above print statement will print same thing.

        Box box9=new BoxWeight(2,3,4,5);
//        System.out.println(box9.l);
//        BoxWeight box10=new Box();
        
    }
}
