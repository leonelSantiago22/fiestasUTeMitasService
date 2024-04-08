package fiestasUteMitas.fiestasUteMitas.models;

import jakarta.persistence.*;

@Entity
@Table(name = "user")
public class UserModel {
    @Id
    @GeneratedValue(strategy =  GenerationType.IDENTITY)
    @Column
    private Long id_user;
    @Column
    private  String name;
    @Column
    private  String correo;

    public Long getId_user() {
        return id_user;
    }

    public void setId_user(Long id_user) {
        this.id_user = id_user;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }
}
