package com.jafa.mapper;

import java.util.List;

import com.jafa.model.Board;

public interface BoardMapper {
	List<Board> getList();
	int totalCount();
	void insert(Board board);

	Board get(Long bno);
	void update(Board board);
	void delete(Board board);
}
