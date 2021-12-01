package handlers;

import java.math.BigDecimal;
import java.util.Scanner;

public class UserInputHelper {
    public static String getProductName() {
        PrintToUserInfo.askForProductName();
        Scanner scanner = new Scanner(System.in);
        return scanner.nextLine();
    }

    public static int getQuantity() {
        PrintToUserInfo.askForProductQuantity();
        Scanner scanner = new Scanner(System.in);
        return scanner.nextInt();
    }

    public static BigDecimal getProductPrice() {
        PrintToUserInfo.askForProductPrice();
        Scanner scanner = new Scanner(System.in);
        return scanner.nextBigDecimal();
    }
}
