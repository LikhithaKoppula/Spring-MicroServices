package com.example.demo.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import com.example.demo.VO.Department;
import com.example.demo.VO.ResponseTemplateVO;
import com.example.demo.entity.User;
import com.example.demo.repository.UserRepository;

@Service
public class UserService {
	
	@Autowired
	private  UserRepository userRepository;
	
	@Autowired
	private RestTemplate restTemplate;

	public User saveUser(User user) {
		// TODO Auto-generated method stub
		return userRepository.save(user);
	}

	public ResponseTemplateVO getUserwithDepartment(Long userId) {
		ResponseTemplateVO vo = new ResponseTemplateVO();
		
		User user=userRepository.findByUserId(userId);
		
		Department department = restTemplate.getForObject("http://DEPARTMENTSERVICE/departments/" + user.getDepartmentId() , Department.class);
// TODO Auto-generated method stub
		
		vo.setUser(user);
		vo.setDepartment(department);
	
		
		return vo;
	}

	
}
