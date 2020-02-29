package com.example.unicode.model;

public enum TownOfBirth {
	
	MYSORE("MYS-09"), BANGLORE("BNG-01"), CHAMARAJANAGAR("CHN-10");
	
	private String code;
	
	TownOfBirth(String code){
		this.code = code;       
	}
	
	public String getTownCode() {
		return this.code;
	}
}
