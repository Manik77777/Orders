package com.manik.orders.controller;

import com.manik.orders.entity.Order;
import com.manik.orders.service.OrderService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
@RequestMapping("/order")
@RequiredArgsConstructor
public class OrderController {
    private final OrderService orderService;

    @PostMapping
    private ResponseEntity<Order> save(@RequestBody Order order){
        return ResponseEntity.ok(orderService.save(order));
    }
}
