package Classes;

import java.util.Date;

public class Auction {

//some array of bids
	private double startPrice;
	private double reservePrice;
	private Date closeDate;
	private char status;

	public Auction(double startPrice, double reservePrice, Date closeDate, char status) {
		
		this.startPrice = startPrice;
		this.reservePrice = reservePrice;
		this.closeDate = closeDate;
		this.status = status;
		
	}
	
	public void placeBid() {
		
	}
	
	public void verify() {
		
	}
	
	public void close() {
		
	}
	
	public boolean isBlocked() {
		return false;
		
	}
	
	public void setBlocked() {
		
	}

}
