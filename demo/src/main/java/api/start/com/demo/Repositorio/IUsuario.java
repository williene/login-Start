package api.start.com.demo.Repositorio;

import org.springframework.data.repository.CrudRepository;

import api.start.com.demo.Model.Usuario;

public interface IUsuario extends CrudRepository<Usuario, Integer> {

}
