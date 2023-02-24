/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */

/**
 *
 * @author brand
 */
import java.util.Scanner;
import midtermexam_versiona_extensioncode.UserProfile;

public class TestUserProfile {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String name;
        String genre;
        System.out.println("Enter your name: ");
        
        name = input.next();
        System.out.println("Enter your favourite genre: ");
        genre = input.next();
        System.out.println("Your Profile was created");
        UserProfile User1 = new UserProfile(name, genre);
        System.out.println(User1);
    }
    
}
