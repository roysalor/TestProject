/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.test.main;

import com.test.dao.TbVehiculosDAO;
import com.test.model.TbVehiculos;
import java.util.List;


public class Main {

    public static void main(String[] args) {
        TbVehiculosDAO dao = new TbVehiculosDAO();
        List<TbVehiculos> lstVehiculos = dao.selectAll();
        for (TbVehiculos tbVehiculos : lstVehiculos) {
            System.out.println(tbVehiculos.getId() + "\t" + tbVehiculos.getNumeroPlaca());
        }
        
        System.out.println("----------INSERTO DATOS----------");
        
        
        TbVehiculos nuevoVehiculo = new TbVehiculos();
        nuevoVehiculo.setFechaRegistro("2015-09-18");
        nuevoVehiculo.setIdModelo("1");
        nuevoVehiculo.setNumeroPlaca("Porche");
        dao.insert(nuevoVehiculo);
        
        System.out.println("--------------------");
        lstVehiculos = dao.selectAll();
        for (TbVehiculos tbVehiculos : lstVehiculos) {
            System.out.println(tbVehiculos.getId() + "\t" + tbVehiculos.getNumeroPlaca());
        }
    }
}
