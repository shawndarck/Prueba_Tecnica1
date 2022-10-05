package co.com.choucair.certification.Prueba_Tecnica1.tasks;


import co.com.choucair.certification.Prueba_Tecnica1.userinterface.form;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;

public class completeForm implements Task {
    public static Performable the() {
        return Tasks.instrumented(completeForm.class);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(Enter.theValue("Julian").into(form.Nombres),
                Enter.theValue("Paredes").into(form.Apellidos),
                Enter.theValue("juliancamilo1995@gmail.com").into(form.Email),
                Click.on(form.Mes),
                Click.on(form.Dia),
                Click.on(form.Ano),
                Click.on(form.Ubicacion),
                Click.on(form.Dispositivos),
                Click.on(form.UltimoPaso),
                Enter.theValue("Julian123456.").into(form.Password),
                Enter.theValue("Julian123456.").into(form.PasswordConfirmar),
                Click.on(form.checkBox1),
                Click.on(form.checkBox2),
                Click.on(form.Finalizar)
        );
    }
}
