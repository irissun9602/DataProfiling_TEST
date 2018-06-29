package net.skhu.mapper;

import java.util.ArrayList;
import java.util.List;

import org.apache.ibatis.annotations.Mapper;

import net.skhu.dto.Answer;

@Mapper
public interface AnswerMapper {
		List<Answer> findAllA();
		Answer findOne(int id);
		Answer findOneWithComment(int id);
		ArrayList<Answer> findByQuestion_id(int question_id);
		List<Answer> findByBoardId(int boardId);
		List<Answer> findByUserId(int userId);
		List<Answer> findByUsername(String username);
		List<Answer> findByTitle(String keyword);
		List<Answer> findByContent(String keyword);
		List<Answer> findByTitleAndContent(String keyword);
		void insertA(Answer article);	//질문 등록
		
		void updateA(Answer article);	//질문 수정
		void delete(int id);
}
