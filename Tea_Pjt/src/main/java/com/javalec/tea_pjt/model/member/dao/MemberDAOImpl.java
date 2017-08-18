package com.javalec.tea_pjt.model.member.dao;

import java.util.HashMap;
import java.util.Map;

import javax.inject.Inject;

import org.apache.ibatis.session.SqlSession;
import org.springframework.stereotype.Repository;

import com.javalec.tea_pjt.model.member.dto.MemberDTO;

@Repository
public class MemberDAOImpl implements MemberDAO{
	
	@Inject
	SqlSession sqlSession;//DB접속처리

	@Override
	public int signup(MemberDTO member) {
		return sqlSession.insert("member.insert", member);
	}

	@Override
	public MemberDTO login(String id, String password) {
		Map<String, String> map = new HashMap<String, String>();
		map.put("id", id);
		map.put("password", password);
		return sqlSession.selectOne("member.login", map);
		
	}

	@Override
	public int searchId(String id) {
		return sqlSession.selectOne("member.searchId", id);
	}

	@Override
	public MemberDTO userInfo(String id) {
		return (MemberDTO) sqlSession.selectList("member.userInfo", id);
	}
	
	@Override
	public int updateUser(MemberDTO member) {
		return sqlSession.update("member.updateUser", member);
	}

	@Override
	public int deleteUser(String id, String password) {
		Map<String, String> map = new HashMap<String, String>();
		map.put("id", id);
		map.put("password", password);
		return sqlSession.update("member.deleteUser", map);
	}

	

}
