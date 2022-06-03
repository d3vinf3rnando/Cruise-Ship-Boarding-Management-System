//software development 2 course work task 1

//import packages
import java.util.*;
import java.util.Arrays;
import java.io.*;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;




public class Test_1 {

    public static void main(String[] args){
        //declare cabin arrays
        ArrayList<String> cabin_1 = new ArrayList<String>();
        ArrayList<String> cabin_2 = new ArrayList<String>();
        ArrayList<String> cabin_3 = new ArrayList<String>();
        ArrayList<String> cabin_4 = new ArrayList<String>();
        ArrayList<String> cabin_5 = new ArrayList<String>();
        ArrayList<String> cabin_6 = new ArrayList<String>();
        ArrayList<String> cabin_7 = new ArrayList<String>();
        ArrayList<String> cabin_8 = new ArrayList<String>();
        ArrayList<String> cabin_9 = new ArrayList<String>();
        ArrayList<String> cabin_10 = new ArrayList<String>();
        ArrayList<String> cabin_11 = new ArrayList<String>();
        ArrayList<String> cabin_12 = new ArrayList<String>();




        while(true){
            //display a greeting message to the user
            System.out.println("Welcome to the Cruise Ship Boarding System");
            System.out.println(); //new line

            System.out.println("**** Main Menu ****");
            System.out.println("""
                A: Add a customer to a cabin
                V: View all cabins
                E: Display Empty cabins
                D: Delete customer from cabin
                F: Find cabin from customer name
                S: Store program data into file\s
                L: Load program data from file
                O: View passengersOrdered alphabetically by name""");
            System.out.println();

            //let user input an option

            Scanner userInput=new Scanner(System.in);
            System.out.println("Enter a letter from main menu");
            String userInputLetter=userInput.nextLine();
            userInputLetter=userInputLetter.toUpperCase(); //used toUpperCase to get user input always in capital

            //V: view all code section
            if (userInputLetter.equals("V") || userInputLetter.equals("v")){
                viewAllCabins();

            //A: add a customer code section
            }else if(userInputLetter.equals("A") || userInputLetter.equals("a")){
                System.out.println("Enter the customer name:");
                String customerName=userInput.nextLine();

                System.out.println("Enter the Cabin number to add customer:");
                String customerCabinNumber=userInput.nextLine();

                //beginning of the add customers to cabins statement
                if (customerCabinNumber.equals("Cabin 1")){
                    cabin_1.add(customerName);

                }else if(customerCabinNumber.equals("Cabin 2")){
                    cabin_2.add(customerName);

                }else if (customerCabinNumber.equals("Cabin 3")){
                    cabin_3.add(customerName);

                }else if  (customerCabinNumber.equals("Cabin 4")){
                    cabin_4.add(customerName);

                }else if(customerCabinNumber.equals("Cabin 5")){
                    cabin_5.add(customerName);

                }else if(customerCabinNumber.equals("Cabin 6")){
                    cabin_6.add(customerName);

                }else if (customerCabinNumber.equals("Cabin 7")){
                    cabin_7.add(customerName);

                }else if(customerCabinNumber.equals("Cabin 8")){
                    cabin_8.add(customerName);

                }else if(customerCabinNumber.equals("Cabin 9")){
                    cabin_9.add(customerName);

                }else if(customerCabinNumber.equals("Cabin 10")){
                    cabin_10.add(customerName);

                }else if (customerCabinNumber.equals("Cabin 11")){
                    cabin_11.add(customerName);

                }else if (customerCabinNumber.equals("Cabin 12")){
                    cabin_12.add(customerName);

                }else{
                    System.out.println("Invalid Cabin number. Try again!");
                }

                //beginning of the display empty cabins
            }else if(userInputLetter.equals("E") || userInputLetter.equals("e")){
                System.out.println("Displaying Empty Cabins");
               if(cabin_1.size()==0){
                   System.out.println("Cabin 1");
               }
               if (cabin_2.size()==0){
                   System.out.println("Cabin 2");
               }
               if(cabin_3.size()==0){
                   System.out.println("Cabin 3");
               }
                if(cabin_4.size()==0){
                    System.out.println("Cabin 4");
                }
                if(cabin_5.size()==0){
                    System.out.println("Cabin 5");
                }
                if(cabin_6.size()==0){
                    System.out.println("Cabin 6");
                }
                if(cabin_7.size()==0){
                    System.out.println("Cabin 7");
                }
                if(cabin_8.size()==0){
                    System.out.println("Cabin 8");
                }
                if(cabin_9.size()==0){
                    System.out.println("Cabin 9");
                }
                if(cabin_10.size()==0){
                    System.out.println("Cabin 10");
                }
                if(cabin_11.size()==0){
                    System.out.println("Cabin 11");
                }
                if(cabin_12.size()==0){
                    System.out.println("Cabin 12");
                }

                //beginning of the delete customer statement
            }else if(userInputLetter.equals("D") || userInputLetter.equals("d")) {
                //ask customer name and cabin number to delete customer from cabin
                System.out.println("Enter the customer name you want to delete:");
                String delCustomerName = userInput.nextLine();
                System.out.println("Enter the cabin number:");
                String delCustomerCabin = userInput.nextLine();

                if (cabin_1.contains(delCustomerName)) {
                    cabin_1.remove(delCustomerName);
                    System.out.println("Customer removed from Cabin 1");

                } else if (cabin_2.contains(delCustomerName)) {
                    cabin_2.remove(delCustomerName);
                    System.out.println("Customer removed from Cabin 2");

                } else if (cabin_3.contains(delCustomerName)) {
                    cabin_3.remove(delCustomerName);
                    System.out.println("Customer removed from Cabin 3");

                } else if (cabin_4.contains(delCustomerName)) {
                    cabin_4.remove(delCustomerName);
                    System.out.println("Customer removed from Cabin 4");

                } else if (cabin_5.contains(delCustomerName)) {
                    cabin_5.remove(delCustomerName);
                    System.out.println("Customer removed from Cabin 5");

                } else if (cabin_6.contains(delCustomerName)) {
                    cabin_6.remove(delCustomerName);
                    System.out.println("Customer removed from Cabin 6");

                } else if (cabin_7.contains(delCustomerName)) {
                    cabin_7.remove(delCustomerName);
                    System.out.println("Customer removed from Cabin 7");

                } else if (cabin_8.contains(delCustomerName)) {
                    cabin_8.remove(delCustomerName);
                    System.out.println("Customer removed from Cabin 8");

                } else if (cabin_9.contains(delCustomerName)) {
                    cabin_9.remove(delCustomerName);
                    System.out.println("Customer removed from Cabin 9");

                } else if (cabin_10.contains(delCustomerName)) {
                    cabin_10.remove(delCustomerName);
                    System.out.println("Customer removed from Cabin 10");

                } else if (cabin_11.contains(delCustomerName)) {
                    cabin_11.remove(delCustomerName);
                    System.out.println("Customer removed from Cabin 11");

                } else if (cabin_12.contains(delCustomerName)) {
                    cabin_12.remove(delCustomerName);
                    System.out.println("Customer removed from Cabin 12");

                } else {
                    System.out.println("Invalid customer name");
                }

                //beginning of the find customers from cabins statement
            }else if(userInputLetter.equals("F") || userInputLetter.equals("f")){
                System.out.println("Enter customer name to find his/her cabin:");
                String findCustomer= userInput.nextLine();

                if(cabin_1.contains(findCustomer)){
                    System.out.println(findCustomer+"'s cabin is Cabin 1");

                }else if(cabin_2.contains(findCustomer)) {
                    System.out.println(findCustomer + "'s cabin is Cabin 2");

                }else if(cabin_3.contains(findCustomer)){
                    System.out.println(findCustomer+"'s cabin is Cabin 3");

                }else if(cabin_4.contains(findCustomer)){
                    System.out.println(findCustomer+"'s cabin is Cabin 4");

                }else if(cabin_5.contains(findCustomer)){
                    System.out.println(findCustomer+"'s cabin is Cabin 5");

                }else if(cabin_6.contains(findCustomer)){
                    System.out.println(findCustomer+"'s cabin is Cabin 6");

                }else if(cabin_7.contains(findCustomer)){
                    System.out.println(findCustomer+"'s cabin is Cabin 7");

                }else if(cabin_8.contains(findCustomer)){
                    System.out.println(findCustomer+"'s cabin is Cabin 8");

                }else if(cabin_9.contains(findCustomer)){
                    System.out.println(findCustomer+"'s cabin is Cabin 9");

                }else if(cabin_10.contains(findCustomer)){
                    System.out.println(findCustomer+"'s cabin is Cabin 10");

                }else if(cabin_11.contains(findCustomer)){
                    System.out.println(findCustomer+"'s cabin is Cabin 11");

                }else if(cabin_12.contains(findCustomer)){
                    System.out.println(findCustomer+"'s cabin is Cabin 12");

                }else{
                    System.out.println("Customer not found");
                }

                //beginning of the save customers to text file statement
            }else if(userInputLetter.equals("S") || userInputLetter.equals("s")){
                //youtube reference
                //https://youtu.be/hgF21imQ_Is
                try{
                    BufferedWriter bw=new BufferedWriter(new FileWriter("C:\\Users\\HP\\Desktop\\IIT\\Bsc Computer Science L4\\Semester 2\\Software Developent 2\\Course Work\\20200219_CW\\src\\customers.txt"));
                    bw.write(String.valueOf(Arrays.asList(cabin_1))+"\n");
                    bw.write(String.valueOf(Arrays.asList(cabin_2))+"\n");
                    bw.write(String.valueOf(Arrays.asList(cabin_3))+"\n");
                    bw.write(String.valueOf(Arrays.asList(cabin_4))+"\n");
                    bw.write(String.valueOf(Arrays.asList(cabin_5))+"\n");
                    bw.write(String.valueOf(Arrays.asList(cabin_6))+"\n");
                    bw.write(String.valueOf(Arrays.asList(cabin_7))+"\n");
                    bw.write(String.valueOf(Arrays.asList(cabin_8))+"\n");
                    bw.write(String.valueOf(Arrays.asList(cabin_9))+"\n");
                    bw.write(String.valueOf(Arrays.asList(cabin_10))+"\n");
                    bw.write(String.valueOf(Arrays.asList(cabin_11))+"\n");
                    bw.write(String.valueOf(Arrays.asList(cabin_12))+"\n");
                    bw.close();
                }catch(Exception ex){
                    return;
                }
                //beginning of the load customers from text file statement
            }else if(userInputLetter.equals("L") || userInputLetter.equals("l")){
                try{
                    BufferedReader read= new BufferedReader(new FileReader("C:\\Users\\HP\\Desktop\\IIT\\Bsc Computer Science L4\\Semester 2\\Software Developent 2\\Course Work\\20200219_CW\\src\\customers.txt"));
                    String line;
                    while((line= read.readLine())!=null){
                        System.out.println(line);
                    }
                    read.close();

                }catch (Exception ex){
                    return;
                }
//beginning of the customers sorting  statement
            }else if(userInputLetter.equals("O") || userInputLetter.equals("o")){
                ArrayList<String> allCustomersList = new ArrayList<String>(); //list to add all customers' names into one list
                //ading all names into one list
                allCustomersList.add(String.valueOf(cabin_1));
                allCustomersList.add(String.valueOf(cabin_2));
                allCustomersList.add(String.valueOf(cabin_3));
                allCustomersList.add(String.valueOf(cabin_4));
                allCustomersList.add(String.valueOf(cabin_5));
                allCustomersList.add(String.valueOf(cabin_6));
                allCustomersList.add(String.valueOf(cabin_7));
                allCustomersList.add(String.valueOf(cabin_8));
                allCustomersList.add(String.valueOf(cabin_9));
                allCustomersList.add(String.valueOf(cabin_10));
                allCustomersList.add(String.valueOf(cabin_11));
                allCustomersList.add(String.valueOf(cabin_12));


                Arrays.sort(new ArrayList[]{allCustomersList});
                Collections.sort(allCustomersList);
                System.out.println(new String(String.valueOf(allCustomersList)));
            }


        } //end  main while loop
    }



//------------------------------------------------------------------------------------------------------------------------------
//all methods from here

    //method for View all cabins
    static void viewAllCabins(){
        System.out.println("""
                    Cabin 1
                    Cabin 2
                    Cabin 3
                    Cabin 4
                    Cabin 5
                    Cabin 6
                    Cabin 7
                    Cabin 8
                    Cabin 9
                    Cabin 10
                    Cabin 11
                    Cabin 12
                    """);
    }




    }

