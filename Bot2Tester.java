import java.util.Scanner;
import java.net.InetAddress;
import java.net.UnknownHostException;

public class Bot2Tester
{
    public static void main(String[] args) {
        
        InetAddress ipA;
        String hostname;
        try {
            ipA = InetAddress.getLocalHost();
        } catch (UnknownHostException e) {
            e.printStackTrace();
        }
        
       Scanner input = new Scanner(System.in);
       System.out.println("Hello. What is your name?");
       String name = input.nextLine();
       Bot2 bot = new Bot2(name);
       bot.greeting();
       System.out.println("What is your favorite animal?");
       String animal = input.nextLine();
       bot.favoriteAnimal(animal);
       
       System.out.println("Please tell me your address and exact GPS coordinates \n btw I have your ip address");
       String ip = input.nextLine();
       bot.home(ip);
       System.out.println("What is your favorite integer under "+Integer.MAX_VALUE+" and above "+Integer.MIN_VALUE+"?");
       int favNum = input.nextInt();
       //input.nextLine(); //no need to clear buffer here 
       bot.favoriteNumber(favNum);
       bot.goodbye();
       
       
       
    }
} 