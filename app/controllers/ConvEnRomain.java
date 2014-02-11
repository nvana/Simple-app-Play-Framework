package controllers;

import play.mvc.*;
import play.data.*;
import static play.data.Form.*;

import views.html.romain.*;
import models.*;

public class ConvEnRomain extends Controller {
    
    /**
     * Formulaire pour la classe NombreDecimal.
     */ 
    final static Form<NombreDecimal> formulaire = form(NombreDecimal.class);
  
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
        Form<NombreDecimal> formulaire_plein = formulaire.bindFromRequest();
	int n=-1;
	boolean valide = true;

	try { n = Integer.parseInt(formulaire_plein.field("valeur").value()); }
	catch (NumberFormatException e) { valide = false; }
        
        // vérifier les conditions d'acceptation
	if (! valide) {
	    formulaire_plein.reject("valeur", "la valeur doit être un nombre");
	}
	else if (n <= 0) {
	    formulaire_plein.reject("valeur", "la valeur doit etre strictement positive");
        }
        
        if (formulaire_plein.hasErrors()) {
            return badRequest(form_sans.render(formulaire_plein));
        } else {
	    NombreDecimal d = formulaire_plein.get();
            return ok(form_avec.render(form(NombreDecimal.class), d.valeur, d.en_romain()));
        }
    }
}
