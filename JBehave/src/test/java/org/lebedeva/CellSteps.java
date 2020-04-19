package org.lebedeva;

import org.jbehave.core.annotations.Given;
import org.jbehave.core.annotations.Then;
import org.jbehave.core.annotations.When;
import org.junit.Assert;

public class CellSteps {
    private boolean cellIsDead;
    private int liveNeighbours;

    @Given("a dead cell")
    public void given() {
        this.cellIsDead = true;
    }

    @Given("a live cell")
    public void given2() {
        this.cellIsDead = false;
    }

    @Given("the cell has 4 live neighbours")
    public void given3() {
        this.liveNeighbours = 4;
    }

    @Given("the cell has 3 live neighbours")
    public void given4() {
        this.liveNeighbours = 3;
    }

    @When("the cell evolves to the next generation")
    public void when() {
        this.cellIsDead = this.liveNeighbours > 3;
    }

    @Then("the cell is now alive")
    public void thenIShouldGetTheResultsAsresult() {
        Assert.assertFalse(this.cellIsDead);
    }

    @Then("the cell is now dead")
    public void thenIShouldGetTheResultsAsresult2() {
        Assert.assertTrue(this.cellIsDead);
    }
}
