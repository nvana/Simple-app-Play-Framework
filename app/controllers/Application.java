package controllers;

import play.mvc.*;
import play.data.*;
import static play.data.Form.*;
import play.data.validation.Constraints.*;

import views.html.*;

public class Application extends Controller {
    
    /**
     * Describes the hello form.
     */
    public static class Hello {
         @Required public Integer as;
        
         @Required public Integer dix;
        public Integer roi;
        public Integer dame;
         public Integer valet;
         public Integer neuf;
         public Integer huit;
         public Integer sept; 

         /* Cartes pour l'atout */
        @Required public Integer asA;
         @Required public Integer dixA;
        public Integer roiA;
        public Integer dameA;
         public Integer valetA;
         public Integer neufA;
         public Integer huitA;
         public Integer septA; 
        
    } 
    
    // -- Actions
  
    /**
     * Home page
     */
    public static Result index() {
        return ok(
            index.render(form(Hello.class))
        );
    }
  
    /**
     * Handles the form submission.
     */
    public static Result sayHello() {
        Form<Hello> form = form(Hello.class).bindFromRequest();
        if(form.hasErrors()) {
            return badRequest(index.render(form));
        } else {
            Hello data = form.get();
            return ok(
                hello.render(data.as*11+data.dix*10+data.roi*4+data.dame*3+data.valet*2+data.asA*11+data.dixA*10+data.roiA*4+data.dameA*3+data.valetA*20+data.neufA*14)
            );
        }
    }
  
}
