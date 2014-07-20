package controllers;

import play.*;
import play.mvc.*;

import views.html.*;

public class Application extends Controller {

    public static Result index() {
        return ok(index.render("KHAWAJA HOMES REAL ESTATE"));
       
    }
     public static Result about() {
        return ok(about.render("KHAWAJA HOMES REAL ESTATE"));
     }
      public static Result contact() {
        return ok(contact.render("KHAWAJA HOMES REAL ESTATE"));
     }
      public static Result search() {
        return ok(search.render("KHAWAJA HOMES REAL ESTATE"));
     }
     
}
