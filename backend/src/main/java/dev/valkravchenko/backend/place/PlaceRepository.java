package dev.valkravchenko.backend.place;

import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public class PlaceRepository {

    private final List<Place> places = List.of(
            new Place(1L, "Raja Ampat", "ID"),
            new Place(2L, "Great Barrier Reef", "AU"),
            new Place(3L, "Galapagos", "EC")
    );

    public List<Place> findAll() {
        return places;
    }

    public Optional<Place> findById(Long id) {
        return places.stream()
                .filter(place -> place.id().equals(id))
                .findFirst();
    }
}
