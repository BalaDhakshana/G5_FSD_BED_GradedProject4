package com.greatlearning.ems.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.greatlearning.ems.entity.Role;

public interface RoleRepository extends JpaRepository<Role, Integer> {

}
