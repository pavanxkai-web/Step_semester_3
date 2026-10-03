class Cart {
    private int[] prices;
    private int itemCount;
    private final String cartId;

    Cart(String cartId, int capacity) {
        this.cartId = cartId;
        prices = new int[Math.max(0, capacity)];
        itemCount = 0;
    }

    public void addItem(int price) {
        if (price >= 0 && itemCount < prices.length) {
            prices[itemCount] = price;
            itemCount++;
        } else {
            System.out.println("Cannot add item.");
        }
    }

    public int getTotal() {
        int total = 0;

        for (int i = 0; i < itemCount; i++) {
            total += prices[i];
        }

        return total;
    }

    public int getItemCount() {
        return itemCount;
    }

    public String getCartId() {
        return cartId;
    }
}

public class ShoppingCartProgram {
    public static void main(String[] args) {
        Cart cart = new Cart("CART-5", 20);

        cart.addItem(250);
        cart.addItem(99);
        cart.addItem(151);

        System.out.println("Cart ID: " + cart.getCartId());
        System.out.println("Total price: " + cart.getTotal());
        System.out.println("Item count: " + cart.getItemCount());
    }
}