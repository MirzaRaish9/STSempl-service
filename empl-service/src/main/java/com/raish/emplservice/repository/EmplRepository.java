package com.raish.emplservice.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.raish.emplservice.model.Empl;
@Repository
public interface EmplRepository extends JpaRepository<Empl, Integer>{

}
