package com.web;

import java.io.IOException;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.utl.HibernateUtil;
import com.dao.RecordsDao;
import com.model.Records;
import java.util.ArrayList;
import org.hibernate.Session;

public class RecordsServlet extends HttpServlet{
   
    @Override
    public void doPost(HttpServletRequest request, HttpServletResponse response) throws IOException, ServletException{
        String name = request.getParameter("name");
        String barcode = request.getParameter("barcode");
        String color = request.getParameter("color");
        String desc = request.getParameter("desc");
        Records rcs = new Records();
        rcs.setBarcode(barcode);
        rcs.setName(name);
        rcs.setColor(color);
        rcs.setDescr(desc);
        Session session = HibernateUtil.getSessionFactory().openSession();
        Records crc = RecordsDao.getRecord(barcode, session);
        if(crc != null){//The record exists
            RequestDispatcher view = request.getRequestDispatcher("found.jsp");
            view.forward(request, response);
            
        }else{

            RecordsDao.saveRecord(rcs, session);
            List result = new ArrayList();
            result.add(name);
            result.add(barcode);
            result.add(color);
            result.add(desc);
            request.setAttribute("styles", result);
            RequestDispatcher view = request.getRequestDispatcher("result.jsp");
            view.forward(request, response);
        }
    }
}