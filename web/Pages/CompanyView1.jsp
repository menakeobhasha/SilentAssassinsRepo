<%-- 
    Document   : CompanyView1
    Created on : Jun 16, 2018, 12:32:58 PM
    Author     : Menake
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <jsp:include page="../Shared//StyleForPages.jsp" />

        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <jsp:include page="../Shared/headerForPages.jsp" />
        <div class="content-wrapper">
            <section class="content">
                <div class="box box-primary">
                    <div class="box-header with-border">
                        <h3 class="box-title">Company Details</h3>
                    </div>
                    <div class="box-body">
                        <div class="form-horizontal">
                            <div class="form-group">
                                <label class="col-sm-2 control-label">Start Date:</label>
                                <div class="col-sm-4">
                                    <input type="text" name="txtV1Search" value="" class="form-control"/>
                                </div>
                                <div class="col-sm-1">
                                    <input type="submit" value="Search" name="btnV1Search" class="btn btn-success" />
                                </div>
                                <div class="col-sm-0">
                                    <asp:Label ID="lblEmpAttendance" runat="server" Text="Helloooooo"></asp:Label>
                                </div>
                            </div>
                        </div>
                    </div>
                    <!--                <div class="box-footer">
                                        <input type="submit" value="Search" name="btnV1Search" class="btn btn-success" />
                                    </div>-->
                </div>
            </section>
        </div>

        <jsp:include page="../Shared/footerForPages.jsp" />

    </body>
</html>
