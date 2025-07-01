

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
import java.util.Scanner;
import java.util.Random;
import java.util.Arrays;
public class Main {
    public static void main(String[] args) {
        //welcome statement   ✅
        //user choice (loop)  ✅
        //computer choice (loop)  ✅
        //if-else evaluation (loop)  ✅
        //won/lose statement (loop)  ✅
        //ask user to play (loop)  ✅
        //closing statement  ✅

        String user;
        String computer;
        String[] say={"ROCK","PAPER","SCISSORS"};

        String choice="yes";

        Random random=new Random();
        Scanner scanner=new Scanner(System.in);

        System.out.println("WELCOME TO YOUR FUN GAME");


        do{

            System.out.println("ENTER YOUR CHOICE(ROCK,PAPER,SCISSORS): ");
            user=scanner.nextLine().toUpperCase();

            System.out.println("COMPUTER CHOICE: ");
            computer=say[random.nextInt(3)];
            System.out.println(computer);

            if(user.equals("SCISSORS") && computer.equals("PAPER") || user.equals("PAPER") && computer.equals("ROCK") || user.equals("ROCK") && computer.equals("SCISSORS") ){
                System.out.println("You Win!🏆");

            }
            else if(user.equals(computer)) {
                System.out.println("Its a Tie!❌");
            }
//            else if(  user!=("ROCK") || user!="PAPER" || user!="SCISSORS"){
//
//                System.out.println("INVALID CHOICE TRY AGAIN!");
//            }

            else if(  !user.equals("ROCK") && !user.equals("PAPER") && !user.equals("SCISSORS")){

                System.out.println("INVALID CHOICE TRY AGAIN!");
            }
            else{
                System.out.println("You Lose!🏳️");
            }

            System.out.println("WOULD YOU LIKE TO PLAY AGAIN ? (YES/NO)");
            choice=scanner.nextLine().toUpperCase();


            if(!choice.equals("YES")){

                System.out.println("THANKYOU FOR PLAYING");
                break;
            }

        }while(choice.equals("YES"));



        scanner.close();






    }
}