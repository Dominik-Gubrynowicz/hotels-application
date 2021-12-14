package com.dominik.hotel.remote.rest.dto.response;

import com.dominik.hotel.domain.model.ReservationStatusType;
import com.dominik.hotel.remote.rest.dto.common.PersonDto;
import com.dominik.hotel.remote.rest.dto.common.RoomReservationDto;

import java.util.List;

public class ReservationDto {
    private Integer id;
    private ReservationStatusType status;
    private List<RoomReservationDto> rooms;
    private PersonDto person;

    public ReservationDto(Integer id, ReservationStatusType status, List<RoomReservationDto> rooms, PersonDto person) {
        this.id = id;
        this.status = status;
        this.rooms = rooms;
        this.person = person;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public ReservationStatusType getStatus() {
        return status;
    }

    public void setStatus(ReservationStatusType status) {
        this.status = status;
    }

    public List<RoomReservationDto> getRooms() {
        return rooms;
    }

    public void setRooms(List<RoomReservationDto> rooms) {
        this.rooms = rooms;
    }

    public PersonDto getPerson() {
        return person;
    }

    public void setPerson(PersonDto person) {
        this.person = person;
    }
}