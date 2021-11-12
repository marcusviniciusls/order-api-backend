package br.com.order.api.backend.controller;

import br.com.order.api.backend.service.OrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;


@RestController
public class OrderController {

    @Autowired
    private OrderService orderService;



}
