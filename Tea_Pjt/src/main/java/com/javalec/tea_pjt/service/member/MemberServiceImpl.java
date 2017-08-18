package com.javalec.tea_pjt.service.member;

import javax.inject.Inject;
import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Service;

import com.javalec.tea_pjt.model.member.dao.MemberDAO;
import com.javalec.tea_pjt.model.member.dto.MemberDTO;

@Service
public class MemberServiceImpl implements MemberService{
	
	@Inject
	MemberDAO mDao;

	@Override
	public int signup(MemberDTO member, HttpServletRequest request) {
			String tel1 = request.getParameter("tel1");
			String tel2 = request.getParameter("tel2");
			String tel3 = request.getParameter("tel3");
		int tel = Integer.parseInt(tel1+tel2+tel3);
			String email1 = request.getParameter("email1");
			String email2 = request.getParameter("email2");
		String email = email1+"@"+email2;
			String adress1 = request.getParameter("adress1");
			String adress2 = request.getParameter("adress2");
			String adress3 = request.getParameter("adress3");
		String adress = adress1+" "+adress2+" "+adress3;
		member.setTel(tel);
		member.setEmail(email);
		member.setAdress(adress);
		return mDao.signup(member);
	}

	@Override
	public MemberDTO login(String id, String password) {
		
		return mDao.login(id, password);
	}

	@Override
	public int searchId(String id) {
		return mDao.searchId(id);
	}

	@Override
	public MemberDTO userInfo(String id) {
		// TODO Auto-generated method stub
		return null;
	}
	
	@Override
	public int updateUser(MemberDTO member) {
		return mDao.updateUser(member);
	}

	@Override
	public int deleteUser(String id, String password) {
		return mDao.deleteUser(id, password);
	}

	
}
