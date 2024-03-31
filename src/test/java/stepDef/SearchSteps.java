package stepDef;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class SearchSteps {

	@Given("I want to write a step with precondition")
	public void i_want_to_write_a_step_with_precondition() {
		System.out.println(Thread.currentThread().getStackTrace()[1].getMethodName());
		
	}

	@Given("some other precondition")
	public void some_other_precondition() {
		System.out.println(Thread.currentThread().getStackTrace()[1].getMethodName());
		
	}

	@When("I complete action")
	public void i_complete_action() {
		System.out.println(Thread.currentThread().getStackTrace()[1].getMethodName());
		
	}

	@When("some other action")
	public void some_other_action() {
		System.out.println(Thread.currentThread().getStackTrace()[1].getMethodName());
		
	}

	@When("yet another action")
	public void yet_another_action() {
		System.out.println(Thread.currentThread().getStackTrace()[1].getMethodName());
		
	}

	@Then("I validate the outcomes")
	public void i_validate_the_outcomes() {
		System.out.println(Thread.currentThread().getStackTrace()[1].getMethodName());
		
	}

	@Then("check more outcomes")
	public void check_more_outcomes() {
		System.out.println(Thread.currentThread().getStackTrace()[1].getMethodName());
		
	}

}
