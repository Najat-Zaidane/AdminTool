package web;

import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;


@WebServlet("/Login")
public class Login extends HttpServlet {
	private static final long serialVersionUID = 1L;
   
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		HttpSession session=request.getSession();
		//récuperation des données
		String email= request.getParameter("email");
		String password= request.getParameter("password");
		
		//les données a la bd
		String url  = "jdbc:mysql://localhost:3306/fsj";
		String user = "root";
		String pwd  = "";
		try {
			
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection con = DriverManager.getConnection(url, user, pwd);
			 // Ajoutez des messages de débogage pour afficher les valeurs de email et password
		    System.out.println("Email: " + email);
		    System.out.println("Password: " + password);
			PreparedStatement pst=con.prepareStatement("SELECT idUser FROM utilisateurs WHERE email=? AND password=?");
			pst.setString(1,email);
			pst.setString(2,password);
			ResultSet rs = pst.executeQuery();
			if(rs.next()) {
				session.setAttribute("email", email);
				response.sendRedirect("home.jsp");
			}else response.sendRedirect("auth.jsp");
			rs.close();
			pst.close();
			con.close();
		}catch(Exception e) {
			 System.out.println("Erreur lors de la connexion à la base de données : " + e.getMessage());
			 e.printStackTrace();
		}
		
	}
}
