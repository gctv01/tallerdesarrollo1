package ucab.dsw.entidades;

import javax.persistence.*;
import java.util.List;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import java.util.List;


    @Entity
    //@Table( name = "opcion" )
    public class Opcion extends EntidadBase
    {
        public String get_descripcion()
        {
            return _descripcion;
        }

        public void set_descripcion( String _descripcion )
        {
            this._descripcion = _descripcion;
        }

        //@Column( name = "descripcion", nullable = false )
        private String _descripcion;

        public List<Usuario> get_usuarios()
        {
            return _usuarios;
        }

        public void set_estudios( List<Usuario> _usuarios )
        {
            this._usuarios = _usuarios;
        }

        //public List<Estudio> get_estudios()
        {
            //return _estudios;
        }

        public void set_estudio( List<Usuario> _usuarios )
        {
            this._usuarios = _usuarios;
        }

        @OneToMany( mappedBy = "_opcion", fetch = FetchType.LAZY, cascade = CascadeType.PERSIST )
        private List<Usuario> _usuarios;

        public Opcion( long id )
        {
            super( id );
        }

        public Opcion( )
        {

        }
    }

}
