package com.usuario.empresa.web.administracion.controladores;

import java.sql.Date;
import java.util.ArrayList; 
import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.multiaction.MultiActionController;

import com.usuario.empresa.web.administracion.entidades.Noticia;
import com.usuario.empresa.web.administracion.servicios.NoticiaService;


public class NoticiaController extends MultiActionController {
	private Noticia objetoNoticia = new Noticia(); 
	private Noticia objetoNoticia2 = new Noticia();
	private NoticiaService service = null;
	private ApplicationContext ctx = null; 

	public NoticiaController() {  
		ctx = new ClassPathXmlApplicationContext(
				"classpath:/spring/applicationContext.xml");
		service = (NoticiaService) ctx.getBean("noticiasService"); //PREGUNTAR
	}

	public ModelAndView vernoticias1(HttpServletRequest request,
			HttpServletResponse response) throws Exception {  
			objetoNoticia2=service.getMaxId(); 
			objetoNoticia = service.getNoticiaid(objetoNoticia2.getId_noticia());

		return new ModelAndView("noticias/vernoticias1", "noticia", objetoNoticia);
	}   
	
	public ModelAndView vernoticias2(HttpServletRequest request,
			HttpServletResponse response) throws Exception { 
			objetoNoticia2=service.getMaxId(); 
			objetoNoticia = service.getNoticiaid(objetoNoticia2.getId_noticia()-1);

		return new ModelAndView("noticias/vernoticias2", "noticia", objetoNoticia);
	}   
	
	public ModelAndView vernoticias3(HttpServletRequest request,
			HttpServletResponse response) throws Exception { 
			objetoNoticia2=service.getMaxId(); 
			objetoNoticia = service.getNoticiaid(objetoNoticia2.getId_noticia()-2);

		return new ModelAndView("noticias/vernoticias3", "noticia", objetoNoticia);
	}  
	public ModelAndView vernoticias4(HttpServletRequest request,
			HttpServletResponse response) throws Exception { 
			objetoNoticia2=service.getMaxId(); 
			objetoNoticia = service.getNoticiaid(objetoNoticia2.getId_noticia()-3);

		return new ModelAndView("noticias/vernoticias4", "noticia", objetoNoticia);
	}  
	public ModelAndView vernoticias5(HttpServletRequest request,
			HttpServletResponse response) throws Exception { 
			objetoNoticia2=service.getMaxId(); 
			objetoNoticia = service.getNoticiaid(objetoNoticia2.getId_noticia()-4);

		return new ModelAndView("noticias/vernoticias5", "noticia", objetoNoticia);
	}   
	
	public ModelAndView vernoticias6(HttpServletRequest request,
			HttpServletResponse response) throws Exception { 
			objetoNoticia2=service.getMaxId(); 
			objetoNoticia = service.getNoticiaid(objetoNoticia2.getId_noticia()-5);

		return new ModelAndView("noticias/vernoticias6", "noticia", objetoNoticia);
	}   
	
	public ModelAndView vernoticias7(HttpServletRequest request,
			HttpServletResponse response) throws Exception { 
			objetoNoticia2=service.getMaxId(); 
			objetoNoticia = service.getNoticiaid(objetoNoticia2.getId_noticia()-6);

		return new ModelAndView("noticias/vernoticias7", "noticia", objetoNoticia);
	}   
	
	
	public ModelAndView insertarnoticia(HttpServletRequest request,
			HttpServletResponse response) throws Exception {  
			objetoNoticia=obtenerDatosFormularioNoticia(request, objetoNoticia); 
			service.insertNoticia(objetoNoticia); 
			return new ModelAndView("noticias/insertarnoticia");
	} 
	
	private Noticia obtenerDatosFormularioNoticia(HttpServletRequest request, Noticia noticia) { 
		Date fecha = null;
		java.sql.Date sqlDate = java.sql.Date.valueOf(request.getParameter("fecha"));
		fecha = sqlDate ;			
		noticia.setTitulo(request.getParameter("titulo"));
		noticia.setCuerpo(request.getParameter("cuerpo")); 
		noticia.setFuente(request.getParameter("fuente"));  
		noticia.setFecha(fecha);
		noticia.setUrl_imagen(request.getParameter("url")); 
		noticia.setTag1(request.getParameter("tag1"));  
		noticia.setTag2(request.getParameter("tag2"));  
		noticia.setTag3(request.getParameter("tag3"));  
		return noticia;
	}   
	
	public ModelAndView buscarnoticia(HttpServletRequest request,
			HttpServletResponse response) throws Exception {   
			
			List<Noticia> noticias = service.getNoticiaTag(request.getParameter("tag"));

		return new ModelAndView("noticias/buscarnoticia", "noticias", noticias);
	}    
	 
	 public ModelAndView modificarnoticia(HttpServletRequest request,
			HttpServletResponse response) throws Exception {  
		 	objetoNoticia=modificarDatosNoticia(request, objetoNoticia);  
			
		 	if(objetoNoticia.getTitulo().length()!=0) { 
				service.updateNoticiaTitulo(objetoNoticia);
			} 
			if(objetoNoticia.getCuerpo().length()!=0) { 
				service.updateNoticiaCuerpo(objetoNoticia);
			}  
			if(objetoNoticia.getFuente().length()!=0) { 
				service.updateNoticiaFuente(objetoNoticia);
			}   
			if(objetoNoticia.getFecha()!=null) { 
				service.updateNoticiaFecha(objetoNoticia);
			}  
			if(objetoNoticia.getUrl_imagen().length()!=0) { 
				service.updateNoticiaUrl(objetoNoticia);
			}    
			if(objetoNoticia.getTag1().length()!=0) { 
				service.updateNoticiaTag1(objetoNoticia);
			}   
			if(objetoNoticia.getTag2().length()!=0) { 
				service.updateNoticiaTag2(objetoNoticia);
			}    
			if(objetoNoticia.getTag3().length()!=0) { 
				service.updateNoticiaTag3(objetoNoticia);
			}   
			return new ModelAndView("noticias/modificarnoticia");
	} 
	
	private Noticia modificarDatosNoticia(HttpServletRequest request, Noticia noticia) { 
		Date fecha2 = null;  
		if(request.getParameter("fecham").length()!=0) {  
			java.sql.Date sqlDate2 = java.sql.Date.valueOf(request.getParameter("fecham")); 
			fecha2 = sqlDate2 ;  
		}
		if(request.getParameter("idm").length()>0) { 
			noticia.setId_noticia(Integer.parseInt(request.getParameter("idm")));
		}
			
		noticia.setTitulo(request.getParameter("titulom"));
		noticia.setCuerpo(request.getParameter("cuerpom")); 
		noticia.setFuente(request.getParameter("fuentem"));  
		noticia.setFecha(fecha2);
		noticia.setUrl_imagen(request.getParameter("urlm")); 
		noticia.setTag1(request.getParameter("tag1m"));  
		noticia.setTag2(request.getParameter("tag2m"));  
		noticia.setTag3(request.getParameter("tag3m"));  		
		return noticia;
	}
}
