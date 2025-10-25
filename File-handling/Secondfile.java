import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;
public class Secondfile{
    public static void main(String[] args) {

        //Create a new File
        
        try 
        {
            File firstfile = new File("Beyblade.txt");
            if(firstfile.createNewFile())
            {
                System.out.println("Sucessfully new file creat");
            }
            else
            {
                System.out.println("file already exist");
            }
        } 
        catch (IOException e) {
            System.out.println("Error");
        }

        //Write the file

        try{
        FileWriter filewriter = new FileWriter("Beyblade.txt");
        filewriter.write("Max has power of Draciel\n");
        filewriter.write("Ray has power of White Tiger\n");
        filewriter.write("Tyson  has power of Dragoon\n");
        filewriter.write("Kia has power of Dranzar");
        filewriter.close();
        }
        catch(IOException e)
        {
            System.out.println("Error");
        }

        //Read the file
        System.out.println();

        try{
            File firstobj = new File("Beyblade.txt");
            Scanner sc = new Scanner(firstobj);
            while (sc.hasNextLine()) { 
                String str = sc.nextLine();
                System.out.println(str);
            }
        }
        catch(FileNotFoundException e)
        {
            System.out.println("File has not found");
        }

        //File information 

        System.out.println();
        File Secondfile = new File("Beyblade.txt");
        if(Secondfile.exists())
        {
            System.out.println("Name of file : "+Secondfile.getName());
            System.out.println("Location of flie is : "+Secondfile.getAbsolutePath());
            System.out.println("Writeable : "+Secondfile.canWrite());
            System.out.println("Readable : "+Secondfile.canRead());
            System.out.println("File sizes in bytes : "+Secondfile.length());
        }
        else{
            System.out.println("File cannot found");
        }
    }
}


