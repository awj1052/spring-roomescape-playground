package roomescape.exception;

public class ReservationException extends RuntimeException {

    public ReservationException(ReservationErrorMessage errorMessage) {
        super(errorMessage.getMessage());
    }
}