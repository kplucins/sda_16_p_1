package shop;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class CartService {

    private Map<Long,Cart> carts = new HashMap<>();
    private Map<Long, List<Cart>> oldCarts = new HashMap<>();

    public void addProduct(Product product){

    }

    public Cart getCart(Long userId){
        
    }
}
