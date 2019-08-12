package com.prasanna.employee.tracker;

public class EntryLog {
	
	private long logIn;
	private long logOut;
	
	public EntryLog(long logIn, long logOut) {
		if(logOut==0) {
			this.logIn = logIn;
		}
		else if(logIn==0) {
			this.logOut = logOut;
		}	
	}
	
	public long getLogIn() {
		return logIn;
	}
	public void setLogIn(long logIn) {
		this.logIn = logIn;
	}
	public long getLogOut() {
		return logOut;
	}
	public void setLogOut(long logOut) {
		this.logOut = logOut;
	}
	
	public int workHours(long logIn, long logOut) {
		return (int)(logOut-logIn)/3600;
	}
	
	@Override
	public String toString() {
		return "EntryLog [logIn=" + logIn + ", logOut=" + logOut + "]";
	}
	

}
