package co.com.choucair.certification.Prueba_Tecnica1.tasks;

import co.com.choucair.certification.Prueba_Tecnica1.userinterface.Page;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Open;

public class openPage implements Task {

    private Page UtestPage;
    public static openPage thePage() {
        return Tasks.instrumented(openPage.class);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(Open.browserOn(UtestPage));
    }

}
