package com.liuweiwei.ssh.dao;

import java.util.List;

import com.liuweiwei.ssh.entity.Department;

public class DepartmentDao extends BaseDao{

	public List<Department> getAll(){
		String hql = "FROM Department";
		return getSession().createQuery(hql).list();
	}
	
}
