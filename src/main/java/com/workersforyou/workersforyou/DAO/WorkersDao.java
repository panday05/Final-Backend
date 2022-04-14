package com.workersforyou.workersforyou.DAO;


import org.springframework.data.jpa.repository.JpaRepository;
import com.workersforyou.workersforyou.entities.Worker;

public interface WorkersDao extends JpaRepository<Worker, Integer> {


}
