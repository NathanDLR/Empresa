/**
 *
 * @author natan
 */
public class TipoEmpleado {
    // Attributes & Variables
    private Integer idTipoEmpleado;
    private String name;

    // Constructor
    public TipoEmpleado(Integer idTipoEmpleado, String name) {
        this.idTipoEmpleado = idTipoEmpleado;
        this.name = name;
    }

    public Integer getIdTipoEmpleado() {
        return idTipoEmpleado;
    }

    public void setIdTipoEmpleado(Integer idTipoEmpleado) {
        this.idTipoEmpleado = idTipoEmpleado;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
    
    
}
