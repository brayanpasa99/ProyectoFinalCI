<%-- 
    Document   : index
    Created on : 23/07/2019, 11:30:00 PM
    Author     : braya
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%String casa = "Casa";%>
<%String salon = "Salon de eventos";%>
<!DOCTYPE html>
<html>
    <head>    
        <title>Análisis de habitabilidad</title>
        <meta charset="UTF-8">
        <meta name="viewport" content="width=device-width, initial-scale=1.0">
        <link rel="stylesheet" href="Estilos/indexcss.css">
        <script src="//ajax.googleapis.com/ajax/libs/jquery/1.9.1/jquery.min.js"></script>
        <script type="text/javascript" src="Scripts/indexscript.js"></script>
    </head>
    <body>
        <header>
            <h1>Análisis de habitabilidad</h1>
        </header>
        <article>
            <h2>Construcción del edificio</h2>

            <%for (int i = 0; i < 4; i++) {%>
            <%for (int j = 0; j < 3; j++) {%>
            <section name="<%=i%><%=j%>">	
                <select>
                    <option selected> Elige una opción </option>
                    <optgroup label="<%=casa%>"> 
                        <option onclick="obtenerEspacio(<%=i%>, <%=j%>, '<%=casa%> habitada')"><%=casa%> habitada</option> 
                        <option onclick="obtenerEspacio(<%=i%>, <%=j%>, '<%=casa%> vacia')"><%=casa%> vacía</option> 
                    </optgroup> 
                    <optgroup label="<%=salon%>"> 
                        <option onclick="obtenerEspacio(<%=i%>, <%=j%>, '<%=salon%> en uso')"><%=salon%> en uso</option> 
                        <option onclick="obtenerEspacio(<%=i%>, <%=j%>, '<%=salon%> no usado')"><%=salon%> no usado</option> 
                    </optgroup> 
                    <optgroup label="Otros">
                        <option onclick="obtenerEspacio(<%=i%>, <%=j%>, 'Biblioteca')">Biblioteca</option>
                        <option onclick="obtenerEspacio(<%=i%>, <%=j%>, 'Gimnasio')">Gimnasio</option>
                        <option onclick="obtenerEspacio(<%=i%>, <%=j%>, 'Estudio de grabacion')">Estudio de grabación</option>
                    </optgroup>
                </select>
            </section>
            <%}%>
            <br>
            <%}%>
        </article>
    </body>
</html>