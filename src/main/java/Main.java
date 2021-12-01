import basketFactory.Basket;
import handlers.PrintToUserInfo;
import handlers.UserInputHelper;

public class Main {

    public static void main(String[] args) {


        Basket myBasket = new Basket();
        for (int i =0; i<5; i++){
            myBasket.addProductToBasket(UserInputHelper.getProductName(), UserInputHelper.getProductPrice(), UserInputHelper.getQuantity());
        }

        PrintToUserInfo.printOrderLines(myBasket.getBasketLists());
        PrintToUserInfo.printTotalBasketCost(myBasket);
    }
}
