package stepDefinitions;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import dataProviders.EnvPropertyManager;
import utilities.TestContext;
import pageObjects.LoginPage;
import pageObjects.MyGrantsPage;

public class GetNewGrantSteps {

	TestContext testContext;
	private LoginPage loginPage;
	private MyGrantsPage myGrantsPage;
	String applnRefId;
	
	public GetNewGrantSteps(TestContext testContext) {
		this.testContext = testContext;
		loginPage = new LoginPage(testContext);
		myGrantsPage = new MyGrantsPage(testContext);
	}

	@Given("Launch Business Grants Portal")
	public void Launch_Business_Grants_Portal() {
		loginPage.launchUrl(EnvPropertyManager.getUsername(), EnvPropertyManager.getPassword(),
				EnvPropertyManager.getUrl());
	}

	@When("Login with NRIC {string}, username {string}, UEN {string}, Role {string}")
	public void login_with_NRIC_username_UEN_Role(String nric, String name, String uen, String role) {
		loginPage.login(nric, name, uen, role);
	}

	@When("Proceed to get new grant")
	public void proceed_to_get_new_grant() {
		myGrantsPage.proceedToGetNewGrant();
	}

	@When("Complete filling the eligibility details by selecting yes for all questions")
	public void Enter_Eligibility_details() {
		myGrantsPage.checkEligibility();
	}

	@When("Ensure visit smart advisor warning message is displayed on selecting No for any of the questions")
	public void ensure_warning_message_is_displayed_on_selecting_No_for_any_of_the_questions() {
		myGrantsPage.ensureWarnMsgVisitSmartAdvisor();
	}

	@When("Clicking the link in the warning message will launch a website in another window tab")
	public void clicking_the_link_in_the_warning_message_will_launch_a_website_in_another_window_tab() {
		myGrantsPage.clickWarnMsgLinkAndSwitchTo2ndTab();
	}
	
	@When("Click on save button")
	public void clicking_save_button() throws InterruptedException {
		myGrantsPage.clickSave();
	}

	@When("Refreshing the page should reload the saved values in eligibility section")
	public void refreshing_the_page_should_reload_the_saved_values() {
		myGrantsPage.reloadPage();
		myGrantsPage.ensureYesSelectedForEligibilityQues();
	}
	
	@When("Click on next button")
	public void click_on_next_button() {
		myGrantsPage.clickNext();
	}
	
	@When("Enter contact person details name {string}, job title {string}, contact number {string}, email {string}, alternate email {string}")
	public void enter_contact_person_details_name_job_title_contact_number_email_alternate_email(String name,
			String jobTitle, String contactNo, String email, String altEmail) {
		myGrantsPage.enterContactPersonDetails(name, jobTitle, contactNo, email, altEmail);
	}

	@When("Select same as registered address in Company Profile checkbox")
	public void select_same_as_registered_address_in_Company_Profile_checkbox() {
		myGrantsPage.selectSameAsRegAddress();
	}

	@Then("Verify auto-populate Mailing Address details")
	public void verify_auto_populate_Mailing_Address_details() {
		myGrantsPage.verifyAutoPopMailAddressDetails();
	}

	@Then("Select same as main contact person details")
	public void select_same_as_main_contact_person_details() {
		myGrantsPage.selectSameAsMainContact();
	}

	@Then("Verify auto-populate Letter of Offer Addressee details")
	public void verify_auto_populate_Letter_of_Offer_Addressee_details() {
		myGrantsPage.verifyAutoPopLetterOfferAddresseeDetails();
	}
	
	@When("Search mailing address with the postal code {string}")
	public void search_mailing_address_with_the_postal_code(String postalCode) {
		myGrantsPage.searchPostalCode(postalCode);
	}


	@Then("Refreshing the page should reload the saved values in Contact Details section")
	public void refreshing_the_page_should_reload_the_saved_values_in_Contact_Details_section() {
		myGrantsPage.reloadPage();
		myGrantsPage.verifyAutoPopMailAddressDetails();
		myGrantsPage.verifyAutoPopLetterOfferAddresseeDetails();
	}
	
