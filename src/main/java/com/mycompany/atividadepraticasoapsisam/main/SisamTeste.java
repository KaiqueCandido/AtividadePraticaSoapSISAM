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

        CidadesServiceService cidadesServiceService = new CidadesServiceService();
        CidadesService cidadesWebService = cidadesServiceService.getCidadesWebService();

        VariaveisServiceService variaveisServiceService = new VariaveisServiceService();
        VariaveisService variaveisWebService = variaveisServiceService.getVariaveisWebService();

        TabulacaoServiceService tabulacaoServiceService = new TabulacaoServiceService();
        TabulacaoService tabulacaoWebService = tabulacaoServiceService.getTabulacaoWebService();

        String opcData = "mes";
        String dataInicial = "2004-01-01";
        String dataFinal = "2015-08-01";
        List<String> mes = mesAnoWebService.getMeses();
        List<String> ano = null;
        String opcEstMun = "municipio";
        List<String> estado = null;

        List<PontosMunicipais> municipiosDeJoaoPessoa = cidadesWebService.getMunicipios("João Pessoa");
        ArrayList<String> municipios = new ArrayList<>();
        municipiosDeJoaoPessoa.stream().forEach((m) -> {
            municipios.add(m.getNome());
        });

        List<VarWebServiceView> listaVariaveis = variaveisWebService.getListaVariaveis();
        ArrayList<String> variaveis = new ArrayList<>();
        listaVariaveis.stream().forEach((v) -> {
            variaveis.add(v.getNome());
        });

        List<VariaveisView> dadosTabulados = tabulacaoWebService.getDadosTabulados(opcData, dataInicial, dataFinal, mes, ano, opcEstMun, estado, municipios, variaveis);
        dadosTabulados.stream().forEach((dados) -> {
            System.out.println(dados.toString());
        });
    }
}
