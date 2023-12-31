package com.kdt.mappers;

import org.mapstruct.Mapper;

import com.kdt.domain.entities.Estate;
import com.kdt.dto.EstateDTO;

@Mapper(componentModel = "spring")
public interface EstateMapper extends GenericMapper<EstateDTO,Estate>{

}
