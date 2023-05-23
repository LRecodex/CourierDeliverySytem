<%-- 
    Document   : assignparcel
    Created on : 23 May 2023, 14:08:39
    Author     : Lenovo
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Assign Parcel</title>
        <style>
            body {
                background-color: rgb(121, 252, 252);
            }
            h1{
                text-align: center;
                font-family: comic sans ms;
            }
            div{
                text-align: center;
                background-color: rgb(253, 101, 101);
                margin: auto;
                width: 90%;
            }
            #container {
                margin:auto;
                margin-bottom: 200px;
                width: 60%;
                background-color: #f56e6e;
                color: #000000;
                min-width: 30%;
                box-shadow: 0px 0px 10px rgba(0, 0, 0, 0.2);
            }


        </style>
    </head>
    <body>
        <jsp:include page="header.jsp" flush="true" />

        <h1>Assign parcel to the driver</h1>
        <div>
            <form method="post" action="assignParcel.jsp">
                <label for="parcelId">Parcel ID:</label>
                <input type="text" name="parcelId" id="parcelId" required><br><br>

                <label for="driverId">Driver ID:</label>
                <input type="text" name="driverId" id="driverId" required><br><br>

                <input type="submit" value="Assign Parcel">


            </form>

        </div>
        <div id="container">
            <p>Driver details</p>
            <br><br><br><br><br><br><br><br><br><br><br><br>
        </div>
        <!--Driver list available-->

        <jsp:include page="footer.html" flush="true" />
    </body>
</html>
