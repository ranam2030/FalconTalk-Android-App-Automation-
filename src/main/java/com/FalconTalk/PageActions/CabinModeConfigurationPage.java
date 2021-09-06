package com.FalconTalk.PageActions;

import java.util.ArrayList;

import org.openqa.selenium.support.PageFactory;

import com.FalconTalk.Config.AppDriver;
import com.FalconTalk.PageObject.CabinModeConfigurationObj;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;

public class CabinModeConfigurationPage {
	int i=0;
	ArrayList<String> ExtensionListAxxess = new ArrayList<String>();
	ArrayList<String> ExtensionListCG_710_Legacy = new ArrayList<String>();
	ArrayList<String> ExtensionListCG_710_FC = new ArrayList<String>();
	ArrayList<String> ExtensionListCNX_900 = new ArrayList<String>();
	ArrayList<String> ExtensionListGDR = new ArrayList<String>();
	ArrayList<String> ExtensionListSDR = new ArrayList<String>();
	
	public CabinModeConfigurationPage() {
		PageFactory.initElements(new AppiumFieldDecorator(AppDriver.getDriver()), this);
	}
	
	CabinModeConfigurationObj cabinmode = new CabinModeConfigurationObj();
	
	public void getNavDrawer() {
		cabinmode.NavigationDrawer.click();
	}
	
	public void getCabinMode() {
		cabinmode.configureCabinDevice.click();
	}
	
	public String getCabinPage() {
		return cabinmode.cabinPage.getText();
	}
	
	public String getTostMessage() {
		return cabinmode.TostMessage.getText();
	}
	
	public void pressValidateButton() {
		cabinmode.validateButton.click();
	}
	
	public void pushPassword(String password) {
		cabinmode.cabinModePassword.sendKeys(password);
	}
	
	public String getRingGroupPageforCabinMode() {
		return cabinmode.cabinModePage.getText();
	}
	
	public String getCabinNameWithExtension(int accountIndex) {
		if (accountIndex == 1) {
			return cabinmode.cabinAxxessExtension.getText();
		}
		else if(accountIndex == 2) {
			return cabinmode.cabinCG_710LegacyExtension.getText();
		}
		else if(accountIndex == 3) {
			return cabinmode.cabinCG_710FCExtension.getText();
		}
		else if(accountIndex == 4) {
			return cabinmode.cabinCNX_900Extension.getText();
		}
		else if(accountIndex == 5) {
			return cabinmode.cabinGDRExtension.getText();
		}
		else if(accountIndex == 6) {
			return cabinmode.cabinSDRExtension.getText();
		}
		else {
			return "Wring Cabin Name";
		}
		
	}
	
	public ArrayList<String> getExtensionList(int accountIndex) {
		if(accountIndex == 1) {
			//cabinmode.cabinAxxessExtension.click();
			for(i=0;i<4;i++) {
				//String ext = cabinmode.extensionList.get(i).getText();
				ExtensionListAxxess.add(cabinmode.extensionList.get(i).getText());
				
			}
			System.out.println(ExtensionListAxxess);
			return ExtensionListAxxess;
		}
		else if(accountIndex == 2) {
			cabinmode.cabinCG_710LegacyExtension.click();
			for(i=0;i<4;i++) {
				String ext = cabinmode.extensionList.get(i).getText();
				ExtensionListCG_710_Legacy.add(ext);
				
			}
			System.out.println(ExtensionListCG_710_Legacy);
			return ExtensionListCG_710_Legacy;
		}
		else if(accountIndex == 3) {
			cabinmode.cabinCG_710FCExtension.click();
			for(i=0;i<6;i++) {
				String ext = cabinmode.extensionList.get(i).getText();
				ExtensionListCG_710_FC.add(ext);
			}
			System.out.println(ExtensionListCG_710_FC);
			return ExtensionListCG_710_FC;
		}
		
		else if(accountIndex == 4) {
			cabinmode.cabinCNX_900Extension.click();
			for(i=0;i<6;i++) {
				String ext = cabinmode.extensionList.get(i).getText();
				ExtensionListCNX_900.add(ext);
			}
			System.out.println(ExtensionListCNX_900);
			return ExtensionListCNX_900;
		}
		
		else if(accountIndex == 5) {
			cabinmode.cabinGDRExtension.click();
			for(i=0;i<6;i++) {
				String ext = cabinmode.extensionList.get(i).getText();
				ExtensionListGDR.add(ext);
			}
			System.out.println(ExtensionListGDR);
			return ExtensionListGDR;
		}
		else if(accountIndex == 6) {
			cabinmode.cabinSDRExtension.click();
			for(i=0;i<4;i++) {
				String ext = cabinmode.extensionList.get(i).getText();
				ExtensionListSDR.add(ext);
			}
			System.out.println(ExtensionListSDR);
			return ExtensionListSDR;
		}
	
		
		return ExtensionListSDR;
	}

}
