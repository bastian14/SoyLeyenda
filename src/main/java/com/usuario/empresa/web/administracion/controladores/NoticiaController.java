package com.usuario.empresa.web.administracion.controladores;

import java.util.ArrayList;
import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.multiaction.MultiActionController;

import com.usuario.empresa.web.administracion.entidades.Noticia;
import com.usuario.empresa.web.administracion.entidades.Usuario;
import com.usuario.empresa.web.administracion.servicios.NoticiaService;


public class NoticiaController extends MultiActionController {
	/*private List<Noticia> noticias = new ArrayList<Noticia>();*/ 
	private Noticia objetoNoticia = new Noticia();
	
	private NoticiaService service = null;
	private ApplicationContext ctx = null; 


	/**
	 * constructor
	 */
	public NoticiaController() {
		/*Usuario usuario = null;
		// usuario 1
		usuario = new Usuario();
		usuario.setId(1);
		usuario.setNombre("Pedro Perez");
		usuario.setEdad(30);
		usuarios.add(usuario);
		// usuario 1
		usuario = new Usuario();
		usuario.setId(2);
		usuario.setNombre("Maria Gonzalez");
		usuario.setEdad(25);
		usuarios.add(usuario);*/

		ctx = new ClassPathXmlApplicationContext(
				"classpath:/spring/applicationContext.xml");
		service = (NoticiaService) ctx.getBean("noticiasService"); //PREGUNTAR
	}

	/**
	 * Método que lista los usuarios
	 * 
	 * @param request
	 * @param response
	 * @return Lista de Usuarios
	 * @throws Exception
	 */
	/*public ModelAndView listar(HttpServletRequest request,
			HttpServletResponse response) throws Exception {

		// método de primera iteracion
		// return new ModelAndView("usuarios/listar", "usuarios", usuarios);

		// obtener la lista de usuarios
		//List<Usuario> listaUsuarios = service.getUsuarios();
		
		//return new ModelAndView("usuarios/listar", "usuarios", listaUsuarios);
	}*/

	/**
	 * Método que siempre devuelve el primer usuario
	 * 
	 * @param request
	 * @param response
	 * @return primer usuario
	 * @throws Exception
	 */
	public ModelAndView vernoticias1(HttpServletRequest request,
			HttpServletResponse response) throws Exception { 
			objetoNoticia = service.getNoticiaid(1);

		return new ModelAndView("noticias/vernoticias1", "noticia", objetoNoticia);
	}   
	
	public ModelAndView vernoticias2(HttpServletRequest request,
			HttpServletResponse response) throws Exception { 
			objetoNoticia = service.getNoticiaid(2);

		return new ModelAndView("noticias/vernoticias2", "noticia", objetoNoticia);
	}   
	
	public ModelAndView vernoticias3(HttpServletRequest request,
			HttpServletResponse response) throws Exception { 
			objetoNoticia = service.getNoticiaid(3);

		return new ModelAndView("noticias/vernoticias3", "noticia", objetoNoticia);
	}  
	public ModelAndView vernoticias4(HttpServletRequest request,
			HttpServletResponse response) throws Exception { 
			objetoNoticia = service.getNoticiaid(4);

		return new ModelAndView("noticias/vernoticias4", "noticia", objetoNoticia);
	}  
	public ModelAndView vernoticias5(HttpServletRequest request,
			HttpServletResponse response) throws Exception { 
			objetoNoticia = service.getNoticiaid(5);

		return new ModelAndView("noticias/vernoticias5", "noticia", objetoNoticia);
	}   
	
	public ModelAndView vernoticias6(HttpServletRequest request,
			HttpServletResponse response) throws Exception { 
			objetoNoticia = service.getNoticiaid(6);

		return new ModelAndView("noticias/vernoticias6", "noticia", objetoNoticia);
	}   
	
	public ModelAndView vernoticias7(HttpServletRequest request,
			HttpServletResponse response) throws Exception { 
			objetoNoticia = service.getNoticiaid(7);

		return new ModelAndView("noticias/vernoticias7", "noticia", objetoNoticia);
	}   
	
	/*public ModelAndView titulo1(HttpServletRequest request,
			HttpServletResponse response) throws Exception { 
			String titulo = service.getTitulo(7);

		return new ModelAndView("noticias/vernoticias7", "noticia", titulo);
	}  */
	
	public void insertarnoticia(HttpServletRequest request,
			HttpServletResponse response) throws Exception {  
			objetoNoticia=obtenerDatosFormularioNoticia(request, objetoNoticia); 
			service.insertNoticia(objetoNoticia);
	} 
	
	private Noticia obtenerDatosFormularioNoticia(HttpServletRequest request, Noticia noticia) { 
		noticia.setId_noticia(Integer.parseInt(request.getParameter("id_noticia")));
		noticia.setTitulo(request.getParameter("titulo"));
		noticia.setCuerpo(request.getParameter("cuerpo"));
		noticia.setFuente(request.getParameter("fuente"));
		return noticia;
	}
}
