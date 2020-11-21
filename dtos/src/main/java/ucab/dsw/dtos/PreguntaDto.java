package ucab.dsw.dtos;

import java.util.Date;

public class PreguntaDto extends DtoBase {

    public PreguntaDto() { }

    public PreguntaDto(long id) throws Exception {super(id);}

    private DtoEjecucionEncuesta EjecucionEncuestaDto;
    private DtoOpcion OpcionDto;
    private DtoTipoPregunta TipopreguntaDto;
    private CategoriaDto CategoriaDto;
    private UsuarioDto UsuarioDto;
    private Date fechaCreacion;
    private String estatus;
    private String pregunta;

    public void setPregunta(String P) {
        this.pregunta=P;
    }
    public String getPregunta() {return this.pregunta;}

    public void setUsuarioDto(UsuarioDto UO) {
        this.UsuarioDto = UO;
    }
    public UsuarioDto getUsuarioDto() {
        return this.UsuarioDto;
    }

    public void setOpcionDto(DtoOpcion DO) {
        this.OpcionDto = DO;
    }
    public DtoOpcion getOpcionDto() {
        return this.OpcionDto;
    }


    public void setFechaCreacion(Date FC) {
        this.fechaCreacion = FC;
    }
    public Date getFechaCreacion() {
        return this.fechaCreacion;
    }

    public void setEstatus(String E) {
        this.estatus = E;
    }
    public String getEstatus() {
        return this.estatus;
    }

    public void setTipoPreguntaDto(DtoTipoPregunta U) {
        this.TipopreguntaDto = U;
    }
    public DtoTipoPregunta gettipopregunta() {
        return this.TipopreguntaDto;
    }

    public void setCategoriaDto(CategoriaDto S) {
        this.CategoriaDto = S;
    }
    public CategoriaDto getCategoriaDto() {return this.CategoriaDto;}

    public void setDtoEjecucionEncuesta(DtoEjecucionEncuesta S) {this.EjecucionEncuestaDto = S;}
    public DtoEjecucionEncuesta getDtoEjecucionEncuesta() {return this.EjecucionEncuestaDto;}
}


