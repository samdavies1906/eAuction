package Classes;

import java.util.Date;

public class Bid {

	private double amount;
	private Buyer who;
	private Date when;
	
	public Bid(double amount, Buyer who, Date when) {

		this.amount = amount;
		this.who = who;
		this.when = when;

	}

}
