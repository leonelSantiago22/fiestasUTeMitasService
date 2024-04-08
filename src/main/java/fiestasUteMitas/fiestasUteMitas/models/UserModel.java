package fiestasUteMitas.fiestasUteMitas.models;

import jakarta.persistence.*;

@Entity
@Table(name = "user")
public class UserModel {
    @Id
    @GeneratedValue(strategy =  GenerationType.IDENTITY)
    private Long id_user;
    @Column
    private  String name;
    
}
