package com.company.people.memberdao;

import java.util.HashMap;

import javax.inject.Inject;

import org.apache.ibatis.session.SqlSession;
import org.springframework.stereotype.Repository;

import com.company.people.memberdto.PeopleMemberDTO;



@Repository
public class PeopleMemberDAOImpl implements PeopleMemberDAO {

	@Inject
	private SqlSession sql;
	private static String namespace = "com.company.mappers.people.peopleMemberMapper";
	
	//회원가입
	@Override
	public void register(final String sitename, final PeopleMemberDTO dto) {
		// TODO Auto-generated method stub
		HashMap data = new HashMap();
		data.put("sitename", sitename);
		data.put("userid", dto.getUserid());
		data.put("userpass", dto.getUserpass());
		sql.insert(namespace+".register",data);
	}
	
	//로그인
	@Override
	public PeopleMemberDTO login(final String sitename, final PeopleMemberDTO dto) {
		// TODO Auto-generated method stub
		HashMap data = new HashMap();
		data.put("sitename", sitename);
		data.put("userid", dto.getUserid());
		data.put("userpass", dto.getUserpass());
		return sql.selectOne(namespace+".login",data);
	}

}
