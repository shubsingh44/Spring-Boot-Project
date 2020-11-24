package com.shubham.Dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.shubham.model.Drugs;
import com.shubham.model.User;

@Repository
public interface DrugRepository extends JpaRepository<Drugs,Long>{

}
