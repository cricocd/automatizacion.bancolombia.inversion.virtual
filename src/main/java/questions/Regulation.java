package questions;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;

public class Regulation implements Question<Boolean> {

    private String pdfText;
    private String title = "Inversi\u00f3n Virtual Bancolombia";

    public Regulation(String pdfText) {
        this.pdfText = pdfText;
    }

    public static Regulation isCorrect(String pdfText) {
        return new Regulation(pdfText);
    }

    @Override
    public Boolean answeredBy(Actor actor){
        boolean result;
        if(pdfText.contains(title)){
            result = true;
        } else {
            result = false;
        }
        return result;

    }
}
