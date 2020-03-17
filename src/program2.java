import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.Scanner;

/*
You are to write a java program that prompts the user for the name of an input file.
The file is to be opened and read from line by line.
As each line is read in, the program will display the individual tokens it finds in the line to the screen.
Tokens are items in text that are separated by whitespace.
BETH ALLEN OOMMENT   i am changing it

 */
public class program2
{
    public static void main(String[] args)
    {
        //name of input file entered
        String filename = "";

        //scanner for use with keyboard text
        Scanner keyBoard = new Scanner(System.in);

        //scanner to pull text from a file
        Scanner inFile = null;

        //scanner to attach to each line
        Scanner LineToParse = null;

        //line counter
        int count = 0;

        System.out.println("Enter the filename with your student data: ");

        filename = keyBoard.next();

        try
        {
            inFile = new Scanner(new FileReader(filename));
        }
        catch(FileNotFoundException fe)
        {
            System.out.println("The file" + filename + " could not be opened.");
            System.out.println("Exiting program.");
            System.exit(0);
        }

        System.out.println("File opened successfully");

        while (inFile.hasNext())
        {
            count++;

            //print it
            System.out.println("Line " + count + " contains these tokens:");

            //get the next line and attach a scanner to it
            LineToParse = new Scanner(inFile.nextLine());

            //as long as there is another token in the lin e
            while (LineToParse.hasNext())
            {
                //grab it and print it
                System.out.println("    " + LineToParse.next());
            }
            System.out.println();
        }

        inFile.close();
        System.out.println("\nNo more data.");
    }
}
