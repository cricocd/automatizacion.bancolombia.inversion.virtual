package userinterfaces;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;

import static net.serenitybdd.screenplay.targets.Target.the;
import static org.openqa.selenium.By.*;

public class BancolombiaPersonasSection extends PageObject {

    public static final Target PERSONAS_BUTTOM = the("where we can click on personas buttom")
            .located(id("header-personas"));
    public static final Target SOLICITAR_PRODUCTOS_BUTTOM = the("where we can click on solicitar productos buttom")
            .located(id("header-solicitud-productos"));
    public static final Target INVERSIONES_BUTTOM = the("where we can click on inversiones buttom")
            .located(id("filtro-inversiones"));
    public static final Target FILTER_LIST = the("where we can click on filter buttom")
            .located(id("mostrar-filtros"));
    public static final Target MONTO_BUTTOM = the("where we can click on monto mix 500000 buttom")
            .located(id("tag-catMontoMinimo500000 icon-cash"));
    public static final Target CONOCE_MAS_BUTTOM = the("where we can click on monto mix 500000 buttom")
            .located(id("filtrado-conoce-inversion-0"));
    public static final Target DOCUMENTOS_BUTTOM = the("where we can click on documentos buttom")
            .located(xpath("//section[@id=\"tabs\"]/div/ul/li[4]"));
    public static final Target REGLAMENTO_INVERSION_VITUAL_BUTTOM = the("where we can click on documentos buttom")
            .located(className("c-download-rules"));

}
