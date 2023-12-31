package com.kdt.domain.entities;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToOne;
import jakarta.persistence.Table;

@Entity
@Table(name="Estate_Option")
public class EstateOption {
	
	@Id
	@Column(name="seq")
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long seq;
	
	@Column(name="estate_code")
	private Long estateCode;
	
	@OneToOne
	@JoinColumn(name = "option_code", referencedColumnName = "option_id")
	private OptionTitle optionTitle;

	public Long getSeq() {
		return seq;
	}

	public void setSeq(Long seq) {
		this.seq = seq;
	}

	public Long getEstateCode() {
		return estateCode;
	}

	public void setEstateCode(Long estateCode) {
		this.estateCode = estateCode;
	}

	public OptionTitle getOptionTitle() {
		return optionTitle;
	}

	public void setOptionTitle(OptionTitle optionTitle) {
		this.optionTitle = optionTitle;
	}

	public EstateOption(Long seq, Long estateCode, OptionTitle optionTitle) {
		super();
		this.seq = seq;
		this.estateCode = estateCode;
		this.optionTitle = optionTitle;
	}

	public EstateOption() {
		super();
	}
	
	
}
