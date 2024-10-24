package com.example.Weather_Info._for_Pincode.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.Weather_Info._for_Pincode.model.Pincode;



@Repository
public interface PincodeRepository extends JpaRepository<Pincode, Integer> {

}
