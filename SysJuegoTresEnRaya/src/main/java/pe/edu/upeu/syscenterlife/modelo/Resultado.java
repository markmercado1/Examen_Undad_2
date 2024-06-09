
package pe.edu.upeu.syscenterlife.modelo;


import lombok.Data;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Data
@Entity
public class Resultado {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    private String nombrePartida;
    private String nombreJugador1;
    private String nombreJugador2;
    private String nombreGanador;
    private int puntuacion;
    private String estado;
}
