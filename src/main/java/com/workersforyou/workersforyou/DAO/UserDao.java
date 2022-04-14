package com.workersforyou.workersforyou.DAO;



import org.springframework.data.jpa.repository.JpaRepository;

import com.workersforyou.workersforyou.entities.User;

public interface UserDao  extends JpaRepository<User, Integer>{

}
