package com.sda.cucumber;

import com.sda.CalcService;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.junit.Assert;

public class CalcServiceSteps {

    private String text;

    private int actual;

    private CalcService calcService;

    @Given("^I initialize CalcService$")
    public void I_initialize_CalcService() {
        calcService = new CalcService();
    }

    @And("^I pass text value to compute$")
    public void I_pass_text_value_to_compute() {
        text = "2;3;4";
    }

    @And("^I pass null text value$")
    public void I_pass_null_text_value() {
        text = null;
    }

    @And("^I pass blank text value$")
    public void I_pass_blank_text_value() {
        text = "";
    }

    @And("^I pass text with letters$")
    public void I_pass_text_with_letters() {
        text = "3a;2;4;5b";
    }

    @And("^I pass recipe$")
    public void I_pass_recipe() {
        text = "2 jablka;3 jajka;5zmieniakow";
    }

    @When("^I execute calculate method$")
    public void I_execute_calculate_method() {
        actual = calcService.calculate(text);
    }

    @Then("^I get result for text with letters$")
    public void I_get_result_for_text_with_letters() {
        Assert.assertEquals(14, actual);
    }


    @Then("^I get result for recipe$")
    public void I_get_result_for_recipe() {
        Assert.assertEquals(10, actual);
    }

    @Then("^I get correct result$")
    public void I_get_correct_result() {
        Assert.assertEquals(9, actual);
    }

    @Then("^I get 0 as a result$")
    public void I_get_0_as_a_result() {
        Assert.assertEquals(0, actual);
    }
}
