package controllers;

import play.*;
import play.mvc.*;

import views.html.*;

public class Application extends Controller {

    public Result detail() {
        return ok(index.render("Your new application is ready."));
    }

    public Result list() {
        return ok(list.render("Your new application is ready."));
    }

}
