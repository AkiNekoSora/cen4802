package com.example.handling_form_submission;

import jakarta.validation.constraints.*;
import java.time.DateTimeException;
import java.time.LocalDate;

/* Greeting Class
 * Purpose:
 *          Used as a Greeting objects for the web app. Holding to return back on the results screen.
 *          Holds the StudentID, Day, Month, Year, and Content/Message
 */
public class Greeting {
    /*
     * These are all the variables used. And the @___ in front of them are used for error checking to make
     * sure the line has not been left empty and is valid.
     */
    //StudentID errors and variable
    @NotNull(message = "Student ID Required.")
    @Min(value = 1, message = "Student ID is required.")
    private String id;

    //Month errors and variable
    @Min(value = 1, message = "Month is required.")
    @Max(value = 12, message = "Please enter a valid Month.")
    private Integer month;

    //Year errors and variable
    @NotNull(message = "Year is required.")
    @Min(value = 1900, message = "Please enter a valid Year.")
    private Integer year;

    //Content/Message errors and variable
    @Size(min = 1, message = "Message is required.")
    @Size(max = 500, message = "Message cannot be longer than 500 characters.")
    private String content;

    /*
     * Getters!
     * Used to return all the values above.
     * All return Integers except for ID and content/message which is a String.
     * Used to return the values to the user.
     */
    public String getId() {
        return id;
    }
    public Integer getMonth() {return month;}
    public Integer getYear() {return year;}
    public String getContent() {
        return content;
    }

    /*
     * Setters!
     * Used to set all the values above.
     * All return values are void since it just sets the value.
     * Used to set the values by the program.
     */
    public void setId(String id) {this.id = id;}
    public void setMonth(Integer month) {this.month = month;}
    public void setYear(Integer year) {this.year = year;}
    public void setContent(String content) {this.content = content;}

}