package com.kdt.dto;

public class EstateOptionDTO {
	private Long seq;
	private Long estateCode;
	private OptionTitleDTO optionTitle;
	
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
	public OptionTitleDTO getOptionTitle() {
		return optionTitle;
	}
	public void setOptionTitle(OptionTitleDTO optionTitle) {
		this.optionTitle = optionTitle;
	}
	public EstateOptionDTO(Long seq, Long estateCode, OptionTitleDTO optionTitle) {
		super();
		this.seq = seq;
		this.estateCode = estateCode;
		this.optionTitle = optionTitle;
	}
	public EstateOptionDTO() {
		super();
	}
	
	
}
