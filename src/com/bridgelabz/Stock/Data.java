package com.bridgelabz.Stock;

        import java.util.ArrayList;
        import java.util.HashMap;
        import java.util.Scanner;

public class Data {

    static ArrayList<String> HolderName = new ArrayList<>();
    static ArrayList<Integer> AccountBalance = new ArrayList<>();
    static ArrayList<Integer> TataStocks = new ArrayList<>();
    static ArrayList<Integer> AppleStocks = new ArrayList<>();
    static ArrayList<Integer> RelianceStocks = new ArrayList<>();
    static ArrayList<Integer> MahindraStocks = new ArrayList<>();

    // defining function for action
    void AddAccount(){
        Scanner sc1 = new Scanner(System.in);
        System.out.println("Enter the first name");
        String in1 = sc1.nextLine();
        HolderName.add(in1);

        System.out.println("Enter the amount you want to deposit");
        int in2 = sc1.nextInt();
        AccountBalance.add(in2);

        TataStocks.add(0);
        AppleStocks.add(0);
        RelianceStocks.add(0);
        MahindraStocks.add(0);
    }

    void Display(int a){
        System.out.println("The account name is " + HolderName.get(a));
        System.out.println("The account balance is " + AccountBalance.get(a));
        System.out.println("The Number of Tata Stocks are " + TataStocks.get(a));
        System.out.println("The Number of apple Stocks are " + AppleStocks.get(a));
        System.out.println("The Number of reliance Stocks are " + RelianceStocks.get(a));
        System.out.println("The Number of Mahindra Stocks are " + MahindraStocks.get(a));
    }

}