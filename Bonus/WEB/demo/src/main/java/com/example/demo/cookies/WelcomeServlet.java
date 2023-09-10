package com.example.demo.cookies;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet(name = "WelcomeServlet", value = "/WelcomeServlet")
public class WelcomeServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        response.setContentType("text/plain");
        PrintWriter printWriter= response.getWriter();
//        Cookie[] cookies= request.getCookies();
        HttpSession session= request.getSession();

        String username=session.getAttribute("username").toString();
        String password=session.getAttribute("password").toString();

//        for(Cookie x:cookies){
//            System.out.println(x.getName()+" "+x.getValue());
//            if(x.getName().equals("username")){
//                username=x.getValue();
//            }
//            if(x.getName().equals("password")){
//                password=x.getValue();
//            }
//            x.setMaxAge(0);
//        }
        System.out.println("username: "+username);
        System.out.println("password: "+password);
        if(username.equals("dtienanh1909")&&password.equals("12345")){
            printWriter.println("welcome: "+username);
        }
        else{
            response.sendRedirect("/demo_war_exploded/LoginServlet");
        }
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }
}
