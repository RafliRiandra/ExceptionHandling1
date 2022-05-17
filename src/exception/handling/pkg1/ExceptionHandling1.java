/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package exception.handling.pkg1;

/**
 *
 * @author HP
 */
public class ExceptionHandling1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner console =new Scanner(System.in);
        
        System.out.println("Enter value for C");
        
        //Exception handling
        try{
        int c = console.nextInt();
        int res=c/0;
            System.out.println("the result is"+res);
        }
        catch(Exception exception_message){
            System.out.println("Adalah= "+exception_message);
}
    }