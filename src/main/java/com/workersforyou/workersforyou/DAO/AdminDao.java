package com.workersforyou.workersforyou.DAO;

import org.springframework.data.jpa.repository.JpaRepository;

import com.workersforyou.workersforyou.entities.Admin;


public interface AdminDao extends JpaRepository<Admin, Integer>{

}
