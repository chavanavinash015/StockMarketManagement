package com.bridgelabz.oops;

import java.util.Scanner;

public class Stock {
        String name;
        int numberOfShares;
        int sharePrice;
        int value;
        static Scanner sc = new Scanner(System.in);

        public Stock(String name, int numberOfShares, int sharePrice, int value) {
            super();
            this.name = name;
            this.numberOfShares = numberOfShares;
            this.sharePrice = sharePrice;
            this.value = value;
        }

        public Stock() {

        }

        @Override
        public String toString() {
            return "Stock{" +
                    "Name='" + name + '\'' +
                    ", NumberOfShares=" + numberOfShares +
                    ", SharePrice=" + sharePrice +
                    ", Value=" + value +
                    '}';
        }

        public String getName() {
            return name;
        }

        public int getNumberOfShares() {
            return numberOfShares;
        }

        public int getSharePrice() {
            return sharePrice;
        }

        public int getValue() {
            return value;
        }

        public void addStocks(StockPortfolio portfolio) {

            System.out.print("\n\nEnter the number of Stocks existing in the Portfolio : ");
            int numberOfStocks = sc.nextInt();

            for (int index = 0; index < numberOfStocks; index++) {
                System.out.println("\nStock "+(index+1));
                System.out.print("Enter the name of the stock :	");
                String name = sc.next();
                System.out.print("Enter the number of shares :	");
                int shares = sc.nextInt();
                System.out.print("Enter the price of the share of this stock :	");
                int price = sc.nextInt();
                int value = calculateStockValue(shares, price);

                Stock stock = new Stock(name, shares, price, value);
                portfolio.addToPortfolio(stock);
            }
        }

        public int calculateStockValue(int shares, int stockPrice) {
            return (shares * stockPrice);
        }
    }




