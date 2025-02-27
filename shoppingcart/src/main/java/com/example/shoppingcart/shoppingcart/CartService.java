package com.example.shoppingcart.shoppingcart;

import org.springframework.stereotype.Service;
import java.util.ArrayList;
import java.util.List;

@Service
public class CartService {
    public List<CartModel> cartList = new ArrayList<CartModel>();

    //return all items in the cart
    public List<CartModel> getCartList() {
        return cartList;
    }

    //add item to the cart 
    public void addCartItem(CartModel cart){
        cartList.add(cart);
    }

    //remove item from cart
    public void removeCartItem(int id){

    }

    //update item in the cart
    public void updateCartItem(CartModel cart){
        for (CartModel item : cartList) {
            if (item.getId() == cart.getId()) {
                item.setName(cart.getName());
                item.setPrice(cart.getPrice());
                item.setQuantity(cart.getQuantity());
                break;
            }
        }

    }
    //delete item from cart
    public void deleteCartItem(int id){
        cartList.removeIf(item -> item.getId() == id);
    }

/*        if (item.getId() == cart.getId){
            cartList.remove(item);
            break;
        }
    }*/
}