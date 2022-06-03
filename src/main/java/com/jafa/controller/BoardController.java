package com.jafa.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.jafa.mapper.BoardMapper;

@Controller
@RequestMapping("/board/")
public class BoardController {
	
	@Autowired
	BoardMapper mapper;
	
	@RequestMapping("/list")
	public String getList(Model model) {
		model.addAttribute("list", mapper.getList());
		return "board/list";
	}
}
