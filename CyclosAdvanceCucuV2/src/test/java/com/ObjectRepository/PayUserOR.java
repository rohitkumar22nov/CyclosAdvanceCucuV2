package com.ObjectRepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import KeyMouseActions.CommandsKeyMouse;

public class PayUserOR {
	
	

		public WebDriver localDriver;
		
		public String paymentMessage;

			public PayUserOR(WebDriver remoteDriver)
			{
				localDriver = remoteDriver;
				
					
				PageFactory.initElements(localDriver, this);
				
			}

			
			
			@FindBy(xpath="//a[@href='#banking.transactions.payment-user-to-user']")
			WebElement btnPayUser;
			
			
			@FindBy(xpath ="//input[@class='inputField large']")
			WebElement txtBoxUser_quickSearch;
			

			@FindBy(xpath="/html/body/div[3]/div[3]/div/div/div[2]/div[2]/div[2]/div/div/table/tbody/tr[4]/td[2]/div/div/div[2]/img")
			WebElement radioContact;
			

			@FindBy(xpath="//div[@class='selectionLabel'][contains(text(),'Please')]")
			WebElement drpDownContact;
			
			@FindBy(xpath ="//input[@class='inputField large rightAligned']")
			WebElement txtBoxAmount;
			
			@FindBy(xpath ="/html/body/div[3]/div[3]/div/div/div[2]/div[2]/div[2]/div/div/table/tbody/tr[23]/td/div/div[3]/button/div")
			WebElement btnSubmit;

			
			@FindBy(xpath="//div[text()='Confirm']")
			WebElement btnConfirm;
			
			
			@FindBy(xpath="//div[contains(text(),'successful')]")
			WebElement msgPaymentSuccessful;
			

			
			@FindBy(xpath="//div[text()='New payment']")
			WebElement btnNewPayment; 
			

			
			@FindBy(xpath="/html/body/div[3]/div[3]/div/div/div[2]/div[2]/div[2]/div/div/div/table[5]/tbody/tr/td[2]/a")
			WebElement payeeName;
			
			
			@FindBy(xpath = "/html/body/div[3]/div[3]/div/div/div[2]/div[2]/div[2]/div/div/div/table[2]/tbody/tr/td[2]")
			WebElement amountPaid;

			@FindBy(xpath = "/html/body/div[3]/div[3]/div/div/div[2]/div[2]/div[2]/div/div/div[3]/div/div[2]/div[1]/div[2]/table/tbody/tr[2]/td[1]")
			WebElement tblValuePaymentDate;
			
			
			public  void payUser(String User, String Amount)
			{
				
				CommandsKeyMouse KeyMouse = new CommandsKeyMouse();
				

    			KeyMouse.clickAction(btnPayUser);
				KeyMouse.sendKeysAction(txtBoxUser_quickSearch, User);
				KeyMouse.sendKeysAction(txtBoxAmount, Amount);
				KeyMouse.clickAction(btnSubmit);
				KeyMouse.clickAction(btnConfirm);
				
				
			
		        String paymentMessage =	KeyMouse.gettingText(msgPaymentSuccessful);
				String payeeName1 = KeyMouse.gettingText(payeeName);
				String amountPaid1 = KeyMouse.gettingText(amountPaid);

				System.out.println("System is able to make payment to" + " " + payeeName1 +  " " + "of " + amountPaid1 + " and shows a message" + " " + paymentMessage);
					
				
	    		KeyMouse.clickAction(btnNewPayment);
					
			}
			
			
			public void successUpdate()
			{
				
				
				
				
			}
			

}

	
	
	

	