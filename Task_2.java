//software development 2 course work task 2

//import packages
import java.util.Scanner;
import java.util.*;
import java.util.Arrays;
import java.io.*;
import java.util.ArrayList;
import java.util.Collections;
import java.util.SplittableRandom;
import java.util.stream.Collectors;



class cabins{
     //declare cabin class
    ArrayList<String> cabin1 = new ArrayList<String>();
    ArrayList<String> cabin2 = new ArrayList<String>();
    ArrayList<String> cabin3 = new ArrayList<String>();
    ArrayList<String> cabin4 = new ArrayList<String>();
    ArrayList<String> cabin5 = new ArrayList<String>();
    ArrayList<String> cabin6 = new ArrayList<String>();
    ArrayList<String> cabin7 = new ArrayList<String>();
    ArrayList<String> cabin8 = new ArrayList<String>();
    ArrayList<String> cabin9 = new ArrayList<String>();
    ArrayList<String> cabin10 = new ArrayList<String>();
    ArrayList<String> cabin11 = new ArrayList<String>();
    ArrayList<String> cabin12 = new ArrayList<String>();
}

class passengers{
     //declare passenger class
    ArrayList<String> passengers = new ArrayList<String>();
}

class Task_2 {

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
        ArrayList<String> allPassengers = new ArrayList<String>();

        double totalExpenses;




