package com.pratian.AppointmentService.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import com.pratian.AppointmentService.Entities.Test;

public interface TestRepo extends JpaRepository<Test, Long> {
	
	@Query("select t from Test t  where t.testId= :id")
	public Test getTestId(@Param(value="id") long id);
	
	@Query("select m from Test m  where m.testName= :name")
	public Test getTestName(@Param(value="name") String name);
	

}
