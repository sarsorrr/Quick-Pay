/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.mavenproject46;
import java.util.Scanner;
public class Mavenproject46 {
static String adminUserName="admin";
static String adminPassword="00000000";
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
      while(true){
        System.out.println("===========QUICK PAY==========");
        System.out.println("Welcome to Quick Pay Wallet!");
        System.out.println("1:Login as Customer");
        System.out.println("2:Login as Admin");
        System.out.println("3:Exit");
        System.out.println("_:Enter your choice");
        int choice,accountchoice;
        String username;
        choice=input.nextInt();
        switch(choice){
           case 1:
               System.out.println("=====CUSTOMER LOGIN=====");
               System.out.println("1:login");
               System.out.println("2:Create Account");
               System.out.println("3:Back to Main Menu");
        accountchoice=input.nextInt();
             switch(accountchoice)  {
                 case 1:
                     System.out.println("Enter username:");
                     username=input.next();
                     System.out.println("Enter your password:");
                     String password =input.next();
                     break;
                 case 2:
                     System.out.println("Choose a username");
                     username=input.next();
                     System.out.println("Creat a password");
                     String newpassword=input.next();
                     System.out.println("Confirm password:");
                     String confirmpassword=input.next();
                     if(newpassword.equals(confirmpassword)){
                         System.out.println("Account created successfully!!");
                     }else{
                         System.out.println("Password do not match!!!");
                     }
             }
       break;
           case 2:
               System.out.println("=====ADMIN LOGIN=====");
               System.out.println("Enter Admin username:");
               String adminusername=input.next();
               System.out.println("Enter Admin password:");
               String adminpassword=input.next();
               while(!adminusername.equals(adminUserName)||!adminpassword.equals(adminPassword)){
                   System.out.println("Wrong username or password!");
                   System.out.println("Enter 0 to return to Main Menu");
                   System.out.println("Enter 1 to try again");
                   int retry=input.nextInt();
                   if(retry==0){
                   break;
                   }else if(retry==1){
                       System.out.println("Enter Admin username:");
                       adminusername=input.next();
                       System.out.println("Enter admin password:");
                       adminpassword=input.next();
                   }else{
                       System.out.println("INVALID CHOICE!!!");
                   }
               }
               if(adminusername.equals(adminUserName)&&adminpassword.equals(adminPassword)){
                   System.out.println("Admin login Successful!");
                   System.out.println("-------------------------------");
                   int adminchoices;
                   do{
                   System.out.println("1:Manage Users\n2:View All Transactions\n3:Block/Unblock Accounts\n4:View Statistics\n5:Logout");
                       System.out.println("Enter your choice:");
                       adminchoices=input.nextInt();
                       switch(adminchoices){
                           case 1:
                              int userchoice;
                               System.out.println("====MANAGE USERS====");
                               System.out.println("1:View users");
                               System.out.println("2:Back to admin menu");
                               System.out.println("Enter your choice:");
                               userchoice=input.nextInt();
                               break;
                           case 2:
                               System.out.println("View All Transactions");
                               break;
                           case 3:
                               System.out.println("Block/Unblock Accounts");
                               break;
                           case 4:
                               System.out.println("View All Statistics");
                               break;
                           case 5:
                               System.out.println("Logging out");
                               break;
                           default:
                               System.out.println("INVALID CHOICE!!!");
                       
                       }
                       
                   }while(adminchoices!=5);
               }
              
               
               
               
               break;
           case 3:
               System.out.println("Goodbye!!");
               break;
           default:
               System.out.println("INVALID CHOICE!!");
       }
        }
    }
}
