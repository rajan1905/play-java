package controllers;

import play.*;
import play.mvc.*;

import views.html.*;

public class Application extends Controller {

    public static Result index() {
        return ok(index.render("KHAWJA HOMES REAL ESTATE"));
       
    }
     public static Result about() {
        return ok(about.render("KHAWJA HOMES REAL ESTATE"));
     }
      public static Result contact() {
        return ok(contact.render("KHAWJA HOMES REAL ESTATE"));
     }
     
}
