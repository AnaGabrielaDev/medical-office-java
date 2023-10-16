package br.com.anagabriela.apimed.controller;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.anagabriela.apimed.dtos.DoctorDto;

@RestController
@RequestMapping("doctor")
public class DoctorController {
    @PostMapping
    public void create(@RequestBody DoctorDto doctorParams) {
        System.out.println(doctorParams);
    }
}
