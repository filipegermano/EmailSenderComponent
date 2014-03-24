<%-- 
    Document   : index
    Created on : 21/03/2014, 16:54:03
    Author     : filipe
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <link href="css/cssform.css" rel="stylesheet" type="text/css">
        <title>Enviar E-mail</title>
    </head>
    <body>
        <div id="top_bar">
            <div id="home">

            </div>
        </div>
        <div id="wrapper">
            <div id="box">
                <div id="top_header">
                    <h3>Enviar Email</h3>
                    <br>
                </div>
                <form name="cadastro_pessoa" method="POST" action="EnviaEmail">
                    <di id="inputs">
                        <input type="text" name="eRemetente" placeholder="E-mail remetente" required="true">
                        <input type="text" name="nRemetente" placeholder="Nome remetente" required="true">
                        <input type="text" name="eDestinatario" placeholder="E-mail destinatário" required="true">
                        <input type="text" name="nDestinatario" placeholder="Nome destinatário" required="true">
                        <input type="text" name="host" placeholder="Host" required="true">
                        
                        <input type="text" name="porta" placeholder="Porta" required="true">
                        <input type="password" name="senha" placeholder="Senha" required="true">
                        <input type="text" name="assunto" placeholder="Assunto" required="true">
                        
                        <textarea type="text" name="msg" placeholder="Mensagem"></textarea>
                                            
                        <input type="submit" value="Enviar">
                        ${result}
                    </di>
                </form>
                <br>
            </div>
        </div>
    </body>
</html>

