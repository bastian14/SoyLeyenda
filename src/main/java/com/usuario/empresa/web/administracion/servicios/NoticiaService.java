package com.usuario.empresa.web.administracion.servicios;

import java.util.List;


import com.usuario.empresa.web.administracion.entidades.Noticia;


public class NoticiaService extends ServiceImpl { 
	
	public Noticia getNoticiaid(int id_noticia) throws Exception {
		return (Noticia) sqlMap.queryForObject("getNoticiaid", id_noticia);
	}  
	public Noticia getMaxId() throws Exception {
		return (Noticia) sqlMap.queryForObject("getMaxId");
	}  
	
	public List <Noticia> getNoticiaTag(String tag) throws Exception {
		return (List <Noticia>) sqlMap.queryForList("getNoticiaTag",tag);
	}  
	public void insertNoticia(Noticia noticia) throws Exception {
		sqlMap.insert("insertNoticia", noticia);
	}  
	
	public void updateNoticiaTitulo(Noticia noticia) throws Exception {
		sqlMap.update("updateNoticiaTitulo", noticia);
	}   
	
	public void updateNoticiaCuerpo(Noticia noticia) throws Exception {
		sqlMap.update("updateNoticiaCuerpo", noticia);
	}  
	
	public void updateNoticiaFuente(Noticia noticia) throws Exception {
		sqlMap.update("updateNoticiaFuente", noticia);
	} 
	
	public void updateNoticiaFecha(Noticia noticia) throws Exception {
		sqlMap.update("updateNoticiaFecha", noticia);
	}  
	
	public void updateNoticiaUrl(Noticia noticia) throws Exception {
		sqlMap.update("updateNoticiaUrl", noticia);
	}   
	
	public void updateNoticiaTag1(Noticia noticia) throws Exception {
		sqlMap.update("updateNoticiaTag1", noticia);
	}    
	
	public void updateNoticiaTag2(Noticia noticia) throws Exception {
		sqlMap.update("updateNoticiaTag2", noticia);
	}    
	
	public void updateNoticiaTag3(Noticia noticia) throws Exception {
		sqlMap.update("updateNoticiaTag3", noticia);
	}   
	
}
