package tasks;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import userinterfaces.BancolombiaPersonasSection;

import static net.serenitybdd.screenplay.actions.Click.on;
import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isVisible;
import static net.serenitybdd.screenplay.waits.WaitUntil.the;
import static userinterfaces.BancolombiaPersonasSection.*;

public class SelectInverstment implements Task {

    private BancolombiaPersonasSection bancolombiaPersonasSection;

    public static SelectInverstment andEnter(){
        return Tasks.instrumented(SelectInverstment.class);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                the(PERSONAS_BUTTOM, isVisible()).forNoMoreThan(10).seconds(),
                on(PERSONAS_BUTTOM),
                on(SOLICITAR_PRODUCTOS_BUTTOM),
                on(INVERSIONES_BUTTOM),
                on(FILTER_LIST),
                the(MONTO_BUTTOM, isVisible()).forNoMoreThan(10).seconds(),
                on(MONTO_BUTTOM),
                on(CONOCE_MAS_BUTTOM),
                on(DOCUMENTOS_BUTTOM),
                on(REGLAMENTO_INVERSION_VITUAL_BUTTOM)
        );

    }
}
