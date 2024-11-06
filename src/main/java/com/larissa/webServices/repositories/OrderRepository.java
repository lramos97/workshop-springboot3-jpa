package com.larissa.webServices.repositories;

import com.larissa.webServices.entities.Order;
import com.larissa.webServices.entities.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface OrderRepository extends JpaRepository<Order, Long> {
}
