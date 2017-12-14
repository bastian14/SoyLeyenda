package com.usuario.empresa.web.administracion.controladores;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.multiaction.MultiActionController;

import com.usuario.empresa.web.administracion.entidades.Indicador;
import com.usuario.empresa.web.administracion.servicios.IndicadorService;


public class IndicadorController extends MultiActionController {
	private Indicador objetoIndicador = new Indicador();
	private IndicadorService service = null;
	private ApplicationContext ctx = null; 


	/**
	 * constructor
	 */
	public IndicadorController() {
		ctx = new ClassPathXmlApplicationContext("classpath:/spring/applicationContext.xml");
		service = (IndicadorService) ctx.getBean("indicadoresService"); //PREGUNTAR
	}

	public ModelAndView insertarindicador(HttpServletRequest request,
			HttpServletResponse response) throws Exception {  
			objetoIndicador=obtenerDatosFormularioIndicador(request, objetoIndicador); 
			service.insertIndicador(objetoIndicador); 
			return new ModelAndView("indicadores/insertarindicador");
	} 
	
	private Indicador obtenerDatosFormularioIndicador(HttpServletRequest request, Indicador indicador) { 
		
		indicador.setNombre(request.getParameter("nombreii"));	 
		indicador.setValor(Integer.parseInt(request.getParameter("valorii")));
		return indicador;
	} 
	public ModelAndView modificarindicador(HttpServletRequest request,
			HttpServletResponse response) throws Exception {  
			objetoIndicador=modificarDatosIndicador(request, objetoIndicador);   
			if(objetoIndicador.getNombre().length()!=0) { 
				service.updateNombre(objetoIndicador);
			}   
			
			if(objetoIndicador.getValor()>0) { 
				service.updateValor(objetoIndicador);
			} 
			return new ModelAndView("indicadores/modificarindicador");
	} 
	
	private Indicador modificarDatosIndicador(HttpServletRequest request, Indicador indicador) {  
		if(request.getParameter("idim").length()>0) { 
			indicador.setId_indicador(Integer.parseInt(request.getParameter("idim")));
		}
		indicador.setNombre(request.getParameter("nombreim"));	 
		if(request.getParameter("valorim").length()>0) { 
			indicador.setValor(Integer.parseInt(request.getParameter("valorim")));
		}
		return indicador;
	}
}
