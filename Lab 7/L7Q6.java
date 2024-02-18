package lab7;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;

public class L7Q6 {
    public static void main(String[] args) {
        //Write programs that merge data from two text files namely product.txt and order.txt. 
        //The product.txt contains the ProductID, ProductName, ProductPrice separated by comma. 
        //The order.txt contains the OrderID, ProductID, OrderQuantiy separated by comma. 
        //You program will display the ProductID, ProductName, OrderQuantity, PricePerUnit and TotalPrice for each order. 
        //(You can use the String.split(), Integer.parseInt(String) and Double.parseDouble(String))
        
        //to split() can only be use array
        try {
            System.out.printf("%-10s%-21s%-10s%-14s%-7s\n", "ProductID", "ProductName", "Quantity", "PricePerUnit", "Total");
            Scanner input1 = new Scanner(new FileInputStream("order.txt"));
            String[] order, product;
            String temp, productName = "";
            int quantity = 0;
            double price = 0;
            
            while (input1.hasNextLine()) {
                temp = input1.nextLine();
                order = temp.split(",");
                //string to integer
                quantity = Integer.parseInt(order[2]);
                
                Scanner input2 = new Scanner(new FileInputStream("product.txt"));
                while (input2.hasNextLine()) {
                    temp = input2.nextLine();
                    product = temp.split(",");
                    if (order[1].equals(product[0])) {
                        productName = product[1];
                        price = Double.parseDouble(product[2]);
                        break;
                    }
                }
                input2.close();
                System.out.printf("%-10s%-21s", order[1], productName);
                System.out.printf("%-10d%-14.2f%-7.2f\n", quantity, price, quantity * price);
            }
            input1.close();
        } catch (FileNotFoundException e) {
            System.out.println("File was not found");
        }
    }
}

/*
        try {
            String[] orderId = new String[5];
            String[] product = new String[5];
            int[] quantity = new int[5];
            
            String[] productId = new String[7];
            String[] name = new String[7];
            double[] price = new double[7];
 
            Scanner scs = new Scanner(new FileInputStream("order.txt"));
            Scanner sc = new Scanner(new FileInputStream("product.txt"));
            
            int orderIndex = 0;
            while (scs.hasNextLine()){
                String[] temp = scs.nextLine().split(",");
                    orderId[orderIndex] = temp[0];
                    product[orderIndex] = temp[1];
                    quantity[orderIndex] = Integer.parseInt(temp[2]);
                    orderIndex++;
            }
            
            int productIndex = 0;
            while (sc.hasNextLine()){
                String[] temp = sc.nextLine().split(",");
                    productId[productIndex] = temp[0];
                    name[productIndex] = temp[1];
                    price[productIndex] = Double.parseDouble(temp[2]);
                    productIndex++;
            }                   
            
            
            System.out.printf("%-10s%-21s%-10s%-14s%-7s\n", "ProductID", "ProductName", "Quantity", "PricePerUnit", "Total");
            for (int i=0; i<orderId.length; i++){
                for (int j=0; j<productId.length; j++){
                    if (productId[j].equals(product[i])){
                        System.out.printf("%-10s%-21s%-10s%-14s%-7s", productId[j], name[j],quantity[i],price[j],price[j]*quantity[i]);
                        System.out.println("");
                    }
                }
            }
            
            sc.close();
            scs.close();
        } catch (IOException e){
            System.out.println("Problem with input file.");
        }
    }
}
*/