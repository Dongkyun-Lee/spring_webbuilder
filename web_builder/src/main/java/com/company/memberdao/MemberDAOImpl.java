package com.company.memberdao;

import javax.inject.Inject;

import org.apache.ibatis.session.SqlSession;
import org.springframework.stereotype.Repository;

import com.company.memberdto.MemberDTO;

@Repository
public class MemberDAOImpl implements MemberDAO {

	@Inject
	private SqlSession sql;
	private static String namespace = "com.company.mappers.memberMapper";
	
	//회원가입
	@Override
	public void register(final MemberDTO dto) {
		// TODO Auto-generated method stub
		sql.insert(namespace+".register",dto);
	}
	
	//로그인
	@Override
	public MemberDTO login(final MemberDTO dto) {
		// TODO Auto-generated method stub
		return sql.selectOne(namespace+".login",dto);
	}

}
