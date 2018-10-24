/*
 * Karl Butler
 * 24/10/2018
 * for Mr.Kaune
 */

package powwers;
import java.util.Scanner;
/**
 *
 * @author kabut2496
 */
public class Powwers {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       Scanner keyedInput = new Scanner(System.in);
       //declaring the variables 
        int choose,num,num2,power;
      do{
        System.out.println("pleas enter your number");
        num=keyedInput.nextInt();
        num2=num;
        
        System.out.println("select 1 if you want to square your number press 2 to cube your number\n and press 3 to select the power on your number Press 4 to exit program");
        
        choose = keyedInput.nextInt();
       //squaring the variable
        if(choose==1){
           for(int i=0; i <2-1;i++){
               num=num*num2;
           }
            System.out.println("your number squard is "+num);
        }
     //cubeing the variable
        if (choose==2){
          for(int i=0; i <3-1;i++){
               num=num*num2;
           }
         System.out.println("your number cubed is "+num);
     }
    //alowing the user to choose the power and the number used
        if (choose==3){
         System.out.println("pleas enter power you would like to use");
         power=keyedInput.nextInt();
    for(int i =0 ;i <power-1; i++){
                
        num=num*num2;           
    }
    System.out.println(num);
     }
        //exiting the program
        }while(choose!=4);
     }
}
