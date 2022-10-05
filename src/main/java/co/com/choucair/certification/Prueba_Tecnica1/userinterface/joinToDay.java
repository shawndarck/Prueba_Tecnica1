package co.com.choucair.certification.Prueba_Tecnica1.userinterface;

import net.serenitybdd.core.pages.PageObject;
import  net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class joinToDay extends PageObject {
    public static final Target JoinToDayButton = Target.the("botón Registro").located(By.xpath("//a[@class='unauthenticated-nav-bar__sign-up']"));



}

