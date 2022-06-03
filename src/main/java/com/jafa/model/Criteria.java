package com.jafa.model;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Criteria {

	private int page; // 현재 페이지
	private int perPageNum; // 한페이지에 보여줄 게시물 수

	public Criteria() {
		this.page = 1;
		this.perPageNum = 10;
	}

	public int getStartPage() {
		return (this.page - 1) * perPageNum;
	}
	// page = 1 0 this.page-1 * 10
	// page = 2 10
	// page = 3 20

}
