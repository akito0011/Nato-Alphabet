import java.util.Scanner;
import java.io.*;

import javax.print.attribute.standard.MediaSize.NA;
public class TestNato{
    public static void main(String[] args) throws IOException, InterruptedException{

        Scanner scan = new Scanner(System.in);
        String text="";
        String solution ="";

        new ProcessBuilder("cmd", "/c", "cls").inheritIO().start().waitFor();
        System.out.println("Welcome to Nato alphabet training program, press 1 to start the test");
        int check = scan.nextInt() ;
        new ProcessBuilder("cmd", "/c", "cls").inheritIO().start().waitFor();

        while(check!=0){

            switch(check){
                
                case 1:

                text = getInput("Write the text in the international alphabet:");
                solution = getInput("Write your translation in Nato alphabet:");

                if(NatoConverter.checkTranslation(text,solution)){
                    System.out.println("correct!");
                    System.out.println("To do an other test click 1\n To end the program click 0");
                    check =scan.nextInt();
                    new ProcessBuilder("cmd", "/c", "cls").inheritIO().start().waitFor();

                }else{
                    System.out.println("wrong answer, do you want displayed the corret translation? Click 2!\n To do an other test click 1\n To end the program click 0");
                    check = scan.nextInt();
                    if(check==2){
                        new ProcessBuilder("cmd", "/c", "cls").inheritIO().start().waitFor();
                        System.out.println("The corret translation is: "+NatoConverter.toNato(text));
                        System.out.println("To do an other test click 1\n To end the program click 0");
                        check = scan.nextInt();
                        new ProcessBuilder("cmd", "/c", "cls").inheritIO().start().waitFor();
                    }
                }
                break;

                case 0:
                    check =0;
                    new ProcessBuilder("cmd", "/c", "cls").inheritIO().start().waitFor();
                    break;

                default:
                    new ProcessBuilder("cmd", "/c", "cls").inheritIO().start().waitFor();
                    System.out.println("Insert a valid option!");
                    check = scan.nextInt();
                    break;
            }
        }

    }
    private static String getInput(String prompt){
        BufferedReader stdin = new BufferedReader(new InputStreamReader(System.in));

        System.out.print(prompt);
        System.out.flush();

        try{
            return stdin.readLine();
        } catch (Exception e){
            return "Error: " + e.getMessage();
        }
    }
}

