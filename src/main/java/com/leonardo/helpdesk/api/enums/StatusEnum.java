package com.leonardo.helpdesk.api.enums;

public enum StatusEnum {
	
	New,
	Assigned, 
	Resolved,
	Approved,
	Disaproved,
	closed;
	
	public static StatusEnum getStatus(String status) {
		switch(status) {
			case "New" : return New;
			case "Assigned" : return Assigned;
			case "Resolved" : return Resolved;
			case "Approved" : return Approved;
			case "Disaproved" : return Disaproved;
			case "closed" : return closed;
			default: return New;
		}
	}
}
