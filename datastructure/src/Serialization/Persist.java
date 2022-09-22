package Serialization;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class Persist {
    public static void main(String[] args) throws IOException {
     Student   std = new Student(1,"trilochan");
        FileOutputStream fout=new FileOutputStream("f.txt");
        ObjectOutputStream out=new ObjectOutputStream(fout);
        out.writeObject(std);
        out.flush();
        out.close();
        System.out.println("done");

    }
}
