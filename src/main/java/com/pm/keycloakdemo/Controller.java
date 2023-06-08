package com.pm.keycloakdemo;

import lombok.extern.slf4j.Slf4j;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import java.time.LocalDate;

@RestController
@Slf4j
@CrossOrigin
public class Controller {

    public Controller() {
        show();
    }

    @PostMapping("")
    public ResponseEntity<?> show() {
        LocalDate startDate = LocalDate.now().minusMonths(1).withDayOfMonth(1);
        LocalDate endDate = LocalDate.now().minusMonths(1).withDayOfMonth(startDate.lengthOfMonth());

        log.info("Start date : {}, and end date {}", startDate, endDate);
        return ResponseEntity.badRequest().body("mhrr ny tl ");
    }
}
