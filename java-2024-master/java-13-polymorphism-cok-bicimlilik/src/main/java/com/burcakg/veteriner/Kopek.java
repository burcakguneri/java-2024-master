package com.burcakg.veteriner;

import com.burcakg.base.Hayvan;

public class Kopek extends Hayvan {


    public Kopek() {
        super();
        System.out.println("Kopek");
    }


    @Override
    public void sesVer(){
        System.out.println("Kopek : hav hav");
    }


}
