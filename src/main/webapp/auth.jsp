<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
 <meta charset="UTF-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Login</title>
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
    width: 400px;
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
    margin-top: 20px;
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
.sign {
margin-top:20px;
text-align: center;
}
 .sign p {
 color: black;
 font-size: 13px;
 }
 .sign a {
  
font-size: 14px;
font-weight: bold;
text-decoration: none;
margin-left: 5px;
color : #003CA6;
 }
 .sign a:hover {
 text-decoration: underline;
}
    </style>
</head>
<body>

    <form action="Login" method="Post">
        <h3>Connexion</h3>

        <label for="email">E-mail :</label><br>
       <input type="email"  name="email" id="email" placeholder="Entrez votre e-mail..." required><br>

        <label for="password">Mot de passe :</label><br>
        <input type="password" id="password" name="password" placeholder="Entrez votre mot de passe..." required><br>

         <input type="submit" value="Se connecter" id="button">  
        <div class="sign"><p> Vous n'avez pas de compte? </p>
        <a href="sign.jsp">Créer en-un</a>
         </div>
    </form>
    <% if (request.getParameter("error") != null) { %>
        <p style="color: red;">Erreur de connexion. Veuillez réessayer.</p>
    <% } %>
 
</body>
</html>