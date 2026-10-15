# Quick-pay-JavaFinalProject || Presented by Youssef Hesham & Sara Mohamed
**Quick Pay** is a program that allows its users to control their money (See balance, Transfer Money and receive money) and control their account (Update info, add favorite contacts and Search for another users).  !!!!Note it is not a real program!!!!
***
To Use the program correctly please log in with one of those test accounts :
 -  **UserName** : `Acount1` , **Pass** : `user1Pass`
 -  **UserName** : `Acount2` , **Pass** : `user2Pass`
 -  **UserName** : `Acount3` , **Pass** : `user3Pass` 
   
or **create a new account** to continue to the program. 

The options avaliable to normal users are :

 - **Show Balance** : to show the balance for the current logged in user.
 - **Transfer Money** : to transfer money to any user on the app.
 - **Transaction history** : to show all history transaction done by the current logged in user.
 - **Show Favorites** : to show the list of all favorite accounts saved by the current logged in user.
 - **Add Favorite** : enables the user to add any account to their favorite list.
 - **Remove Favorite** : enables the user to remove any Favorite conctact.
 - **Search Recipient** : Enables the user to search for any other user on the app and find info about him.
 - **View Profile** : Enables the user to see all his saved info.
 - **Update profile** : Enables the user to update any of his updatable info.
 - **Logout** : to logout from the account and return to the main menu.
***
The program has an admin panel and allows the admin to control the program and view data about it. The options avaliable to admin are :

 - **View all users** : to view all registered user on the app.
 - **View all transactions** : to view all saved transaction done by any user.
 - **Block account** : to block any account.
 - **View statistics** : to show some statistics about the app.
 - **Unblock account** : to unblock any account.
 - **Search user** : Enables the admin to search for any user on the app and find info about him.
 - **View User details** : Enables the admin to see all info about specific user.
 - **Update user** : Enables the admin to update info about specific user.
 - **Logout** : to logout from the admin account and return to the main menu.

To log in as an admin please use those data :
 - **Username**: `admin`
 - **Pass** : `00000000`

***
#### Some Important Notes
 - When Entering any **choice** input you should enter only the number of your choice then press enter.
 - After creating a new account you can use it normally in the program but you should log in with that account after creating it, **It will not log in automatically**
 - Choosing `Exit Program` option in any part of the program will close the whole program and all entered data will be lost.
 - When entering a **username** you should typed correctly and without any spaces
   
Enjoy using our program !
***
#### ===Code break down=== (For developers only)
How it works?

We used used methods functionality in java to create our methods and call them when it's needed, in the main code part we used nested loops and switches to create a friendly user experience and ensure that the program do not stop until the user exit from it. We used arrays and global variables to strore the data of program using corresponding index technique.
Example : (Account with index 0 in names is same index 0 in ID and same in index 0 in balance etc.).

The maximum users the program can accept is 10000. 
Each user has maximum 100 favorite contacts.
When logged in the program automatically saves the index of the user to use it in the program when needed.

#### Main variables and arrays
 - `String NormalUsersAccounts_ID[] = new String[100000];`
 - `String NormalUsersAccounts_Name[] = new String[100000];`
 - `String NormalUsersAccounts_Email[] = new String[100000];`
 - `String NormalUsersAccounts_PhoneNumber[] = new String[100000];`
 - `double NormalUsersAccounts_Balance[] = new double[100000];`
 - `Boolean NormalUsersAccounts_Status[] = new Boolean[100000];`
 - `String NormalUsersPasswords[] = new String[100000];`
 - `int NormalUsersFavoriteAccountIndex[][] = new int[100000][100];`
 - `int FavoritesCountForEachUser[] = new int[100];`
 - `int UsersCount = 3;`
 - `String adminUserName = "admin";`
 - `String adminUserName = "admin";`
 - `String UserTransferInput;`
 - `static int choice;`
 - `String TransactionID[] = new String[10000];`
 - `int SinderIndex[] = new int[10000];`
 - `int RecieverIndex[] = new int[10000];`
 - `double transferAmount[] = new double[10000];`
 - `boolean transactionStatus[] = new boolean[10000];`
 - `int TotalNumberOfTransaction = 0;`
 - `int TotalNumberOfCorrectTransaction = 0;`
 - `int TotalNumberOfFailedTransaction = 0;`
 - `int TotalAmount = 0;`

###### We made most of the variables global so we can use them in any part of the program and so we do not need to pass them as parameters in any method

#### Admin methods
 - `showStatistics()` 
 - `searchUser()`
 - `viewAllUsers()`
 - `updateUser()`
 - `blockAccount()`
 - `unblockAccount() `
 - `viewUserDetails() `
 - `showAllTransaction()`

#### User Methods
 - `showBalance()`
 - `AccountTransferMoneyCheck()` & `TransferMoney()`
 - `showTransactionHistoryforUser()`
 - `addFavorite()`
 - `removeFavorite()`
 - `showFavorites()`
 - `searchRecipient()`
 - `viewProfile()`
 - `updateProfile()`
   
#### Main code
- Main `while()` Loop -> To make sure that the program is working till the user choose to exit
- Main `switch()` To choose the main choice (Login for user , admin or logout
    - Nested `switch()` to choose another options related to the chosen first option
         - Every case has its own nested `switch()` and `if(){}` when needed to do the logical flow of the program 
    - Putting that `switch` in a `while()` loop to make sure it never stops till the user choose to back to main menu 
- `break;` is used in the end of each case and sometimes in a loop to do the logical flow of returning back to the parent loop
- `return;` is used sometimes to close the program completely when needed.
