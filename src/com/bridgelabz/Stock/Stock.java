package com.bridgelabz.Stock;
import java.util.Scanner;

public class Stock extends Data{

    public static void main(String[] args) {
        int exit = 99;
        Stock obj = new Stock();

        int Tata = 1150;
        int Apple = 1075;
        int Reliance = 1250;
        int Mahindra = 1650;


        while (exit == 99){
            System.out.println("Enter the following :");
            System.out.println("1. Create an account");
            System.out.println("2. Search Existing account");
            System.out.println("3. Account Status");
            System.out.println("4. Exit");

            Scanner sc2 = new Scanner(System.in);
            int in2 = sc2.nextInt();

            if (in2 == 1){
                obj.AddAccount();
            } else if (in2 == 2) {
                System.out.println("Enter the first name");
                Scanner sc3 = new Scanner(System.in);
                String inp = sc3.nextLine();

                if (HolderName.contains(inp)){
                    int b =HolderName.indexOf(inp);
                    obj.Display(b);
                    System.out.println("                         ");
                    System.out.println("Enter the following ");
                    System.out.println("1 Buy stock");
                    System.out.println("2 Sell stock");

                    Scanner sc4 = new Scanner(System.in);
                    int g = sc4.nextInt();

                    //===========================Buying stocks=====================================

                    if (g == 1){
                        System.out.println(" Choose one of the following stocks 1. Tata  2. Apple  3. Reliance 4. Mahindra");
                        int h = sc4.nextInt();
                        if (h == 1){
                            if (AccountBalance.get(b)<Tata){
                                System.out.println("you do not have enough balance");
                            }else {
                                int c =AccountBalance.get(b) - Tata;
                                AccountBalance.add(b,c);
                                int l = TataStocks.get(b) +1;
                                TataStocks.add(b,l);
                                System.out.println("You bought 1 unit of stock");
                            }
                        } else if (h == 2) {
                            if (AccountBalance.get(b)<Apple){
                                System.out.println("you do not have enough balance");
                            }else {
                                int c =AccountBalance.get(b) - Apple;
                                AccountBalance.add(b,c);
                                int l = AppleStocks.get(b) +1;
                                AppleStocks.add(b,l);
                                System.out.println("You bought 1 unit of stock");
                            }
                        } else if (h == 3) {
                            if (AccountBalance.get(b)<Reliance){
                                System.out.println("you do not have enough balance");
                            }else {
                                int c =AccountBalance.get(b) - Reliance;
                                AccountBalance.add(b,c);
                                int l = RelianceStocks.get(b) +1;
                                RelianceStocks.add(b,l);
                                System.out.println("You bought 1 unit of stock");
                            }
                        } else if (h == 4) {
                            if (AccountBalance.get(b)<Mahindra){
                                System.out.println("you do not have enough balance");
                            }else {
                                int c =AccountBalance.get(b) - Mahindra;
                                AccountBalance.add(b,c);
                                int l = MahindraStocks.get(b) +1;
                                MahindraStocks.add(b,l);
                                System.out.println("You bought 1 unit of stock");
                            }
                        }else {
                            System.out.println("Enter invalid input");
                        }

                        //============================Selling stocks===============================================

                    } else if (g == 2) {
                        obj.Display(2);
                        System.out.println(" Choose one of the following stocks 1. Tata  2. Apple  3. Reliance 4. Mahindra");
                        int n = sc4.nextInt();
                        if (n == 1){
                            if (TataStocks.get(b)<1){
                                System.out.println("You do not have any stock");
                            } else if (TataStocks.get(b)>1) {
                                int d =AccountBalance.get(b) + Tata;
                                AccountBalance.add(b,d);
                                int l = TataStocks.get(b) -1;
                                TataStocks.add(b,l);
                                System.out.println("One unit of stock is sold");
                            }
                        } else if (n == 2) {
                            if (AppleStocks.get(b)<1){
                                System.out.println("You do not have any stock");
                            } else if (AppleStocks.get(b)>1) {
                                int d =AccountBalance.get(b) + Apple;
                                AccountBalance.add(b,d);
                                int l = AppleStocks.get(b) -1;
                                AppleStocks.add(b,l);
                                System.out.println("One unit of stock is sold");
                            }
                        } else if (n == 3) {
                            if (RelianceStocks.get(b)<1){
                                System.out.println("You do not have any stock");
                            } else if (RelianceStocks.get(b)>1) {
                                int d =AccountBalance.get(b) + Reliance;
                                AccountBalance.add(b,d);
                                int l = RelianceStocks.get(b) +1;
                                RelianceStocks.add(b,l);
                                System.out.println("One unit of stock is sold");
                            }
                        } else if (n == 4) {
                            if (MahindraStocks.get(b)<1){
                                System.out.println("You do not have any stock");
                            } else if (MahindraStocks.get(b)>1) {
                                int d =AccountBalance.get(b) + Mahindra;
                                AccountBalance.add(b,d);
                                int l = MahindraStocks.get(b) +1;
                                MahindraStocks.add(b,l);
                                System.out.println("One unit of stock is sold");
                            }
                        }
                    }else {
                        System.out.println("Invalid output");
                    }
                }

            }
            else if (in2 == 3){
                System.out.println("Enter the first name");
                Scanner sc7 = new Scanner(System.in);
                String inp7 = sc7.nextLine();

                if (HolderName.contains(inp7)) {
                    int b = HolderName.indexOf(inp7);
                    obj.Display(b);
                }
            } else if (in2 == 4) {
                exit = 100;

            }
        }
    }
}