package com.qualizeal.interfacePrototype;

import com.qualizeal.interfaceOperation.Laptop;
import com.qualizeal.interfaceOperation.Tv;

public class App  {
    public static void main( String[] args) {
        Tv tv = new Tv();
        
        System.out.println(tv.name);
        System.out.println(tv.Brandname);
        System.out.println(tv.size);
        System.out.println(tv.displayType);
        System.out.println(tv.price);
        tv.Watch();
        tv.Entertain();
        
        Laptop laptop = new Laptop();
        
        System.out.println(laptop.name);
        System.out.println(laptop.Brandname);
        System.out.println(laptop.size);
        System.out.println(laptop.screenType);
        System.out.println(laptop.ram);
        System.out.println(laptop.rom);
        System.out.println(laptop.price);
        laptop.operate();
        laptop.programming();
        
        
    }
}
