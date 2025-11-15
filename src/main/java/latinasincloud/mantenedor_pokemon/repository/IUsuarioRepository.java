package latinasincloud.mantenedor_pokemon.repository;

import latinasincloud.mantenedor_pokemon.model.Usuario;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;


public interface IUsuarioRepository extends JpaRepository<Usuario, Long> {
    Optional<Usuario> findByUsuario(String usuario);

}
