package com.kdt.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.kdt.dto.EstateDTO;
import com.kdt.dto.ReviewApprovalDTO;
import com.kdt.dto.UploadEstateDTO;
import com.kdt.services.EstateService;
import com.kdt.services.ReviewApprovalService;

@RestController
@RequestMapping("/api/reviewApproval/")
public class ReviewApprovalController {

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
	public ResponseEntity<List<ReviewApprovalDTO>> selectById(@PathVariable String loginId) {
		List<ReviewApprovalDTO> list = rServ.selectByAgent(loginId);

		return ResponseEntity.ok(list);
	}

	@GetMapping("estate/{id}")
	public ResponseEntity<EstateDTO> selectEstate(@PathVariable Long id) {
		EstateDTO dto = eServ.selectEstate(id);
		return ResponseEntity.ok(dto);
	}

	@PostMapping
	public ResponseEntity<Void> insert(@RequestBody ReviewApprovalDTO reviewApprovalDTO) {
	    System.out.println(reviewApprovalDTO.getEstateCode());
	    System.out.println(reviewApprovalDTO.getUserId());
	    
	    rServ.insert(reviewApprovalDTO);

	    return ResponseEntity.ok().build();
	}
}