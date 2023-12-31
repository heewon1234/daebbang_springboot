package com.kdt.controllers;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.kdt.dto.EstateDTO;
import com.kdt.dto.ReviewApprovalDTO;
import com.kdt.dto.SawEstateDTO;
import com.kdt.dto.UploadReviewApprovalDTO;
import com.kdt.services.EstateService;
import com.kdt.services.ReviewApprovalService;

@RestController
@RequestMapping("/api/reviewApproval/")
public class ReviewApprovalController {
	private static final Logger logger = LoggerFactory.getLogger(ReviewApprovalController.class);

	@Autowired
	private ReviewApprovalService rServ;

	@Autowired
	private EstateService eServ;

	@GetMapping("myReview/{id}")
	public ResponseEntity<List<ReviewApprovalDTO>> selectAll(@PathVariable String id) {
		List<ReviewApprovalDTO> list = rServ.selectAll(id);
		return ResponseEntity.ok(list);
	}

	@GetMapping("agentReview/{loginId}")
	public ResponseEntity<List<UploadReviewApprovalDTO>> selectById(@PathVariable String loginId) {
		List<UploadReviewApprovalDTO> list = rServ.selectByAgent(loginId);

		return ResponseEntity.ok(list);
	}
	
	@GetMapping("agentReview/count/{loginId}")
	public ResponseEntity<Long> countByAgent(@PathVariable String loginId) {
		Long count = rServ.countByAgent(loginId);
		
		return ResponseEntity.ok(count);
	}

	@GetMapping("estate/{id}")
	public ResponseEntity<EstateDTO> selectEstate(@PathVariable Long id) {
		EstateDTO dto = eServ.selectEstate(id);
		return ResponseEntity.ok(dto);
	}

	@PostMapping
	public ResponseEntity<Void> insert(@RequestBody UploadReviewApprovalDTO dto) {

		logger.debug(Long.toString(dto.getEstateCode()));
		logger.debug(dto.getUserId());

		rServ.insert(dto);

		return ResponseEntity.ok().build();
	}

	@PutMapping("updateStatus/{seq}")
	public ResponseEntity<Void> updateStatus(@PathVariable Long seq, @RequestBody ReviewApprovalDTO dto) {
		dto.setSeq(seq);

		rServ.updateStatus(dto);

		return ResponseEntity.ok().build();
	}
	
	@GetMapping("sawEstate/{id}")
	public ResponseEntity<List<SawEstateDTO>> selectSawEstate(@PathVariable String id) {
		List<SawEstateDTO> list = rServ.selectSawEstate(id);
		return ResponseEntity.ok(list);
	}
	
	@PutMapping("writeComplete")
	public ResponseEntity<Void> writeComplete(@RequestParam("userId") String id, @RequestParam("estateId") Long estateId, @RequestParam("approvalCode") String approvalCode) {
		rServ.writeComplete(id, estateId, approvalCode);
		return ResponseEntity.ok().build();
	}
	
}
