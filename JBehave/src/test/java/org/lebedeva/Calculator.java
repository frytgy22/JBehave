package org.lebedeva;

import org.jbehave.core.annotations.*;
import org.junit.Assert;

public class Calculator {

    private String sign;
    private long a;
    private long b;

    @Given("a Operations class with the operation sing as <sign>")
    public void givenAOperationsClassWithTheOperationSingAssign(@Named("sign") String sign) {
        this.sign = sign;
    }

    @When("I give the first number as <number1>")
    public void whenIGiveTheFirstNumberAsnumber1(@Named("number1") long number1) {
        this.a = number1;
    }

    @When("I give the second number as <number2>")
    public void whenIGiveTheSecondNumberAsnumber2(@Named("number2") long number1) {
        this.b = number1;
    }

    @Then("I should get the results as <result>")
    public void thenIShouldGetTheResultsAsresult(@Named("result") long result) {
        Operations operations = new Operations();

        switch (this.sign) {
            case "+":
                long result1 = operations.addition(this.a, this.b);
                Assert.assertEquals(result1,result);
                break;
            case "-":
                result1 = operations.subtraction(this.a, this.b);
                Assert.assertEquals(result1,result);
                break;
            case "*":
                result1 = operations.multiplication(this.a, this.b);
                Assert.assertEquals(result1,result);
                break;
            case "/":
                result1 = operations.division(this.a, this.b);
                Assert.assertEquals(result1,result);
                break;
            default:
                System.out.println("error");
        }
    }
}
