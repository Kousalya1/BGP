package pageObjects;

import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertTrue;

import java.util.ArrayList;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

import dataProviders.EnvPropertyManager;
import dataProviders.MsgPropertyManager;
import utilities.TestContext;

public class MyGrantsPage extends BasePage {

	@FindBy(how = How.XPATH, using = "//h4[text()='Get new grant']")
	private WebElement getNewGrant;

	@FindBy(how = How.XPATH, using = "//div[text()='IT']")
	private WebElement it;

	@FindBy(how = How.XPATH, using = "//div[contains(text(),'Bring my business overseas')]")
	private WebElement bringMyBusinessOverseas;

	@FindBy(how = How.XPATH, using = "//div[contains(text(),'Market Readiness Assistance')]")
	private WebElement marketReadinessAssist;

	@FindBy(how = How.XPATH, using = "//button[text()='Apply']")
	private WebElement applyButton;

	@FindBy(how = How.ID, using = "keyPage-form-button")
	private WebElement proceedButton;

	@FindBy(how = How.ID, using = "react-eligibility-sg_registered_check-true")
	private WebElement registeredCheckYes;
	@FindBy(how = How.XPATH, using = "//input[@id='react-eligibility-sg_registered_check-true']//following-sibling::span[@class='radiobutton']")
	private WebElement registeredCheckYesRadioButton;
	
	@FindBy(how = How.ID, using = "react-eligibility-turnover_check-true")
	private WebElement turnoverCheckYes;
	@FindBy(how = How.XPATH, using = "//input[@id='react-eligibility-turnover_check-true']//following-sibling::span[@class='radiobutton']")
	private WebElement turnoverCheckYesRadioButton;
	
	@FindBy(how = How.ID, using = "react-eligibility-global_hq_check-true")
	private WebElement globalHqCheckYes;
	@FindBy(how = How.XPATH, using = "//input[@id='react-eligibility-global_hq_check-true']//following-sibling::span[@class='radiobutton']")
	private WebElement globalHqCheckYesRadioButton;
	
	@FindBy(how = How.ID, using = "react-eligibility-new_target_market_check-true")
	private WebElement newTargetMarketCheckYes;
	@FindBy(how = How.XPATH, using = "//input[@id='react-eligibility-new_target_market_check-true']//following-sibling::span[@class='radiobutton']")
	private WebElement newTargetMarketCheckYesRadioButton;
	
	@FindBy(how = How.ID, using = "react-eligibility-started_project_check-true")
	private WebElement startedProjectCheckYes;
	@FindBy(how = How.XPATH, using = "//input[@id='react-eligibility-started_project_check-true']//following-sibling::span[@class='radiobutton']")
	private WebElement startedProjectCheckYesRadioButton;
	
	@FindBy(how = How.ID, using = "react-eligibility-started_project_check-false")
	private WebElement startedProjectCheckNo;

	@FindBy(how = How.XPATH, using = "//div[@class='eligibility-advice']//span")
	private WebElement eligibilityAdvice;

	@FindBy(how = How.XPATH, using = "//div[@class='eligibility-advice']//a[@target='_blank']")
	private WebElement eligibilityAdviceLink;

	@FindBy(how = How.XPATH, using = "//a[@href='/content/smeportal.html']/following::img[@class='siteLogo']")
	private WebElement siteLogo;

	@FindBy(how = How.XPATH, using = "//button[text()='Next']")
	private WebElement nextButton;

	@FindBy(how = How.ID, using = "react-contact_info-name")
	private WebElement contactPersonName;

	@FindBy(how = How.ID, using = "react-contact_info-designation")
	private WebElement jobTitleTextbox;

	@FindBy(how = How.ID, using = "react-contact_info-phone")
	private WebElement contactNum;

	@FindBy(how = How.ID, using = "react-contact_info-primary_email")
	private WebElement primaryEmail;

	@FindBy(how = How.ID, using = "react-contact_info-secondary_email")
	private WebElement secondaryEmail;

	@FindBy(how = How.ID, using = "react-contact_info-correspondence_address-copied")
	private WebElement sameAsRegAddressCheckbox;

	@FindBy(how = How.ID, using = "react-contact_info-correspondence_address-postal")
	private WebElement postalCode;

