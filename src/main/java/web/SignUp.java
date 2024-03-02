package web;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

import java.sql.SQLException;



@WebServlet("/SignUp")
public class SignUp extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		HttpSession session=request.getSession();
		
		// Récupération des données du formulaire
        String nom = request.getParameter("nom");
        String prenom = request.getParameter("prenom");
        String email = request.getParameter("email");
        String password = request.getParameter("password");
        String role = request.getParameter("role");
        
     // Connexion à la base de données
        String url = "jdbc:mysql://localhost:3306/fsj";
        String user = "root";
        String pwd = "";
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection con = DriverManager.getConnection(url, user, pwd);

            // Insertion des données dans la base de données
            PreparedStatement pst = con.prepareStatement(
                    "INSERT INTO utilisateurs (nom, prenom, email, password, role) VALUES (?, ?, ?, ?, ?)");
            pst.setString(1, nom);
            pst.setString(2, prenom);
            pst.setString(3, email);
            pst.setString(4, password);
            pst.setString(5, role);

            int rowsAffected = pst.executeUpdate();
            if (rowsAffected > 0) {
            	session.setAttribute("nom", nom);
            	session.setAttribute("prenom", prenom);
                response.sendRedirect("auth.jsp");
            } else {
                response.sendRedirect("signup.jsp?error=true");
            }
            pst.close();
            con.close();
        } catch (ClassNotFoundException | SQLException e) {
            System.out.println("Erreur lors de l'inscription : " + e.getMessage());
            response.sendRedirect("signup.jsp?error=true");
        }
		
		
		
		
	}

}
