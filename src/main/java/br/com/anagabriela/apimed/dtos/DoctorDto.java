package br.com.anagabriela.apimed.dtos;

public record DoctorDto(String name, String email, String crm, SpecialtyDto specialty, AddressDto addressDto) {
}
