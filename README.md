# Quick-pay-JavaFinalProject || Presented by Youssef Hesham & Sara Mohamed
**Quick Pay** is a program that allows its users to control thier money (See balance, Transfer Money and receive money) and control their account (Update info, add favorite contacts and Search for another users). 
***
To Use the program correctly please log in with one of those test accounts :
 -  **UserName** : `Acount1` , **Pass** : `user1Pass`
 -  **UserName** : `Acount2` , **Pass** : `user2Pass`
 -  **UserName** : `Acount3` , **Pass** : `user3Pass` 
   
or **create a new account** to continue to the program. 

The options avaliable to normal users are (1-Show Balance /2-Transfer Money /3-Transaction History /4-Show Favorites /5-Add Favorite /6-Remove Favorite/ 7-Search Recipient /8-View Profile /9-Update Profile /10-Logout)
***
The program has an admin panel and allows the admin to control the program and view data about it. The options avaliable to admin are (1-View all users /2-View all transactions /3-Block account /4-View stastics /5-Unblock account /6-Search user /7-View User details /8-Update user /9-Log out)

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
We used used methods functionality in java to create our methods and call them when it's needed, in the main code part we used nested loops and switches to create a friendly user experience and ensure that the program do not stop until the user exit from it. We used arrays and global variables to strore the data of program using corresponding index technique. (Account with index 0 in names is same index 0 in ID and same in index 0 in balance etc.).
The maximum users the program can accept is 10000. 
Each user has maximum 100 favorite contacts.
When logged in the program automatically saves the index of the user to use it in the program when needed.
