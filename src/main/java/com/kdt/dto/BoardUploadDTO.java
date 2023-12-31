package com.kdt.dto;

import java.time.Instant;
import java.util.List;

import org.springframework.web.multipart.MultipartFile;

public class BoardUploadDTO {

	private Long seq;
	private String boardTitle;
	private String title;
	private String writer;
	private Instant writeDate;
	private String header;
	private String contents;
	private Long viewCount;
	
	private List<MultipartFile> files;
	
	public BoardUploadDTO() {
		super();
		// TODO Auto-generated constructor stub
	}
	public BoardUploadDTO(Long seq, String boardTitle, String title, String writer, Instant writeDate, String header,
			String contents, Long viewCount, List<MultipartFile> files) {
		super();
		this.seq = seq;
		this.boardTitle = boardTitle;
		this.title = title;
		this.writer = writer;
		this.writeDate = writeDate;
		this.header = header;
		this.contents = contents;
		this.viewCount = viewCount;
		this.files = files;
	}
	public Long getSeq() {
		return seq;
	}
	public void setSeq(Long seq) {
		this.seq = seq;
	}
	public String getBoardTitle() {
		return boardTitle;
	}
	public void setBoardTitle(String boardTitle) {
		this.boardTitle = boardTitle;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getWriter() {
		return writer;
	}
	public void setWriter(String writer) {
		this.writer = writer;
	}
	public Instant getWriteDate() {
		return writeDate;
	}
	public void setWriteDate(Instant writeDate) {
		this.writeDate = writeDate;
	}
	public String getHeader() {
		return header;
	}
	public void setHeader(String header) {
		this.header = header;
	}
	public String getContents() {
		return contents;
	}
	public void setContents(String contents) {
		this.contents = contents;
	}
	public Long getViewCount() {
		return viewCount;
	}
	public void setViewCount(Long viewCount) {
		this.viewCount = viewCount;
	}
	public List<MultipartFile> getFiles() {
		return files;
	}
	public void setFiles(List<MultipartFile> files) {
		this.files = files;
	}
	
	
}
