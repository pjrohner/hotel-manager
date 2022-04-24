package ch.rohner.hotel.persistence;

import ch.rohner.hotel.domain.models.Hotel;
import ch.rohner.hotel.persistence.repos.HotelRepository;
import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@Component
@Slf4j
public class DbSeeder implements CommandLineRunner {
    private HotelRepository hotelRepository;

    public DbSeeder(HotelRepository hotelRepository) {
        this.hotelRepository = hotelRepository;
    }

    @Override
    public void run(String... args) throws Exception {
        log.info("run>");
        Hotel hilton = new Hotel("Hilton, Basel", 4, true);
        Hotel dreiKoenig = new Hotel("Hotel drei Könige, Basel", 4, true);
        Hotel ibis = new Hotel("Ibis Hotel, Basel", 3, true);

        Hotel movenpick = new Hotel("Mövenpick, Basel", 2, false);
        movenpick.setRemark("Lobby under construction, reopen in mid 2022.");

        List<Hotel> hotels = new ArrayList<>();
        hotels.add(hilton);
        hotels.add(dreiKoenig);
        hotels.add(ibis);
        hotels.add(movenpick);

        log.info("saving all hotels ..");
        this.hotelRepository.saveAll(hotels);
        log.info("run<");
    }
}
