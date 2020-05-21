package com.company.memberservice;

import com.company.memberdto.MemberDTO;

public interface MemberService {

	public void register(final MemberDTO dto);
	public MemberDTO login(final MemberDTO dto);
}
