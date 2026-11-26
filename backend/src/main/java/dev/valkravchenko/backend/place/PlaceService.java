package dev.valkravchenko.backend.place;

import org.springframework.stereotype.Service;

import java.util.Comparator;
import java.util.List;
import java.util.Optional;

@Service
public class PlaceService {

    private final PlaceRepository placeRepository;


    public PlaceService(PlaceRepository placeRepository) {
        this.placeRepository = placeRepository;
    }

    public List<Place> fidAll() {
        return placeRepository.findAll().stream()
                .sorted(Comparator.comparing(Place::name))
                .toList();
    }

    public Optional<Place> fidById(Long id) {
        return placeRepository.findById(id);
    }
}
