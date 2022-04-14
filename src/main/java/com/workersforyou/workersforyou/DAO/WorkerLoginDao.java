package com.workersforyou.workersforyou.DAO;

import org.springframework.data.jpa.repository.JpaRepository;

import com.workersforyou.workersforyou.entities.WorkerLogin;

public interface WorkerLoginDao extends JpaRepository<WorkerLogin, Integer> {

}
