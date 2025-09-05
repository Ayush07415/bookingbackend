package sih.backend.sikkim.service;

import org.springframework.stereotype.Service;
import sih.backend.sikkim.dto.BookingRequest;
import sih.backend.sikkim.model.Booking;
import sih.backend.sikkim.repository.BookingRepository;

import java.util.List;

@Service
public class BookingService {
    private final BookingRepository bookingRepository;

    public BookingService(BookingRepository bookingRepository) {
        this.bookingRepository = bookingRepository;
    }

    public Booking createBooking(BookingRequest request) {
        Booking booking = new Booking();
        booking.setFullName(request.getFullName());
        booking.setEmail(request.getEmail());
        booking.setPhone(request.getPhone());
        booking.setCheckInDate(request.getCheckInDate());
        booking.setCheckOutDate(request.getCheckOutDate());
        booking.setGuests(request.getGuests());
        booking.setPackageId(request.getPackageId());
        booking.setTotalPrice(request.getTotalPrice());
        booking.setStatus("PENDING");
        return bookingRepository.save(booking);
    }

    public List<Booking> getAllBookings() {
        return bookingRepository.findAll();
    }
}


