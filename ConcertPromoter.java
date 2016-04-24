/*
 * ConcertPromoter.java
 * 
 * Copyright 2016 graf <graf@chillosphere.spacepotato>
 * 
 * This program is free software; you can redistribute it and/or modify
 * it under the terms of the GNU General Public License as published by
 * the Free Software Foundation; either version 2 of the License, or
 * (at your option) any later version.
 * 
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU General Public License for more details.
 * 
 * You should have received a copy of the GNU General Public License
 * along with this program; if not, write to the Free Software
 * Foundation, Inc., 51 Franklin Street, Fifth Floor, Boston,
 * MA 02110-1301, USA.
 * 
 * 
 */


public class ConcertPromoter {
	private static int ticketsSold = 0;
	private static int seatsLeft = 50;
	private static double sales;
	
	private String bandName;
	private double phonePrice = 5.00;
	private double venuePrice = 6.00;

	
	private void setBandName(String band){
		bandName = band;
		}
	private String getBandName(){
		return bandName;
		}
	private void phoneSales (int sale){
		if (seatsLeft - sale > 0){
			seatsLeft = seatsLeft - sale;
			ticketsSold += sale;
			sales += (double)ticketsSold * phonePrice;
			System.out.println("Sold " + sale + " tickets.");
			System.out.println("There are " + seatsLeft + " seats left.");
			}
		else {
			System.out.println("There aren't enough seats to accomodate your party of " + sale);
			System.out.println("There are " + seatsLeft + " seats available.");
		}
	}
	private void venueSales (int sale){
		if (seatsLeft - sale > 0){
			seatsLeft = seatsLeft - sale;
			ticketsSold += sale;
			sales += (double)ticketsSold * venuePrice;
			System.out.println("Sold " + sale + " tickets.");
			System.out.println("There are " + seatsLeft + " seats left.");
			}
		else {
			System.out.println("There aren't enough seats to accomodate your party of " + sale);
			System.out.println("There are " + seatsLeft + " seats available.");
			}
		}		
	private double getSales(){
		return sales;
		}
	private int getSeatsLeft(){
		return seatsLeft;
		}
	private int getTicketsSold(){
		return ticketsSold;
	}			
	
	public static void main (String args[]) {
		
		ConcertPromoter PartialsShow = new ConcertPromoter();
		PartialsShow.setBandName("The Barnacles");
		System.out.println(PartialsShow.getBandName());
		PartialsShow.phoneSales(4);
		PartialsShow.venueSales(40);
		PartialsShow.phoneSales(1);
		PartialsShow.phoneSales(20);
		System.out.println("Total sales: " + PartialsShow.getSales());
		System.out.println("Total tickets sold: " + PartialsShow.getTicketsSold());
	}
}

