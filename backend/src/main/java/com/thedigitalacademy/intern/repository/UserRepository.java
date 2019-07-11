package com.thedigitalacademy.intern.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.thedigitalacademy.intern.entity.User;

@Repository   
//CrudRepository what is the purpose
public interface UserRepository extends CrudRepository<User,String> {

}
