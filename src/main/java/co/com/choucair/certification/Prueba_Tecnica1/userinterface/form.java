package co.com.choucair.certification.Prueba_Tecnica1.userinterface;

import net.thucydides.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class form extends PageObject {

    /*Mapeo de las páginas, descripción de los inputs y localizadores por medio de ID o Path completo*/

    public static final Target Nombres = Target.the("Input primer nombres").located(By.xpath("//input[@id='firstName']"));
    public static final Target Apellidos = Target.the("Input Apellidos").located(By.xpath("//input[@id='lastName']"));
    public static final Target Email = Target.the("Input Email").located(By.xpath("//input[@id='email']"));
    public static final Target Mes = Target.the("Selecciona mes").located(By.xpath("//select[@id='birthMonth']/option[@value='number:2']"));
    public static final Target Dia = Target.the("Selecciona dia").located(By.xpath("//select[@id='birthDay']/option[@value='number:24']"));
    public static final Target Ano = Target.the("Selecciona año").located(By.xpath("//select[@id='birthYear']/option[@value='number:1995']"));
    public static final Target Ubicacion = Target.the("Ubicación").located(By.xpath("//a[@class='btn btn-blue']"));
    public static final Target Dispositivos = Target.the("Dispositivos").located(By.xpath("//a[@class='btn btn-blue pull-right']"));
    public static final Target UltimoPaso = Target.the("Boton Ultimo Paso").located(By.xpath("//a[@class='btn btn-blue pull-right']"));
    public static final Target Password = Target.the("Input contraseña").located(By.xpath("//input[@name='password']"));
    public static final Target PasswordConfirmar = Target.the("Confirma contraseña").located(By.xpath("//input[@name='confirmPassword']"));
    public static final Target checkBox1 = Target.the("Aceptar checkBox").located(By.xpath("(//span[@class=\"checkmark signup-consent__checkbox error\"])[1]"));
    public static final Target checkBox2 = Target.the("checkBox aceptar").located(By.xpath("(//span[@class='checkmark signup-consent__checkbox error'])[last()]"));
    public static final Target Finalizar = Target.the("Boton Finalizar").located(By.xpath("//a[@class='btn btn-blue']"));

}
