import java.io.*;
import java.util.Scanner;

public class Ereadfile {
//-------------------------------------------------------------------------------------
    /*  this is using BufferedReader class


    public static void main(String[] args) throws Exception{
    File file = new File("/home/chaithra/marks.txt");

    BufferedReader br = new BufferedReader(new FileReader(file));

    String st;
    while ((st=br.readLine()) != null)
        System.out.println(st);

    }
----------------------------------------------------------------------------------------*/


    /* This is using FileReader class
       read character by character


    public static void main(String[] args) throws Exception{
        FileReader fr = new FileReader("/home/chaithra/marks.txt");
        int i;
        while ((i = fr.read()) != -1)
            System.out.println((char) i);

    }
------------------------------------------------------------------------------------------*/


    public static void main(String[] args) throws Exception{
        File file = new File("/home/chaithra/marks.txt");
        Scanner sc = new Scanner(file);

        while(sc.hasNextLine())
            System.out.println(sc.nextLine());
    }
}

