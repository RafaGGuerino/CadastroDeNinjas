package dev.rafagguerino.CadastroDeNinjas.Missoes;

import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class MissaoService {

    private MissaoRepository missaoRepository;

    public MissaoService(MissaoRepository missaoRepository) {this.missaoRepository = missaoRepository;}

    // Listar todas as missões
    public List<MissaoModel> listarMissoes() {

        return missaoRepository.findAll();
    }

    // Listar missões por ID
    public MissaoModel listarMissoesPorID(Long id) {

        Optional<MissaoModel> missao = missaoRepository.findById(id);

        return missao.orElse(null);
    }

    // Criar missão
    public MissaoModel criarMissao(MissaoModel missao) {

        return missaoRepository.save(missao);
    }

    // Deletar missão
    public void deletarMissaoPorID(Long id) {

        missaoRepository.deleteById(id);
    }
}
