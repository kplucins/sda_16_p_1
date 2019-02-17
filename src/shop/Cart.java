package shop;

import java.util.*;

public class Cart {
    private User user;
    private Set<CartProduct> cartProducts = new HashSet<>();

    public Cart(User user) {
        this.user = user;
    }

    public void addProduct(Product product) {
        CartProduct cartProductTemp = cartProducts.stream()
                .filter(cartProduct -> cartProduct.getProduct().equals(product))
                .findAny()
                .orElse(null);
        if (cartProductTemp == null) {
            cartProductTemp = new CartProduct();
            cartProductTemp.setCart(this);
            cartProductTemp.setPrice(product.getPrice());
            cartProductTemp.setProduct(product);
            cartProductTemp.setQuantity(1);
        } else {
            cartProductTemp.setQuantity(cartProductTemp.getQuantity() + 1);
        }
        cartProducts.add(cartProductTemp);
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public List<CartProduct> getCartProducts() {
        return cartProducts;
    }

    public void setCartProducts(List<CartProduct> cartProducts) {
        this.cartProducts = cartProducts;
    }
}
