import java.util.Scanner;
public class team20FinalProject{
    //Main Variables and arrays
    static Scanner input = new Scanner (System.in);
    // static Object NormalUsersAccounts[][] = {{1000,2000,3000},{"Acount1" , "Acount2" , "Acount3"},{"email1@test.com","email2@test.com","email3@test.com"},
    // {"01000","012000","015000"},{4000,10000,5000},{true,false,true}};
    static String NormalUsersAccounts_ID[] = new String [100];
    static String NormalUsersAccounts_Name[] = new String [100];
    static String NormalUsersAccounts_Email[] = new String [100];
    static String NormalUsersAccounts_PhoneNumber[] = new String [100];
    static double NormalUsersAccounts_Balance[] = new double[100];
    static Boolean NormalUsersAccounts_Status[] = new Boolean[100];
    static String NormalUsersPasswords[] = new String[100];

    //Some registered users to test our program
    static {
        NormalUsersAccounts_ID[0] = "101010";
        NormalUsersAccounts_Name[0] = "Acount1";
        NormalUsersAccounts_Email[0] = "email1@test.com";
        NormalUsersAccounts_PhoneNumber[0] = "01234567890";
        NormalUsersAccounts_Balance[0] = 4000;
        NormalUsersAccounts_Status[0] = true;
        NormalUsersPasswords[0] = "user1Pass";
    }
    static {
        NormalUsersAccounts_ID[1] = "202020";
        NormalUsersAccounts_Name[1] = "Acount2";
        NormalUsersAccounts_Email[1] = "email2@test.com";
        NormalUsersAccounts_PhoneNumber[1] = "01134567890";
        NormalUsersAccounts_Balance[1] = 10000;
        NormalUsersAccounts_Status[1] = true;
        NormalUsersPasswords[1] = "user2Pass";
    }
    static {
        NormalUsersAccounts_ID[2] = "303030";
        NormalUsersAccounts_Name[2] = "Acount3";
        NormalUsersAccounts_Email[2] = "email3@test.com";
        NormalUsersAccounts_PhoneNumber[2] = "01534567890";
        NormalUsersAccounts_Balance[2] = 6000;
        NormalUsersAccounts_Status[2] = false;
        NormalUsersPasswords[2] = "user3Pass";
    }
    static int UsersCount = 3;

    //Admin accounts
    static String adminUserName = "admin";
    static String adminPassword = "00000000";



    // inputs for user methods
    static String ID;
    static String Name;
    static String Email;
    static String PhoneNumber;
    static String Email2;
    static String PhoneNumber2;
    static double transmoney;
    static double finalBalance_User;
    static double finalBalance_Deciever;
    static int choice;





    //Admin methods

            // Used to Print all some statistics of the program it works woth for loop
    static void showStatistics(){   
        int NumberOfUsers = UsersCount;     
        int NumberOfActiveUsers = 0;
        for (int i = 0; i < UsersCount; i++) {
            if(NormalUsersAccounts_Status[i] == true){
                NumberOfActiveUsers++;
            }
        }
        int NumberOfBlockedUsers = UsersCount - NumberOfActiveUsers;
        // !!!! Stilll Neeeds to be donee !!!!!
        // Money transaction part !!!!

        System.out.println("\n====Program stastics=====");
        System.out.println("Total number of registered users : " + NumberOfUsers + "\nNumber of Active users : " + NumberOfActiveUsers + "\nNumber of blocked accounts : " + NumberOfBlockedUsers + "\n");
    }

