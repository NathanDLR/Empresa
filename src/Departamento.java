/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author natan
 */
public class Departamento {
    // Attributes & Variables
    private Integer idDepartamento;
    private String name;
    
    // Constructor
    public Departamento(Integer idDepartamento, String name){
        this.idDepartamento = idDepartamento;
        this.name = name;
    }

    public Integer getIdDepartamento() {
        return idDepartamento;
    }

    public void setIdDepartamento(Integer idDepartamento) {
        this.idDepartamento = idDepartamento;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
    
    
    
}
