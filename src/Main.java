import java.util.Scanner;

public class Main
{
    public static void main(String[] args)
    {
        String partyAfil = "";
        Scanner console = new Scanner(System.in);

        System.out.print("Enter your Party Affiliation[D,R,I]: ");
        partyAfil = console.nextLine();

        if (partyAfil.equalsIgnoreCase("R"))
        {
            System.out.println("You get a Rupublican Elephant!");
        }
        else if (partyAfil.equalsIgnoreCase("D"))
        {
            System.out.println("You get a Democratic Donkey!");
        }
        else if (partyAfil.equalsIgnoreCase("I"))
        {
            System.out.println("You get an Independant man!");
        }
        else
        {
            System.out.println("I dont know what party you belong to!");
        }


    }
}