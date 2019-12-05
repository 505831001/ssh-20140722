package com.liuweiwei.ssh.service;

import java.util.List;

import com.liuweiwei.ssh.dao.DepartmentDao;
import com.liuweiwei.ssh.entity.Department;

public class DepartmentService {
	
	private DepartmentDao departmentDao;
	
	public void setDepartmentDao(DepartmentDao departmentDao) {
		this.departmentDao = departmentDao;
	}
	
	public List<Department> getAll(){
		return departmentDao.getAll();
	}
	
}
