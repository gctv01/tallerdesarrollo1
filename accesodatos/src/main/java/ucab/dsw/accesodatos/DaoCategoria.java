package ucab.dsw.accesodatos;

import ucab.dsw.entidades.categoria;

import javax.persistence.EntityManager;

public class DaoCategoria extends Dao<categoria>{

    private EntityManager _em;
    static DaoHandler _handler = new DaoHandler();


    public DaoCategoria( )
    {
        super( _handler );
    }

}
