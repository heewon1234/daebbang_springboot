package com.kdt.services;

import java.time.LocalDate;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.kdt.domain.entities.Visitor;
import com.kdt.dto.VisitorDTO;
import com.kdt.mappers.VisitorMapper;
import com.kdt.repositories.VisitorRepository;

import jakarta.transaction.Transactional;

@Service
@Transactional
public class VisitorService {
	@Autowired
	private VisitorRepository vRepo;
	@Autowired
	private VisitorMapper vMapper;

	public VisitorDTO getTodayVisitor() {
		LocalDate today = LocalDate.now();
		Visitor v =  vRepo.findByVisitorDate(today);
		VisitorDTO dto = vMapper.toDto(v);
		return dto;
	}

	public void createVisitor() {
		Visitor newVisitor = new Visitor();
		newVisitor.setVisitorDate(LocalDate.now());
		newVisitor.setVisitorCount(1);
		vRepo.save(newVisitor);
	}

	public void incrementVisitor(Long seq) {
	    Visitor todayVisitor = vRepo.findById(seq).get();
	    todayVisitor.setVisitorCount(todayVisitor.getVisitorCount() + 1);
	    vRepo.save(todayVisitor);
	}
	public List<VisitorDTO> getAll() {
		List<Visitor> list = vRepo.findAll();
		List<VisitorDTO> dlist = vMapper.toDtoList(list);
		return dlist;
	}
	public int sum() {
		return vRepo.sumVisitorCount();
	}


	public Visitor getDailyVisitors(LocalDate date) {
		return vRepo.findByVisitorDate(date);
	}
	public Visitor getYesterdayVisitors(LocalDate date) {
		return vRepo.findByVisitorDate(date);
	}

	public List<Visitor> getMonthlyVisitors(LocalDate startDate, LocalDate endDate) {
		return vRepo.findByVisitorDateBetween(startDate, endDate);
	}
}
