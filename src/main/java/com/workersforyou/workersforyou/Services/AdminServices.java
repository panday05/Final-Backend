package com.workersforyou.workersforyou.Services;

import java.util.List;

import com.workersforyou.workersforyou.entities.Admin;


public interface AdminServices {

	
	List <Admin>findAllAdmins();
    Admin findByAdminId(int adminId);
    Admin findByUserId(int userId);
    void updateAdmin(Admin admin);
}