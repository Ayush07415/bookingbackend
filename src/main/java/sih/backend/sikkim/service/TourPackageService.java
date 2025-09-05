package sih.backend.sikkim.service;

import org.springframework.stereotype.Service;
import sih.backend.sikkim.model.TourPackage;
import sih.backend.sikkim.repository.TourPackageRepository;

import java.util.List;

@Service
public class TourPackageService {

    private final TourPackageRepository tourPackageRepository;

    // Standard constructor for dependency injection
    public TourPackageService(TourPackageRepository tourPackageRepository) {
        this.tourPackageRepository = tourPackageRepository;
    }

    public List<TourPackage> getAllPackages() {
        return tourPackageRepository.findAll();
    }
}
