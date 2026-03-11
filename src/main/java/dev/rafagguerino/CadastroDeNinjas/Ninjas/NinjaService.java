package dev.rafagguerino.CadastroDeNinjas.Ninjas;

import org.springframework.stereotype.Service;

import java.util.Collections;
import java.util.List;

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
    public NinjaModel listarNinjaPorID(long id) {

        return ninjaRepository.findById(id).get();
    }
}
