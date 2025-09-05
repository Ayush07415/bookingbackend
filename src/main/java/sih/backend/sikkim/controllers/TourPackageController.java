package sih.backend.sikkim.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import sih.backend.sikkim.model.TourPackage;
import sih.backend.sikkim.service.TourPackageService;
import java.util.List;

@RestController
@RequestMapping("/api/packages")
public class TourPackageController {

    private final TourPackageService tourPackageService;

    public TourPackageController(TourPackageService tourPackageService) {
        this.tourPackageService = tourPackageService;
    }

    @GetMapping
    public List<TourPackage> getAllPackages() {
        return tourPackageService.getAllPackages();
    }
}

