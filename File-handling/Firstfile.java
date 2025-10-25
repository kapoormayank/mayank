import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;
public class Firstfile{
    public static void main(String[] args) {

        //Create a new File
        
        try 
        {
            File firstfile = new File("pokemon.txt");
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
        FileWriter filewriter = new FileWriter("pokemon.txt");
        filewriter.write("Pikachu\n");
        filewriter.write("Charizard\n");
        filewriter.write("Grey Ninja\n");
        filewriter.write("Lucario\n");
        filewriter.write("Sceptile\n");
        filewriter.write("Venusur\n");
        filewriter.write("Garchomp\n");
        filewriter.write("Gyaradus\n");
        filewriter.write("Meta gross\n");
        filewriter.write("Goodra\n");
        filewriter.write("Talon Flame");
        filewriter.close();
        }
        catch(IOException e)
        {
            System.out.println("Error");
        }

        //Read the file
        System.out.println();

        try{
            File firstobj = new File("pokemon.txt");
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
        File Firstfile = new File("pokemon.txt");
        if(Firstfile.exists())
        {
            System.out.println("Name of file : "+Firstfile.getName());
            System.out.println("Location of flie is : "+Firstfile.getAbsolutePath());
            System.out.println("Writeable : "+Firstfile.canWrite());
            System.out.println("Readable : "+Firstfile.canRead());
            System.out.println("File sizes in bytes : "+Firstfile.length());
        }
        else{
            System.out.println("File cannot found");
        }
    }
}



