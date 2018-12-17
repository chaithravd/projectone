package p1;

import p1.Mobile;

public class Ecall {

    public static void main(String[] args){

        Mobile m = Mobile.APPLE;
        Mobile arr[] = Mobile.values();               // values() method inside the Enum class presents the  values inside enum

        for(Mobile mobile : arr)
        {
            System.out.println(mobile +" at index"+mobile.ordinal());   // ordinal a method inside the Enum class finds the index
        }

        System.out.println(Mobile.valueOf("APPLE"));  // valueOf() one of the methods present inside the Enum class returns the specified string value

    }
}