    static void searchUser(String NormalUsersAccounts_ID[] ,String NormalUsersAccounts_Name[] , String NormalUsersAccounts_Email[] , String NormalUsersAccounts_PhoneNumber[]){
        System.out.print("\nHow you want to search ? (1.By ID  2. By Full Name  3.By Phone number  4.By Email Adress)");
        int SearchAdminChoice = input.nextInt();
        
        switch (SearchAdminChoice) {
            case 1:
                System.out.println("Enter user ID : ");
                String id = input.next();
                boolean check = false;
                for (int i = 0; i < UsersCount; i++) {
                    if (NormalUsersAccounts_ID[i].equals(id)){
                        System.out.println("\nSearch Result : Account found");
                        System.out.println("\n=====Acount details=====");
                        System.out.println("\nName : " + NormalUsersAccounts_Name[i] + "\nUser ID : "+ NormalUsersAccounts_ID[i] +  "\nEmail : " + NormalUsersAccounts_Email[i] + "\nPhone Number : " + NormalUsersAccounts_PhoneNumber[i]);
                        check = true;
                    }
                }
                if(check == false){
                    System.out.println("\nSearch Result : User Not Found\n");
                }
                break;
            case 2:
                System.out.print("Enter Full Name : ");
                String name = input.next();
                check = false;
                for (int i = 0; i < UsersCount; i++) {
                    if (NormalUsersAccounts_Name[i].equals(name)){
                        System.out.println("\n=====Acount details=====");
                        System.out.println("\nName : " + NormalUsersAccounts_Name[i] + "\nUser ID : "+ NormalUsersAccounts_ID[i] +  "\nEmail : " + NormalUsersAccounts_Email[i] + "\nPhone Number : " + NormalUsersAccounts_PhoneNumber[i]);
                        check = true;
                    }
                }
                if(check == false){
                    System.out.println("\nSearch Result : User Not Found\n");
                }
                break;
            case 3:
                System.out.print("Enter Phone Number : ");
                String pnumber = input.next();
                check = false;
                for (int i = 0; i < UsersCount; i++) {
                    if (NormalUsersAccounts_PhoneNumber[i].equals(pnumber)){
                        System.out.println("\n=====Acount details=====");
                        System.out.println("\nName : " + NormalUsersAccounts_Name[i] + "\nUser ID : "+ NormalUsersAccounts_ID[i] +  "\nEmail : " + NormalUsersAccounts_Email[i] + "\nPhone Number : " + NormalUsersAccounts_PhoneNumber[i]);
                        check = true;
                    }
                }
                if(check == false){
                    System.out.println("\nSearch Result : User Not Found\n");
                }
                break;
            case 4:
                System.out.print("Enter Email : ");
                String email = input.next();
                check = false;
                for (int i = 0; i < UsersCount; i++) {
                    if (NormalUsersAccounts_Email[i].equals(email)){
                        System.out.println("\n=====Acount details=====");
                        System.out.println("\nName : " + NormalUsersAccounts_Name[i] + "\nUser ID : "+ NormalUsersAccounts_ID[i] +  "\nEmail : " + NormalUsersAccounts_Email[i] + "\nPhone Number : " + NormalUsersAccounts_PhoneNumber[i]);
                        check = true;
                    }
                }
                if(check == false){
                    System.out.println("\nSearch Result : User Not Found\n");
                }
                break;
            default:
                System.out.println("Invalid choice");
                break;
                
        }

    }

    static void viewAllUsers(){
        System.out.println("\n=====All Users=====\n");
        for (int i = 0; i < UsersCount; i++) {
            System.out.println("User number " + (i + 1));
            System.out.println("\nUser ID : " + NormalUsersAccounts_ID[i] + "\nName : " + NormalUsersAccounts_Name[i] + "\nEmail : " + NormalUsersAccounts_Email[i] + "\nPhone Number : " + NormalUsersAccounts_PhoneNumber[i] + "\nCurrunt Balance : " + NormalUsersAccounts_Balance[i] + "\nAccount is active : " + NormalUsersAccounts_Status[i]);
            System.out.println("");
        }
    }

