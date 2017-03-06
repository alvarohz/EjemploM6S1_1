
package com.aerolinea.control;

import com.aerolinea.dao.UsuarioDao;
import com.aerolinea.entidad.Usuario;
import javax.servlet.http.HttpServletRequest;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class ControlUsuario {
    
    private UsuarioDao dao;

    @Autowired
    public void setDao(UsuarioDao dao) {
        this.dao = dao;
    }
    
    @RequestMapping("/login")
    public String login(@RequestParam("txtUsuario")String usuario,
            @RequestParam("txtClave") String clave, HttpServletRequest req){
        Usuario u=new Usuario();
        u.setIdusuario(usuario);
        u.setClave(clave);
        Usuario usuarioLogueado=dao.validarUsuario(u);
        if (usuarioLogueado!=null){
            return "redirect:/principal";
        }else
            return "redirect:/home";
    }
}
