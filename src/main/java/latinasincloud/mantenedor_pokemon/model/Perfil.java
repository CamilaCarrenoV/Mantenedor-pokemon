package latinasincloud.mantenedor_pokemon.model;


import jakarta.persistence.*;

@Entity
@Table(name = "profiles")
public class Perfil {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String name;

    public Perfil(){
    }

    public Perfil(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }
}
