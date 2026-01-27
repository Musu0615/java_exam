public class Exam5 {
    public static void main(String[] args) {
        int total = 0;
        int average = 0;
        ShoppingCart shoppingcart = new ShoppingCart();
        Item items1 = new Item();
        items1.setName("アナと雪の女王");
        items1.setPrice(3000);

        Item items2 = new Item();
        items2.setName("美女と野獣");
        items2.setPrice(2000);

        Item items3 = new Item();
        items3.setName("モアナと伝説の海");
        items3.setPrice(8000);

        total = shoppingcart.getTotalPrice();
        average = shoppingcart.getAveragePrice();
        System.out.println("合計値：" + total + "円");
        System.out.println("平均値" + average + "円");
    }
}
