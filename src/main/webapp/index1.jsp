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
    height: 520px;
    width: 400px;
    background-color: rgba(255,255,255,0.20);
    position: absolute;
    transform: translate(-50%,-50%);
    top: 50%;
    left: 50%;
    border-radius: 23px;
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
    font-size: 32px;
    font-weight: 600;
    line-height: 45px;
    text-align: center;
}

label{
    display: block;
    margin-top: 25px;
    font-size: 16px;
    font-weight: 800;
}
input{
    display: block;
    height: 50px;
    width: 100%;
    background-color: rgba(255,255,256,0.45);
    border-radius: 5px;
    padding: 0 10px;
    margin-top: 8px;
    font-size: 13px;
    font-weight: 300;
}
::placeholder{
    color: black;
}
button{
    margin-top: 50px;
    width: 100%;
    background-color: #ffffff;
    color: #080710;
    padding: 15px 0;
    font-size: 18px;
    font-weight: 800;
    border-radius: 5px;
    cursor: pointer;
}
    </style>
</head>
<body>

    <form action="Login" method="post">
        <h3>Connexion par içi</h3>

        <label for="email">E-mail :</label><br>
       <input type="email" id="email" name="email" required><br>

        <label for="password">Mot de passe :</label><br>
        <input type="password" id="password" name="password" required><br><br>

         <input type="submit" value="Se connecter">   
    </form>
    <% if (request.getParameter("error") != null) { %>
        <p style="color: red;">Erreur de connexion. Veuillez réessayer.</p>
    <% } %>
 
</body>
</html>