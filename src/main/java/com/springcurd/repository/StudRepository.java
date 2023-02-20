package com.springcurd.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.springcurd.model.Login;
@Repository
public interface StudRepository extends JpaRepository<Login, Integer>
{

}
