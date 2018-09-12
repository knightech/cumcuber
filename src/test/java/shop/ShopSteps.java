package shop;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.core.IsEqual.equalTo;

import cucumber.api.java8.En;

public class ShopSteps implements En {

  private int budget = 0;

  public ShopSteps() {
    
    Given("^I have (\\d+) in my wallet$", (Integer money) -> budget = money);

    When("^I buy .* with (\\d+)$", (Integer price) -> budget -= price);

    Then("^I should have (\\d+) in my wallet$", (Integer finalBudget) ->
      assertThat(budget, equalTo(finalBudget)));
  }
}