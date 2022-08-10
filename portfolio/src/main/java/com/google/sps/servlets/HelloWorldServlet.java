package com.google.sps.servlets;

import java.io.IOException;
import java.util.ArrayList;

import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/** Handles requests sent to the /hello URL. Try running a server and navigating to /hello! */
@WebServlet("/hello")
public class HelloWorldServlet extends HttpServlet {

  @Override
  public void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException {
    //response.setContentType("text/html;");
    //response.getWriter().println("Hello Sreekruthi!");
    String[] msg = {"Hi There!", "Hola!", "Bonjour"};
    
    // Convert the server stats to JSON
    String json = convertToJson(msg);

    // Send the JSON as the response
    response.setContentType("application/json;");
    response.getWriter().println(json);
  }

  private String convertToJson(String[] input) {
    String json = "{";
    json += "\"message1\": ";
    json += "\"" + input[0] + "\"";
    json += ", ";
    json += "\"message2\": ";
    json += "\"" + input[1] + "\"";
    json += ", ";
    json += "\"message3\": ";
    json += input[2];
    json += "}";
    return json;

  }
}
