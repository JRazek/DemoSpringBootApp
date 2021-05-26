<html>
    <head><title>Login</title>
        <link rel="stylesheet" href="${pageContext.request.contextPath}/styles.css" />
        <script src="${pageContext.request.contextPath}/js/jquery.js"></script>
        <script src="${pageContext.request.contextPath}/js/scripts.js"></script>
        <script src="${pageContext.request.contextPath}/js/eventHandlers.js"></script>
        <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.0.1/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-+0n0xVW2eSR5OomGNYDnhzAbDsOXxcvSN1TPprVMTNDbiYZCxYbOOl7+AMvyTG2x" crossorigin="anonymous">
    </head>
    <body>

        <div class="wrapper fadeInDown">
            <div id="formContent">
                <div id="loginForm01">
                    <input type="text" id="login01" class="fadeIn second input01" name="login" placeholder="login">
                    <input type="text" id="password01" class="fadeIn third input01" name="login" placeholder="password">
                    <input id="loginButton01" type="submit" class="fadeIn fourth" value="Log In">
                </div>
                <div id="registerForm01">
                    <input type="text" id="login02" class="fadeIn second input01" name="login" placeholder="login">
                    <input type="text" id="firstName01" class="fadeIn second input01" name="fname" placeholder="first name">
                    <input type="text" id="lastName01" class="fadeIn second input01" name="lname" placeholder="last name">
                    <input type="password" id="password02" class="fadeIn third input01" name="password" placeholder="password">
                    <input type="password" id="password03" class="fadeIn third input01" name="password" placeholder="confirm password">
                    <input type="email" id="email01" class="fadeIn third input01" name="email" placeholder="email">
                    <input id="registerButton01" type="submit" class="fadeIn fourth input01" value="Sign Up">
                </div>
                <!-- Remind Passowrd -->
                <div id="formFooter">
                    <a id="createAccountFormButton" class="underlineHover" href="#">Create Account</a>
                    <br>
                    <a class="underlineHover">Forgot Password?</a>
                </div>

            </div>
        </div>
    </body>
</html>