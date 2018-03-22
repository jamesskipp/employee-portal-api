package main.java;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource(collectionResourceRel = "employee", path = "employees")
public interface EmployeeRepository extends MongoRepository<Employee, String> {
	
}