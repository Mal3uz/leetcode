/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package solution9;

/**
 *
 * @author DELL
 */
public class Solution9 {
     public static boolean isPalindrome(int x) {
          if(x < 0){
         return false;
        }else{
            int a = x;
            int check = 0;
            int remain ;
            while(a > 0){
                 remain = a % 10;
                 a = a /10;
                 check = (check * 10) + remain;
                  System.out.println(check);

            }
            
            if(check == x){
               
               return true ;
            }else{
                
                return false ;
            }
    
        }
    }
     
     
     public static void main(String[] args) {
        System.out.println(isPalindrome(11));
    }
}
