package com.sporticiasapp.sporticiasapp.controller;

import com.sporticiasapp.sporticiasapp.models.Marcacao;
import com.sporticiasapp.sporticiasapp.repository.MarcacaoRepository;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class MarcacaoController {

    private MarcacaoRepository mRep;

    @RequestMapping(value = "/marcar", method = RequestMethod.GET)
    public String form(){
        return "cadastro/formMarcacao";
    }

}
