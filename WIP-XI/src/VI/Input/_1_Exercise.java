/*
 * WIP XI Computer Programing 
 */

package VI.Input;

/**
 *
 * @author sittiwatlcp
 */

import java.util.Scanner;


public class _1_Exercise {
    public static void main(String[] args) {
         Scanner sc = new Scanner(System.in);
         
         int เงินพ่อ;
         int เงินแม่;
         
        System.out.print("เงินพ่อ");

        เงินพ่อ = sc.nextInt();
        
        System.out.print("เงินแม่");

        เงินแม่ = sc.nextInt();
        
       
               
        System.out.println("รวมเงินทั้งหมด" + (เงินพ่อ+เงินแม่));
        
        
    }
}