    static void updateUser(){
        System.out.println("\n====Update users (Admin only)====");
        System.out.print("Enter user ID : ");
        String AdminUserID_Input = input.next();
        int indexOfUserToUpdate = -1;
        boolean updateUserCheck = false;
        for (int i = 0; i < UsersCount; i++) {
            if(AdminUserID_Input.equals(NormalUsersAccounts_ID[i])){
                indexOfUserToUpdate = i;
                updateUserCheck = true;
            }
        }
        if (updateUserCheck == true){
            System.out.print("Choose what you want to update (1.Full Name , 2.Email address , 3.Phone number)");
            int choice = input.nextInt();
            switch (choice){
                case(1):
                    System.out.println("Update the name of user " + NormalUsersAccounts_ID[indexOfUserToUpdate] + "\n");
                    System.out.print("Enter the new name : ");
                    boolean checkForName = true;
                    String name = input.next();
                    for (int i = 0; i < UsersCount; i++) {
                        if(NormalUsersAccounts_Name[i].equals(name)){
                            checkForName = false;
                            break;
                        }
                    }
                    if (checkForName == true){
                    NormalUsersAccounts_Name[indexOfUserToUpdate] = name;
                    System.out.println("====User details after edit====");
                    System.out.println("\nUser ID : " + NormalUsersAccounts_ID[indexOfUserToUpdate] + "\nName : " + NormalUsersAccounts_Name[indexOfUserToUpdate] + "\nEmail : " + NormalUsersAccounts_Email[indexOfUserToUpdate] + "\nPhone Number : " + NormalUsersAccounts_PhoneNumber[indexOfUserToUpdate] + "\nCurrunt Balance : " + NormalUsersAccounts_Balance[indexOfUserToUpdate] + "\nAccount is active : " + NormalUsersAccounts_Status[indexOfUserToUpdate] + "\n");
                    }else{
                        System.out.println("This Name is already used");
                    }
                    break;

                case(2):
                    System.out.println("Update the Email of user : " + NormalUsersAccounts_ID[indexOfUserToUpdate]);
                    System.out.println("Enter the new email : ");
                    String input_email = input.next();
                    boolean checkForEmail = true;
                    for (int i = 0; i < UsersCount; i++) {
                        if(NormalUsersAccounts_Email[i].equals(input_email) || !input_email.contains("@") || !input_email.contains(".")){
                            checkForEmail = false;
                            break;
                        }
                    }
                    if (checkForEmail == true){
                        NormalUsersAccounts_Email[indexOfUserToUpdate] = input_email;
                        System.out.println("====User details after edit====");
                        System.out.println("\nUser ID : " + NormalUsersAccounts_ID[indexOfUserToUpdate] + "\nName : " + NormalUsersAccounts_Name[indexOfUserToUpdate] + "\nEmail : " + NormalUsersAccounts_Email[indexOfUserToUpdate] + "\nPhone Number : " + NormalUsersAccounts_PhoneNumber[indexOfUserToUpdate] + "\nCurrunt Balance : " + NormalUsersAccounts_Balance[indexOfUserToUpdate] + "\nAccount is active : " + NormalUsersAccounts_Status[indexOfUserToUpdate] + "\n");
                    }else{
                        System.out.println("Invalid Email , Email Should be not used before and should contain '@' and domain");
                    }
                    break;

                case(3):
                    System.out.println("Update the Phone Number of user : " + NormalUsersAccounts_ID[indexOfUserToUpdate]);
                    System.out.println("Enter the new phone number : ");
                    String Input_PhoneNumber = input.next();
                    boolean PhoneNumberCheck = true;
                    for (int i = 0; i < UsersCount; i++) {
                        if(NormalUsersAccounts_PhoneNumber[i].equals(Input_PhoneNumber) || Input_PhoneNumber.length() != 11){
                            PhoneNumberCheck = false;
                            break;
                        }
                    }
                    if(PhoneNumberCheck == true){
                        NormalUsersAccounts_PhoneNumber[indexOfUserToUpdate] = Input_PhoneNumber;
                        System.out.println("====User details after edit====");
                        System.out.println("\nUser ID : " + NormalUsersAccounts_ID[indexOfUserToUpdate] + "\nName : " + NormalUsersAccounts_Name[indexOfUserToUpdate] + "\nEmail : " + NormalUsersAccounts_Email[indexOfUserToUpdate] + "\nPhone Number : " + NormalUsersAccounts_PhoneNumber[indexOfUserToUpdate] + "\nCurrunt Balance : " + NormalUsersAccounts_Balance[indexOfUserToUpdate] + "\nAccount is active : " + NormalUsersAccounts_Status[indexOfUserToUpdate] + "\n");
                    }else{
                        System.out.println("Invalid Phone Number , Phone Number must be 11 numbers and must not be already used");
                    }
                    break;
                default:
                    System.out.println("Invalid Choice");
                    break;
            }

        }else{
            System.out.println("\nUser not found\n");
        }

    }


