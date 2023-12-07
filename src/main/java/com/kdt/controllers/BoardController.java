package com.kdt.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.kdt.dto.BoardDTO;
import com.kdt.security.SecurityUser;
import com.kdt.services.BoardService;

@RestController
@RequestMapping("/api/board")
public class BoardController {
	
	@Autowired
	BoardService bServ;
	
	public SecurityUser getUser() {
		Authentication auth = SecurityContextHolder.getContext().getAuthentication();

		if(auth!=null && auth.getPrincipal() instanceof SecurityUser) {
			SecurityUser su = (SecurityUser)auth.getPrincipal();
			return su;
		}
		return null;
	}
	
	@PostMapping
	public ResponseEntity<Void> insertBoardContents(@RequestBody BoardDTO dto){
		dto.setWriter(getUser().getUsername());
		bServ.insertBoardContents(dto);
		return ResponseEntity.ok().build();
	}
	
	@GetMapping("/freeBoardList")
	public ResponseEntity<List<BoardDTO>> selectAllFreeBoardContents(){
		List<BoardDTO> list = bServ.selectAllFreeBoardContents();
		return ResponseEntity.ok(list);
		
	}
	
	@GetMapping("/roomBoardList")
	public ResponseEntity<List<BoardDTO>> selectAllRoomBoardContents(){
		List<BoardDTO> list = bServ.selectAllRoomBoardContents();
		return ResponseEntity.ok(list);
		
	}

}