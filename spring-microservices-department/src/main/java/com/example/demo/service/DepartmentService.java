

package com.example.demo.service;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.controller.DepartmentController;
import com.example.demo.entity.Department;
import com.example.demo.repository.DepartmentRepository;

import lombok.extern.slf4j.Slf4j;



@Service
@Slf4j
public class DepartmentService {

	Logger log = LoggerFactory.getLogger(DepartmentController.class);
	
	@Autowired
	private DepartmentRepository departmentRepository;
	

	public Department saveDepartment(Department department) {
		log.info("Entered in service" + department);
		//log.info("Hiiiii");
		return departmentRepository.save(department);
	}
	
	public Department findDepartmentById(Long departmentId)
	{
	return departmentRepository.findByDepartmentId(departmentId);
	}
	
}

