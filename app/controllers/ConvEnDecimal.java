package controllers;

import play.mvc.*;
import play.data.*;
import static play.data.Form.*;

import views.html.decimal.*;
import models.*;

public class ConvEnDecimal extends Controller {
    
    /**
     * Formulaire pour la classe NombreRomain.
     */ 
    final static Form<NombreRomain> formulaire = form(NombreRomain.class);
  
    /**
     * Afficher un formulaire vide.
     */ 
    public static Result blank() {
        return ok(form_sans.render(formulaire));
    }
  
    /**
     * Traiter la soumission d'un formulaire.
     */
    public static Result submit() {
        Form<NombreRomain> formulaire_plein =  formulaire.bindFromRequest();
        
        // vérifier les conditions d'acceptation
	if (! romain_valide(formulaire_plein.field("valeur").value())) {
	    formulaire_plein.reject("valeur", "seules les lettres IVXLCDM sont légales");
        }
        
        if(formulaire_plein.hasErrors()) {
            return badRequest(form_sans.render(formulaire_plein));
        } else {
	    NombreRomain n = formulaire_plein.get();
            return ok(form_avec.render(form(NombreRomain.class), n.valeur, n.en_decimal()));
        }
    }

    static boolean romain_valide(String s) { return true; }
  
}
