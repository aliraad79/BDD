package calculator;

import io.cucumber.java.Before;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;

public class MyStepdefs {
    private int arg0;
    private int arg1;
    private int result;
    private Calculator calculator;


    @Before
    public void before() {
        calculator = new Calculator();
    }

    @Given("^Two input values, ([-]?\\d+) and ([-]?\\d+)$")
    public void twoInputValuesAnd(int arg0, int arg1) {
        this.arg0 = arg0;
        this.arg1 = arg1;
    }

    @When("I add the two values")
    public void iAddTheTwoValues() {
        result = calculator.add(arg0, arg1);
    }

    @Then("I expect the result {int}")
    public void iExpectTheResult(int arg0) {
        Assert.assertEquals(arg0, result);
    }
}
