package stepDef;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import test.util.pack.Utils;

public class SearchSteps {

	@Given("I want to write a step with precondition {string}")
	public void i_want_to_write_a_step_with_precondition(String name) {
		System.out.format("Thread ID - %2d - %s from %s feature file.\t", Thread.currentThread().getId(), "", "");
		System.out.print(Thread.currentThread().getStackTrace()[1].getMethodName() + "\n");
		System.out.println("Time: " + Utils.nanoTime());

	}

	@Given("some other precondition")
	public void some_other_precondition() {
		System.out.format("Thread ID - %2d - %s from %s feature file.\t", Thread.currentThread().getId(), "", "");
		System.out.print(Thread.currentThread().getStackTrace()[1].getMethodName() + "\n");
		System.out.println("Time: " + Utils.nanoTime());

	}

	@Given("some other preconadition")
	public void some_other_preconadition() {
		System.out.format("Thread ID - %2d - %s from %s feature file.\t", Thread.currentThread().getId(), "", "");
		System.out.print(Thread.currentThread().getStackTrace()[1].getMethodName() + "\n");
		System.out.println("Time: " + Utils.nanoTime());

	}

	@When("I complete action")
	public void i_complete_action() {
		System.out.format("Thread ID - %2d - %s from %s feature file.\t", Thread.currentThread().getId(), "", "");
		System.out.print(Thread.currentThread().getStackTrace()[1].getMethodName() + "\n");
		System.out.println("Time: " + Utils.nanoTime());

	}

	@When("some other action")
	public void some_other_action() {
		System.out.format("Thread ID - %2d - %s from %s feature file.\t", Thread.currentThread().getId(), "", "");
		System.out.print(Thread.currentThread().getStackTrace()[1].getMethodName() + "\n");
		System.out.println("Time: " + Utils.nanoTime());

	}

	@When("yet another action")
	public void yet_another_action() {
		System.out.format("Thread ID - %2d - %s from %s feature file.\t", Thread.currentThread().getId(), "", "");
		System.out.print(Thread.currentThread().getStackTrace()[1].getMethodName() + "\n");
		System.out.println("Time: " + Utils.nanoTime());

	}

	@Then("I validate the outcomes")
	public void i_validate_the_outcomes() {
		System.out.format("Thread ID - %2d - %s from %s feature file.\t", Thread.currentThread().getId(), "", "");
		System.out.print(Thread.currentThread().getStackTrace()[1].getMethodName() + "\n");
		System.out.println("Time: " + Utils.nanoTime());

	}

	@Then("check more outcomes")
	public void check_more_outcomes() {
		System.out.format("Thread ID - %2d - %s from %s feature file.\t", Thread.currentThread().getId(), "", "");
		System.out.print(Thread.currentThread().getStackTrace()[1].getMethodName() + "\n");
		System.out.println("Time: " + Utils.nanoTime());

	}

}
