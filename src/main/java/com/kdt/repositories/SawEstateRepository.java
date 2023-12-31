package com.kdt.repositories;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.kdt.domain.entities.SawEstate;

public interface SawEstateRepository extends JpaRepository<SawEstate, String>{
	
//	@Query("SELECT new com.kdt.domain.entities.SawEstate(e.address1, e.title, a.approvalCode, "
//			+ "(SELECT i.sysName FROM EstateImage i WHERE i.parentId = e.estateId ORDER BY i.seq ASC LIMIT 1)) "
//			+ "FROM Estate e "
//			+ "JOIN ReviewApproval a ON e.estateId = a.estateCode "
//			+ "WHERE a.userId = ?1")
//	List<SawEstate> selectSawEstate(String id);
//	@Query("SELECT new com.kdt.domain.entities.SawEstate(e.address1, e.title, a.approvalCode,"
//			+ "(SELECT i.sysName FROM EstateImage i WHERE i.parentId = e.estateId ORDER BY i.seq ASC LIMIT 1), e.estateId) "
//			+ "FROM Estate e "
//			+ "JOIN ReviewApproval a ON e.estateId = a.estateCode "
//			+ "WHERE a.userId = ?1")
//	List<SawEstate> selectSawEstate(String id);
	
	@Query("SELECT new com.kdt.domain.entities.SawEstate(a.estate.address1, a.estate.title, a.approvalCode,"
	+ "(SELECT i.sysName FROM EstateImage i WHERE i.parentId = a.estate.estateId ORDER BY i.seq ASC LIMIT 1), a.estate.estateId) "
	+ "FROM ReviewApproval a "
	+ "WHERE a.userId = ?1")
	List<SawEstate> selectSawEstate(String id);

}