	@FindBy(how = How.ID, using = "react-contact_info-correspondence_address-postal-postal")
	private WebElement searchIcon;

	@FindBy(how = How.ID, using = "react-contact_info-correspondence_address-block")
	private WebElement blockTextbox;
	@FindBy(how = How.ID, using = "react-contact_info-correspondence_address-street")
	private WebElement streetTextbox;
	@FindBy(how = How.ID, using = "react-contact_info-correspondence_address-level")
	private WebElement levelTextbox;
	@FindBy(how = How.ID, using = "react-contact_info-correspondence_address-unit")
	private WebElement unitTextbox;
	@FindBy(how = How.ID, using = "react-contact_info-correspondence_address-building_name")
	private WebElement buildingNameTextbox;

	@FindBy(how = How.ID, using = "react-contact_info-copied")
	private WebElement sameAsMainContactPersonCheckbox;
	@FindBy(how = How.ID, using = "react-contact_info-offeree_name")
	private WebElement offereeName;
	@FindBy(how = How.ID, using = "react-contact_info-offeree_designation")
	private WebElement offereeJobTitle;
	@FindBy(how = How.ID, using = "react-contact_info-offeree_email")
	private WebElement offereeEmail;

	@FindBy(how = How.ID, using = "react-project-title")
	private WebElement projectTitle;

	@FindBy(how = How.ID, using = "react-project-start_date")
	private WebElement projectStartDate;
	@FindBy(how = How.ID, using = "react-project-end_date")
	private WebElement projectEndDate;
	@FindBy(how = How.CSS, using = "div[class='bgp-readonly']")
	private WebElement projectDuration;
	@FindBy(how = How.ID, using = "react-project-description")
	private WebElement projectDesc;

	@FindBy(how = How.XPATH, using = "//span[@id='react-select-project-activity--value']//div[@class='Select-placeholder']")
	private WebElement activityDropdown;
	
	@FindBy(how = How.XPATH, using = "//span[@id='react-select-project-primary_market--value']//div[@class='Select-placeholder']")
	private WebElement targetMarketDropdown;
	@FindBy(how = How.ID, using = "react-project-is_first_time_expand-true")
	private WebElement firstTimeExpandYes;
	@FindBy(how = How.ID, using = "react-project-remarks")
	private WebElement remarks;

	@FindBy(how = How.ID, using = "save-btn")
	private WebElement saveButton;

	@FindBy(how = How.ID, using = "react-project_impact-fy_end_date_0")
	private WebElement fyEndDateBox;
	@FindBy(how = How.ID, using = "react-project_impact-overseas_sales_0")
	private WebElement overseasSales0;

	@FindBy(how = How.ID, using = "react-project_impact-overseas_sales_1")
	private WebElement overseasSales1;
	@FindBy(how = How.ID, using = "react-project_impact-overseas_sales_2")
	private WebElement overseasSales2;

	@FindBy(how = How.ID, using = "react-project_impact-overseas_sales_3")
	private WebElement overseasSales3;

	@FindBy(how = How.ID, using = "react-project_impact-overseas_investments_0")
	private WebElement overseasInvestments0;
	@FindBy(how = How.ID, using = "react-project_impact-overseas_investments_1")
	private WebElement overseasInvestments1;

	@FindBy(how = How.ID, using = "react-project_impact-overseas_investments_2")
	private WebElement overseasInvestments2;
	@FindBy(how = How.ID, using = "react-project_impact-overseas_investments_3")
	private WebElement overseasInvestments3;

	@FindBy(how = How.ID, using = "react-project_impact-rationale_remarks")
	private WebElement rationaleForProjections;
	@FindBy(how = How.ID, using = "react-project_impact-benefits_remarks")
	private WebElement nonTangibleBenefits;

	@FindBy(how = How.XPATH, using = "//div[text()='Third Party Vendors']")
	private WebElement thirdPartyVendors;

	@FindBy(how = How.XPATH, using = "//div[@id='react-project_cost-salaries']//following::button[text()='Add New Item']")
	private WebElement addNewItem;

	@FindBy(how = How.ID, using = "react-project_cost-vendors-0-local_vendor-true")
	private WebElement vendorRegisteredSG;
	@FindBy(how = How.ID, using = "react-project_cost-vendors-0-vendor_name")
	private WebElement vendorName;

