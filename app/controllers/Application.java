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
           @Min(0) @Max(3) public Integer dix;
           @Min(0) @Max(3)public Integer  roi;
         @Min(0) @Max(3) public Integer dame;
          @Min(0) @Max(3) public Integer valet;
          @Min(0) @Max(3) public Integer neuf;
          @Min(0) @Max(3) public Integer huit;
         @Min(0) @Max(3)  public Integer sept; 
         @Min(0) @Max(3) public Integer as;
         /* Cartes pour l'atout */
         @Min(0) @Max(1) public Integer asA;
          @Min(0) @Max(1) public Integer dixA;
         @Min(0) @Max(1)public Integer roiA;
         @Min(0) @Max(1)public Integer dameA;
         @Min(0) @Max(1) public Integer valetA;
         @Min(0) @Max(1) public Integer neufA;
         @Min(0) @Max(1) public Integer huitA;
         @Min(0) @Max(1) public Integer septA; 
        
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
