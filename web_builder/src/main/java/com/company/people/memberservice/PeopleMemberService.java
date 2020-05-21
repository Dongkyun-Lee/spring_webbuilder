package com.company.people.memberservice;

import com.company.people.memberdto.PeopleMemberDTO;

public interface PeopleMemberService {

	public void register(final String sitename, final PeopleMemberDTO dto);
	public PeopleMemberDTO login(final String sitename, final PeopleMemberDTO dto);
}
