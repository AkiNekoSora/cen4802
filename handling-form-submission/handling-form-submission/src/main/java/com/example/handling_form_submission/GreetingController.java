package com.example.handling_form_submission;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import jakarta.validation.Valid;
import org.springframework.validation.BindingResult;

import java.time.DateTimeException;
import java.time.YearMonth;


/* GreetingController Class
 * Purpose:
 *          Used as to create a Greeting object for the web app, passing data between the object
 *          and the view template. Accepting and Returning the values given. Also used to check
 *          for any errors specified in the greeting class.
 */

@Controller
public class GreetingController {

    @GetMapping("/greeting")
    public String greetingForm(Model model) {
        model.addAttribute("greeting", new Greeting());
        return "greeting";
    }

    @PostMapping("/greeting")
    public String submitForm(
            @ModelAttribute("greeting") @Valid Greeting greeting,
            BindingResult result,
            Model model) {

        System.out.println(result.getAllErrors());

        if (result.hasErrors()) {
            return "greeting";
        }

        try {
            YearMonth.of(
                    greeting.getYear(),
                    greeting.getMonth()
            );
        } catch (DateTimeException e) {
            throw new IllegalArgumentException("Invalid date provided.");
        }

        return "result";
    }
}
