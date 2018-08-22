package controllers;

import db.Seeds;
import spark.ModelAndView;
import spark.template.velocity.VelocityTemplateEngine;

import java.util.HashMap;
import java.util.Map;

import static spark.Spark.get;
public class LibraryController {
    public static void main(String[] args) {
        Seeds.seedData();

        get("/library", (req, res) -> {
            Map<String, Object> model = new HashMap<>();
            model.put("template", "/templates/library/index.vtl");
            return new ModelAndView(model, "/templates/layout.vtl");
        }, new VelocityTemplateEngine());
    }
}
