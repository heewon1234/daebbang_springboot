package com.kdt.repositories;

import org.springframework.data.jpa.repository.EntityGraph;
import org.springframework.data.jpa.repository.JpaRepository;

import com.kdt.domain.entities.EstateOption;

public interface EstateOptionRepository extends JpaRepository<EstateOption, Long>{
	@EntityGraph(attributePaths = { "optionTitle" })
	
	Long deleteByEstateCode(Long esateId);
}
