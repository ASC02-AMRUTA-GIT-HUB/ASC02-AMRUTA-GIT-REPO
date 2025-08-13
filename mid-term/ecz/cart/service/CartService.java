package com.ecz.cart.service;

import com.ecz.cart.entity.Cart;
import com.ecz.cart.entity.CartItem;
import org.springframework.stereotype.Service;

import java.util.*;

@Service
public class CartService {
    // In-memory store: cartId -> Cart
    private final Map<Long, Cart> carts = new HashMap<>();
    private Long cartSequence = 1L;

    public Cart createCart(Long userId) {
        Cart cart = new Cart(cartSequence++, userId);
        carts.put(cart.getCartId(), cart);
        return cart;
    }

    public Optional<Cart> getCart(Long cartId) {
        return Optional.ofNullable(carts.get(cartId));
    }

    public void addItem(Long cartId, CartItem item) {
        Cart cart = carts.get(cartId);
        if (cart != null) {
            Optional<CartItem> existing = cart.getItems().stream()
                    .filter(i -> i.getProductId().equals(item.getProductId()))
                    .findFirst();
            if (existing.isPresent()) {
                existing.get().setQuantity(existing.get().getQuantity() + item.getQuantity());
            } else {
                cart.getItems().add(item);
            }
        }
    }

    public void removeItem(Long cartId, Long productId) {
        Cart cart = carts.get(cartId);
        if (cart != null) {
            cart.getItems().removeIf(i -> i.getProductId().equals(productId));
        }
    }

    public void clearCart(Long cartId) {
        Cart cart = carts.get(cartId);
        if (cart != null) {
            cart.getItems().clear();
        }
    }
}
