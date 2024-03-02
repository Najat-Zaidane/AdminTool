package web;

import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet("/Ajouter2")
public class Ajouter2 extends HttpServlet {
	private static final long serialVersionUID = 1L;
   
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		//récupeartion des données 
		String nom = request.getParameter("nom");
		String prenom = request.getParameter("prenom");
		String contact = request.getParameter("contact");
		String role = request.getParameter("role");
	
		String url  = "jdbc:mysql://localhost:3306/fsj";
		String user = "root";
		String pwd  = "";
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection con = DriverManager.getConnection(url, user, pwd);
			PreparedStatement pst=con.prepareStatement("INSERT INTO utilisateurs (nom,prenom,email,role,password) VALUES (?,?,?,?,?)");
			pst.setString(1,nom);
			pst.setString(2,prenom);
			pst.setString(3,contact);
			pst.setString(4,role);
			pst.setString(5,"");
			
			pst.executeUpdate();
			response.sendRedirect("home.jsp");
			pst.close();
			con.close();
		}catch(Exception e) {
			System.out.print(e);
		}
		
	}

}
