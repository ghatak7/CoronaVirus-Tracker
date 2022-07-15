package io.javabrains.coronavirustracker;

public class Locationstats {
	
	
	private String state;
	public String getState() {
		return state;
	}
	public void setState(String state) {
		this.state = state;
	}
	public String getCountry() {
		return country;
	}
	public void setCountry(String country) {
		this.country = country;
	}
	public int getLatestTotalCases() {
		return latestTotalCases;
	}
	public void setLatestTotalCases(int latestTotalCases) {
		this.latestTotalCases = latestTotalCases;
	}
	private String country;
	private int latestTotalCases;
	@Override
	public String toString() {
		return "Locationstats [state=" + state + ", country=" + country + ", latestTotalCases=" + latestTotalCases
				+ "]";
	}
	

}
