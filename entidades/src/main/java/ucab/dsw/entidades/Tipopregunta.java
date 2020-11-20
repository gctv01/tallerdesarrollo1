package ucab.dsw.entidades;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import java.util.List;

@Entity
@Table( name = "tipopregunta" )
public class Tipopregunta extends EntidadBase
{
    public String get_descripcion()
    {
        return _descripcion;
    }

    public void set_descripcion( String _descripcion )
    {
        this._descripcion = _descripcion;
    }

    @Column( name = "descripcion", nullable = false )
    private String _descripcion;



    public void set_estudios( List<Estudio> _estudios)
    {
        this._estudios = _estudios;
    }

    @OneToMany( mappedBy = "_tipousuario", fetch = FetchType.LAZY, cascade = CascadeType.PERSIST )
    private List<Usuario> _usuarios;

    public Tipopregunta(long id )
    {
        super( id );
    }

    public Tipopregunta( )
    {

    }
}

