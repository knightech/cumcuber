package friday;

import static org.junit.Assert.assertEquals;

import cucumber.api.PendingException;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import junitcucumber.IsItFriday;

public class FridaySteps {

  private String today;
  private String actualAnswer;

  @When("^I ask whether it's Friday yet$")
  public void i_ask_whether_is_s_Friday_yet() {
    this.actualAnswer = IsItFriday.isItFriday(today);
  }

  @Then("^I should be told \"([^\"]*)\"$")
  public void i_should_be_told(String expectedAnswer) {
    assertEquals(expectedAnswer, actualAnswer);
  }
 
  @Given("^today is \"([^\"]*)\"$")
  public void todayIsDay(String day) throws Throwable {
    // Write code here that turns the phrase above into concrete actions
   this.today = day;
  }


  
}
