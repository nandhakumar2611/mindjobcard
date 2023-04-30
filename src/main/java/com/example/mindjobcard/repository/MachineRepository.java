package com.example.mindjobcard.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.mindjobcard.model.Machine;

@Repository
public interface MachineRepository extends JpaRepository<Machine, Long>{

}