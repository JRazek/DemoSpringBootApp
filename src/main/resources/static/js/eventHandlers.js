$(document).ready(function() {
    $( "#loginButton01" ).click(function() {
        let login = $( "#login01" ).val();
        let password = $( "#password01" ).val();
        $.ajax({
            type : 'POST',
            url : "/login",
            data : {login, password},
            dataType : "html",
            success : function (data) {
                console.log(data);
            },
        });
    });
    $( "#registerButton01" ).click(function() {
        let login = $( "#login01" ).val();
        let fName = $( "#firstName01" ).val();
        let lName = $( "#lastName01" ).val();
        let password = $( "#password02" ).val();
        let cPassword = $( "#password03" ).val();
        let email = $( "#email01" ).val();
        let ok = true;
        if(password !== cPassword || password.length < 5){
            ok = false;
            $( "#password02" ).addClass("invalidInput");
            $( "#password03" ).addClass("invalidInput");
        }
        if(!validateEmail(email)){
            ok = false;
            $( "#email01" ).addClass("invalidInput");
        }
        //debug!
        ok = true;
        if(ok){
            $.ajax({
                type : 'POST',
                url : "/register",
                data : {login, fName, lName, password, email},
                dataType : "html",
                success : function (data) {
                    console.log(data);
                },
            });
        }
    });
    $( "#createAccountFormButton" ).click(function() {
        $("#loginForm01").hide();
        $("#registerForm01").show();
    });
});