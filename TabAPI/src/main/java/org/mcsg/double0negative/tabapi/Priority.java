package org.mcsg.double0negative.tabapi;

public enum Priority {

	REMOVE(-2), //No longer active
	BACKGROUND(-1), //Only show if nothing else is there
	NORMAL(0),
	HIGH(1),
	HIGHEST(2); // Always show
	
	private int priority;
	
	private Priority(int priority){
		this.priority = priority;
	}
			
	public int getPriorityIntValue(){
		return this.priority;
	}
	
	public String toString(){
		return String.valueOf(this.priority);
	}
}
