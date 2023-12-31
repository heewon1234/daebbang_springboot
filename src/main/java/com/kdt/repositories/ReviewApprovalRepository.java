package com.kdt.repositories;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;

import com.kdt.domain.entities.ReviewApproval;
import com.kdt.domain.entities.UploadReviewApproval;

public interface ReviewApprovalRepository extends JpaRepository<ReviewApproval, Long>{

	List<ReviewApproval> findAllByUserId(String loginId);
	//관리자
	List<ReviewApproval> findAllByApprovalCodeIn(List<String> approvalCodes);
	
	@Modifying
	@Query("UPDATE ReviewApproval ra SET ra.approvalCode = :approvalCode WHERE ra.seq = :seq")
	void updateStatue(Long seq, String approvalCode);
	
	@Modifying
	@Query("UPDATE ReviewApproval ra SET ra.approvalCode = ?3 WHERE ra.estate.estateId = ?2 and ra.userId = ?1")
	void writeComplete(String id, Long estateId, String approvalCode);
	
}
