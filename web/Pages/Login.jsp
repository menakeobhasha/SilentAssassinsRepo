<%-- 
    Document   : Login
    Created on : Jun 17, 2018, 2:35:28 PM
    Author     : Menake
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
    <%@include file="../Shared/stylesheet.jsp" %>
    </head>
    <body class="hold-transition login-page">
    <div class="login-box">
        <div class="login-logo">
            
        </div>
        <!-- /.login-logo -->
        <div class="login-box-body">
        <p class="login-box-msg">Sign in to start your session</p>
        <form id="form1" runat="server">
            <div class="form-group has-feedback">
                <input type="text" name="txtUserName" value="" placeholder="Username" class="form-control"  AutoCompleteType="Disabled" ValidationGroup="login"/>
                <span class="glyphicon glyphicon-envelope form-control-feedback"></span>
                <%--<asp:RequiredFieldValidator ID="RequiredFieldValidator1" runat="server" ControlToValidate="txtUserName" class="error-content" ErrorMessage="*" ValidationGroup="login"></asp:RequiredFieldValidator>--%>
            </div>
            <div class="form-group has-feedback">
                <input type="password" name="txtPassword" value="" class="form-control" placeholder="Password" AutoCompleteType="Disabled" ValidationGroup="login"/>
                <span class="glyphicon glyphicon-lock form-control-feedback"></span>
                <%--<asp:RequiredFieldValidator ID="RequiredFieldValidator2" runat="server" ControlToValidate="txtPassword" class="error-content" ErrorMessage="*" ValidationGroup="login"></asp:RequiredFieldValidator>--%>
            </div>
            <div class="row">
                <div class="col-xs-8">
                    &nbsp;
                </div>
                <!-- /.col -->
                <div class="col-xs-4">
                    <!--<input type="submit" id="btnLogin" class="btn btn-primary btn-block btn-flat" value="Sign In"/>-->
                    <div id="btnLogin" class="btn btn-primary btn-block btn-flat"><a href="Pages/Dashboard.jsp">Sign In</a></div>
                </div>
                <!-- /.col -->
            </div>
            <div class="row">
                <div class="col-xs-12">
                    <label id="lblMessage" class="error-content" ></label>

                </div>
            </div>
        </form>
        <%--        <a href="#">I forgot my password</a><br>
        <a href="#" class="text-center">Register a new membership</a>--%>
    </div>

        <!-- /.login-box-body -->
    </div>
</body>
<script type="text/javascript">
    document.getElementById("btnLogin").onclick = function () {
        location.href = "Pages/Dashboard.jsp";
    };
</script>
</html>
