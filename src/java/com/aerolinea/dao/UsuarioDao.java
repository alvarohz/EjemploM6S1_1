/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.aerolinea.dao;

import com.aerolinea.entidad.Pais;
import com.aerolinea.entidad.Rol;
import com.aerolinea.entidad.Usuario;
import java.util.List;

public interface UsuarioDao {
    public void guardarUsuario(Usuario u);
    public List<Usuario> consultarUsuarios();
    public Usuario validarUsuario(Usuario u);
    public List<Rol> getRoles();
    public List<Pais> getPaises();
    public Usuario getUsuario(String id);
    public void EliminarUsuario(String id);  
}
