/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package facadepattern;
import java.io.*;
/**
 *
 * @author hp
 */
public class FacadePattern {
private static int  choice;
   
    public static void main(String args[])throws NumberFormatException,IOException {
        
        do{       
            System.out.print("========= Mobile Shop ============ \n");  
            System.out.print("            1. IPHONE.              \n");  
            System.out.print("            2. SAMSUNG.              \n");  
            System.out.print("            3. BLACKBERRY.            \n");  
            System.out.print("            4. Exit.                     \n");  
            System.out.print("Enter your choice: ");  
              
            BufferedReader br=new BufferedReader(new InputStreamReader(System.in));  
            choice=Integer.parseInt(br.readLine());  
            ShopKeeper sk=new ShopKeeper();  
              
            switch (choice) {  
            case 1:  
                {   
                  sk.iphoneSale();  
                    }  
                break;  
       case 2:  
                {  
                  sk.samsungSale();        
                    }  
                break;    
       case 3:  
                           {  
                           sk.blackberrySale();       
                           }  
                   break;     
            default:  
            {    
                System.out.println(" You purchased Nothing.");  
            }         
                return;  
            }  
              
      }while(choice!=4);  
   }  
        
    }
    

