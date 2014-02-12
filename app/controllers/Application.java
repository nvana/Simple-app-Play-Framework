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
        @Required public Integer roi;
        public Integer dame;
         public Integer valet;
         public Integer neuf;
         public Integer huit;
         public Integer sept; 
        
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
                hello.render(data.as*11, data.dix, data.roi)
            );
        }
    }
  
}
