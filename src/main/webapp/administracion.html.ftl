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
		<div class="titulo">Seccion de Administracion de la Aplicacion</div> 
		<img src ="http://4.bp.blogspot.com/-cJ0yeWTqqJI/U5RpoazD90I/AAAAAAAAQKg/TK2N57bhRCc/s1600/conoce_banner.png" width ="1000" height ="200" alt ="admin">
		<div id="pestanas">
                <ul id="lista">
                    <li id="pestana1"><a href='javascript:cambiarPestanna(pestanas,pestana1);'>Ingresar Noticia</a></li>
                    <li id="pestana2"><a href='javascript:cambiarPestanna(pestanas,pestana2);'>Modificar Noticia</a></li>
                    <li id="pestana3"><a href='javascript:cambiarPestanna(pestanas,pestana3);'>Eliminar Noticia</a></li>
                    <li id="pestana4"><a href='javascript:cambiarPestanna(pestanas,pestana4);'>Ingresar Indicador</a></li>
                    <li id="pestana5"><a href='javascript:cambiarPestanna(pestanas,pestana5);'>Modificar Indicador</a></li>
                    <li id="pestana6"><a href='javascript:cambiarPestanna(pestanas,pestana6);'>Eliminar Indicador</a></li>
                </ul>
        </div> 
        <div id="contenidopestanas">        
        	<div id="cpestana1">    
        	<form action="./noticias/insertarnoticia.xml" method="POST">
        		<!--<tr> 
        			<td>ID:</td>  <br>
        			
					<td><input type='text' name="id_noticia" value='' /></td> <br>
				</tr>-->   
				<tr> 
					<td>TITULO:</td><br>
					<td><input type='text' name="titulo" value='' /></td> <br> 
				</tr>  
			    <tr> 
					<td>FUENTE:</td><br>
					<td><input type='text' name= "fuente" value='' /></td> <br> 
				</tr>  
				<!--<tr> 
					<td>AUTOR:</td><br>
					<td><input type='text' id="autor" value='' /></td> <br> 
				</tr>--> 
				<tr> 
					<td>FECHA PUBLICACION:</td><br>
					<td><input type='date' name="fecha" value="2017-01-01" /></td> <br> 
				</tr> 
				<tr> 
					<td>URL Imagen:</td><br>
					<td><input type='text' name= "url" value='' /></td> <br> 
				</tr>  
				<tr>  
				<tr> 
					<td>CUERPO:</td><br> 
					<textarea name="cuerpo"  rows="20" cols="40"></textarea><br>
				</tr>  
				<tr> 
					<td>TAG1:</td><br>
					<td><input type='text' name="tag1" value='' /></td> <br> 
				</tr>  
				<tr> 
					<td>TAG2:</td><br>
					<td><input type='text' name="tag2" value='' /></td> <br> 
				</tr>  
				<tr> 
					<td>TAG3:</td><br>
					<td><input type='text' name="tag3" value='' /></td> <br> <br> 
				</tr>
				<tr>
						<td colspan='2'><input id="enviari" type="submit"></td>
				</tr> 
						
            </div> 
         </form>   
            <div id="cpestana2">   
            <form action="./noticias/modificarnoticia.xml" method="POST"> 
				<tr> 
        			<td>ID de la noticia que se modificara:</td>  <br> 
        			
					<td><input type='number' name="idm" value='' /></td> <br>
				</tr>  
				<tr> 
					<td>TITULO:</td><br> 
					<td><input type='text' name="titulom" value='' /></td> <br>  
				</tr>   
				<tr> 
				</tr> 
					<td>CUERPO:</td><br>
					<textarea name="cuerpom" rows="20" cols="40"></textarea><br>  
				
				</tr>     
				<tr>   
					<td>FUENTE:</td><br>
					<td><input type='text' name="fuentem" value='' /></td> <br>   
				
				</tr>  
				<!--<tr> 
					<td>AUTOR:</td><br>
					<td><input type='text' name="autorm" value='' /></td> <br> 
				</tr> -->  
				<tr>  
					<td>FECHA PUBLICACION:</td><br>
					<td><input type='date' name="fecham" value='' /></td> <br>   
				
				</tr>   
				<tr>  
					<td>URL:</td><br>
					<td><input type='text' name="urlm" value='' /></td> <br>  
				
				</tr>  
				<tr>  
					<td>TAG1:</td><br>
					<td><input type='text' name="tag1m" value='' /></td> <br>   
				
				</tr>  
				<tr>  
					<td>TAG2:</td><br>
					<td><input type='text' name="tag2m" value='' /></td> <br>   
					
				</tr>   
				<tr>  
					<td>TAG3:</td><br>
					<td><input type='text' name="tag3m" value='' /></td> <br>   
				<tr>
						<td colspan='2'><input id="enviarm8" type="submit" value="Modificar"></td><br>
				</tr> 		
				</tr>   
			</form>	
            </div> 
           
            <div id="cpestana3">
               	<tr> 
        			<td>ID:</td>  <br>
        			
					<td><input type='number' id="ide" value='' /></td> <br>
				</tr>   
				<tr> 
					<td>TITULO:</td><br>
					<td><input type='text' id="tituloe" value='' /></td> <br><br> 
				</tr>  
				<tr>
						<td colspan='2'><input id="enviare" type="submit" value = "Eliminar"></td>
				</tr>   
				
            </div>
            <div id="cpestana4"> 
            <form action="./indicadores/insertarindicador.xml" method="POST">
                <!--<tr> 
					<td>ID INDICADOR:</td><br>
					<td><input type='number' name="idii" value='' /></td> <br> 
				</tr>-->  
				<tr> 
					<td>NOMBRE INDICADOR:</td><br>
					<td><input type='text' name="nombreii" value='' /></td> <br> 
				</tr>  
				<tr> 
					<td>VALOR NUMERICO:</td><br>
					<td><input type='number' name="valorii" value='' /></td> <br><br> 
				</tr>  
				<tr>
						<td colspan='2'><input id="enviarii" type="submit"></td>
				</tr>   	  
            </div> 
            </form>
            <div id="cpestana5"> 
             <form action="./indicadores/modificarindicador.xml" method="POST"> 
                <tr> 
					<td>ID INDICADOR que se modificara:</td><br>
					<td><input type='number' name="idim" value='' /></td> <br> 
				</tr>  
				<tr> 
					<td>NOMBRE INDICADOR:</td><br>
					<td><input type='text' name="nombreim" value='' /></td> <br> 
				</tr>  
				<tr> 
					<td>VALOR NUMERICO:</td><br>
					<td><input type='number' name="valorim" value='' /></td> <br><br> 
				</tr>  
				<tr>
						<td colspan='2'><input id="enviarim" type="submit"></td>
				</tr>  
			</form>	  
            </div>
            <div id="cpestana6">
            	<tr> 
					<td>ID INDICADOR:</td><br>
					<td><input type='number' id="idie" value='' /></td> <br> 
				</tr>  
				<tr> 
					<td>NOMBRE INDICADOR:</td><br>
					<td><input type='text' id="nombreie" value='' /></td> <br><br> 
				</tr>  
				<tr>
						<td colspan='2'><input id="enviarie" type="submit"></td>
				</tr>    
            </div>
        </div>
	</div>
	<a href="logout.html">Cerrar sesion</a>
</body>
</html>