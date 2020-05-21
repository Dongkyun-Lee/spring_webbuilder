package com.company.memberservice;

import javax.inject.Inject;

import org.springframework.stereotype.Service;

import com.company.memberdao.MemberDAO;
import com.company.memberdto.MemberDTO;

@Service
public class MemberServiceImpl implements MemberService {
	@Inject
	private MemberDAO dao;
	
	//회원가입
	@Override
	public void register(final MemberDTO dto) {
		// TODO Auto-generated method stub
		dao.register(dto);
	}
	
	//로그인
	@Override
	public MemberDTO login(final MemberDTO dto) {
		// TODO Auto-generated method stub
		return dao.login(dto);
	}

}
