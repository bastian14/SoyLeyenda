 [#include "common.ftl" /] [@structure]
<html>
    <head> 
		<!--<body onload="document.f.j_username.focus();">-->
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <link rel="stylesheet" type="text/css" href="css/estilo.css"/>
     	<script type="text/javascript" src="https://ajax.googleapis.com/ajax/libs/jquery/1.8.2/jquery.min.js"></script>
        <script type="text/javascript" src="js/cambiarPestanna.js"></script>
    </head>
    <body onload="javascript:cambiarPestanna(pestanas,pestana1);">
      <script type="text/javascript" src="js/jquery-1.10.2.min.js"></script>
        <div class="contenedor">
            <div class="titulo">Sistema de Gesti&oacute;n de Noticias e Indicadores Econ&oacute;micos</div> 
            <img src="http://realrubio.es/sites/default/files/banner-nuestros-vinos.jpg" width="1000" height="200" alt="vinos" />
            <a href="administracion.html.ftl"><font color="#ffffff">"Administrar Noticias e Indicadores"</font></a>
            <div id="pestanas">
                <ul id="lista">
                    <li id="pestana1"><a href='javascript:cambiarPestanna(pestanas,pestana1);'>Inicio</a></li>
                    <li id="pestana2"><a href='javascript:cambiarPestanna(pestanas,pestana2);'>Buscador de noticias</a></li>
                    <li id="pestana3"><a href='javascript:cambiarPestanna(pestanas,pestana3);'>Calculadora</a></li>
                    <li id="pestana4"><a href='javascript:cambiarPestanna(pestanas,pestana4);'>Conversor de divisas</a></li>
                    <li id="pestana5"><a href='javascript:cambiarPestanna(pestanas,pestana5);'>Contacto</a></li>
                </ul>
            </div> 
            <div id="contenidopestanas">
                <div id="cpestana1"> 
					<a href="noticias/vernoticias1.xml"><img src = "img/noticia1.jpg" width = "1000" height = "200" alt = "vinos"/></a><br><br> 
                	<a href="noticias/vernoticias2.xml"><img src = "img/noticia2.jpg" width = "240" height = "150" alt = "vinos1"/></a>
                	<a href="noticias/vernoticias3.xml"><img src = "img/noticia3.jpg" width = "240" height = "150" alt = "vinos2"/></a>
                	<a href="noticias/vernoticias4.xml"><img src = "img/noticia4.jpg" width = "240" height = "150" alt = "vinos3"/></a>
                	<a href="noticias/vernoticias5.xml"><img src = "img/noticia5.jpg" width = "240" height = "150" alt = "vinos4"/></a><br>
               		<a href="noticias/vernoticias6.xml"><font color="#ffffff">"La competencia vitivin&iacute;cola entre Chile y Argentina: ¿cuántas copas vendes?"</font></a><br><br>
               		<a href="noticias/vernoticias7.xml"><font color="#ffffff">"Chile se consolida como el primer exportador de vino del nuevo mundo a Rusia"</font></a><br>
                </div>
                <div id="cpestana2"> 
					Buscar por Tag:<br>  
				<form action="./noticias/buscarnoticia.xml" method="POST">
	
                    <input type='text' name="tag" value='' /> 
     
                    <td colspan='2'><input id="busca" type="submit" value="Buscar"></td><br> 
                </form>      
                </div>
                <div id="cpestana3">
				<HEAD>
				<script language="LiveScript">
				<!-- 
				
				function addChar(input, character)
				{
				    if(input.value == null || input.value == "0")
				        input.value = character
				    else
				        input.value += character
				}
				
				function deleteChar(input)
				{
				    input.value = input.value.substring(0, input.value.length - 1)
				}
				
				function changeSign(input)
				{
				    // could use input.value = 0 - input.value, but let's show off substring
				    if(input.value.substring(0, 1) == "-")
					input.value = input.value.substring(1, input.value.length)
				    else
					input.value = "-" + input.value
				}
				
				function compute(form) 
				{
					form.display.value = eval(form.display.value)
				}
				
				function square(form) 
				{
					form.display.value = eval(form.display.value) * eval(form.display.value)
				}
				
				function checkNum(str) 
				{
					for (var i = 0; i < str.length; i++) {
						var ch = str.substring(i, i+1)
						if (ch < "0" || ch > "9") {
							if (ch != "/" && ch != "*" && ch != "+" && ch != "-" 
								&& ch != "(" && ch!= ")") {
								alert("invalid entry!")
								return false
							}
						}
					}
					return true
				}
				
				<!--  -->
				</script>
				
				
				</HEAD>
				
				<BODY bgcolor="white">
				
				
				<form>
				<table border="5" align=center>
				<tr align="center">
				<td colspan = 4>
				
				<table border="3">
				<tr>
				<td align=center><input name="display" value="0" size=20></td>
				</tr>
				</table>
				
				</td>
				</tr>
				
				<tr align=center>
				<td>
				<input type="button" value="    7    "
				  onClick="addChar(this.form.display, '7')">
				</td>
				<td>
				<input type="button" value="    8    "
				  onClick="addChar(this.form.display, '8')">
				</td>
				<td>
				<input type="button" value="    9    "
				  onClick="addChar(this.form.display, '9')">
				</td>
				<td>
				<input type="button" value="    /     "
				  onClick="addChar(this.form.display, '/')">
				</td>
				</tr>
				
				<tr align=center>
				<td>
				<input type="button" value="    4    "
				  onClick="addChar(this.form.display, '4')">
				</td>
				<td>
				<input type="button" value="    5    "
				  onClick="addChar(this.form.display, '5')">
				</td>
				<td>
				<input type="button" value="    6    "
				  onClick="addChar(this.form.display, '6')">
				</td>
				<td>
				<input type="button" value="    *    "
				  onClick="addChar(this.form.display, '*')">
				</td>
				</tr>
				
				<tr align=center>
				<td>
				<input type="button" value="    1    "
				  onClick="addChar(this.form.display, '1')">
				</td>
				<td>
				<input type="button" value="    2    "
				  onClick="addChar(this.form.display, '2')">
				</td>
				<td>
				<input type="button" value="    3    "
				  onClick="addChar(this.form.display, '3')">
				</td>
				<td>
				<input type="button" value="     -    " 
				  onClick="addChar(this.form.display, '-')">
				</td>
				</tr>
				
				<tr align=center>
				<td>
				<input type="button" value="    0    "
				  onClick="addChar(this.form.display, '0')"> 
				</td>
				<td>
				<input type="button" value="     .    "
				  onClick="addChar(this.form.display, '.')"> 
				</td>
				<td>
				<input type="button" value="   +/-   "
				  onClick="changeSign(this.form.display)">
				</td>
				<td>
				<input type="button" value="    +    "
				  onClick="addChar(this.form.display, '+')">
				</td>
				</tr>
				
				<tr align=center>
				<td>
				<input type="button" value="    (    "
				  onClick="addChar(this.form.display, '(')"> 
				</td>
				<td>
				<input type="button" value="     )    "
				  onClick="addChar(this.form.display, ')')"> 
				</td>
				<td>
				<input type="button" value="   ^    "
				  onClick="if (checkNum(this.form.display.value))
					{ square(this.form) }">
				</td>
				<td>
				<input type="button" value="    Borrar   "
				  onClick="deleteChar(this.form.display)">
				</td>
				</tr>
				
				<tr align=center>
				<td colspan="2">
				<input type="button" value="     =      " name="enter"
				  onClick="if (checkNum(this.form.display.value))
					{ compute(this.form) }">
				</td>
				<td colspan="2">
				<input type="button" value="         C          "
				  onClick="this.form.display.value = 0 ">
				</td>
				</tr>
				</table>
				</form>
				
				</body>
                </div>
                <div id="cpestana4">
                	<center><iframe id="tmcmini" src="https://themoneyconverter.com/ES/MoneyConverter.aspx?from=EUR&amp;to=USD" style="width: 175px; height: 202px; border: none; background-color: #ffffff;" scrolling="no" marginwidth="0" marginheight="0"></iframe></center>
                </div>
                <div id="cpestana5">
                	Nombre administrador: Juan Sepulveda <br><br> 
                	Email: infovinas@gmail.com <br><br>
                	Fono: 0422436469 <br><br>
                </div>
            </div>
        </div>
        <a href="logout.html">Cerrar sesion</a>
    </body>
</html>
[/@structure]
