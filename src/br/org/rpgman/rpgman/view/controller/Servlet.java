package br.org.rpgman.rpgman.view.controller;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

public class Servlet extends HttpServlet {
    private Map<String,IntViewHelper> viewhelpers;
    private Map<String,IntCommand> commands;

    public Servlet(){
        viewhelpers = new HashMap<String,IntViewHelper>();
        commands = new HashMap<String,IntCommand>();


    }
    public void doPost(HttpServletRequest request, HttpServletResponse response)throws ServletException,IOException {
        doProcessRequest(request,response);
    }
    public void doGet(HttpServletRequest request, HttpServletResponse response)throws ServletException,IOException {
        doProcessRequest(request,response);
    }

    private void doProcessRequest(HttpServletRequest request, HttpServletResponse response)throws ServletException,IOException {

    }
}