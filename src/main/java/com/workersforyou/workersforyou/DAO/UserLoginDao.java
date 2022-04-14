package com.workersforyou.workersforyou.DAO;

import org.springframework.data.jpa.repository.JpaRepository;

import com.workersforyou.workersforyou.entities.UserLogin;

public interface UserLoginDao extends JpaRepository<UserLogin, String>{

}
