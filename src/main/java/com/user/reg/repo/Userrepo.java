package com.user.reg.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.user.reg.entity.Emp;

@Repository
public interface Userrepo extends JpaRepository<Emp, String> {

}
