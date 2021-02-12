/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author natan
 */
public class Controller {
    
    static DAOEmpresa dao = new DAOEmpresa();
    
    public Controller(){
        
    }
    
    public static void deleteEmpleado(){
        String idEmpleado = FrameDelete.getInfo();
        dao.deleteEmpleado(idEmpleado);
    }
    
}
