package com.usuario.empresa.web.administracion.servicios;

import com.usuario.empresa.web.administracion.entidades.Indicador;

public class IndicadorService extends ServiceImpl {
	
	public void insertIndicador(Indicador indicador) throws Exception {
		sqlMap.insert("insertIndicador", indicador);
	}  
		
	public void updateNombre(Indicador indicador) throws Exception {
		sqlMap.update("updateNombre", indicador);
	}    
	
	public void updateValor(Indicador indicador) throws Exception {
		sqlMap.update("updateValor", indicador);
	}   
}
