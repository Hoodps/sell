package com.hoodps.demo.repository;

import com.hoodps.demo.dataobject.OrderDetail;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface OrderDetailRepository extends JpaRepository<OrderDetailRepository, String> {

    List<OrderDetail> findByOrderId(String orderId);

}
