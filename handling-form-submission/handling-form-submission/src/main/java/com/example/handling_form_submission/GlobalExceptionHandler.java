package com.example.handling_form_submission;

import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.servlet.ModelAndView;

/* GlobalExceptionHandler using ControllerAdvice
 * Purpose:
 *          Used to handle any global exceptions thrown to it. Using ModelAndView which lets the controller
 *          return a model and a view template(error template).
 */
@ControllerAdvice
public class GlobalExceptionHandler {

    /* handleGeneralException
     * Return type: ModelAndView (Holds both Model and View to make it possible for a controller to return both model
     *              and view in a single return value.)
     * Purpose: Used throw an error based on errors specified by the GreetingController.
     */
    @ExceptionHandler(Exception.class)
    public ModelAndView handleGeneralException(Exception ex) {
        ModelAndView mavError = new ModelAndView("error");
        mavError.addObject("errorMessage", ex.getMessage());
        return mavError;
    }
}

