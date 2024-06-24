package com.apiweb.ApiWeb.repository;

import com.apiweb.ApiWeb.entity.Orders;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface OrdersRepository extends JpaRepository<Orders, Long>{
}