	@FindBy(how = How.ID, using = "react-project_cost-vendors-0-vendor_uen_label")
	private WebElement vendorUEN;

	@FindBy(how = How.ID, using = "react-project_cost-vendors-0-amount_in_billing_currency")
	private WebElement billingCurrency;

	@FindBy(how = How.XPATH, using = "//button[text()='Select Files']")
	private WebElement selectFiles;

	@FindBy(how = How.XPATH, using = "//div[text()='Salary']")
	private WebElement salary;

	@FindBy(how = How.CSS, using = "input[id='react-project_cost-salaries-0-name']")
	private WebElement salaryName;
	@FindBy(how = How.CSS, using = "input[id='react-project_cost-salaries-0-designation']")
	private WebElement salaryDesignation;
	@FindBy(how = How.CSS, using = "input[id='react-project_cost-salaries-0-nric']")
	private WebElement nricOrPassportNo;
	@FindBy(how = How.CSS, using = "input[id='react-select-project_cost-salaries-0-nationality--value']")
	private WebElement natioanlityType;
	@FindBy(how = How.CSS, using = "textarea[id='react-project_cost-salaries-0-project_role']")
	private WebElement roleInPrj;
	@FindBy(how = How.CSS, using = "input[id='react-project_cost-salaries-0-involvement_months']")
	private WebElement prjInvolvement;
	@FindBy(how = How.CSS, using = "input[id='react-project_cost-salaries-0-salary_in_billing_currency']")
	private WebElement salaryBillingCurrency;

	@FindBy(how = How.XPATH, using = "//h3[text()='Consent & Acknowledgement']")
	private WebElement consentAck;

	@FindBy(how = How.XPATH, using = "//span[text()='Declare & Review']")
	private WebElement declareReviewSection;

	@FindBy(how = How.ID, using = "react-declaration-criminal_liability_check-false")
	private WebElement liabilityCheckNo;
	@FindBy(how = How.ID, using = "react-declaration-civil_proceeding_check-false")
	private WebElement proceedingCheckNo;
	@FindBy(how = How.ID, using = "react-declaration-insolvency_proceeding_check-false")
	private WebElement insolvencyProceedingCheckNo;
	@FindBy(how = How.ID, using = "react-declaration-project_incentives_check-false")
	private WebElement projectIncentivesCheckNo;
	@FindBy(how = How.ID, using = "react-declaration-other_incentives_check-false")
	private WebElement otherIncentivesCheckNo;
	@FindBy(how = How.ID, using = "react-declaration-project_commence_check-false")
	private WebElement projectCommenceCheckNo;
	@FindBy(how = How.ID, using = "react-declaration-related_party_check-false")
	private WebElement partyCheckNo;
	@FindBy(how = How.ID, using = "react-declaration-covid_safe_check-true")
	private WebElement covidSafeYes;
	@FindBy(how = How.ID, using = "react-declaration-covid_safe_ques_check-true")
	private WebElement complyAllSDMs;
	@FindBy(how = How.ID, using = "react-declaration-consent_acknowledgement_check")
	private WebElement acknowledgementCheck;
	@FindBy(how = How.ID, using = "review-btn")
	private WebElement reviewButton;

	@FindBy(how = How.XPATH, using = "//span[text()='Eligibility']/following::span[1][@class='label label-error']")
	private WebElement eligibilityErrorNum;
	@FindBy(how = How.XPATH, using = "//span[text()='Contact Details']/following::span[1][@class='label label-error']")
	private WebElement contactDetailsErrorNum;
	@FindBy(how = How.XPATH, using = "//span[text()='Proposal']/following::span[1][@class='label label-error']")
	private WebElement proposalErrorNum;
	@FindBy(how = How.XPATH, using = "//span[text()='Business Impact']/following::span[1][@class='label label-error']")
	private WebElement businessImpactErrorNum;
	@FindBy(how = How.XPATH, using = "//span[text()='Cost']/following::span[1][@class='label label-error']")
	private WebElement costErrorNum;
	@FindBy(how = How.XPATH, using = "//span[text()='Declare & Review']/following::span[1][@class='label label-error']")
	private WebElement declareReviewErrorNum;

