package com.mycompany.atividadepraticasoapsisam.main;

import com.mycompany.atividadepraticasoapsisam.webservicesisam.MesAnoService;
import com.mycompany.atividadepraticasoapsisam.webservicesisam.MesAnoServiceService;
import com.mycompany.atividadepraticasoapsisam.webservicesisam.municipios.CidadesService;
import com.mycompany.atividadepraticasoapsisam.webservicesisam.municipios.CidadesServiceService;
import com.mycompany.atividadepraticasoapsisam.webservicesisam.municipios.PontosMunicipais;
import com.mycompany.atividadepraticasoapsisam.webservicesisam.tabulacao.TabulacaoService;
import com.mycompany.atividadepraticasoapsisam.webservicesisam.tabulacao.TabulacaoServiceService;
import com.mycompany.atividadepraticasoapsisam.webservicesisam.tabulacao.VariaveisView;
import com.mycompany.atividadepraticasoapsisam.webservicesisam.variaveis.VarWebServiceView;
import com.mycompany.atividadepraticasoapsisam.webservicesisam.variaveis.VariaveisService;
import com.mycompany.atividadepraticasoapsisam.webservicesisam.variaveis.VariaveisServiceService;
import java.util.ArrayList;
import java.util.List;

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
//        mesAnoWebService.getAnos().forEach(System.out::println);
        
        CidadesServiceService cidadesServiceService = new CidadesServiceService();
        CidadesService cidadesWebService = cidadesServiceService.getCidadesWebService();
        
        VariaveisServiceService variaveisServiceService = new VariaveisServiceService();
        VariaveisService variaveisWebService = variaveisServiceService.getVariaveisWebService();
        List<VarWebServiceView> listaVariaveis = variaveisWebService.getListaVariaveis();
        listaVariaveis.stream().forEach((listaVariavei) -> {
            System.out.println(listaVariavei.getNome());
        });
        
        TabulacaoServiceService tabulacaoServiceService = new TabulacaoServiceService();
        TabulacaoService tabulacaoWebService = tabulacaoServiceService.getTabulacaoWebService();
        
        String opcData = "ano";
        
        String dataInicial = "2004-12-31";
        
        String dataFinal = "2005-12-31";
        
        List<String> mes = null;
        
        List<String> ano = mesAnoWebService.getAnos();        
        
        String opcEstMun = "municipio";
        
        List<String> estado = null;
        
        List<String> municipio = new ArrayList<>();
        municipio.add("3976");
        
        List<String> vars = new ArrayList<>();
        vars.add("geada");        
        
        List<VariaveisView> dadosTabulados = tabulacaoWebService.getDadosTabulados(opcData, dataInicial, dataFinal, mes, ano, opcEstMun, estado, municipio, vars);
        System.out.println(dadosTabulados.toString());
    }
}
