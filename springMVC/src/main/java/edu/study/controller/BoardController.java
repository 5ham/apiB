package edu.study.controller;

import java.util.Locale;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import edu.study.vo.BoardVO;

/**
 * Handles requests for the application home page.
 */
@RequestMapping(value="/board")
@Controller
public class BoardController {
	
	private static final Logger logger = LoggerFactory.getLogger(BoardController.class);
	
	/**
	 * Simply selects the home view to render by returning its name.
	 */
	@RequestMapping(value = "/list.do", method = RequestMethod.GET)
	public String list(Locale locale, Model model) {
		
		//DB 에서 게시글 
		
		
		return "board/list"; // WEB-INF/views/board/list.jsp
	}
	
	
	@RequestMapping(value="/view.do")
	public String view(Model model) {
		
		return "board/view"; //forward
		
	}
	
	@RequestMapping(value="/delete.do")
	public String delete() {
		//DB삭제처리
		
		return "redirect:/board/list.do"; //리다이렉트 경로시 앞에 /가 있는 경우 프로젝트 path를 바라본다.
		
	}
	
	@RequestMapping(value="/update.do", method=RequestMethod.GET)
	public String update(int bidx) {
		
		System.out.println("bidx 파라미터 값 :"+bidx);
		
		return "board/modify";
	}
	
	@RequestMapping(value="/update.do", method=RequestMethod.POST)
	public String update(BoardVO vo) {
		
//		System.out.println("제목:"+title);
//		System.out.println("작성자:"+writer);
//		System.out.println("내용:"+contents);
//		
		
		System.out.println(vo.toString());
		return "redirect:view.do?bidx=1";
	}
	
	/*
	 1. list.jsp 에 등록 버튼을 추가한 후 
	 2. 클릭시 /board/insert.do를 get방식으로 요청할 시 /board/insert.jsp 페이지 forward
	 3. insert.jsp 페이지에서는 제목, 작성자, 내용을 입력 받고  /board/insert.do로 post 방식으로 submit 한다.
	 4. 해당 컨트롤러에서는 jsp(화면)에서 입력받은 모든 데이터를 console에 출력 후 list.do로 redirect한다. 
	  
	 */
	
	@RequestMapping(value="/insert.do", method=RequestMethod.GET)
	public String insert() {
		return "board/insert";
	}
	
	@RequestMapping(value="/insert.do", method=RequestMethod.POST)
	public String insert(BoardVO vo) {
		System.out.println(vo.toString());
		return "redirect:list.do";
	}
	
}












