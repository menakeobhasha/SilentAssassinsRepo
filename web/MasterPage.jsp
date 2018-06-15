<%-- 
    Document   : MasterPage
    Created on : Jun 15, 2018, 11:48:27 PM
    Author     : Menake
--%>

<%@taglib uri="http://java.sun.com/jstl/core" prefix="c" %>
<%@taglib uri="http://java.sun.com/jstl/fmt" prefix="fn" %>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <body class="hold-transition skin-blue sidebar-mini">
        
        <decorator:body/>
        <div class="wrapper">

            <%@include file="./Shared/header.jsp" %>
            <!-- Left side column. contains the logo and sidebar -->

            <!-- Content Wrapper. Contains page content -->
            <div class="content-wrapper">

            </div>
            <!-- /.content-wrapper -->
            <%@include file="./Shared/footer.jsp" %>
            <div class="control-sidebar-bg"></div>
        </div>
    </body>
</html>
