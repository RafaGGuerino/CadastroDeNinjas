package dev.rafagguerino.CadastroDeNinjas.Missoes;

import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/missoes")
public class MissaoController {

    // localhost:8080/missoes/*

    private MissaoService missaoService;

    public MissaoController(MissaoService missaoService) {this.missaoService = missaoService;}

    // GET --> mandar uma requisição para mostrar as missões
    @GetMapping("/listar")
    public List<MissaoModel> listarMissoes() {
        return missaoService.listarMissoes();
    }

    @GetMapping("/listar/{id}")
    public MissaoModel listarMissoesPorID(@PathVariable Long id) {
        return missaoService.listarMissoesPorID(id);
    }

    // POST --> mandar uma requisição para criar as missões
    @PostMapping("/criar")
    public MissaoModel criarMissao(@RequestBody MissaoModel missao) {
        return missaoService.criarMissao(missao);
    }

    // PUT --> mandar uma requisição para alterar as missões
    @PutMapping("/alterar/{id}")
    public MissaoModel alterarMissaoPorID(@PathVariable Long id, @RequestBody MissaoModel missao) {
        return missaoService.atualizaMissao(id, missao);
    }

    // DELETE --> mandar uma requisição para deletar as missões
    @DeleteMapping("/deletar/{id}")
    public void deletarMissaoPorID(@PathVariable Long id) {
        missaoService.deletarMissaoPorID(id);
    }

}
