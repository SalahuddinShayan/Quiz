package com.backend.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.backend.Entity.Quiz1;

@Repository
public interface Quiz1Repository extends JpaRepository <Quiz1, Integer> {

}
