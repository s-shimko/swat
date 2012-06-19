package com.swat.pages;

import org.openqa.selenium.WebDriver;

import com.swat.BasePage;
import com.swat.data.UserData;
import com.swat.staticdata.PageTitle;
import com.swat.staticdata.PageUrl;

public class AddMemberPage extends BasePage {

	public AddMemberPage(WebDriver driver) {
		super(driver, PageTitle.ADMIN_ADD_MEMBER, PageUrl.ADMIN_ADD_MEMBER);
	}

	public AddMemberPage(WebDriver driver, PageTitle pageTitle,
			PageUrl pageUrl) {
		super(driver, pageTitle, pageUrl);
	}

	public AddMemberPage fillmemberForAs(UserData newMember) {
		getForm().set("memberID", newMember.getName())
		.set("password", newMember.getPassword())
		.set("confirmPassword", newMember.getPassword());
		return this;
	}

}
