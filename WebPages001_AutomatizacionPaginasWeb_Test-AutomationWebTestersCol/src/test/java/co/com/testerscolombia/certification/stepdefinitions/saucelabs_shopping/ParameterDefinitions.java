package co.com.testerscolombia.certification.stepdefinitions.saucelabs_shopping;

import io.cucumber.java.Before;
import io.cucumber.java.ParameterType;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.actors.OnStage;
import net.serenitybdd.screenplay.actors.OnlineCast;

public class ParameterDefinitions {

    @ParameterType(".*")
    public Actor actor (String actorName){
        return OnStage.theActorCalled(actorName);
    }

    @Before
    public void priorSetTheStage(){
        OnStage.setTheStage(new OnlineCast());
    }
}