        while(true) {
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
                    O: View passengersOrdered alphabetically by name
                    T: Print the expenses""");
            System.out.println();

            //let user input an option

            Scanner userInput = new Scanner(System.in);
            System.out.println("Enter a letter from main menu");
            String userInputLetter = userInput.nextLine();
            userInputLetter = userInputLetter.toUpperCase(); //used toUpperCase to get user input always in capital

            //V: view all code section

            if (userInputLetter.equals("V") || userInputLetter.equals("v")) {
                viewAllCabins();

            } else if (userInputLetter.equals("A") || userInputLetter.equals("a")) {
                //ask user to enter the first name, last name , and total expenses
                System.out.println("Enter the cabin number:");
                String customerCabin = userInput.nextLine();

                System.out.println("Enter the customer Firstname:");
                String customerFName = userInput.nextLine();

                System.out.println("Enter the customer Surname:");
                String customerSName = userInput.nextLine();

                System.out.println("Enter the customer expenses:");
                double customerExpenses = userInput.nextDouble();

                //adding customer details to the cabins
                if (customerCabin.equals("cabin 1")) {
                    cabins cabin_1_data= new cabins();
                    cabin_1.add(customerFName + " " + customerSName + " " + customerExpenses); //add all customer details together and add it to the cabin array
                    cabin_1_data.cabin1.add(String.valueOf(cabin_1));

                    totalExpenses=customerExpenses; 

                    passengers passengerdata= new passengers();
                    allPassengers.add(customerFName + " " + customerSName + " " + customerExpenses); //add customer details to the passenger class
                    passengerdata.passengers.add(String.valueOf(allPassengers));



                } else if(customerCabin.equals("cabin 2")){
                    cabins cabin_2_data= new cabins();
                    cabin_2.add(customerFName + " " + customerSName + " " + customerExpenses);
                    cabin_2_data.cabin2.add(String.valueOf(cabin_2));

                    double h=totalExpenses=+customerExpenses;


                    passengers passengerdata= new passengers();
                    allPassengers.add(customerFName + " " + customerSName + " " + customerExpenses);
                    passengerdata.passengers.add(String.valueOf(allPassengers));

                    //System.out.println(passengerdata.passengers);

                }else if(customerCabin.equals("cabin 3")){
                    cabins cabin_3_data= new cabins();
                    cabin_3.add(customerFName + " " + customerSName + " " + customerExpenses);
                    cabin_3_data.cabin3.add(String.valueOf(cabin_3));

                    passengers passengerdata= new passengers();
                    allPassengers.add(customerFName + " " + customerSName + " " + customerExpenses);
                    passengerdata.passengers.add(String.valueOf(allPassengers));


                }else if(customerCabin.equals("cabin 4")){
                    cabins cabin_4_data= new cabins();
                    cabin_4.add(customerFName + " " + customerSName + " " + customerExpenses);
                    cabin_4_data.cabin4.add(String.valueOf(cabin_4));


                    passengers passengerdata= new passengers();
                    allPassengers.add(customerFName + " " + customerSName + " " + customerExpenses);
                    passengerdata.passengers.add(String.valueOf(allPassengers));


                }else if(customerCabin.equals("cabin 5")){
                    cabins cabin_5_data= new cabins();
                    cabin_5.add(customerFName + " " + customerSName + " " + customerExpenses);
                    cabin_5_data.cabin5.add(String.valueOf(cabin_5));



                    passengers passengerdata= new passengers();
                    allPassengers.add(customerFName + " " + customerSName + " " + customerExpenses);
                    passengerdata.passengers.add(String.valueOf(allPassengers));

                }else if(customerCabin.equals("cabin 6")){
                    cabins cabin_6_data= new cabins();
                    cabin_6.add(customerFName + " " + customerSName + " " + customerExpenses);
                    cabin_6_data.cabin6.add(String.valueOf(cabin_6));


                    passengers passengerdata= new passengers();
                    allPassengers.add(customerFName + " " + customerSName + " " + customerExpenses);
                    passengerdata.passengers.add(String.valueOf(allPassengers));


                }else if(customerCabin.equals("cabin 7")){
                    cabins cabin_7_data= new cabins();
                    cabin_7.add(customerFName + " " + customerSName + " " + customerExpenses);
                    cabin_7_data.cabin7.add(String.valueOf(cabin_7));


                    passengers passengerdata= new passengers();
                    allPassengers.add(customerFName + " " + customerSName + " " + customerExpenses);
                    passengerdata.passengers.add(String.valueOf(allPassengers));


                }else if(customerCabin.equals("cabin 8")){
                    cabins cabin_8_data= new cabins();
                    cabin_8.add(customerFName + " " + customerSName + " " + customerExpenses);
                    cabin_8_data.cabin8.add(String.valueOf(cabin_8));


                    passengers passengerdata= new passengers();
                    allPassengers.add(customerFName + " " + customerSName + " " + customerExpenses);
                    passengerdata.passengers.add(String.valueOf(allPassengers));


                }else if(customerCabin.equals("cabin 9")){
                    cabins cabin_9_data= new cabins();
                    cabin_9.add(customerFName + " " + customerSName + " " + customerExpenses);
                    cabin_9_data.cabin9.add(String.valueOf(cabin_9));


                    passengers passengerdata= new passengers();
                    allPassengers.add(customerFName + " " + customerSName + " " + customerExpenses);
                    passengerdata.passengers.add(String.valueOf(allPassengers));


                }else if(customerCabin.equals("cabin 10")){
                    cabins cabin_10_data= new cabins();
                    cabin_10.add(customerFName + " " + customerSName + " " + customerExpenses);
                    cabin_10_data.cabin10.add(String.valueOf(cabin_10));


                    passengers passengerdata= new passengers();
                    allPassengers.add(customerFName + " " + customerSName + " " + customerExpenses);
                    passengerdata.passengers.add(String.valueOf(allPassengers));


                }else if(customerCabin.equals("cabin 11")){
                    cabins cabin_11_data= new cabins();
                    cabin_11.add(customerFName + " " + customerSName + " " + customerExpenses);
                    cabin_11_data.cabin11.add(String.valueOf(cabin_11));


                    passengers passengerdata= new passengers();
                    allPassengers.add(customerFName + " " + customerSName + " " + customerExpenses);
                    passengerdata.passengers.add(String.valueOf(allPassengers));


                }else if(customerCabin.equals("cabin 12")){
                    cabins cabin_12_data= new cabins();
                    cabin_12.add(customerFName + " " + customerSName + " " + customerExpenses);
                    cabin_12_data.cabin12.add(String.valueOf(cabin_12));


                    passengers passengerdata= new passengers();
                    allPassengers.add(customerFName + " " + customerSName + " " + customerExpenses);
                    passengerdata.passengers.add(String.valueOf(allPassengers));


                }else{
                    System.out.println("Invalid details"); //display invalid details if user input wrong details
                }

            //if user input t , this will print total expenses of the all customers   
            }else if (userInputLetter.equals("T") || userInputLetter.equals("t")){
                passengers passengerdata= new passengers();
                passengerdata.passengers.add(String.valueOf(allPassengers));


                System.out.println("All customers' expenses:");
                System.out.println();

                for(int i=0;i<allPassengers.size();i++)    //length is the property of the array
                    System.out.println(allPassengers.get(i));

                System.out.println();
                System.out.println("Total Expenses");
                System.out.println();



            //if user inputs e or E this will display empty cabins 
            }else if(userInputLetter.equals("E")||userInputLetter.equals("e")){
                if(cabin_1.size()==0){
                    System.out.println("Cabin 1");
                }if(cabin_2.size()==0){
                    System.out.println("Cabin 2");
                }if(cabin_3.size()==0){
                    System.out.println("Cabin 3");
                }if (cabin_4.size()==0){
                    System.out.println("Cabin 4");
                }if(cabin_5.size()==0){
                    System.out.println("Cabin 5");
                }if (cabin_6.size()==0){
                    System.out.println("Cabin 6");
                }if (cabin_7.size()==0){
                    System.out.println("Cabin 7");
                }if (cabin_8.size()==0){
                    System.out.println("Cabin 8");
                }if (cabin_9.size()==0){
                    System.out.println("Cabin 9");
                }if (cabin_10.size()==0){
                    System.out.println("Cabin 10");
                }if (cabin_11.size()==0){
                    System.out.println("Cabin 11");
                }if (cabin_12.size()==0){
                    System.out.println("Cabin 12");
                }
            //if user inputs d or D this will allow to delete the customer from cabins
            }else if(userInputLetter.equals("D") || userInputLetter.equals("d")){
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
            }else if(userInputLetter.equals("S") || userInputLetter.equals("s")){
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


        }

    }
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

