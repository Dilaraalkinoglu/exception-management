package com.dilaraalk.controller;

import com.dilaraalk.dto.DtoEmployee;
import com.dilaraalk.model.RootEntity;

public interface RestEmployeeController {
	
	public RootEntity<DtoEmployee> findEmployeeById(Long id);

}
