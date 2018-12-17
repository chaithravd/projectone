public class Exenum {
    enum Directions {NORTH, SOUTH, EAST, WEST}

    enum Mobile {
        APPLE, SAMSUNG, HTC;

    Mobile(){                         // constructor inside a enum is allowed
            System.out.println("constructor called:" + this.toString());
    }

    }

    public static void main(String[] args){
       /* simple demonstration of enum
        Directions d = Directions.EAST;
        System.out.println(d);
        */

       Directions d = Directions.SOUTH;
       //Mobile m = Mobile.APPLE;\
        Mobile arr[] = Mobile.values();               // values() method inside the Enum class presents the  values inside enum

        for(Mobile mobile : arr)
        {
            System.out.println(mobile +" at index"+mobile.ordinal());   // ordinal a method inside the Enum class finds the index
        }

        System.out.println(Mobile.valueOf("APPLE"));  // valueOf() one of the methods present inside the Enum class returns the specified string value

        switch (d)
       {
           case NORTH:
               System.out.println("the direction is north");
               break;

           case EAST:
               System.out.println("the direction is east");
               break;

           case WEST:
               System.out.println("the direction is west");
               break;

           case SOUTH:
               System.out.println("the direction is south");
               break;
       }
    }
}
