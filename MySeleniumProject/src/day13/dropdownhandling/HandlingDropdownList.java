package day13.dropdownhandling;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import day12RelativePath.SeleniumUtil;

public class HandlingDropdownList {

	public static void main(String[] args) {
        //Set the browser
		WebDriver driver = SeleniumUtil.setUp("chrome", "https://demo.automationtesting.in/Register.html");
		// Identify dropdown list
		WebElement skillDropdown = driver.findElement(By.id("Skills"));
//Create an instance of Select class and pass above element into its constructor
		Select selectSkill = new Select(skillDropdown);
//Check whether dropdown is multiselect dropdown or not
		System.out.println("Is dropdown allowing you to select multiple option:" + selectSkill.isMultiple());
//Get default or already selected option
		System.out.println("Already selected option name:" + selectSkill.getFirstSelectedOption().getText());
//Get option count
		List<WebElement> options = selectSkill.getOptions();
		System.out.println("Option Count is:"+options.size());
//get dropdown option names
		for (int i = 0; i < options.size(); i++) {
			System.out.println("Option " + i + " : " + options.get(i).getText());	
		}
//validation dropdown skills are getting displayed in ascending order

//select options from dropdown 
		//1.Select by index
			selectSkill.selectByIndex(4);
			System.out.println("Already selected option name:" + selectSkill.getFirstSelectedOption().getText());
			// or Select by value
			selectSkill.selectByValue("Backup Management");
			System.out.println(("Already selected option name:" + selectSkill.getFirstSelectedOption().getText()));
			// 0r Select by Visible Text
			selectSkill.selectByVisibleText("Analytics");
			System.out.println("Already selected option name:" + selectSkill.getFirstSelectedOption().getText());
			//verify dropdown options sequence or
			//checking the order of skills
			//refer recording for explanation day 4july2023
			String act_skillName="";//
			//get dropdown option names
			for(int i= 1; i <options.size(); i++ ) {
				if((options.size()-1)!=i) {
					act_skillName=act_skillName+options.get(i).getText()+",";//AdobeInDesign
				}else {
					act_skillName=act_skillName+options.get(i).getText();
				}
			}
		//Expected skills
String exp_skillName="Select Skills,Adobe InDesign,Adobe Photoshop,Analytics,Android, APIs Art Design,AutoCAD,Backup Management,C,C++,Certifications Client Server,Client Support,Configuration ,Content Managment ,Content Management Systems ,Corel Draw,Corel Word ,CSS,Data Analytics,Desktop Publishing,Design,Diagnostics,Documentation,End User Support,Email,Engineering,Excel,FileMaker Pro,Fortran ,HTML,Implementation,Installation,Internet,iOS,iPhone,Linux,Java,Javascript,Mac,Matlab,Maya,Microsoft ,Microsoft Office,Microsoft Outlook,Microsoft Publisher,Microsoft Word,Microsoft Visual,Mobile,MySQL,Networks,Open Source Software,Oracle,Perl,PHP,Presentations,Processing,Programming,PT Modeler ,Python,QuickBooks,Ruby,Shade,Software,Spreadsheet,SQL,Support,Systems Administration,Tech Support,Troubleshooting ,Unix ,UI,UX,Windows,Word Processing,XML,XHTML";       
	System.out.println("skillName:"+act_skillName);			
	System.out.println("exp_skillName:"+exp_skillName);		
	System.out.println("Skills are in sequential order or not:"+act_skillName.equals(exp_skillName));
			
			
			
		}
	}

