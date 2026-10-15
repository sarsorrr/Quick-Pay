/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.mavenproject50;

/**
 *
 * @author sm244
 */
import java.util.Scanner;
public class Mavenproject50{
//Main Variables and arrays
static Scanner input = new Scanner (System.in);
static String NormalUsersAccounts_ID[] = new String [100000];
static int nextId=1001;
static String NormalUsersAccounts_Name[] = new String [100000];
static String NormalUsersAccounts_Email[] = new String [100000];
static String NormalUsersAccounts_PhoneNumber[] = new String [100000];
static double NormalUsersAccounts_Balance[] = new double[100000];
static Boolean NormalUsersAccounts_Status[] = new Boolean[100000];
static String NormalUsersPasswords[] = new String[100000];
static int NormalUsersFavoriteAccountIndex[][] = new int[100000][100];
static int FavoritesCountForEachUser[] = new int[100];
static int UsersCount = 3;

// Temp index used in testing thep program and the variable will change to the user index automatically after log in
static int UsertempIndexForTheProgram = 0;


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
static String UserTransferInput;
static int choice;




// For transactions history saving
static String TransactionID[] = new String [1000];
static int SinderIndex[] = new int[1000];
static int RecieverIndex[] = new int[1000];
static double transferAmount[] = new double[1000];
static boolean transactionStatus[] = new boolean[1000];
static int TotalNumberOfTransaction = 0;
static int TotalNumberOfCorrectTransaction = 0;
static int TotalNumberOfFailedTransaction = 0;
static int TotalAmount = 0;
static void Idhistory(int id){
System.out.println("ID IS :"+ NormalUsersAccounts_ID[id]);
}


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
for (int i = 0; i < TotalNumberOfTransaction; i++) {
TotalAmount += transferAmount[i];
}

System.out.println("\n====Program stastics=====");
System.out.println("Total number of registered users : " + NumberOfUsers + "\nNumber of Active users : " + NumberOfActiveUsers + "\nNumber of blocked accounts : " + NumberOfBlockedUsers + "\nNumber of Succussful Transaction : " + TotalNumberOfCorrectTransaction + "\nNumber of failed Transaction : " + TotalNumberOfFailedTransaction + "\nTotal transaction amount : " + TotalAmount);
}

