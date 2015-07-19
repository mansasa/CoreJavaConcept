package com.maneesh.sahu.core.interfaceconcept;

/**
 * Created by gw74 on 7/18/2015.
 */

class Hello implements A,B
{
    public static void main(String arg[])
    {

      // System.out.println(x); // reference to x is ambiguous both variables are x
        System.out.println(A.x);
        System.out.println(B.x);
        System.out.println(B.z);

    }
}

interface A
{
    int x=10;
}
interface B
{
    int x=100;
    int z=200;
}