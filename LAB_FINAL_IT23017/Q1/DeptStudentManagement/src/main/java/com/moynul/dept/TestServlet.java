package com.moynul.dept;

import java.io.*;
import jakarta.servlet.*;
import jakarta.servlet.http.*;

public class TestServlet extends HttpServlet {
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) 
            throws ServletException, IOException {
        
        response.setContentType("text/html");
        PrintWriter out = response.getWriter();

        // ফরম থেকে ইনপুট নেওয়া
        String dName = request.getParameter("dept_name");
        String sCountStr = request.getParameter("num_students");
        int sCount = Integer.parseInt(sCountStr);

        // অবজেক্ট তৈরি এবং সার্ভিস কল
        Department dept = new Department(dName, sCount);
        ServiceClass sc = new ServiceClass();
        int status = sc.saveDepartment(dept);

        if (status > 0) {
            out.println("<h2>Data Saved Successfully!</h2>");
            out.println("<p>Department: " + dName + "</p>");
            out.println("<p>Time: " + new java.util.Date() + "</p>"); // স্যার তারিখ ও সময় চেয়েছেন
        } else {
            out.println("<h2>Error Saving Data!</h2>");
        }
    }
}