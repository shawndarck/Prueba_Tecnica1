package co.com.choucair.certification.Prueba_Tecnica1.tasks;

import co.com.choucair.certification.Prueba_Tecnica1.userinterface.joinToDay;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;


public class joinToday implements Task {

    public static Performable onThePage() {
        return Tasks.instrumented(joinToday.class);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(Click.on(joinToDay.JoinToDayButton));
    }
}
