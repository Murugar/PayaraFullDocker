package com.iqmsoft.payara.docker.controller;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.iqmsoft.payara.docker.entity.Person;
import com.iqmsoft.payara.docker.service.PersonService;

import java.io.IOException;


public class PersonAddController extends HttpServlet {

    protected void processRequest(HttpServletRequest request, HttpServletResponse response) throws IOException {
        request.setCharacterEncoding("UTF-8");
        String nomePessoa = (String) request.getParameter("nome");

        Person p = new Person();
        p.setName(nomePessoa);
        PersonService ps = PersonService.getInstance();
        ps.add(p);
        response.sendRedirect("index");

    }


    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        processRequest(req, resp);
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        processRequest(req, resp);
    }
}
