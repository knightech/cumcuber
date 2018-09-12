# cumcuber

## to run

Right-click on test/java and select Run 'All tests'

Simple set up is

* Under resources and a features directory, 
  * create a subdirectory for your feature under test
  * create a "feature" file ending in .feature
  * write out a scenario
  * each scenario is either a 
    * setup
    * validation
    
```
 Scenario: Track my budget
    Given I have 100 in my wallet
    When I buy milk with 10
    Then I should have 90 in my wallet
```
    
  * go ahead and realise the Given, When and Then parts of the scenario in a "steps" class in test/java
  
```
 
Given("^I have (\\d+) in my wallet$", (Integer money) -> budget = money);

```
 or
 
``` 
@Given("^that the user (.*) is given a task to clear (.*) certification exam$")
public void certificationName(String name, String certication) throws Throwable {
	user.setName(name);
	user.setCertification(certication);
}
```

  * these steps through the magic of cucmber and regular expressions, become clickable from the scenario (ctrl | left-click)
  * User example shows the bog standard one method per setup or validation
  * Shop example shows the Java8 stuff available if you import cucumber-java8 and implement En
* The actual cucmber runner is annotated on the minimal "test" class itself and the other minimally required annotation 
there is to bind the runner to the feature:
```
@RunWith(Cucumber.class)
@CucumberOptions(features = { "classpath:features/user/user.feature" })

```
