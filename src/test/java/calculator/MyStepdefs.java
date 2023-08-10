package calculator;

import io.cucumber.java.Before;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;

public class MyStepdefs {
    private int arg0;
    private int arg1;
    private String opt;
    private int result;
    private Calculator calculator;


    @Before
    public void before() {
        calculator = new Calculator();
    }

    @Given("Two input values, {int} and {int}")
    public void twoInputValuesAnd(int arg0, int arg1) {
        this.arg0 = arg0;
        this.arg1 = arg1;
    }

    @Given("Three input values, {int} and {int} and {word}")
    public void threeInputValuesFirstAndSecondAndOpt(int first, int second, String opt) {
        arg0 = first;
        arg1 = second;
        this.opt = opt;
    }


    @When("I {word} the two values")
    public void iOptTheTwoValues(String opt) {
        switch (opt) {
            case  "add":
                result = calculator.add(arg0, arg1);
                break;
            case "*":
                result = calculator.multiply(arg0, arg1);
                break;
            case "/":
                result = calculator.divide(arg0, arg1);
                break;
            case "^":
                result = calculator.power(arg0, arg1);
                break;
        }
    }

    @Then("I expect the result {int}")
    public void iExpectTheResult(int arg0) {
        Assert.assertEquals(arg0, result);
    }
}
