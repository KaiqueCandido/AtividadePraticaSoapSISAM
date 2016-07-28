package com.mycompany.atividadepraticasoapsisam.main;

import com.mycompany.atividadepraticasoapsisam.webservicesisam.MesAnoService;
import com.mycompany.atividadepraticasoapsisam.webservicesisam.MesAnoServiceService;
import com.mycompany.atividadepraticasoapsisam.webservicesisam.municipios.CidadesService;
import com.mycompany.atividadepraticasoapsisam.webservicesisam.municipios.CidadesServiceService;
import com.mycompany.atividadepraticasoapsisam.webservicesisam.municipios.Estados;
import com.mycompany.atividadepraticasoapsisam.webservicesisam.variaveis.VarDescWebServiceView;
import com.mycompany.atividadepraticasoapsisam.webservicesisam.variaveis.VariaveisService;
import com.mycompany.atividadepraticasoapsisam.webservicesisam.variaveis.VariaveisServiceService;
import java.util.List;
import java.util.function.Consumer;

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
        mesAnoWebService.getAnos().forEach(System.out::println);

        CidadesServiceService cidadesServiceService = new CidadesServiceService();
        CidadesService cidadesWebService = cidadesServiceService.getCidadesWebService();
        cidadesWebService.getEstados().forEach(e -> System.out.println(e.getEstado()));

        VariaveisServiceService variaveisServiceService = new VariaveisServiceService();
        VariaveisService variaveisWebService = variaveisServiceService.getVariaveisWebService();
        variaveisWebService.getListaVariaveisDesc().forEach(t -> System.out.println(t.getNome()));

    }

}
