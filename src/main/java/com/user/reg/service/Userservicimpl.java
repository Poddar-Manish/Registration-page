package com.user.reg.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.user.reg.entity.Emp;
import com.user.reg.repo.Userrepo;

import java.util.Arrays;

@Service
public class Userservicimpl implements Userservice {
    @Autowired
    private Userrepo userrepo;

    @Override
    public void  register(Emp emp) {
        userrepo.save(emp);
    }

}
