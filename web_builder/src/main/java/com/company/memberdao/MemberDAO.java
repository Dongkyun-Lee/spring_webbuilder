package com.company.memberdao;

import com.company.memberdto.MemberDTO;

public interface MemberDAO {

	public void register(final MemberDTO dto);
	public MemberDTO login(final MemberDTO dto);
}
