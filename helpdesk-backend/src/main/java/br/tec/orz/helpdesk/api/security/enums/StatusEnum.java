package br.tec.orz.helpdesk.api.security.enums;

public enum StatusEnum {
	
	New,
	Assigned,
	Resolved,
	Approved,
	Dissapproved,
	Closed;
	
	
	public static StatusEnum getStatus(String status) {
		switch (status) {
		case "New": return New;
		case "Resolved" : return Resolved;
		case "Approved" : return Approved;
		case "Dissapproved" : return Dissapproved;
		case "Assigned" : return Assigned;
		case "Closed": return Closed;
		default : return New;
		}
	}


}
