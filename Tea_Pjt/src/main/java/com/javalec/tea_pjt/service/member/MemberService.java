package com.javalec.tea_pjt.service.member;

import javax.servlet.http.HttpServletRequest;

import com.javalec.tea_pjt.model.member.dto.MemberDTO;

public interface MemberService {
	
	public int signup(MemberDTO member, HttpServletRequest request);
	public MemberDTO login(String id, String password);
	public int searchId(String id);
	public MemberDTO userInfo(String id);
	public int updateUser(MemberDTO member);
	public int deleteUser(String id, String password);

}
