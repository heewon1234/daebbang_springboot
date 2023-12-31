package com.kdt.mappers;

import java.sql.Timestamp;
import java.time.Instant;
import java.util.List;

import org.mapstruct.BeanMapping;
import org.mapstruct.MappingTarget;
import org.mapstruct.NullValuePropertyMappingStrategy;


public interface GenericMapper<D,E>{
	
	D toDto(E e);
	E toEntity(D d);
	
	List<D> toDtoList(List<E> e);
	List<E> toEntityList(List<D> d);
	
	@BeanMapping(nullValuePropertyMappingStrategy = NullValuePropertyMappingStrategy.IGNORE)
	void updateEntityFromDTO(D d, @MappingTarget E e);
	
	default Instant map(Timestamp t) {
		if(t != null) {
			return t.toInstant();
		} else {
			return null;
		}
	}
	
	default Timestamp map(Instant i) {
		if(i != null) {
			return Timestamp.from(i);
		} else {
			return null;
		}
	}
}
