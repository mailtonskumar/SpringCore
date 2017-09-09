package com.santhoshonjava.core.app.services.impl;

import com.santhoshonjava.core.app.services.Coach;

public class CricketCoach implements Coach {

	private String emailAddress;

	private String teamName;

	/**
	 * @return the emailAddress
	 */
	public String getEmailAddress() {
		return emailAddress;
	}

	/**
	 * @param emailAddress
	 *            the emailAddress to set
	 */
	public void setEmailAddress(String emailAddress) {
		this.emailAddress = emailAddress;
	}

	/**
	 * @return the teamName
	 */
	public String getTeamName() {
		return teamName;
	}

	/**
	 * @param teamName
	 *            the teamName to set
	 */
	public void setTeamName(String teamName) {
		this.teamName = teamName;
	}

	public String getDailyWorkOut() {
		// TODO Auto-generated method stub
		return "Practise 15Mins Spin bowling";
	}

}
