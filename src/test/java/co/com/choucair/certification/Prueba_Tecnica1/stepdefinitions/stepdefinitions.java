package co.com.choucair.certification.Prueba_Tecnica1.stepdefinitions;

import co.com.choucair.certification.Prueba_Tecnica1.tasks.joinToday;
import co.com.choucair.certification.Prueba_Tecnica1.tasks.completeForm;
import cucumber.api.java.Before;
import  cucumber.api.java.en.Given;
import  cucumber.api.java.en.Then;
import  cucumber.api.java.en.When;
import net.serenitybdd.screenplay.actors.OnStage;
import net.serenitybdd.screenplay.actors.OnlineCast;
import co.com.choucair.certification.Prueba_Tecnica1.tasks.openPage;


public class stepdefinitions {

    @Before
    public void setStage(){OnStage.setTheStage(new OnlineCast());}

    @Given("^Julian join in button jointoday$")
    public void Julian_join_in_button_jointoday() {
        OnStage.theActorCalled("Julian").wasAbleTo(openPage.thePage(),(joinToday.onThePage()));
    }

    @When("^Complete the form$")
    public void complete_the_form() {
        OnStage.theActorInTheSpotlight().attemptsTo(completeForm.the());
    }

    @Then("^Complete the setup$")
    public void complete_the_setup() {

    }

}