static void searchUser(){
System.out.print("\nHow you want to search ? (1.By ID 2. By Full Name 3.By Phone number 4.By Email Adress)");
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
System.out.println("\nName : " + NormalUsersAccounts_Name[i] + "\nUser ID : "+ NormalUsersAccounts_ID[i] + "\nEmail : " + NormalUsersAccounts_Email[i] + "\nPhone Number : " + NormalUsersAccounts_PhoneNumber[i]);
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
System.out.println("\nName : " + NormalUsersAccounts_Name[i] + "\nUser ID : "+ NormalUsersAccounts_ID[i] + "\nEmail : " + NormalUsersAccounts_Email[i] + "\nPhone Number : " + NormalUsersAccounts_PhoneNumber[i]);
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
System.out.println("\nName : " + NormalUsersAccounts_Name[i] + "\nUser ID : "+ NormalUsersAccounts_ID[i] + "\nEmail : " + NormalUsersAccounts_Email[i] + "\nPhone Number : " + NormalUsersAccounts_PhoneNumber[i]);
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
System.out.println("\nName : " + NormalUsersAccounts_Name[i] + "\nUser ID : "+ NormalUsersAccounts_ID[i] + "\nEmail : " + NormalUsersAccounts_Email[i] + "\nPhone Number : " + NormalUsersAccounts_PhoneNumber[i]);
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

static void showAllTransaction(){
System.out.println("\n==== Transaction History ====");
for (int i = 0; i < TotalNumberOfCorrectTransaction; i++) {

System.out.println("Transaction ID : " + TransactionID[i]);
System.out.println("From : " + NormalUsersAccounts_Name[SinderIndex[i]]);
System.out.println("To : " + NormalUsersAccounts_Name[RecieverIndex[i]]);
System.out.println("Transfer status : " + transactionStatus[i]);
System.out.println("-------");
}
}


// User methods

// Show balance method to show the balance of loggen in user
static void showBalance(int UsertempIndexForTheProgram){
System.out.println("\n====Account Balance====");
System.out.println("Name : " + NormalUsersAccounts_Name[UsertempIndexForTheProgram] + "\nBalance : " + NormalUsersAccounts_Balance[UsertempIndexForTheProgram]);
System.out.println("------------------");
}


// Check for account exist code to transfer money & and money transfer calculations
static void AccountTransferMoneyCheck(int TransferChoice){
double transmoney = 0;
boolean TransferCheck =false;
int UserEmailInputIndex = -1;
if (TransferChoice == 1){
System.out.print("Enter your Email:");
UserTransferInput = input.next();
for (int i = 0; i < UsersCount; i++) {
if(NormalUsersAccounts_Email[i].equals(UserTransferInput)){
TransferCheck = true;
UserEmailInputIndex = i;
break;
}
}
}else if(TransferChoice == 0){
System.out.print("Enter your PhoneNumber :");
UserTransferInput= input.next();
for (int i = 0; i < UsersCount; i++) {
if(NormalUsersAccounts_PhoneNumber[i].equals(UserTransferInput)){
TransferCheck = true;
UserEmailInputIndex = i;
break;
}
}
if (TransferCheck == false){
System.out.println("Invalid Email or Phone Number , You should write a correct existing account");
}


boolean transactionStatus_var = false;
if(TransferCheck == true){
System.out.println("Correct");
System.out.print("Enter the amount to transfer :");
transmoney=input.nextDouble();

if (transmoney < 0 || transmoney > NormalUsersAccounts_Balance[UsertempIndexForTheProgram]){
System.out.println("Invalid amount.");
TotalNumberOfFailedTransaction++;
TotalNumberOfTransaction++;
transactionStatus[TotalNumberOfTransaction] = false;
}
}else if (NormalUsersAccounts_Status[UsertempIndexForTheProgram] == false || NormalUsersAccounts_Status[UserEmailInputIndex] == false){
System.out.println("Transaction failed, one of the accounts is not active");
TotalNumberOfFailedTransaction++;
TotalNumberOfTransaction++;
transactionStatus[TotalNumberOfTransaction] = false;
}else{
String transID = "A000" + TotalNumberOfTransaction;

// Saving history in the array -->
TransactionID[TotalNumberOfTransaction] = transID;
SinderIndex[TotalNumberOfTransaction] = UsertempIndexForTheProgram;
RecieverIndex[TotalNumberOfTransaction] = UserEmailInputIndex;
transferAmount[TotalNumberOfTransaction] = transmoney;
NormalUsersAccounts_Balance[UsertempIndexForTheProgram] -= transmoney;
NormalUsersAccounts_Balance[UserEmailInputIndex] += transmoney;
transactionStatus_var = true;
transactionStatus[TotalNumberOfTransaction] = transactionStatus_var;
System.out.println("\n==== Transaction Details ====");
System.out.println("Transaction ID : " + TransactionID[TotalNumberOfTransaction]);
System.out.println("From : " + NormalUsersAccounts_Name[SinderIndex[TotalNumberOfTransaction]]);
System.out.println("To : " + NormalUsersAccounts_Name[RecieverIndex[TotalNumberOfTransaction]]);
System.out.println("Transfer amount : " + transmoney);
System.out.println("Transfer status : " + transactionStatus_var);
System.out.println("New Balance : " + NormalUsersAccounts_Balance[UsertempIndexForTheProgram]);
TotalNumberOfCorrectTransaction++;
TotalNumberOfTransaction++;
}
}


}

// Transfer Money , printing and calling the main method of transfaring according to the correct choice
static void TransferMoney(){

// choose a way to transfer
System.out.println("Choose a way to transfer (select the user you will send to) :");
System.out.println("1.By Phone Number : ");
System.out.println("2.By Email");
choice = input.nextInt();
switch(choice){
case (1):
AccountTransferMoneyCheck(0);
break;
case (2):
AccountTransferMoneyCheck(1);
break;
}
}


// PRtin transaction for specific loggen in user
static void showTransactionHistoryforUser(){
boolean historyExisist = false;
System.out.println("\nAll history for account " + NormalUsersAccounts_Name[UsertempIndexForTheProgram]);
for (int i = 0; i < TotalNumberOfCorrectTransaction; i++) {
if (SinderIndex[i] == UsertempIndexForTheProgram || RecieverIndex[i] == UsertempIndexForTheProgram){
System.out.println("Transaction ID : " + TransactionID[i]);
System.out.println("From : " + NormalUsersAccounts_Name[SinderIndex[i]]);
System.out.println("To : " + NormalUsersAccounts_Name[RecieverIndex[i]]);
System.out.println("Transfer status : " + transactionStatus[i]);
System.out.println("-------");
historyExisist = true;
}
}
if (historyExisist == false){
System.out.println("No history for this account.");
}
}

static void addFavorite(){
System.out.println("\n====Add favorite accounts====");
System.out.println("Enter favorite phone number : ");
String enteredPhoneNumber = input.next();
boolean checkTOContinue = true;
for(int i = 0; i < FavoritesCountForEachUser[UsertempIndexForTheProgram]; i++){
if (enteredPhoneNumber.equals(NormalUsersAccounts_PhoneNumber[NormalUsersFavoriteAccountIndex[UsertempIndexForTheProgram][i]])) {
System.out.println("Account is already saved in fav");
checkTOContinue = false;
break;
}
}
for(int i = 0; i < UsersCount; i++){
if (enteredPhoneNumber.equals(NormalUsersAccounts_PhoneNumber[UsertempIndexForTheProgram])){
System.out.println("You can not add your self to fav");
checkTOContinue = false;
break;
}
}
if(checkTOContinue == true){
int tempIndex = FavoritesCountForEachUser[UsertempIndexForTheProgram];
boolean tempCheck = false;
for (int i = 0; i < UsersCount; i++) {
if(enteredPhoneNumber.equals(NormalUsersAccounts_PhoneNumber[i])){
NormalUsersFavoriteAccountIndex[UsertempIndexForTheProgram][tempIndex] = i;
tempIndex++;
FavoritesCountForEachUser[UsertempIndexForTheProgram]++;
tempCheck = true;
System.out.println("Account " + NormalUsersAccounts_PhoneNumber[i] + " added to fav succussfully");
}
}
if (tempCheck == false){
System.out.println("Invalid phone number. Please entered a correct registered phone number");
}
}


}
static void removeFavorite(){
System.out.println("\n====Remove favorite===== ");
System.out.println("Enter the phone number you want to remove from favorites : ");
String entertedPhoneNumber = input.next();
boolean tempCheck = false;
for (int i = 0; i < FavoritesCountForEachUser[UsertempIndexForTheProgram]; i++) {
if(entertedPhoneNumber.equals(NormalUsersAccounts_PhoneNumber[NormalUsersFavoriteAccountIndex[UsertempIndexForTheProgram][i]])){
for (int j = i; j < FavoritesCountForEachUser[UsertempIndexForTheProgram] - 1; j++) {
NormalUsersFavoriteAccountIndex[UsertempIndexForTheProgram][j] = NormalUsersFavoriteAccountIndex[UsertempIndexForTheProgram][(j+1)];
}
tempCheck = true;
FavoritesCountForEachUser[UsertempIndexForTheProgram]--;
System.out.println("Account removed");
break;
}
}
if (tempCheck == false){
System.out.println("Invalid phone number , please enter a correct existing number");
}
}

static void showFavorites(){
System.out.println("\n====Your Fav contacts=====");
if(FavoritesCountForEachUser[UsertempIndexForTheProgram] > 0){
for (int i = 0; i < FavoritesCountForEachUser[UsertempIndexForTheProgram]; i++) {
System.out.println("\nAccount " + (i + 1));
System.out.println("Name : " + NormalUsersAccounts_Name[NormalUsersFavoriteAccountIndex[UsertempIndexForTheProgram][i]] + "\nPhone Number : " + NormalUsersAccounts_PhoneNumber[NormalUsersFavoriteAccountIndex[UsertempIndexForTheProgram][i]]);
System.out.println("---------");
}
}else{
System.out.println("No Favorites saved");
}

}


static void searchRecipient(){
System.out.print("\nHow you want to search ? (1.By ID 2. By Full Name 3.By Phone number 4.By Email Adress)");
int SearchUserChoice = input.nextInt();
switch (SearchUserChoice) {
case 1:
System.out.println("Enter user ID : ");
String id = input.next();
boolean check = false;
for (int i = 0; i < UsersCount; i++) {
if (NormalUsersAccounts_ID[i].equals(id)){
System.out.println("\nSearch Result : Account found");
System.out.println("\n=====Acount details=====");
System.out.println("\nName : " + NormalUsersAccounts_Name[i] + "\nUser ID : "+ NormalUsersAccounts_ID[i] + "\nEmail : " + NormalUsersAccounts_Email[i] + "\nPhone Number : " + NormalUsersAccounts_PhoneNumber[i]);
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
System.out.println("\nName : " + NormalUsersAccounts_Name[i] + "\nUser ID : "+ NormalUsersAccounts_ID[i] + "\nEmail : " + NormalUsersAccounts_Email[i] + "\nPhone Number : " + NormalUsersAccounts_PhoneNumber[i]);
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
System.out.println("\nName : " + NormalUsersAccounts_Name[i] + "\nUser ID : "+ NormalUsersAccounts_ID[i] + "\nEmail : " + NormalUsersAccounts_Email[i] + "\nPhone Number : " + NormalUsersAccounts_PhoneNumber[i]);
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
System.out.println("\nName : " + NormalUsersAccounts_Name[i] + "\nUser ID : "+ NormalUsersAccounts_ID[i] + "\nEmail : " + NormalUsersAccounts_Email[i] + "\nPhone Number : " + NormalUsersAccounts_PhoneNumber[i]);
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

//View Profile to allow the user to view thier profile details
static void viewProfile(){
System.out.println("\n====View Your Profile=====");
System.out.println("Name : " + NormalUsersAccounts_Name[UsertempIndexForTheProgram] + "\nID : " + NormalUsersAccounts_ID[UsertempIndexForTheProgram] + "\nPhone Number : " + NormalUsersAccounts_PhoneNumber[UsertempIndexForTheProgram] + "\nEmail : " + NormalUsersAccounts_Email[UsertempIndexForTheProgram] + "\nBalance : " + NormalUsersAccounts_Balance[UsertempIndexForTheProgram] + "\nAccount status : " + NormalUsersAccounts_Status[UsertempIndexForTheProgram]);
}

// User Method 9 Update Profile
// THe method takes the index of the user as a parameter and allows the user to update either email, name or phone number
//THe method also validates the info before saving
static void updateProfile(int UserIndexForMethods){
System.out.println("====Proflle update=====");
System.out.print("Choose what you want to update (1.Full name 2.Phone Number 3.Email Address)");
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




public static void main(String[] args) {
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
switch(accountchoice) {
case 1:
System.out.println("Enter username , email or phone number:");
username = input.next();
System.out.println("Enter your password:");
String password =input.next();
boolean loginCheck = false;
for (int i = 0; i < NormalUsersAccounts_Name.length; i++) {
if((username.equals(NormalUsersAccounts_Name[i]) || username.equals(NormalUsersAccounts_PhoneNumber[i]) || username.equals(NormalUsersAccounts_Email[i])) && password.equals(NormalUsersPasswords[i])){
UsertempIndexForTheProgram = i;
loginCheck = true;
break;
}
}
if (loginCheck == true){
System.out.println("Logged in succussfully");
int userPanelCurrentChoice;
do {
int UserLocalChoice;
System.out.println("\n====User Panel====");
System.out.println("1.Show Balance \n2.Transfer Money \n3.Transaction History \n4.Show Favorites \n5.Add Favorites \n6.Remove Favorite \n7.Search Recipient \n8.View Profile \n9.Update profile \n10.Logout");
userPanelCurrentChoice = input.nextInt();
switch(userPanelCurrentChoice){
case 1:
showBalance(UsertempIndexForTheProgram);
System.out.println("\nChoose an option : \n1.Go back to user menu \n2.Exit program");
UserLocalChoice = input.nextInt();
switch(UserLocalChoice){
case 1:
break;
case 2:
System.out.println("Goodbye!!");
return;
default :
System.out.println("Invalid choice");
}
break;
case 2:
TransferMoney();
System.out.println("\nChoose an option : \n1.Go back to user menu \n2.Exit program");
UserLocalChoice = input.nextInt();
switch(UserLocalChoice){
case 1:
break;
case 2:
System.out.println("Goodbye!!");
return;
default :
System.out.println("Invalid choice");
}

break;
case 3:
showTransactionHistoryforUser();
System.out.println("\nChoose an option : \n1.Go back to user menu \n2.Exit program");
UserLocalChoice = input.nextInt();
switch(UserLocalChoice){
case 1:
break;
case 2:
System.out.println("Goodbye!!");
return;
default :
System.out.println("Invalid choice");
}

break;
case 4:
showFavorites();
System.out.println("\nChoose an option : \n1.Go back to user menu \n2.Exit program");
UserLocalChoice = input.nextInt();
switch(UserLocalChoice){
case 1:
break;
case 2:
System.out.println("Goodbye!!");
return;
default :
System.out.println("Invalid choice");
}

break;
case 5:
addFavorite();
System.out.println("\nChoose an option : \n1.Go back to user menu \n2.Exit program");
UserLocalChoice = input.nextInt();
switch(UserLocalChoice){
case 1:
break;
case 2:
System.out.println("Goodbye!!");
return;
default :
System.out.println("Invalid choice");
}

break;
case 6:
removeFavorite();
System.out.println("\nChoose an option : \n1.Go back to user menu \n2.Exit program");
UserLocalChoice = input.nextInt();
switch(UserLocalChoice){
case 1:
break;
case 2:
System.out.println("Goodbye!!");
return;
default :
System.out.println("Invalid choice");
}

break;
case 7:
searchRecipient();
System.out.println("\nChoose an option : \n1.Go back to user menu \n2.Exit program");
UserLocalChoice = input.nextInt();
switch(UserLocalChoice){
case 1:
break;
case 2:
System.out.println("Goodbye!!");
return;
default :
System.out.println("Invalid choice");
}

break;
case 8:
viewProfile();
System.out.println("\nChoose an option : \n1.Go back to user menu \n2.Exit program");
UserLocalChoice = input.nextInt();
switch(UserLocalChoice){
case 1:
break;
case 2:
System.out.println("Goodbye!!");
return;
default :
System.out.println("Invalid choice");
}

break;
case 9:
updateProfile(UsertempIndexForTheProgram);
System.out.println("\nChoose an option : \n1.Go back to user menu \n2.Exit program");
UserLocalChoice = input.nextInt();
switch(UserLocalChoice){
case 1:
break;
case 2:
System.out.println("Goodbye!!");
return;
default :
System.out.println("Invalid choice");
}

break;
case 10:
break;
default:
System.out.println("Invalid choice");
break;
}

}while (userPanelCurrentChoice != 10);
}else{
System.out.println("The username or password is wrong.");
break;
}

break;
case 2:
System.out.println("Choose a username");
username = input.next();
boolean NameNewCheck = true;
for (int i = 0; i < UsersCount; i++) {
if(username.equals(NormalUsersAccounts_Name[i])){
NameNewCheck = false;
System.out.println("This name is already used");
break;
}
}
if (NameNewCheck == true){
System.out.println("Creat a password");
String newpassword=input.next();
System.out.println("Confirm password:");
String confirmpassword=input.next();
while(!confirmpassword.equals(newpassword)){
    System.out.println("Password do not match");
System.out.println("Enter 0 to return to Main Menu");
System.out.println("Enter 1 to try again");
int retry=input.nextInt();
if(retry == 0){
break;
}else if(retry==1){
System.out.println("Ente password again");
newpassword=input.next();
System.out.println("confirm password");
confirmpassword=input.next();
}else{
System.out.println("INVALID CHOICE!!!");
if (newpassword.length() < 8){
System.out.println("Password should be at least 8 charcters");
break;

}else{

    System.out.println("Enter your phone number");
String phonenum = input.next();
boolean NewPhoneNumCheck = true;
for(int i = 0; i < UsersCount; i++){
if (phonenum.length() != 11 || phonenum.equals(NormalUsersAccounts_PhoneNumber[i])){
System.out.println("Invalid phone number, you should enter a valid 11 charcter and not registerted before phone number");
NewPhoneNumCheck = false;
break;
}
}

if (NewPhoneNumCheck == true){
System.out.println("Enter your email");
String email=input.next();
boolean NewEmailCheck = true;
for (int i = 0; i < UsersCount; i++) {
if(!email.contains("@") || !email.contains(".") || email.equals(NormalUsersAccounts_Email[i])){
System.out.println("Invalid email , please enter a correct not regesterd email");
NewEmailCheck = false;
break;
}
}
if(NewEmailCheck == true){
if(newpassword.equals(confirmpassword)){
if(UsersCount < NormalUsersAccounts_ID.length){
int newUserIndex = UsersCount;
NormalUsersAccounts_ID[newUserIndex]= "QP"+nextId;
NormalUsersAccounts_Name[newUserIndex]= username;
NormalUsersPasswords[newUserIndex]=newpassword;
NormalUsersAccounts_Email[newUserIndex] = email;
NormalUsersAccounts_PhoneNumber[newUserIndex]=phonenum;
NormalUsersAccounts_Balance[newUserIndex] = 0.0;
NormalUsersAccounts_Status[newUserIndex] = true;
nextId++;
UsersCount++;
System.out.println("Account created successfully!");
System.out.println("Your ID is : "+ NormalUsersAccounts_ID[UsersCount - 1]);
}else{
System.out.println("Maximum number of accounts reached!");
}
}else{
System.out.println("Password do not match!");
}
}else{
break;
}
}break;
}
}
}
break;
}}
case 2:
System.out.println("=====ADMIN LOGIN=====");
System.out.println("Enter Admin username : ");
String adminusername=input.next();
System.out.println("Enter Admin password : ");
String adminpassword=input.next();
while(!adminusername.equals(adminUserName) || !adminpassword.equals(adminPassword)){
System.out.println("Wrong username or password!");
System.out.println("Enter 0 to return to Main Menu");
System.out.println("Enter 1 to try again");
int retry=input.nextInt();
if(retry == 0){
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
if(adminusername.equals(adminUserName) && adminpassword.equals(adminPassword)){
System.out.println("Admin login Successful!");
System.out.println("-------------------------------");
int adminchoices;
do{
System.out.println("=====Admin Panel======");
System.out.println("\n1:View All Users \n2:View All Transactions\n3:Block account \n4:View Statistics \n5:Unblock account \n6:Search user \n7:view user details \n8:Update User \n9:Logout");
System.out.println("Enter your choice:");
adminchoices=input.nextInt();
int LocalAdminChoice;
switch(adminchoices){
case 1:
int userchoice = 0 ;
System.out.println("====View all users====");
viewAllUsers();
System.out.println("\nChoose an option : \n1.Go back to admin menu \n2.Exit program");
LocalAdminChoice = input.nextInt();
switch(LocalAdminChoice){
case 1:
break;
case 2:
System.out.println("Goodbye!!");
return;
default:
System.out.println("Invalid Choice");
}

break;
case 2:
System.out.println("View All Transactions");
showAllTransaction();
System.out.println("\nChoose an option : \n1.Go back to admin menu \n2.Exit program");
LocalAdminChoice = input.nextInt();

switch(LocalAdminChoice){
case 1:
break;
case 2:
System.out.println("Goodbye!!");
return;
default:
System.out.println("Invalid Choice");
}

break;
case 3:
System.out.println("Block");
blockAccount();
System.out.println("\nChoose an option : \n1.Go back to admin menu \n2.Exit program");
LocalAdminChoice = input.nextInt();

switch(LocalAdminChoice){
case 1:
break;
case 2:
System.out.println("Goodbye!!");
return;
default:
System.out.println("Invalid Choice");
}

break;
case 4:
System.out.println("View All Statistics");
showStatistics();
System.out.println("\nChoose an option : \n1.Go back to admin menu \n2.Exit program");
LocalAdminChoice = input.nextInt();

switch(LocalAdminChoice){
case 1:
break;
case 2:
System.out.println("Goodbye!!");
return;
default:
System.out.println("Invalid Choice");
}

break;
case 5:
unblockAccount();
System.out.println("\nChoose an option : \n1.Go back to admin menu \n2.Exit program");
LocalAdminChoice = input.nextInt();

switch(LocalAdminChoice){
case 1:
break;
case 2:
System.out.println("Goodbye!!");
return;
default:
System.out.println("Invalid Choice");
}

break;
case 6:
searchUser();
System.out.println("\nChoose an option : \n1.Go back to admin menu \n2.Exit program");
LocalAdminChoice = input.nextInt();

switch(LocalAdminChoice){
case 1:
break;
case 2:
System.out.println("Goodbye!!");
return;
default:
System.out.println("Invalid Choice");
}

break;
case 7:
viewUserDetails();
System.out.println("\nChoose an option : \n1.Go back to admin menu \n2.Exit program");
LocalAdminChoice = input.nextInt();

switch(LocalAdminChoice){
case 1:
break;
case 2:
System.out.println("Goodbye!!");
return;
default:
System.out.println("Invalid Choice");
}

break;
case 8:
updateUser();
System.out.println("\nChoose an option : \n1.Go back to admin menu \n2.Exit program");
LocalAdminChoice = input.nextInt();

switch(LocalAdminChoice){
case 1:
break;
case 2:
System.out.println("Goodbye!!");
return;
default:
System.out.println("Invalid Choice");
}

break;
case 9:
System.out.println("Logging out");
break;
default:
System.out.println("INVALID CHOICE!!!");

}

}while(adminchoices!=9);
}
break;
case 3:
System.out.println("Goodbye!!");
return;
default:
System.out.println("INVALID CHOICE!!");
}
}
}
}

