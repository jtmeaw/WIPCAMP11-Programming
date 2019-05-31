/*
 * WIP XI Computer Programing 
 */
package XI.Project;

import java.util.Scanner;

/**
 *
 * @author sittiwatlcp
 */
public class WIPCargo {

    public static void main(String[] args) {
        int item = 5;
        int limit = 10;
        int menu;
        System.out.println("item" + item);
        System.out.println("limit" + limit);

        Scanner sc = new Scanner(System.in);
        System.out.println("1.Add");
        System.out.println("2.Remove");
        System.out.println("3.Check");
        System.out.println("Input number :");

        menu = sc.nextInt();
        if (menu == 1) {
            System.out.println("Add menu");
            System.out.println("Please add amount");
            System.out.println("Input number :");
            int amount = sc.nextInt();
            if (item < limit) {
                System.out.println("item" + (item + amount));
            } else {
                if (item + amount > limit) {
                    System.out.println("item" + item);
                    System.out.println("limit" + limit);
                }
            }
        }
            if (menu == 2) {
                System.out.println("Remove");
                System.out.println("Please Remove");
                System.out.println("Input number :");
                int remove = sc.nextInt();
                if (item < 0) {
                    System.out.println("ไม่มีของ");
                } else {
                    if (item - remove < limit) {
                        System.out.println("item" + (item-remove));
                        System.out.println("limit" + limit);
                    }
                }
            }
                if (menu == 3) {
                    System.out.println("item" + item);
                    System.out.println("limit" + limit);

                }
                if(menu != 1 || menu!=2 ||menu!=3){
                    System.out.println("ผิดจ้า");
                }
                
            }
    
        }
    

