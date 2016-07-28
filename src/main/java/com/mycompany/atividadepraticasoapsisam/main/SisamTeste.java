package com.mycompany.atividadepraticasoapsisam.main;

import com.mycompany.atividadepraticasoapsisam.webservicesisam.MesAnoService;
import com.mycompany.atividadepraticasoapsisam.webservicesisam.MesAnoServiceService;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Luciana
 */
public class SisamTeste {
    public static void main(String[] args) {
        MesAnoServiceService mesAnoService = new MesAnoServiceService();
        MesAnoService mesAnoWebService = mesAnoService.getMesAnoWebService();
        
        System.out.println("Resultado:" + mesAnoWebService.getAnos());
    }
    
}
