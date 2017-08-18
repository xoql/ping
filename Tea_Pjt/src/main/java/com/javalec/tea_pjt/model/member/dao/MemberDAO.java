package com.javalec.tea_pjt.model.member.dao;

import com.javalec.tea_pjt.model.member.dto.MemberDTO;

public interface MemberDAO {
	
	public int signup(MemberDTO member);
	public MemberDTO login(String id, String password);
	public int searchId(String id);
	public MemberDTO userInfo(String id);
	public int updateUser(MemberDTO member);
	public int deleteUser(String id, String password);
}
