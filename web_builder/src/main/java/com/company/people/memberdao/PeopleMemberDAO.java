package com.company.people.memberdao;

import com.company.people.memberdto.PeopleMemberDTO;

public interface PeopleMemberDAO {

	public void register(final String sitename, final PeopleMemberDTO dto);
	public PeopleMemberDTO login(final String sitename, final PeopleMemberDTO dto);
}
