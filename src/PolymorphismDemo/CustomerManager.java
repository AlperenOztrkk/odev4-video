package PolymorphismDemo;

public class CustomerManager {
	private BaseLoggger baseLoggger;
	public CustomerManager (BaseLoggger baseLoggger) {
		this.baseLoggger=baseLoggger;
	}
 public void Add() {
	 System.err.println("Müşteri Eklendi");
	 this.baseLoggger.Log("Log mesajı");
	
	 
 }
 
}
