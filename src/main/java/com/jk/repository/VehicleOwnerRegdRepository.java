package com.jk.repository;

import java.io.Serializable;
import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.jk.entity.VehicleOwnerDetlsEntity;

@Repository
public interface VehicleOwnerRegdRepository extends JpaRepository<VehicleOwnerDetlsEntity, Serializable>{
	
	VehicleOwnerDetlsEntity findByPid(int ownerID);
}
