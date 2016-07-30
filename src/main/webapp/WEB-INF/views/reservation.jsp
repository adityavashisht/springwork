<html>
<head>
    <script
            src="https://code.jquery.com/jquery-3.1.0.min.js"
            integrity="sha256-cCueBR6CsyA4/9szpPfrX3s49M9vUU5BgtiJj06wt/s="
            crossorigin="anonymous"></script>
</head>


<body>

<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags" %>

Test Reservation Page via Controller
<form:form id="reservation" modelAttribute="reservation" method="post">

    <form:input path="name"/>

    <button type="button" id="save">Save</button>

</form:form>


<script>
    $(function() {

        $("#save").click(function(event) {

            event.preventDefault();
            // test

            var postData = $("#reservation").serialize();
            var URL ='/app/reservation';
            $.ajax({
                type: "POST",
                url: URL,
                contentType: "application/x-www-form-urlencoded",
                data: postData,
                success: function (data) {
                    alert(data.name);
                },
                error : function(data) {
                }
            });

        });




    });
</script>
</body>
</html>