	@FindBy(how = How.XPATH, using = "//h2[text()='Check Your Eligibility']")
	private WebElement checkYourEligibility;

	private static By fieldErrorMessages = By.cssSelector("p[class='help-inline field-error-message']");

	@FindBy(how = How.ID, using = "react-declaration-info_truthfulness_check")
	private WebElement truthfulnessCheck;

	@FindBy(how = How.ID, using = "submit-btn")
	private WebElement submitButton;

	@FindBy(how = How.XPATH, using = "//h3[text()='Your application has been submitted.']")
	private WebElement applnSubmitted;
	@FindBy(how = How.XPATH, using = "//table[@class='key-status-section']//span[1]")
	private WebElement enterpriseSG;
	@FindBy(how = How.XPATH, using = "//table[@class='key-status-section']//td[text()='Ref ID:']//following-sibling::td[@class='value']")
	private WebElement refId;
	@FindBy(how = How.XPATH, using = "//table[@class='key-status-section']//td[text()='Agency Details:']//following-sibling::td[@class='value']")
	private WebElement agencyDetails;

	@FindBy(how = How.CSS, using = "div[class='navbar-burger burger']")
	private WebElement hamburger;

	@FindBy(how = How.XPATH, using = "//a[text()='My Grants']")
	private WebElement myGrants;
	@FindBy(how = How.CSS, using = "a[href='#processing']")
	private WebElement processingTab;
	@FindBy(how = How.XPATH, using = "//table[@id='db-apps-processing']//tbody//td")
	private WebElement newRefId;

	public MyGrantsPage(TestContext context) {
		super(context);
	}

	public void proceedToGetNewGrant() {
		elementFactory.javaScriptExecutorClick(getNewGrant);
		elementFactory.elementClick(it);
		elementFactory.elementClick(bringMyBusinessOverseas);
		elementFactory.elementClick(marketReadinessAssist);
		elementFactory.javaScriptExecutorClick(applyButton);
		elementFactory.elementClick(proceedButton);
		driver.manage().timeouts().pageLoadTimeout(EnvPropertyManager.getImplicitWaitInMilliSeconds(),
				TimeUnit.MILLISECONDS);
	}

	public void checkEligibility() {
		elementFactory.elementClick(registeredCheckYes);
		elementFactory.elementClick(turnoverCheckYes);
		elementFactory.elementClick(globalHqCheckYes);
		elementFactory.elementClick(newTargetMarketCheckYes);
		elementFactory.elementClick(startedProjectCheckYes);
	}

	public void ensureWarnMsgVisitSmartAdvisor() {
		elementFactory.elementClick(startedProjectCheckNo);
		elementFactory.waitUntilVisible(eligibilityAdvice);
		elementFactory.elementMouseHover(eligibilityAdvice, true);
		assertTrue(eligibilityAdvice.getText().equals(MsgPropertyManager.getEligibilityWarnMsg()),
				"Expected warning message: 'Visit Smart Advisor on the SME Portal for more information on other government assistance.' is not displayed.");
	}

	public void clickWarnMsgLinkAndSwitchTo2ndTab() {
		elementFactory.elementClick(eligibilityAdviceLink);
		ArrayList<String> tabs = new ArrayList<String>(driver.getWindowHandles());
		driver.switchTo().window(tabs.get(1));
		assertTrue(driver.getCurrentUrl().contains(MsgPropertyManager.getSmePortalUrl()));
		assertTrue(elementFactory.verifyElementDisplayed(siteLogo));
		driver.close();
		driver.switchTo().window(tabs.get(0));
	}

	public void clickSave() {
		try {
			elementFactory.elementClick(saveButton);
			elementFactory.alertIsPresent();
			elementFactory.alertAccept();
		} catch (Exception ex) {}
	}

	public void reloadPage() {
		driver.navigate().refresh();
		driver.manage().timeouts().pageLoadTimeout(EnvPropertyManager.getImplicitWaitInMilliSeconds(),
				TimeUnit.MILLISECONDS);
	}

