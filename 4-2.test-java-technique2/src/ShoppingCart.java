import java.util.LinkedList;
import java.util.List;

public class ShoppingCart {
    List<Item> lists;

    public ShoppingCart(){
        lists = new LinkedList<Item>();
    }
        public int getTotalPrice(){
            int totalPrice = 0;
            for(Item items:lists){
                totalPrice += items.getPrice();
            }
            return totalPrice;
        }

        public int getAveragePrice(){
            int average = 0;
            int total = 0;
            int num = 0;
            total = getTotalPrice();
            num = lists.size();
            average = total / num;
            return average;

        }

    
}
