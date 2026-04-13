package dev.rafagguerino.CadastroDeNinjas.Ninjas;

import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class NinjaService {

    private NinjaRepository ninjaRepository;

    public NinjaService(NinjaRepository ninjaRepository) {
        this.ninjaRepository = ninjaRepository;
    }

    // Listar todos os ninjas
    public List<NinjaModel> listarNinjas() {

        return ninjaRepository.findAll();
    }

    // Listar ninjas por ID
    public NinjaModel listarNinjaPorID(Long id) {

        Optional<NinjaModel> ninjaPorID = ninjaRepository.findById(id);

        return ninjaPorID.orElse(null);
    }

    public NinjaModel crirarNinja(NinjaModel ninjaModel) {
        return ninjaRepository.save(ninjaModel);
    }

    // Deletar ninjas por ID -- Tem que ser VOID
    public void deletarNinjaPorID(Long id) {

        ninjaRepository.deleteById(id);
    }

    // Atualizar Ninja
    public NinjaModel atualizarNinja(Long id, NinjaModel ninjaModel) {

        if (ninjaRepository.existsById(id)) {
            ninjaModel.setId(id);
            return ninjaRepository.save(ninjaModel);
        }
        return null;
    }
}
