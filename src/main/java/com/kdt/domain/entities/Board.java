package com.kdt.domain.entities;

import java.sql.Timestamp;
import java.time.Instant;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Board {
	
	@Id
	@Column(name="seq")
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long seq;
	
	@Column(name="board_title")
	private String boardTitle;
	
	@Column(name="title")
	private String title;
	
	@Column(name="writer")
	private String writer;
	
	@Column(name="write_date")
	private Timestamp writeDate;
	
	@Column(name="header")
	private String header;
	
	@Column(name="contents")
	private String contents;
	
	@Column(name="view_count")
	private Long viewCount;

	public Board() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Board(Long seq, String boardTitle, String title, String writer, Timestamp writeDate, String header,
			String contents, Long viewCount) {
		super();
		this.seq = seq;
		this.boardTitle = boardTitle;
		this.title = title;
		this.writer = writer;
		this.writeDate = writeDate;
		this.header = header;
		this.contents = contents;
		this.viewCount = viewCount;
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

	public Timestamp getWriteDate() {
		return writeDate;
	}

	public void setWriteDate(Timestamp writeDate) {
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
}
