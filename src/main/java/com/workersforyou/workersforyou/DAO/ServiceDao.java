package com.workersforyou.workersforyou.DAO;

import org.springframework.data.jpa.repository.JpaRepository;

import com.workersforyou.workersforyou.entities.Service;

public interface ServiceDao extends JpaRepository<Service, Integer>  {

}
