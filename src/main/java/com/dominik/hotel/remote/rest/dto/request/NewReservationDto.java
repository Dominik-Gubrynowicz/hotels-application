package com.dominik.hotel.remote.rest.dto.request;

import com.dominik.hotel.remote.rest.dto.common.PersonDto;
import com.dominik.hotel.remote.rest.dto.common.RoomReservationDto;

import java.util.List;

public class NewReservationDto {
    private List<RoomReservationDto> hotels;
    private PersonDto person;

    public NewReservationDto(List<RoomReservationDto> hotels, PersonDto person) {
        this.hotels = hotels;
        this.person = person;
    }

    public List<RoomReservationDto> getHotels() {
        return hotels;
    }

    public void setHotels(List<RoomReservationDto> hotels) {
        this.hotels = hotels;
    }

    public PersonDto getPerson() {
        return person;
    }

    public void setPerson(PersonDto person) {
        this.person = person;
    }
}
