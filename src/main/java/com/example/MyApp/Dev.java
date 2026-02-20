package com.example.MyApp;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component // spring understands that this is the class it needs to manage.
public class Dev {

    /*@Autowired //field injection
    private Laptop laptop;*/

 /*   public Dev(Laptop laptop) {
        this.laptop = laptop;
    } Constructor injection*/

/*    @Autowired
    public void setLaptop(Laptop laptop) {
        this.laptop = laptop;
    }*/


    @Autowired
//    @Qualifier("laptop")
    private Computer comp;

    public void build() {
//        laptop.compile();
        comp.compile();
        System.out.println("Working on a Dev project.");
    }
}