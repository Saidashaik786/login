package com.mohan;

import java.io.*;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/VoteServlet")
public class VoteServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
 
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.setContentType("text/html");
		PrintWriter out = response.getWriter();
		try {
		int age = Integer.parseInt(request.getParameter("age"));
		if (age>=18) {
			out.println("You are eligible to vote and it has been processed");			
		}
		else {
			out.println("You are not eligible to vote");
		}
	}
		catch(NumberFormatException obj){
			out.println("Exception: You have entered invalid input. <p><p> Please enter your age.");
			out.println("<a href = " + "vote.html" + ">Check Again!..</a>");
		}
	}

}
