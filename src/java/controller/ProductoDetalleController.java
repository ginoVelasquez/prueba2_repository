/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package controller;

import java.util.List;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import model.dao.LogocareDAO;
import model.pojo.Categoria;
import model.pojo.Producto;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.Controller;

public class ProductoDetalleController implements Controller{

    @Override
    public ModelAndView handleRequest(HttpServletRequest hsr, HttpServletResponse hsr1) throws Exception {
        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        
        ModelAndView mv= new ModelAndView("detalleVista");
        int id =Integer.parseInt(hsr.getParameter("idProducto"));
        try {
            
            Producto p = LogocareDAO.getProductoDetalle(id);
            mv.addObject("producto",p);
            
        } catch (Exception e) {
            e.printStackTrace();
        }
        return mv;        
        
    }
    
}
