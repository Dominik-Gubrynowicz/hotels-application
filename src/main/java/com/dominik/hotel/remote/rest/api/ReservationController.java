package com.dominik.hotel.remote.rest.api;

import com.dominik.hotel.domain.model.ReservationStatusType;
import com.dominik.hotel.remote.rest.dto.common.PersonDto;
import com.dominik.hotel.remote.rest.dto.common.RoomReservationDto;
import com.dominik.hotel.remote.rest.dto.response.ReservationDto;
import com.dominik.hotel.remote.rest.dto.response.ReservationCollectionDto;
import com.dominik.hotel.remote.rest.dto.response.TokenDto;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

import static org.springframework.http.MediaType.APPLICATION_JSON_VALUE;

@RequestMapping(value = "/api/v1/reservations", produces = APPLICATION_JSON_VALUE)
@RestController
public class ReservationController {

    @PostMapping
    public ResponseEntity<TokenDto> newReservation(@RequestBody ReservationDto reservationDto) {
        TokenDto tokenDto = new TokenDto("sample_token");
        return ResponseEntity.ok(tokenDto);
    }

    @GetMapping
    public ResponseEntity<ReservationCollectionDto> getReservation(
            @RequestParam("status") ReservationStatusType reservationStatusType,
            @RequestHeader("Access-Token") String token
    ) {
        RoomReservationDto roomReservationDto = new RoomReservationDto(3, 1, 5);
        PersonDto personDto = new PersonDto("Jan Kowalski", "123456", "Branickiego 34/2", 1);
        ReservationDto reservationDto = new ReservationDto(1, ReservationStatusType.NEW, List.of(roomReservationDto), personDto);
        ReservationCollectionDto reservationCollectionDto = new ReservationCollectionDto(List.of(reservationDto));
        return ResponseEntity.ok(reservationCollectionDto);
    }

    @DeleteMapping("/{reservation-id}")
    public ResponseEntity<Void> deleteReservation(
            @RequestHeader("Access-Token") String token,
            @PathVariable("reservation-id") Integer reservationId
    ) {
        return ResponseEntity.ok().build();
    }
}
