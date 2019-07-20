package co.com.ingjuanfg.questions;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;

import static net.serenitybdd.rest.SerenityRest.lastResponse;

public class CreacionUsuario implements Question<Boolean>{

    @Override
    public Boolean answeredBy(Actor actor) {
        if(lastResponse().statusCode() == 201){
            return true;
        }else {
            return false;
        }
    }

    public static CreacionUsuario exitoso() {
        return new CreacionUsuario();
    }
}
