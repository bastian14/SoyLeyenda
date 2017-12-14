[#include "../common.ftl" /]
[@structure]
	<h1>Noticias encontradas:</h1>
   	 [#list noticias as noticia]
   		 <tr> 
   		 	<td>
   				 ${noticia_index+1}
   			 </td>	
   			 <center><b><u><td>
   				 ${noticia.titulo}<br>
   			 </td></b></u></center><br>
   			 <td>
   				 ${noticia.cuerpo}<br>
   			 </td><br>    
   		 </tr>
   	 [/#list]   
[/@structure]
