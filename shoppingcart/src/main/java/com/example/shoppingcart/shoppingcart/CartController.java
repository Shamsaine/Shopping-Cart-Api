package com.example.shoppingcart.shoppingcart;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.bean.factory.annotation.Autowired;
import java.util.List;

@Controller
public class CartController {

    @Autowired
    public CartService cartservice;

    @GetMapping("/cart")
    @ResponseBody
    public List<CartModel> getAll(){
        return cartservice.getCartList();
    }
    
    @PostMapping("/cart")
    @ResponseBody
    public String addCartItem(@ResponseBody CartModel cart) {
        cartservice.addCartItem(cart);
        return "item added successfully";
    }

    @PutMapping("/cart/{id}")
    @ResponseBody
    public String updateCartItem(@PathVariable int id, @RequestBody CartModel cart) {
        cart.setId(id);
        cartservice.updateCartItem(cart);
        return "item updated successfully";
    }

    @DeleteMapping("/cart/{id}")
    @ResponseBody
    public String deleteCartItem(@PathVariable int id) {
        cartservice.deleteCartItem(id);
        return "item deleted successfully";
    }
}
