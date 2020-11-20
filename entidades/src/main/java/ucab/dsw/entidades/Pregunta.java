package ucab.dsw.entidades;

import javax.persistence.*;
import java.util.List;

@Entity
@Table(name = "pregunta")
public class Pregunta extends EntidadBase{

    @Column(name = "estatus")
    private String estatus;
    @Column(name = "fecha_creacion")
    private String fecha_creacion;
    @Column(name = "pregunta")
    private String pregunta;

    @OneToMany(mappedBy = "idsubcategoria", fetch = FetchType.LAZY, cascade = CascadeType.PERSIST)
    private List<Ejecucionencuesta> ejecucionencuesta;

    public List<Ejecucionencuesta> get_ejecucionencuesta()
    {
        return ejecucionencuesta;
    }
    @ManyToOne
    @JoinColumn(name="idUsuario")
    private Usuario idusuario;

    @ManyToOne
    @JoinColumn(name="idtipopregunta")
    private Tipopregunta idtipopregunta;

    @ManyToOne
    @JoinColumn(name="idSubcategoria")
    private subCategoria idsubcategoria;

    public String get_estatus(){
        return this.estatus;
    }

    public void set_estatus(String D){
        this.estatus=D;
    }

    public Usuario get_idusuario() {
        return this.idusuario;
    }

    public void set_idusuario(Usuario C) {
        this.idusuario=C;
    }

    public subCategoria get_subCategoria()
    {
        return this.idsubcategoria;
    }
    public void set_subCategoria( subCategoria idSC ){ this.idsubcategoria = idSC;}

    public Pregunta(long id){
        super(id);
    }

    public Pregunta(){

    }
}