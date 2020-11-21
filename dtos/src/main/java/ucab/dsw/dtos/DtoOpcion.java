package ucab.dsw.dtos;

public class DtoOpcion extends DtoBase {

    private String estatus;
    private String descripcion;
    private PreguntaDto pregunta;

    public DtoOpcion() {

    }

    public DtoOpcion(long id) throws Exception {
        super(id);
    }

    public String getestatus()
    {
        return estatus;
    }

    public void setestatus( String estatus )
    {
        this.estatus = estatus;
    }

    public String getDescripcion()
    {
        return this.descripcion;
    }

    public void setDescripcion( String D )
    {
        this.descripcion = D;
    }

    public PreguntaDto getPreguntaDto()
    {
        return this.pregunta;
    }
    public void getPreguntaDto(PreguntaDto P){this.pregunta=P;}


    public DtoOpcion getTipoPregunta()
    {
        return opcion;
    }

    public void setOpcionDto( DtoEjecucionEncuesta ejecucion )
    {
        this.opcion= opcion;
    }


    private DtoOpcion opcion;



    public String getEstatus()
    {
        return estatus;
    }
    public void setEstatus( String estatus )
    {
        this.estatus = estatus;
    }

}
