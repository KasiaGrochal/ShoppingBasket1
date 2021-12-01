package basketFactory;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

public class Basket {


    public List<OrderLine> getBasketLists() {
        return basketLists;
    }

    List<OrderLine> basketLists;

    public Basket() {
        basketLists = new ArrayList<>();
    }

    public void addProductToBasket(String productName, BigDecimal price, int quantity){
        for (OrderLine orderLine: basketLists){
            if (isProductAlreadyinTheBasket(productName,orderLine.getProduct())){
                orderLine.setQuantity(orderLine.getQuantity()+quantity);
                orderLine.setTotalCost(BigDecimal.valueOf(orderLine.getQuantity()).multiply(orderLine.getProduct().getPrice()));
                return;
            }
        }
        addNewProductToBasket(new Product(productName,price),quantity);

    }

    public boolean isProductAlreadyinTheBasket(String productName, Product product){
       return product.getName().equals(productName);
    }

    public void addNewProductToBasket(Product product, int quantity){
        basketLists.add(new OrderLine(product,quantity));
    }



    public BigDecimal getBasketTotal(){
        BigDecimal total = BigDecimal.valueOf(0);
        for (OrderLine orderLine: basketLists){
            total = total.add(orderLine.getTotalCost());
        }
        return total;
    }
}
