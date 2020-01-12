<!DOCTYPE html>
<!--[if IE 8]> <html lang="en" class="ie8"> <![endif]-->
<!--[if IE 9]> <html lang="en" class="ie9"> <![endif]-->
<!--[if !IE]><!-->
<html lang="en"> <!--<![endif]-->
<!-- BEGIN HEAD -->
<head>
    <meta charset="UTF-8"/>
    <title>BCORE Admin Dashboard Template | Dashboard </title>
    <meta content="width=device-width, initial-scale=1.0" name="viewport"/>
    <meta content="" name="description"/>
    <meta content="" name="author"/>
    <!--[if IE]>
    <meta http-equiv="X-UA-Compatible" content="IE=edge,chrome=1">
    <![endif]-->
    <!-- GLOBAL STYLES -->
    <%@include file="header_src.jsp" %>
    <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>

</head>

<!-- END HEAD -->

<!-- BEGIN BODY -->
<body class="padTop53 ">

<!-- MAIN WRAPPER -->
<div id="wrap">


    <div id="top">

        <%@include file="header.jsp" %>

    </div>
    <!-- END HEADER SECTION




  <!--  MENU SECTION -->
    <%@include file="left.jsp" %>
    <!--END MENU SECTION



    <!--PAGE CONTENT -->
    <div id="content">

        <div class="inner" style="min-height: 700px;">
            <div class="row">
                <div class="col-lg-12">
                    <h1> Admin Dashboard </h1>
                </div>
            </div>
            <hr/>
            <!--BLOCK SECTION -->
            <!--END BLOCK SECTION -->
            <hr/>

            <%--<form name="userRoleForm">--%>
            <%--<div class="form-group">--%>
            <%--<labe>User Role</labe></label>--%>
            <%--<input class="form-control" name="name">--%>
            <%--<p class="help-block">Example block-level help text here.</p>--%>
            <%--</div>--%>
            <%--<div class="form-group">--%>
            <%--<label>status</label>--%>
            <%--<input class="form-control" name="status">--%>
            <%--<p class="help-block">Example block-level help text here.</p>--%>
            <%--</div>--%>

            <%--<div class="row">--%>
            <%--<div class="form-actions no-margin-bottom"--%>
            <%--style="text-align: center;">--%>
            <%--<div class="col-sm-3"></div>--%>
            <%--<div class="col-sm-6">--%>
            <%--<div>--%>
            <%--<input id="btn_save"--%>
            <%--value="Save" class="btn btn-success btn-md " type="submit">--%>
            <%--<input id="btn_reset" value="Reset"--%>
            <%--class="btn btn-warning btn-md " type="reset"/> <a--%>
            <%--class="btn btn-danger btn-md"--%>
            <%--href="/userRole/">Cancel</a>--%>
            <%--</div>--%>

            <%--</div>--%>
            <%--</div>--%>
            <%--</div>--%>
            <%--</form>--%>


            <form id="userRoleForm" class="form-horizontal" align="center" novalidate>


                </br>

                <table id="table_id" class="display">
                    <thead>
                    <tr>
                        <th>ID</th>
                        <th>Name</th>
                        <th>Status</th>
                        <th>Action</th>


                    </tr>
                    </thead>
                    <tbody>
                    <c:forEach items="${Userroles}" var="tempcolmn">
                        <tr class="">
                            <td><c:out value="${tempcolmn.id}"/></td>
                            <td><c:out value="${tempcolmn.name}"/></td>
                            <td><c:out value="${tempcolmn.status}"/></td>
                            <td><a href="/userRole/getUserRoleById?id=<c:out value="${tempcolmn.id}"/>" ></a>

                            </td>


                         </tr>
                    </c:forEach>

                    </tbody>
                </table>




                <div class="row">
                    <div class="form-actions no-margin-bottom"
                         style="text-align: center;">
                        <div class="col-sm-3"></div>
                        <div class="col-sm-6">
                            <div>
                                <input id="btn_save"
                                       value="Save" class="btn btn-success btn-md " type="submit">
                                <input id="btn_reset" value="Reset"
                                       class="btn btn-warning btn-md " type="reset"/> <a
                                    class="btn btn-danger btn-md"
                                    href="/userRole/">Cancel</a>
                            </div>

                        </div>
                    </div>
                </div>
            </form>

        </div>

    </div>
    <!--END PAGE CONTENT -->


    <!-- RIGHT STRIP  SECTION -->

    <!-- END RIGHT STRIP  SECTION -->
</div>

<!--END MAIN WRAPPER -->

<!-- FOOTER -->
<%@include file="footer.jsp" %>
<!--END FOOTER -->


<!-- GLOBAL SCRIPTS -->
<%@include file="footersrc.jsp" %>

<!-- END PAGE LEVEL SCRIPTS -->
<


<script type="text/javascript">
    $(document).ready(function () {
        $('#table_id').DataTable();
        $("#userRoleForm").submit(
            function (e) {
                e.preventDefault();

                var formData = getFormDataAsDTO("userRoleForm");
                $.ajax({
                    type: "POST",
                    url: "/user/addUserRole",
                    dataType: 'json',
                    contentType: 'application/json',
                    data: formData,
                    success: function (data) {
                        alert(JSON.stringify(data));
                    }

                });
            });


    });


    function getFormDataAsDTO(formId) {
        var formElement = $('form#' + formId);
        var formData = new Object();
        var formDataArray = formElement.serializeArray();
        $.each(formDataArray, function (i, obj) {
            formData[obj.name] = obj.value;
        });
        return JSON.stringify(formData);
    }

</script>
</body>

<!-- END BODY -->
</html>
