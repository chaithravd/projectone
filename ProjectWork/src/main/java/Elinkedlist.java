import java.util.Iterator;
import java.util.LinkedList;

public class Elinkedlist {
    public static void main(String[] args){
        LinkedList <String> fruits = new LinkedList<String>();

        // adding items to the list
        fruits.add("Apple");
        fruits.add("Banana");
        fruits.add("Grapes");
        fruits.add("Orange");
        fruits.add(3,"Pineapple");
        fruits.addFirst("Watermelon");
        fruits.addLast("Mango");
        fruits.add("Apple");

        System.out.println("Linked list items:" +fruits);

        Object ele = fruits.contains("Pista");
        System.out.println("Finding the element:" +ele );
//---------------------------------------------------------------------------------
        //updating or editing the list
        fruits.set(2,"banana");
        System.out.println("Editing the list:" +fruits);

//----------------------------------------------------------------------------------

        // Finding the size of the list
        int size = fruits.size();
        System.out.println("The size of the list is:" +size);

//----------------------------------------------------------------------------------

        // getting the elements present in the index mentioned
         Object element = fruits.get(3);
         System.out.println("The element in the index:" +element);

//----------------------------------------------------------------------------------
        // iterating the list in the reverse order

        Iterator i = fruits.listIterator();
        while (i.hasNext()){
            System.out.println( i.next());
        }
//----------------------------------------------------------------------------------

        // removing the elements from the list
        fruits.remove("Banana");
        fruits.removeFirst();
        fruits.removeLast();
        fruits.remove(2);

        System.out.println("List items after remove operation:" +fruits);

        // removing all the elements from the list
        fruits.clear();

        System.out.println("Removing all the elements:" +fruits);


    }
}
