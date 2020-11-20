package ucab.dsw.entidades;

import javax.persistence.*;
import java.util.List;

@Entity
@Table(name = "ejecucionencuesta")
public class Ejecucionencuesta extends EntidadBase {

    @Column(name = "respuesta", nullable = false)
    private String _respuesta;
    @Column(name = "estatus", nullable = false)
    private String _estatus;
    @ManyToOne
    @JoinColumn(name = "idEncuesta")
    private Encuesta encuesta;
    @ManyToOne
    @JoinColumn(name = "idPregunta")
    private Pregunta pregunta;
    @ManyToOne
    @JoinColumn(name = "idOpcion")
    private Opcion opcion;

    public String get_respuesta() {
        return _respuesta;
    }

    public void set_respuesta(String _descripcion) {
        this._respuesta = _respuesta;
    }

    public String get_estatus() {
        return _estatus;
    }

    public void set_estatus(String _estatus) {
        this._estatus = _estatus;
    }

    public Encuesta getIdencuesta(){return this.encuesta;}
    public void setIdencuesta(Encuesta U){this.encuesta=U;}

    public Pregunta getIdpregunta(){return this.pregunta;}
    public void setIdpregunta(Pregunta U){this.pregunta=U;}

    public Opcion getIdopcion(){return this.opcion;}
    public void setIdopcion(Opcion U){this.opcion=U;}


    @OneToMany(mappedBy = "_tipousuario", fetch = FetchType.LAZY, cascade = CascadeType.PERSIST)
    private List<Usuario> _usuariosencuestados;

    public Ejecucionencuesta(long id) {
        super(id);



    }
}


