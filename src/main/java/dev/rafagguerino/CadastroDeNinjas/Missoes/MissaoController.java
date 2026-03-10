package dev.rafagguerino.CadastroDeNinjas.Missoes;

import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("missoes")
public class MissaoController {

    // localhost:8080/missoes/*

    // GET --> mandar uma requisição para mostrar as missões
    @GetMapping("/listar")
    public String listarMissoes() {
        return "Lista de missoes";
    }

    // POST --> mandar uma requisição para criar as missões
    @PostMapping("/criar")
    public String criarMissao() {
        return "Criando a missao";
    }

    // PUT --> mandar uma requisição para alterar as missões
    @PutMapping("/alterar")
    public String alterarMissao() {
        return "Alterando a missao";
    }

    // DELETE --> mandar uma requisição para deletar as missões
    @DeleteMapping("/deletar")
    public String deletarMissao() {
        return "Deletando a missao";
    }

}
