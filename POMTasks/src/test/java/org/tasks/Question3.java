package org.tasks;

import java.awt.AWTException;

import org.base.BaseClass;
import org.pojogreens.Amazon;
import org.pojogreens.GreensCareer;
import org.pojogreens.GreensCertification;
import org.pojogreens.GreensContactUs;
import org.pojogreens.GreensCourseTab;
import org.pojogreens.GreensHomePage;
import org.pojogreens.GreensSeleniumCourseCont;
import org.pojogreens.GreensTestimony;

public class Question3 extends BaseClass{
		
	public static void main(String args[]) throws AWTException, InterruptedException {
			
			launchBrowser();
			launchUrl("https://snapdeal.com/");
			maximizeBrowser();
			impWait();
			Amazon a = new Amazon();
			scrollDown(10);
			mouseOverTo(a.getMobilesTab());
			click(a.getMobilesTab());
			
			goToWindow(1);
			click(a.getSimCards());
					
/*			//Greens Home Page
			GreensHomePage h = new GreensHomePage();
			click(h.getCloseMsg());
			scrollDown(10);
			Thread.sleep(3000);
			scrollUp(9);
			printText(h.getPrintNo1());
			
			//Greens Certification Page
			GreensCertification cert = new GreensCertification();
			click(cert.getCertifications());
			click(cert.getCloseMsg());
			
			//Greens Course Content Page
			GreensSeleniumCourseCont cont = new GreensSeleniumCourseCont();
			scrollTo(cont.getSeleniumCourseCont());
			click(cont.getSeleniumCourseCont());			
			scrollTo(cont.getFirstReview());
			printText(cont.getFirstReview());
			
			//course tab
			GreensCourseTab course = new GreensCourseTab();
			scrollTo(course.getCourseTab());
			mouseOverTo(course.getCourseTab());
			mouseOverTo(course.getJavaTrngButton());
			mouseOverTo(course.getCoreJavaTrngButton());
			click(course.getCoreJavaTrngButton());		
			
			click(course.getCloseMsg());
			scrollTo(course.getAnithaReview());
			printText(course.getAnithaReview());
						
			//testinmony tab
			GreensTestimony t = new GreensTestimony();
			scrollTo(t.getTestimonyTab());
			click(t.getTestimonyTab());
			scrollTo(t.getLastReview());
			printText(t.getLastReview());			
			
			//contact us
			GreensContactUs us = new GreensContactUs();
			scrollTo(us.getContactUs());
			click(us.getContactUs());
			click(us.getCloseMsg());
			printText(us.getChennaiBranches());
			scrollTo(us.getAllRights());
			printText(us.getAllRights());
			
			//career tab
			GreensCareer car = new GreensCareer();
			scrollTo(car.getCareersTab());
			rightClick(car.getCareersTab());
			downKey();
			enterKey();
			goToWindow(0);
			car.getCloseMsg();
			scrollTo(car.getEmailIdAtLast());
			printText(car.getEmailIdAtLast());*/
			
			
	}

}
