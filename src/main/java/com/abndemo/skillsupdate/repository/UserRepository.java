package com.abndemo.skillsupdate.repository;

import java.util.List;

import com.abndemo.skillsupdate.model.User;
import org.springframework.data.repository.CrudRepository;

public interface UserRepository extends CrudRepository<User, Long> {

    List<User> findByLastName(String lastName);

    User findById(long id);
}
