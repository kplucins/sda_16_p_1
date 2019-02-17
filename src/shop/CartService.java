package shop;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class CartService {

    private Map<Long, Cart> carts = new HashMap<>();
    private Map<Long, List<Cart>> oldCarts = new HashMap<>();

    public void addProduct(Product product) {
        Long userId = MainShop.user.getId();
        Cart currentCart = getCart(userId);
        CartProduct cartProduct = new CartProduct();
        cartProduct.s
        currentCart.getCartProducts().add(cartProduct);
        addCartToMap(userId,currentCart);
    }

    public Cart getCart(Long userId) {
        return carts.getOrDefault(userId, new Cart());
    }

    private void addCartToMap(Long userId, Cart newCart){
        carts.put(userId,newCart);
    }
}
