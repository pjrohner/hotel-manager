package ch.rohner.hotel.api.controllers;

import ch.rohner.hotel.domain.models.Hotel;
import ch.rohner.hotel.persistence.repos.HotelRepository;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/hotels")
@Slf4j
public class HotelController {
    private HotelRepository hotelRepository;

    public HotelController(final HotelRepository hotelRepository) {
        log.info("c'tor>");
        this.hotelRepository = hotelRepository;
        log.info("c'tor<");
    }

    @GetMapping
    public ResponseEntity<List<Hotel>> getHotels() {
        log.info("getHotels>");
        List<Hotel> hotels = this.hotelRepository.findAll();

        hotels.stream().forEach(System.out::println);
        log.info("getHotels<");
        return ResponseEntity.ok(hotels);
    }
}
