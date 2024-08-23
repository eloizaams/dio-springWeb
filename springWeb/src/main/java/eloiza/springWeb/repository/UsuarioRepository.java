package eloiza.springWeb.repository;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Repository;

import eloiza.springWeb.model.Usuario;

@Repository
public class UsuarioRepository {
	public void save(Usuario user) {
		if(user.getId()==null)
			System.out.println("SAVE - Recebendo o usuário da camada de repositório");
		else
			System.out.println("UPDATE - Recebendo o usuário da camada de repositório");
		System.out.println(user);
	}
	
	public void deleteById(Integer id) {
		System.out.println(String.format("DELETE/id - Recebendo o id: %d para excluir", id));
		System.out.println(id);
	}
	
	public List<Usuario> findAll(){
		System.out.println("LIST - Listando os usuários do sitema");
		List<Usuario> usuarios = new ArrayList<>();
		usuarios.add(new Usuario("eloiza", "xxx"));
		usuarios.add(new Usuario("rafael", "pass"));
		return usuarios;
	}
	
	public Usuario findById(Integer id) {
		System.out.println(String.format("FIND/id - Recebendo o id: %d para localizar", id));
		return new Usuario ("eloiza", "xxx");
	}
	
	public Usuario findByName(String username) {
		System.out.println(String.format("FIND/username - Recebendo o username: %s para localizar", username));
		return new Usuario ("eloiza", "xxx");
	}

	
}