    static void blockAccount() {
        System.out.println("\n====Block Account (Admin only)====");
        System.out.println("Enter the User ID of the account : ");
        String id = input.next();
        int indexOfUSerToBlock = -1;
        boolean check = false;
        for (int i = 0; i < UsersCount; i++) {
            if(id.equals(NormalUsersAccounts_ID[i])){
                indexOfUSerToBlock = i;
                NormalUsersAccounts_Status[i] = false;
                check = true;
            }
        }
        if(check == true){
            System.out.println("\nUser : " + NormalUsersAccounts_ID[indexOfUSerToBlock] + " Blocked succussfully.\n");
        }else{
            System.out.println("User not found");
        }
    }
    
    static void unblockAccount(){
        System.out.println("\n====Unblock account(Admin only)====");
        System.out.println("Enter the User ID of the account you want to unblock : ");
        String id = input.next();
        boolean check = false;
        int indexOfUSerToUnBlock = -1;
        for (int i = 0; i < UsersCount; i++) {
            if(id.equals(NormalUsersAccounts_ID[i])){
                indexOfUSerToUnBlock = i;
                NormalUsersAccounts_Status[i] = true;
                check = true;
            }
        }
        if(check == true){
            System.out.println("\nUser : " + NormalUsersAccounts_ID[indexOfUSerToUnBlock] + " UnBlocked succussfully.\n");
        }else{
            System.out.println("User not found");
        }
    }

