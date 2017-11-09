package com.codepandars.chemical.redisinterface.command.impl.smembers;

import java.util.Set;

import com.codepandars.chemical.redisinterface.command.BaseResponse;

public class SMembersResponse extends BaseResponse{

	private Set<String> members ;

	public Set<String> getMembers() {
		return members;
	}

	public void setMembers(Set<String> members) {
		this.members = members;
	}

	@Override
	public String toString() {
		return "SMembersResponse [" + (members != null ? "members=" + members : "") + "]";
	}

}