	@When("Click on Declare and Review section")
	public void click_on_Declare_and_Review_section() {
		myGrantsPage.clickDeclareReviewSection();
	}

	@When("Click on review button")
	public void click_on_review_button() {
		myGrantsPage.clickReview();
	}

	@Then("Verify redirect to the section with the missing details")
	public void verify_redirect_to_the_section_with_the_missing_details() {
		myGrantsPage.verifyRedirectSectionMissingDetails();
	}

	@Then("Verify error numbers are shown in the sidebar")
	public void verify_error_numbers_are_shown_in_the_sidebar() {
		myGrantsPage.verifyErrorNumShown();
	}

	@Then("Enter Proposal section details project title {string}, start date {string}, end date {string}, project description {string}")
	public void enter_Proposal_section_details_project_title_start_date_end_date_project_description(String prjTitle,
			String startDate, String endDate, String prjDesc) {
		myGrantsPage.enterProposalDetails(prjTitle, startDate, endDate, prjDesc);
	}
	
	@Then("Select Activity {string} and Target market {string}")
	public void select_Activity_and_Target_market(String activity, String targetMarket) {
		myGrantsPage.selectActivityTargetMarket(activity, targetMarket);
	}

	@Then("Select yes for first time expanding outside Singapore")
	public void select_yes_for_first_time_expanding_outside_Singapore() {
		myGrantsPage.selectYesFirstTimeExpanOutsideSg();
	}

	@Then("Select FY end date {string}")
	public void select_FY_end_date(String fyEndDate) {
		myGrantsPage.selectFyEndDate(fyEndDate);
	}

	@Then("Enter Overseas sales details sales one {string}, sales two {string}, sales three {string}, sales four {string}")
	public void enter_Overseas_sales_details_sales_sales_sales_sales(String sales0, String sales1, String sales2, String sales3) {
		myGrantsPage.enterOverseasSales(sales0, sales1, sales2, sales3);
	}

	@Then("Enter Overseas investments details investments one {string}, investments two {string}, investments three {string}, investments four {string}")
	public void enter_Overseas_investments_details_investments_investments_investments_investments(String investments0,
			String investments1, String investments2, String investments3) {
		myGrantsPage.enterOverseasInvestments(investments0, investments1, investments2, investments3);
	}

	@Then("Enter Rationale for projections {string} and non tangible benefits {string}")
	public void enter_Rationale_for_projections_and_non_tangible_benefits(String rationaleProj, String nonTangBenefits) {
		myGrantsPage.enterRationaleProjNonTangBenefits(rationaleProj, nonTangBenefits);
	}

	@Then("Complete filling the Cost section details name {string}, designation {string}, nricPassportNum {string}, nationlity {string}, roleInProject {string}, projectInvolvement {string}, monthlySalary {string}")
	public void complete_filling_the_Cost_section_details(String name, String designation, String nricPassportNum,
			String nationlity, String roleInProject, String projectInvolvement, String monthlySalary) {
		myGrantsPage.enterSalary(name, designation, nricPassportNum, nationlity, roleInProject, projectInvolvement,
				monthlySalary);
	}

	@Then("Select no for declare and acknowledgement terms")
	public void select_no_for_declare_and_acknowledgement_terms() {
		myGrantsPage.selectNoDeclareAckTerms();
	}
	
	@Then("Select Yes for comply all govt rules")
	public void select_Yes_for_comply_all_govt_rules() {
		myGrantsPage.selectYesComplyAllGovtRules();
	}
	
	@When("Click on Consent and Acknowledgement checkbox")
	public void click_on_Consent_and_Acknowledgement_checkbox() {
		myGrantsPage.ClickConsentAckCheckbox();
	}

	@Then("Submit application and ensure")
	public void ensure_application_is_submitted() {
		applnRefId = myGrantsPage.clickSumbitAndEnsure();
	}

	@Then("Ensure My Grants dasboard shows the application under processing tab")
	public void ensure_My_Grants_dasboard_shows_the_application_under_processing_tab() {
		myGrantsPage.verifyApplnUnderProcessingTab(applnRefId);
	}

}
