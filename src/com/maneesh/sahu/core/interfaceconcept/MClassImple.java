package com.maneesh.sahu.core.interfaceconcept;

/**
 * Created by gw74 on 7/18/2015.
 */
public class MClassImple  implements MInterface {


    @Override
    public void print() {
        System.out.println("welcome to pring method");
    }

    @Override
    public void show() {
        System.out.println("welcome to show method");
    }
}
