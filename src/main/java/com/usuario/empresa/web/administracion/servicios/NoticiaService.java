package com.usuario.empresa.web.administracion.servicios;

import com.usuario.empresa.web.administracion.entidades.Noticia;
import com.usuario.empresa.web.administracion.entidades.Usuario;

public class NoticiaService extends ServiceImpl {
	/**
	 * Retorna la lista de usuarios
	 * 
	 * @return lista de usuarios
	 * @throws Exception
	 */
	@SuppressWarnings("unchecked")
	/*public List<Usuario> getUsuarios() throws Exception {
		return (List<Usuario>) sqlMap.queryForList("getUsuarios");
	}*/ 
	
	/*public Noticia getNoticia() throws Exception {
		return (Noticia) sqlMap.queryForList("getNoticia");
	}*/

	/**
	 * Retorna un usuario dado su correspondiente id
	 * 
	 * @param idUsuario
	 *            - id del usuario
	 * @return usuario
	 * @throws Exception
	 */
	public Noticia getNoticiaid(int id_noticia) throws Exception {
		return (Noticia) sqlMap.queryForObject("getNoticiaid", id_noticia);
	}  
	
	/*public String getTitulo(int id_noticia) throws Exception {
		return (String) sqlMap.queryForObject("getTitulo", id_noticia);
	}*/ 
	
	public void insertNoticia(Noticia noticia) throws Exception {
		sqlMap.insert("insertNoticia", noticia);
	}  
	
	public void updateNoticia(Noticia noticia) throws Exception {
		sqlMap.update("updateNoticia", noticia);
	}  
	
	public void deleteNoticia(int id_noticia) throws Exception {
		sqlMap.delete("deleteNoticia", id_noticia);
	}

	/**
	 * Retorna la cantidad total de usuarios
	 * 
	 * @return cantidad de usuarios
	 * @throws Exception
	 */
	/*public int getTotalUsuarios() throws Exception {
		return (Integer) sqlMap.queryForObject("getTotalUsuarios");
	}*/

	/**
	 * Inserta un usuario
	 * 
	 * @param usuario
	 *            - datos del usuario
	 * @return id del nuevo usuario
	 * @throws Exception
	 */
	/*public int insertUsuario(Usuario usuario) throws Exception {
		return (Integer) sqlMap.insert("insertUsuario", usuario);
	}*/

	/**
	 * Actualiza la informacion de un usuario
	 * 
	 * @param usuario
	 *            - datos del usuario
	 * @throws Exception
	 */
	/*public void updateUsuario(Usuario usuario) throws Exception {
		sqlMap.update("updateUsuario", usuario);
	}*/

	/**
	 * Eliminar usuario
	 * 
	 * @param id
	 *            del usuario
	 * @throws Exception
	 */
	/*public void deleteUsuario(int idUsuario) throws Exception {
		sqlMap.delete("deleteUsuario", idUsuario);
	}*/
}
