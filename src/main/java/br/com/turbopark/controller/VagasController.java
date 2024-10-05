package br.com.turbopark.controller;

import br.com.turbopark.repository.VagaRepository;
import org.apache.coyote.Response;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("vagas")
public class VagasController {

    @Autowired
    private VagaRepository vagaRepository;

    @GetMapping
        public ResponseEntity<?> buscarVagas() {
            return ResponseEntity.ok(vagaRepository.findAll());
        }
}


