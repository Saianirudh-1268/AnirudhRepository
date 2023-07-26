package com.qualizeal.gettersetter;
import com.qualizeal.gettersetter.program.Mobile;
public class App {
    public static void main( String[] args ){
    	Mobile mobile = new Mobile();

        mobile.setBrandname("Realme Narzo 60 Pro 5G");
        mobile.setRam(12);
        mobile.setRom(1);
        mobile.setDisplay("120Hz 6.8inches Curved Vision Display");
        mobile.setCamara(100);
        mobile.setProcessor("MediaTek Dimensity 7050 5G");
        
        System.out.println("Brand Name: "+ mobile.getBrandname());
        System.out.println("RAM Size: "+ mobile.getRam()+"GB");
        System.out.println("ROM Size: "+ mobile.getRom()+"TB");
        System.out.println("Display size: "+ mobile.getDisplay());
        System.out.println("Camara: "+ mobile.getCamara()+"MP");
        System.out.println("Processor Name: "+ mobile.getProcessor());
        
    }
}
