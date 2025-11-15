package latinasincloud.mantenedor_pokemon.model;


import jakarta.persistence.*;

@Entity
@Table(name = "users")
public class Usuario {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String users;
    private String password;

    @ManyToOne
    @JoinColumn(name = "profile_id", nullable = false)
    private Perfil profile;

    public Usuario(){
    }

    public Usuario(String users, String password, Perfil profile){
        this.users = users;
        this.password =password;
        this.profile = profile;
    }

    public String getUsers(){
        return users;
    }

    public String getPassword(){
        return password;
    }

    public Perfil getProfile() {
        return profile;
    }
}
