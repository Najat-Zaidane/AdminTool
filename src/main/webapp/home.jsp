<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ page language="java"%>
<%@ page import="java.sql.*"%>
<%
String email = "";
 if(session.getAttribute("email")!=null){
	 email = session.getAttribute("email").toString();
 }else{
	 response.sendRedirect("auth.jsp");
 }
%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Acceuil</title>
<meta charset="utf-8" />
<meta name="viewport" content="width=device-width, initial-scale=1, user-scalable=no" />
<link rel="stylesheet" href="main.css" />
</head>
<body>
<!-- Wrapper -->
			<div id="wrapper" >
                 <div> <br/></div>
				<!-- Nav -->
					<nav id="nav" style="border-radius: 40px;width:55em ">
						<ul>
							<li><a href="#second" class="active">Gestion des Etudiants</a></li>
							<li><a href="#third">Gestion des Départements </a></li>
							<li><a href="#cta">Gestion du Personnel</a></li>
							<!--<li><a href="#third">Espace Administarteur</a></li>-->
							<li><a href="auth.jsp">Déconnexion</a></li>
							
						</ul>
					</nav>

				<!-- Main -->
					<div id="main" style="background-color: #f8f8ff">

						<!-- About -->
							<section id="intro" class="main">
								<div class="spotlight">
									<div class="content">
										<header class="major">
											<h2> Bienvenue</h2>
										</header>
										<p>Nous sommes heureux de vous accueillir dans notre espace dédié aux administrateurs, conçu pour simplifier et optimiser la gestion de notre établissement. Grâce à cet outil, vous aurez accès à un ensemble de fonctionnalités vous permettant d'administrer efficacement les différents aspects de la vie universitaire.</p>
									</div>
									<span class="image"><img src="fac2.jpg" alt="" /></span>
								</div>
							</section>
			
						<!-- gestion etu -->
							<section id="second" class="main special">
								<header class="major">
									<h2>Gestion des Etudiants</h2>					
								</header>							
								<p class="content">Nam elementum nisl et mi a commodo porttitor. Morbi sit amet nisl eu arcu faucibus hendrerit vel a risus. Nam a orci mi, elementum ac arcu sit amet, fermentum pellentesque et purus. Integer maximus varius lorem, sed convallis diam accumsan sed. Etiam porttitor placerat sapien, sed eleifend a enim pulvinar faucibus semper quis ut arcu. Ut non nisl a mollis est efficitur vestibulum. Integer eget purus nec nulla mattis et accumsan ut magna libero. Morbi auctor iaculis porttitor. Sed ut magna ac risus et hendrerit scelerisque. Praesent eleifend lacus in lectus aliquam porta. Cras eu ornare dui curabitur lacinia.</p>
							</section>
						<!--gestion depart-->
						<section id="third" class="main special">
								<header class="major">
									<h2>Gestion des Départements</h2>
								</header>
							<p>Basic question for the user while lookign for or setting up the event</p>		
							</section>				

						<!-- Gestion Personnel -->
							<section id="cta" class="main special">
								<header class="major">
									<h2>Gestion du Personnel</h2>
									<p>Are you ready to make your next event unforgettable? Look no further than Eventify!</p>
								</header>
							</section>
					</div>
			</div>
		<!-- Scripts -->	
			<script src="main.js"></script>
			
</body>
</html>