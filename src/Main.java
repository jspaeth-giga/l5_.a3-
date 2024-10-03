import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        //variable + scanner
        Scanner scan = new Scanner(System.in);
        String politicsParty;

        //code
        System.out.println("what is your party?");
        politicsParty = scan.nextLine();

        if (politicsParty.equalsIgnoreCase("Democratic")) {
            System.out.println("you get a democratc donkey!");
        }else if ((politicsParty.equalsIgnoreCase("Republican"))) {
            System.out.println("you get Republican Elepahnt!");
        }else{
            System.out.println("You get a Independent Human!");
            }
        }
    }