    static void viewUserDetails(){
        System.out.println("\n====View User (Admin only)=====");
        System.out.println("Enter the User ID : ");
        String id = input.next();
        int indexOfUserToSee = -1;
        boolean check = false;
        for (int i = 0; i < UsersCount; i++) {
            if (id.equals(NormalUsersAccounts_ID[i])){
                indexOfUserToSee = i;
                check = true;
            }
        }
        if (check == true){
            System.out.println("\nUser ID : " + NormalUsersAccounts_ID[indexOfUserToSee] + "\nName : " + NormalUsersAccounts_Name[indexOfUserToSee] + "\nEmail : " + NormalUsersAccounts_Email[indexOfUserToSee] + "\nPhone Number : " + NormalUsersAccounts_PhoneNumber[indexOfUserToSee] + "\nCurrunt Balance : " + NormalUsersAccounts_Balance[indexOfUserToSee] + "\nAccount is active : " + NormalUsersAccounts_Status[indexOfUserToSee] + "\n");
        }else{
            System.out.println("\nUser not found");
        }
    }



    
    // User methods 

    
    // User Method 9 Update Profile
    // THe method takes the index of the user as a parameter and allows the user to update either email, name or phone number
    //THe method also validates the info before saving
        static void updateProfile(int UserIndexForMethods){
            System.out.println("====Proflle update=====");
            System.out.print("Choose what you want to update (1.Full name  2.Phone Number  3.Email Address)");
            int UserCoiceForUpdate = input.nextInt();
            
            switch (UserCoiceForUpdate) {
                case (1):
                    System.out.print("Enter the New Name : ");
                    String NameUserInput;
                    input.nextLine();
                    NameUserInput = input.nextLine();
                    boolean NameUpdateCheckUser = true;
                    for (int i = 0; i < UsersCount; i++) {
                        if(NameUserInput.equals(NormalUsersAccounts_Name[UserIndexForMethods])){
                            NameUpdateCheckUser = false;
                            break;
                        }
                    }
                    if( NameUpdateCheckUser == true){
                        NormalUsersAccounts_Name[UserIndexForMethods] = NameUserInput;
                        System.out.println("--Name updated succussfully--");
                        System.out.println("\n====User details after edit====");
                        System.out.println("\nUser ID : " + NormalUsersAccounts_ID[UserIndexForMethods] + "\nName : " + NormalUsersAccounts_Name[UserIndexForMethods] + "\nEmail : " + NormalUsersAccounts_Email[UserIndexForMethods] + "\nPhone Number : " + NormalUsersAccounts_PhoneNumber[UserIndexForMethods] + "\nCurrunt Balance : " + NormalUsersAccounts_Balance[UserIndexForMethods] + "\nAccount is active : " + NormalUsersAccounts_Status[UserIndexForMethods] + "\n");
                    }else{
                        System.out.println("The name is already used !");
                    }
                    break;
                case(2):
                    System.out.print("Enter the New Phone Number : ");
                    input.nextLine();
                    String UserInput_PhoneNumber = input.nextLine();
                    boolean UserPhoneNumberCheck = true;
                    for (int i = 0; i < UsersCount; i++) {
                        if(NormalUsersAccounts_PhoneNumber[i].equals(UserInput_PhoneNumber) || UserInput_PhoneNumber.length() != 11){
                            UserPhoneNumberCheck = false;
                            break;
                        }
                    }
                    if(UserPhoneNumberCheck == true){
                        NormalUsersAccounts_PhoneNumber[UserIndexForMethods] = UserInput_PhoneNumber;
                        System.out.println("====User details after edit====");
                        System.out.println("\nUser ID : " + NormalUsersAccounts_ID[UserIndexForMethods] + "\nName : " + NormalUsersAccounts_Name[UserIndexForMethods] + "\nEmail : " + NormalUsersAccounts_Email[UserIndexForMethods] + "\nPhone Number : " + NormalUsersAccounts_PhoneNumber[UserIndexForMethods] + "\nCurrunt Balance : " + NormalUsersAccounts_Balance[UserIndexForMethods] + "\nAccount is active : " + NormalUsersAccounts_Status[UserIndexForMethods] + "\n");
                    }else{
                        System.out.println("Invalid Phone Number , Phone Number must be 11 numbers and must not be already used");
                    }
                    break;
                case (3):
                    System.out.print("Enter the New Email : ");
                    input.nextLine();
                    String Useremail = input.nextLine();
                    boolean UserEmailcheck = true;
                    for (int i = 0; i < UsersCount; i++) {
                        if(NormalUsersAccounts_Email[i].equals(Useremail) || !Useremail.contains("@") || !Useremail.contains(".")){
                            UserEmailcheck = false;
                            break;
                        }
                    }
                    if (UserEmailcheck == true){
                        NormalUsersAccounts_Email[UserIndexForMethods] = Useremail;
                        System.out.println("====User details after edit====");
                        System.out.println("\nUser ID : " + NormalUsersAccounts_ID[UserIndexForMethods] + "\nName : " + NormalUsersAccounts_Name[UserIndexForMethods] + "\nEmail : " + NormalUsersAccounts_Email[UserIndexForMethods] + "\nPhone Number : " + NormalUsersAccounts_PhoneNumber[UserIndexForMethods] + "\nCurrunt Balance : " + NormalUsersAccounts_Balance[UserIndexForMethods] + "\nAccount is active : " + NormalUsersAccounts_Status[UserIndexForMethods] + "\n");
                    }else{
                        System.out.println("Invalid Email , Email Should be not used before and should contain '@' and domain");
                    }
                break;
                default:
                    System.out.println("Invalid Choice");
                    break;
            }
        }

        // User Method 10
        static void Userlogout(){
            // Call main menu
        }


    public static void main(String[] args) {
        //Test methods

        // showStatistics();
        // blockAccount();
        // unblockAccount();
        // searchUser(NormalUsersAccounts_ID, NormalUsersAccounts_Name, NormalUsersAccounts_Email, NormalUsersAccounts_PhoneNumber);
        // viewAllUsers();
        // updateUser();
        // viewUserDetails();
        
        // Main for user methods
            //For update profile
            
            // updateProfile(1);
            
            
    }
}