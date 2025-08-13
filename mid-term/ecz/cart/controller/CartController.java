package com.ecz.cart.controller;


import com.ecz.cart.entity.Cart;
import com.ecz.cart.entity.CartItem;
import com.ecz.cart.service.CartService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/cart")
public class CartController {

    private final CartService cartService;
    public CartController(CartService cartService) {
        this.cartService = cartService;
    }

    @PostMapping("/create/{userId}")
    public ResponseEntity<Cart> createCart(@PathVariable Long userId) {
        return ResponseEntity.ok(cartService.createCart(userId));
    }

    @GetMapping("/{cartId}")
    public ResponseEntity<Cart> getCart(@PathVariable Long cartId) {
        return cartService.getCart(cartId)
                .map(ResponseEntity::ok)
                .orElse(ResponseEntity.notFound().build());
    }

    @PostMapping("/{cartId}/add")
    public ResponseEntity<String> addItem(@PathVariable Long cartId, @RequestBody CartItem item) {
        cartService.addItem(cartId, item);
        return ResponseEntity.ok("Item added to cart");
    }

    @DeleteMapping("/{cartId}/remove/{productId}")
    public ResponseEntity<String> removeItem(@PathVariable Long cartId, @PathVariable Long productId) {
        cartService.removeItem(cartId, productId);
        return ResponseEntity.ok("Item removed from cart");
    }

    @DeleteMapping("/{cartId}/clear")
    public ResponseEntity<String> clearCart(@PathVariable Long cartId) {
        cartService.clearCart(cartId);
        return ResponseEntity.ok("Cart cleared");
    }
}
