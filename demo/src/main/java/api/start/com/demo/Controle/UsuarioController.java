package api.start.com.demo.Controle;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import api.start.com.demo.Model.Usuario;
import api.start.com.demo.Repositorio.IUsuario;

@RestController
@RequestMapping("/usuarios")
public class UsuarioController {

    @Autowired
    private IUsuario iUsuario;
    
    @GetMapping
    public List<Usuario> listaUsuarios (){ 
        return (List<Usuario>) iUsuario.findAll();
    }

    @PostMapping
    public Usuario criarUsuario(@RequestBody Usuario usuario){
    Usuario usuarioNovo = iUsuario.save(usuario);
    return usuarioNovo;
    }
    @PutMapping
    public Usuario editarUsuario(@RequestBody Usuario usuario){
        Usuario usuarioNovo = iUsuario.save(usuario);
        return usuarioNovo;
    }
}
