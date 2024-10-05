package br.com.turbopark.controller;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

public class TicketController {

    @RestController
    @RequestMapping("tickets")
    public class TicketsController {

        @PostMapping
        public String criarTicket() {
            return "ola mundo";
        }
    }

}
