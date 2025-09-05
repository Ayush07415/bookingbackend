package sih.backend.sikkim.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import sih.backend.sikkim.model.TourPackage;
public interface TourPackageRepository extends JpaRepository<TourPackage, String> {
}
