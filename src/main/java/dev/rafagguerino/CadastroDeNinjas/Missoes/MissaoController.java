package dev.rafagguerino.CadastroDeNinjas.Missoes;

import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/missoes")
public class MissaoController {

    // localhost:8080/missoes/*

    // GET --> mandar uma requisição para mostrar as missões
    @GetMapping("/listar")
    public String listarMissoes() {
        return "Lista de missoes";
    }

    @GetMapping("/listarID")
    public String listarMissoesPorID() {
        return "Lista de missoes por ID";
    }

    // POST --> mandar uma requisição para criar as missões
    @PostMapping("/criar")
    public String criarMissao() {
        return "Criando a missao";
    }

    // PUT --> mandar uma requisição para alterar as missões
    @PutMapping("/alterarID")
    public String alterarMissaoPorID() {
        return "Alterando a missao por ID";
    }

    // DELETE --> mandar uma requisição para deletar as missões
    @DeleteMapping("/deletarID")
    public String deletarMissaoPorID() {
        return "Deletando a missao por ID";
    }

}
