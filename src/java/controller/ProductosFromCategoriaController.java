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
import model.pojo.Producto;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.Controller;

public class ProductosFromCategoriaController implements Controller{
    @Override
    public ModelAndView handleRequest(HttpServletRequest hsr, HttpServletResponse hsr1) throws Exception {
        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.        
                
        ModelAndView mv= new ModelAndView("productosFromCategoriaVista");
        int categoria;
        try {
            
            categoria=Integer.parseInt(hsr.getParameter("categoriaId"));
            List<Producto> lista=LogocareDAO.getProductos(categoria);
            mv.addObject("productosFromCategoria",lista);            
            mv.addObject("idCategoria",categoria);            
            for (int i = 0; i < lista.size(); i++) {
                System.out.println(lista.get(i).getNombre());                
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return mv;
    }       
}
