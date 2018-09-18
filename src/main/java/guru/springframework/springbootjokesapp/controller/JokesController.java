package guru.springframework.springbootjokesapp.controller;

import guru.springframework.springbootjokesapp.services.JokesService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class JokesController {

    JokesService jokesService;

    public JokesController(JokesService jokesService) {
        this.jokesService = jokesService;
    }

    @RequestMapping("/chucknorris")
    public String getJoke(Model model){
        String joke = jokesService.getJoke();
        model.addAttribute("joke", joke);

        return joke;
    }

}
