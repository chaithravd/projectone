import java.io.BufferedWriter;
import java.io.FileWriter;

public class Ewritefile {

    /*----------------------------------------------------------------------------
    This is using the BufferedWriter Class

    public static void main(String[] args) throws Exception{
        String str = "\n 1st line is gone";

        BufferedWriter bw = new BufferedWriter(new FileWriter("/home/chaithra/writingfile.txt",true)); //true should be mentioned only if appending
        //bw.write(str);
        // to append text to the existing file
        // note: to append the text after the filename mentioned true should be specified

        bw.append(' ');
        bw.append(str);
        bw.close();

    }
    */

    public static void main(String[] args) throws Exception{
        FileWriter fw = new FileWriter("/home/chaithra/writingfile.txt", true);
        fw.write("\n Writing through the filewriter class");
        fw.append(' ');
        fw.close();
    }
}
