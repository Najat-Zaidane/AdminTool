<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ page language="java"%>
<%@ page import="java.sql.*"%>

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
											<h2> Bienvenue </h2>
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
								
							</section>
						<!--gestion depart-->
						<section id="third" class="main special">
								<header class="major">
									<h2>Gestion des Départements</h2>
								</header>
								
							</section>				

						<!-- Gestion Personnel -->
							<section id="cta" class="main special">
								<header class="major">
									<h2>Gestion du Personnel</h2>
									
								</header>
							</section>
					</div>
			</div>
		<!-- Scripts -->	
			<script src="main.js"></script>
			
</body>
</html>