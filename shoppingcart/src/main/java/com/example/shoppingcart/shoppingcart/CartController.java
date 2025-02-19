package com.example.shoppingcart.shoppingcart;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.beans.factory.annotation.Autowired;
import java.util.List;

@Controller
public class CartController {

    //what it was before the dependency injection
    //@Autowired
    //public CartService cartservice;

    private final CartService cartService;

    // Using constructor injection to replace the initial design
    @Autowired
    public CartController(CartService cartService) {
        this.cartService = cartService;
    }

    @GetMapping("/cart")
    @ResponseBody
    public List<CartModel> getAll() {
        return cartService.getCartList();
    }
    
    @PostMapping("/cart")
    @ResponseBody
    public String addCartItem(@RequestBody CartModel cart) {
        cartService.addCartItem(cart);
        return "item added successfully";
    }

    @PutMapping("/cart/{id}")
    @ResponseBody
    public String updateCartItem(@PathVariable int id, @RequestBody CartModel cart) {
        cart.setId(id);
        cartService.updateCartItem(cart);
        return "item updated successfully";
    }

    @DeleteMapping("/cart/{id}")
    @ResponseBody
    public String deleteCartItem(@PathVariable int id) {
        cartService.deleteCartItem(id);
        return "item deleted successfully";
    }
}
