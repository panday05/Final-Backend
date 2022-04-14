package com.workersforyou.workersforyou.DAO;

import org.springframework.data.jpa.repository.JpaRepository;

import com.workersforyou.workersforyou.entities.Payment;

public interface PaymentDao extends JpaRepository<Payment, Integer> {

}
