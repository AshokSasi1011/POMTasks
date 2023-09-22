package org.tasks;

import org.base.*;

import org.pojo.AdactinRegister;
import org.pojo.AdactinCardDetails;
import org.pojo.AdactinConfirmPackage;
import org.pojo.AdactinLandingPage;
import org.pojo.AdactinLogin;
import org.pojo.AdactinPrintOrderNo;



public class Question4 extends BaseClass{
	
	public static void main(String args[]) {
		
		
		launchBrowser();
		launchUrl("https://adactinhotelapp.com/");
		maximizeBrowser();
		impWait();	
		
		AdactinLogin l = new AdactinLogin();		
		AdactinLandingPage p = new AdactinLandingPage();
		AdactinConfirmPackage c = new AdactinConfirmPackage();
		AdactinCardDetails d = new AdactinCardDetails();
		AdactinPrintOrderNo o = new AdactinPrintOrderNo();
				
		
		// New User Registration
/*		AdactinRegister r = new AdactinRegister();
		click(r.getNewUser());		
		passCredentials(r.getUserName(), "sasi0505");
		passCredentials(r.getPassWord(), "preethi05");
		passCredentials(r.getConfPassWord(), "preethi05");
		passCredentials(r.getFullName(), "SASIKUMAR");
		passCredentials(r.getEmail(), "sasikumar.saran7@gmail.com");		
		click(r.getCheckBox());*/
		
		//login page
		passCredentials(l.getUsername(), "sasi0505");
		passCredentials(l.getPassword(), "preethi05");
		click(l.getLoginUser());
		
		//landing page
		selectByIndex(p.getSelectLocation(),5);
		selectByIndex(p.getSelectHotel(),2);
		selectByIndex(p.getSelectRoomType(),2);
		selectByIndex(p.getNoOfRooms(),1);
		passCredentials(p.getCheckInDate(),"13/08/2023");
		passCredentials(p.getCheckOutDate(),"14/08/2023");
		selectByIndex(p.getAdultsPerRoom(),2);
		selectByIndex(p.getChildPerRoom(),1);
		click(p.getSearchButton());
		
		//confirm checkbox page		
		click(c.getConfirmPackage());
		click(c.getContinueNext());
		
		//entering personal and card details
		passCredentials(d.getFirstName(),"SASIKUMAR");
		passCredentials(d.getLastName(),"ASHOKAN");
		passCredentials(d.getBillingAddress(),"VIVEKANANDAR STREET, DUBAI MAIN ROAD, DUBAI");
		passCredentials(d.getCCNo(),"5623456912589856");
		selectByIndex(d.getCCType(),2);
		selectByIndex(d.getExpMonth(),8);
		selectByIndex(d.getExpYear(),19);
		passCredentials(d.getCVVNumber(),"655");
		click(d.getBookNow());
		
		//print order number
		scrollDown(15);
		printValue(o.getOrderNumber());
	}

}