	public void ensureYesSelectedForEligibilityQues() {
		elementFactory.waitUntilVisible(registeredCheckYesRadioButton);
		elementFactory.elementMouseHover(registeredCheckYesRadioButton, true);
		assertTrue(registeredCheckYesRadioButton.isEnabled());
		assertTrue(turnoverCheckYesRadioButton.isEnabled());
		assertTrue(globalHqCheckYesRadioButton.isEnabled());
		assertTrue(newTargetMarketCheckYesRadioButton.isEnabled());
		assertTrue(startedProjectCheckYesRadioButton.isEnabled());
	}

	public void enterContactPersonDetails(String name, String jobTitle, String contactNo, String email,
			String altEmail) {
		elementFactory.enterTextBox(contactPersonName, name);
		elementFactory.enterTextBox(jobTitleTextbox, jobTitle);
		elementFactory.enterTextBox(contactNum, contactNo);
		elementFactory.enterTextBox(primaryEmail, email);
		elementFactory.enterTextBox(secondaryEmail, altEmail);
	}

	public void selectSameAsRegAddress() {
		elementFactory.elementClick(sameAsRegAddressCheckbox);
	}

	public void verifyAutoPopMailAddressDetails() {
		assertTrue(elementFactory.elementGetText(postalCode) != "", "Postal code is Empty!");
		assertTrue(elementFactory.elementGetAttribute(blockTextbox, "value") != "Block No is Empty!");
		assertTrue(elementFactory.elementGetAttribute(streetTextbox, "value") != "Street is Empty!");
	}

	public void searchPostalCode(String postCode) {
		elementFactory.enterTextBox(postalCode, postCode);
		elementFactory.elementClick(searchIcon);
	}

	public void enterLetterOfOfferAddressee(String name, String jobTitle, String email) {
		elementFactory.enterTextBox(offereeName, name);
		elementFactory.enterTextBox(offereeJobTitle, jobTitle);
		elementFactory.enterTextBox(offereeEmail, email);
	}

	public void selectSameAsMainContact() {
		elementFactory.elementClick(sameAsMainContactPersonCheckbox);
	}

	public void verifyAutoPopLetterOfferAddresseeDetails() {
		assertTrue(elementFactory.elementGetText(offereeName) != "", "Offeree name is Empty!");
		assertTrue(elementFactory.elementGetText(offereeJobTitle) != "", "Offeree job title is Empty!");
		assertTrue(elementFactory.elementGetText(offereeEmail) != "", "Offeree email is Empty!");
	}

	public void clickNext() {
		elementFactory.elementClick(nextButton);
	}

	public void enterProposalDetails(String prjTitle, String startDate, String endDate, String prjDesc) {
		elementFactory.enterTextBox(projectTitle, prjTitle);
		elementFactory.enterTextBox(projectStartDate, startDate);
		elementFactory.enterTextBox(projectEndDate, endDate);
		elementFactory.enterTextBox(projectDesc, prjDesc);
		projectDesc.sendKeys(Keys.TAB);
	}

	public void selectActivityTargetMarket(String activity, String targetMarket) {
		elementFactory.enterTextBox(activityDropdown, activity);
		activityDropdown.sendKeys(Keys.ENTER);
		elementFactory.enterTextBox(targetMarketDropdown, targetMarket);
		targetMarketDropdown.sendKeys(Keys.ENTER);
	}

	public void selectYesFirstTimeExpanOutsideSg() {
		elementFactory.elementClick(firstTimeExpandYes);
	}

	public void selectFyEndDate(String fyEndDate) {
		elementFactory.enterTextBox(fyEndDateBox, fyEndDate);
	}

	public void enterOverseasSales(String sales0, String sales1, String sales2, String sales3) {
		elementFactory.enterTextBox(overseasSales0, sales0);
		elementFactory.enterTextBox(overseasSales1, sales1);
		elementFactory.enterTextBox(overseasSales2, sales2);
		elementFactory.enterTextBox(overseasSales3, sales3);
	}

	public void enterOverseasInvestments(String investments0, String investments1, String investments2,
			String investments3) {
		elementFactory.enterTextBox(overseasInvestments0, investments0);
		elementFactory.enterTextBox(overseasInvestments1, investments1);
		elementFactory.enterTextBox(overseasInvestments2, investments2);
		elementFactory.enterTextBox(overseasInvestments3, investments3);
	}

