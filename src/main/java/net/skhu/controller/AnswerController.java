package net.skhu.controller;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import net.skhu.dto.Answer;
import net.skhu.dto.Columns;
import net.skhu.mapper.AnswerMapper;
import net.skhu.mapper.ColumnsMapper;

@Controller
public class AnswerController {
	@Autowired
	AnswerMapper answerMapper;
	@Autowired
	ColumnsMapper columnsMapper;

	@RequestMapping("list")
	public String list(Model model) {
		List<Answer> answers = answerMapper.findAllA();
		model.addAttribute("answers", answers);
		return "answer/answer";
	}
	
	@RequestMapping("columns")
	public String columns(Model model) {
		List<Columns> columns = columnsMapper.findAll();
		model.addAttribute("columns", columns);
		return "answer/columns";
	}

}
