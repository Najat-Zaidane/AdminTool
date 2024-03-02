<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Sign Up</title>
    <link rel="preconnect" href="https://fonts.gstatic.com">
    <link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/5.15.4/css/all.min.css">
    <link href="https://fonts.googleapis.com/css2?family=Poppins:wght@300;500;600&display=swap" rel="stylesheet">
    <!--Stylesheet-->
    <style media="screen">
      *,
*:before,
*:after{
    padding: 0;
    margin: 0;
    box-sizing: border-box;
}
body{
    background-image : url('fac5.jpg');
     background-repeat: no-repeat;
     background-size: cover;
}
form{
    height: 500px;
    width: 500px;
    background-color: rgba(255,255,255,0.20);
    position: absolute;
    transform: translate(-50%,-50%);
    top: 50%;
    left: 50%;
    border-radius: 25px;
    backdrop-filter: blur(35px);
    border: 2px solid rgba(255,255,255,0.1);
    box-shadow: 0 0 40px rgba(8,7,16,0.6);
    padding: 50px 35px;
    margin-top: 15px
}
form *{
    font-family: 'Poppins',sans-serif;
    color: #003CA6;
    letter-spacing: 0.2px;
    outline: none;
    border: none;
}
form h3{
    font-size: 28px;
    font-weight: 550;
    line-height: 45px;
    text-align: center;
     letter-spacing: 2px;
     margin-top:-30px
}

label{
    display: block;
    margin-top: 20px;
    font-size: 14px;
    font-weight:700;
}
input{
    display: block;
    height: 50px;
    width: 100%;
    background-color: rgba(255,255,255,0.50);
    border-radius: 10px;
    padding: 0 10px;
    /*margin-top: 2px;*/
    font-size: 13px;
    font-weight: 320;
    color:black;
    margin-bottom: -15px;
}
::placeholder{
    color: black;
}
#button{
    margin-top: 15px;
    width: 100%;
    background-color: #53B24A;
    color: #ffffff;
    padding: 10px 0;
    font-size: 15px;
    font-weight: 700;
    border-radius: 12px;
    letter-spacing: 1px;
    cursor: pointer;
}
.auth {
margin-top:20px;
text-align: center;
}
 .auth p {
 color: black;
 font-size: 13px;
 }
 .auth a {
  
font-size: 14px;
font-weight: bold;
text-decoration: none;
margin-left: 5px;
color : #003CA6;
 }
 .auth a:hover {
 text-decoration: underline;
}
    </style>

</head>
<body>
<form action="SignUp" method="Post">
        <h3>Inscription</h3>
        
    <div style="display: flex; justify-content: space-between;">
        <div style="width: 48%;">
            <label for="nom">Nom :</label>
            <input type="text"  name="nom" id="nom" placeholder="Entrez votre nom..." required>
        </div>
        <div style="width: 48%;">
            <label for="prenom">Prénom :</label>
            <input type="text"  name="prenom" id="prenom" placeholder="Entrez votre prénom..." required>
        </div>
    </div>
    <label for="role">Role :</label>
    <input type="text"  name="role" id="role" placeholder="Entrez votre rôle, fonctionnalité..." required>

    <label for="email">E-mail :</label>
    <input type="email"  name="email" id="email" placeholder="Entrez votre e-mail..." required>

    <label for="password">Mot de passe :</label>
    <input type="password" id="password" name="password" placeholder="Entrez votre mot de passe..." required><br>

    <input type="submit" value="S'inscrire" id="button">  
    <div class="auth">
        <p> Vous avez déjà un compte? <a href="auth.jsp">Connectez-vous!</a> </p>
        
    </div>
    </form>
    <% if (request.getParameter("error") != null) { %>
        <p style="color: red;">Erreur de connexion. Veuillez réessayer.</p>
    <% } %>

</body>
</html>