	public void enterRationaleProjNonTangBenefits(String rationaleProj, String nonTangBenefits) {
		elementFactory.enterTextBox(rationaleForProjections, rationaleProj);
		elementFactory.enterTextBox(nonTangibleBenefits, nonTangBenefits);
	}

	public void enterSalary(String name, String designation, String nricPassportNum, String nationlity,
			String roleInProject, String projectInvolvement, String monthlySalary) {
		elementFactory.elementMouseHover(salary, true);
		elementFactory.elementClick(salary);
		elementFactory.waitUntilVisible(addNewItem);
		elementFactory.javaScriptExecutorClick(addNewItem);
		elementFactory.enterTextBox(salaryName, name);
		elementFactory.enterTextBox(salaryDesignation, designation);
		elementFactory.enterTextBox(nricOrPassportNo, nricPassportNum);
		elementFactory.enterTextBox(natioanlityType, nationlity);
		elementFactory.enterTextBox(roleInPrj, roleInProject);
		elementFactory.enterTextBox(prjInvolvement, projectInvolvement);
		elementFactory.enterTextBox(salaryBillingCurrency, monthlySalary);
	}

	public void selectNoDeclareAckTerms() {
		elementFactory.elementClick(liabilityCheckNo);
		elementFactory.elementClick(proceedingCheckNo);
		elementFactory.elementClick(insolvencyProceedingCheckNo);
		elementFactory.elementClick(projectIncentivesCheckNo);
		elementFactory.elementClick(otherIncentivesCheckNo);
		elementFactory.elementClick(projectCommenceCheckNo);
		elementFactory.elementClick(partyCheckNo);
		elementFactory.elementClick(liabilityCheckNo);
	}

	public void selectYesComplyAllGovtRules() {
		elementFactory.elementClick(covidSafeYes);
		elementFactory.elementClick(complyAllSDMs);
	}
	
	public void ClickConsentAckCheckbox() {
		elementFactory.elementClick(acknowledgementCheck);
	}

	public void clickDeclareReviewSection() {
		elementFactory.elementMouseHover(declareReviewSection, true);
		elementFactory.elementClick(declareReviewSection);
		clickReview();
		driver.manage().timeouts().pageLoadTimeout(EnvPropertyManager.getImplicitWaitInMilliSeconds(),
				TimeUnit.MILLISECONDS);
	}

	public void clickReview() {
		elementFactory.javaScriptExecutorClick(reviewButton);
	}

	public void verifyErrorNumShown() {
		assertTrue(eligibilityErrorNum.isDisplayed(), "Error number for Eligibility section is not displayed!");
		assertTrue(contactDetailsErrorNum.isDisplayed(), "Error number for Contact details section is not displayed!");
		assertTrue(proposalErrorNum.isDisplayed(), "Error number for Proposal section is not displayed!");
		assertTrue(businessImpactErrorNum.isDisplayed(), "Error number for Business impact section is not displayed!");
		assertTrue(costErrorNum.isDisplayed(), "Error number for Cost section is not displayed!");
		assertTrue(declareReviewErrorNum.isDisplayed(), "Error number for Declare and Review section is not displayed!");
	}

	public void verifyRedirectSectionMissingDetails() {
		elementFactory.waitUntilVisible(checkYourEligibility);
		assertTrue(checkYourEligibility.isDisplayed(), "The text 'Check Your Eligibility' is not displayed.");
		assertTrue(driver.findElements(fieldErrorMessages).size() > 0, "Field error messages are not displayed.");
	}

	public String clickSumbitAndEnsure() {
		elementFactory.elementClick(truthfulnessCheck);
		elementFactory.elementClick(submitButton);
		assertTrue(applnSubmitted.isDisplayed(), "The application has not been submitted.");
		assertTrue(agencyDetails.isDisplayed(), "Agency details are not displayed.");
		assertTrue(enterpriseSG.isDisplayed(), "Receiving Agency as 'Enterprise Singapore' is not displayed.");
		assertTrue(refId.isDisplayed(), "Receiving Agency as 'Enterprise Singapore' is not displayed.");
		return elementFactory.elementGetText(refId);
	}

	public void verifyApplnUnderProcessingTab(String refId) {
		elementFactory.elementClick(hamburger);
		elementFactory.elementClick(myGrants);
		elementFactory.elementClick(processingTab);
		assertEquals(newRefId, refId);
	}

}