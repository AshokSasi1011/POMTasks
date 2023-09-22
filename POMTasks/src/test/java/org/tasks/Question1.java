package org.tasks;

import org.base.*;
import org.pojo.FBLogin;

public class Question1 extends BaseClass{
	
	public static void main(String args[]) {
		
		
		launchBrowser();
		launchUrl("https://www.facebook.com/");
		maximizeBrowser();
		impWait();
		
		FBLogin fb = new FBLogin();
		passCredentials(fb.getUserName(),"asasikumar0505@gmail.com");
		passCredentials(fb.getPassWord(), "preethi05");
		click(fb.getClickLogin());
		quitBrowser();
	}

}
