package com.javalec.tea_pjt.controller.member;

import javax.inject.Inject;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.HttpRequest;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.SessionAttribute;
import org.springframework.web.servlet.ModelAndView;

import com.javalec.tea_pjt.model.member.dto.MemberDTO;
import com.javalec.tea_pjt.service.member.MemberService;

@Controller
@RequestMapping("/member/*")
public class MemberController {
		
	private static final Logger logger
	=LoggerFactory.getLogger(MemberController.class);
		
	@Inject
	MemberService mService; //new생성안하고 spring에서 관리해주기 때문에 바로 사용 가능
							//싱글톤(하나의 객체를 만들어 계속 사용)
	
	@RequestMapping(value="signup.do",method=RequestMethod.GET)
	public String signup(){//회원가입페이지 이동
		return "/member/signUp";
	}
	
	@RequestMapping(value="signup.do" ,method=RequestMethod.POST)
	public String signup(MemberDTO member , Model model, HttpServletRequest request){
		int result = mService.signup(member, request);
		if(result >= 1){
			model.addAttribute("msg","회원가입이 완료. 로그인하세요");
			return "/member/login";
		}else{
			model.addAttribute("msg","회원가입 실패.");
			return "/home";
		}
	}
	
	@RequestMapping(value="login.do", method=RequestMethod.GET)
	public String login(){//로그인페이지 이동
		return "/member/login";
	}
	
	@RequestMapping(value="login.do", method=RequestMethod.POST)
	public String login(String id, String password, HttpSession session){
		MemberDTO dto = mService.login(id, password);
		session.setAttribute("user", dto);//다른 페이지에서 값을 사용할 수 있도록 넘기기
		if(dto != null){
			return "/home";
		}else{
			return "/member/login";
		}
	}
	
	@RequestMapping(value="updateUser.do", method=RequestMethod.GET)
	public String updateUser(){//회원 정보 수정 페이지 이동
		return "/member/updateUser";
	}
	
	@RequestMapping(value="updateUser.do", method=RequestMethod.POST)
	public String updateUser(MemberDTO member){
		int result = mService.updateUser(member);
		if(result >= 1){//회원 정보 수정 성공
			return "/home";
		}else{
			return "/member/updateUser";
		}
	}
	
	/*@RequestMapping("deleteUser.do")
	public String deleteUser(String id, String password){
		int result = mService.deleteUser(id, password);
		if(result >= 1){//회원 삭제 성공
			return "login";
		}else{
			return "/home";
		}
	}*/
	
	@RequestMapping("deleteUser.do")
	public ModelAndView deleteUser(String id,String password, ModelAndView mav){
		int result = mService.deleteUser(id, password);
		if(result >= 1){//회원 삭제 성공
			mav.addObject("msg", "회원 삭제 성공");
			mav.setViewName("/member/login");
		}else{
			mav.addObject("msg", "회원 삭제 성공");
			mav.setViewName("/home");
		}
		return mav;
	}
	
	@RequestMapping(value="userInfo.do", method=RequestMethod.GET)
	public String userInfo(){
		return "/member/userInfo";
	}
	
	@RequestMapping(value="userInfo.do", method=RequestMethod.POST)
	public String userInfo(String id, HttpServletRequest session){
		MemberDTO dto = mService.userInfo(id);
		session.setAttribute("user", dto);
		return "/member/userInfo";
	}
	
		

}
