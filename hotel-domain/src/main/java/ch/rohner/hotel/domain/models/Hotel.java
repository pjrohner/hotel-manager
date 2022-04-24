package ch.rohner.hotel.domain.models;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Hotel {

    public Hotel(String name, int stars, boolean hotelOpen) {
        this.name = name;
        this.stars = stars;
        this.hotelOpen = hotelOpen;
    }

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    private String name;
    private int stars;
    private boolean hotelOpen;
    private String remark;
}
