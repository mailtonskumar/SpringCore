package com.santhoshonjava.core.app.services.impl;

import com.santhoshonjava.core.app.services.Coach;

public class VolleyBallCoach implements Coach {

	public String getDailyWorkOut() {
		// TODO Auto-generated method stub
		return "Volley Ball - Physical Excercise for 15 mins";
	}
	
	public void initialization(){
		System.out.println("VolleyBallCoach : initializatin()");
	}
	
	public void cleanUp(){
		System.out.println("VolleyBallCoach : cleanUp()");
	}

}
