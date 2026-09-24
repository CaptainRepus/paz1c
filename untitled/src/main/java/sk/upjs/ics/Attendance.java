package sk.upjs.ics;

import sk.upjs.ics.User;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.List;

public record Attendance(
        Long id,
        LocalDate date,
        Subject subject,
        List<User> attendees
) {
    static void main() {
        System.out.println("LocalDateTime: " + LocalDateTime.now());
    }
}
