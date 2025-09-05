package sih.backend.sikkim.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import sih.backend.sikkim.model.Booking;
public interface BookingRepository  extends JpaRepository <Booking, Long> {
}
