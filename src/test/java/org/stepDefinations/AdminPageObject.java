package org.stepDefinations;

import org.openqa.selenium.By;

public class AdminPageObject {

	public String getinputTextFieldNameXpat(String textfieldlabel) {

		if (textfieldlabel.equalsIgnoreCase("Username")) {
			try {
				return "(//label[normalize-space('" + textfieldlabel + "')]/following::input[1])[1]";
			} catch (Exception e) {
				return "//label[normalize-space('" + textfieldlabel + "')]//following::div[1]/input[1]";
			}

		} else if (textfieldlabel.equalsIgnoreCase("password")) {
			return "(//label[normalize-space('" + textfieldlabel + "')]/following::input[1])[2]";

		} else if (textfieldlabel.equalsIgnoreCase("Username")) {
			return "//label[normalize-space('" + textfieldlabel + "')]//following::div[1]/input[1]";

		} else if (textfieldlabel.equalsIgnoreCase("AddUsername")) {
			return "((//label[normalize-space('" + textfieldlabel + "')])[3]//following::div//input[1])[1]";
		} else if (textfieldlabel.equalsIgnoreCase("AddPassword")) {
			return "((//label[normalize-space('" + textfieldlabel + "')])[3]//following::div//input[1])[2]";
		} else if (textfieldlabel.equalsIgnoreCase("AddConfirm Password")) {
			return "((//label[normalize-space('" + textfieldlabel + "')])[3]//following::div//input[1])[3]";
		} else if (textfieldlabel.equalsIgnoreCase("Employee Name")) {
			return "((//label[normalize-space('" + textfieldlabel + "')])[2]//following::div//input[1])[1]";
		} else {

			return textfieldlabel;
		}

	}

	public String clickOnButton(String buttonn) {
		if (buttonn.trim().equalsIgnoreCase("Login")) {
			return "//button[normalize-space('" + buttonn + "') and @type='submit']";

		} else if (buttonn.trim().equalsIgnoreCase("Forgot your password?")) {
			return "(//p[normalize-space('" + buttonn + "')])[3]";
		} else if (buttonn.equalsIgnoreCase("Admin")) {

			return "(//span[normalize-space('" + buttonn + "')])[1]";
		} else if (buttonn.equalsIgnoreCase("Add")) {

			return "(//button[normalize-space('" + buttonn + "')])[7]";

		} else if (buttonn.equalsIgnoreCase("Save")) {

			return "(//button[normalize-space('" + buttonn + "')])[5]";

		} else {
			return buttonn;
		}

	}

	public String clickOnDropdown(String txt) {

		if (txt.contains("User Role")) {
			return "(//label[normalize-space('" + txt + "')])[1]/following::div[4][text()='-- Select --']";
		} else if (txt.contains("Status")) {
			return "(//label[normalize-space('" + txt + "')])[3]/following::div[4][text()='-- Select --']";
		}
		return txt;

	}

	public String clickOnDropdownvalue(String txt) {

		if (txt.contains("Admin")) {

			return "(//div[@role='option']//span[normalize-space('" + txt + "')])[1]";

		} else if (txt.contains("Enabled")) {
			return "(//div[@role='option']//span[normalize-space('" + txt + "')])[1]";
		}
		return txt;

	}

	public String dashBoadTxt(String txt) {
		return "//*[normalize-space('" + txt + "')]";

	}

	public String adminText(String txt) {
		if (txt.equalsIgnoreCase("System Users")) {

			return "(//*[normalize-space('" + txt + "')])[1]";

		} else if (txt.equalsIgnoreCase("Add User")) {

			return "(//*[normalize-space('" + txt + "')])[1]";

		}

		return txt;

	}

}