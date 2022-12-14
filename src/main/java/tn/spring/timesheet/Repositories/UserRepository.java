package tn.spring.timesheet.Repositories;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import tn.spring.timesheet.entities.User;

@Repository
public interface UserRepository extends CrudRepository<User, Integer> {

}
