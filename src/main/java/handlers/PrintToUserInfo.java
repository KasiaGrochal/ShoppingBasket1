package handlers;

import basketFactory.Basket;
import basketFactory.OrderLine;

import java.util.List;

public class PrintToUserInfo {
    public static void askForProductName() {
        System.out.println("Please type in the name of the product: ");
    }

    public static void askForProductPrice() {
        System.out.println("Please type in the price of the product: ");
    }

    public static void askForProductQuantity() {
        System.out.println("Please type in the quantity: ");
    }

   public static void printTotalBasketCost(Basket basket){
       System.out.println("Total basket cost is: " +basket.getBasketTotal());
   }
    public static void printOrderLines(List<OrderLine> basketLists){
        System.out.println("Your basket summary: ");
        for(OrderLine orderLine :basketLists){
            System.out.println("\t"+orderLine.toString());
        }
    }
}
