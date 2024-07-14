package com.manik.orders.service;

import com.manik.orders.entity.Order;
import com.manik.orders.repository.OrderRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class OrderService {
    private final OrderRepository orderRepository;

    public Order save(Order order){
        return orderRepository.save(order);
    }
}
