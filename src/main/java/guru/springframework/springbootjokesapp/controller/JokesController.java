package guru.springframework.springbootjokesapp.controller;

import guru.springframework.springbootjokesapp.services.JokesService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class JokesController {

    private JokesService jokesService;

    // Annotation is optional
    @Autowired
    public JokesController(JokesService jokesService) {
        this.jokesService = jokesService;
    }

    @RequestMapping({"/", ""})
    public String getJoke(Model model){
        model.addAttribute("joke", jokesService.getJoke());

        return "chucknorris";
    }

}
