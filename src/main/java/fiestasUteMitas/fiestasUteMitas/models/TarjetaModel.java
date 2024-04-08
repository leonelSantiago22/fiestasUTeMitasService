package fiestasUteMitas.fiestasUteMitas.models;

import jakarta.persistence.*;

import java.util.Date;

@Entity
@Table(name = "tarjeta")
public class TarjetaModel {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String name;
    private String number;
    private String email;
    private String address;
    private int billValue;
    private String cardNumber;
    private String cardHolder;
    private String dateValue;
    private String cvc;
}
