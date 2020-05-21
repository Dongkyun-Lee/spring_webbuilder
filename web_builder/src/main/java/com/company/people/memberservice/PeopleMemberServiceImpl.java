package com.company.people.memberservice;

import javax.inject.Inject;

import org.springframework.stereotype.Service;

import com.company.people.memberdao.PeopleMemberDAO;
import com.company.people.memberdto.PeopleMemberDTO;


@Service
public class PeopleMemberServiceImpl implements PeopleMemberService {
	@Inject
	private PeopleMemberDAO dao;
	
	//회원가입
	@Override
	public void register(final String sitename, final PeopleMemberDTO dto) {
		// TODO Auto-generated method stub
		dao.register(sitename ,dto);
	}
	
	//로그인
	@Override
	public PeopleMemberDTO login(final String sitename, final PeopleMemberDTO dto) {
		// TODO Auto-generated method stub
		return dao.login(sitename, dto);
	}

}
