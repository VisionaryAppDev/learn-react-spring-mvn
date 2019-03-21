package com.okta.developer.jugtours.demo;

import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.PagingAndSortingRepository;

/**
 * EmployeeRepository
 */
public interface EmployeeRepository extends PagingAndSortingRepository<Employee, Long> {

}