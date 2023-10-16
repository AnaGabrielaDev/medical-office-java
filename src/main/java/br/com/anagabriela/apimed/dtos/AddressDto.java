package br.com.anagabriela.apimed.dtos;

public record AddressDto(
        String street, String neighborhood, String cep,
        String city, String state, String number, String complement) {
}
