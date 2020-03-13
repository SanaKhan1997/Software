package com.trevordouglas;

public interface Subject {
	public void register(NhlObserver o);
	public void unregister(NhlObserver o);
	public void notifyUsers();

}
