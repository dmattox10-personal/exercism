import java.time.LocalDate;
import java.time.LocalDateTime;
import java.math.BigInteger;

public class Gigaseconds {
    private final LocalDateTime date;
    private static final Long GIGASECOND = BigInteger
            .valueOf(10)
            .pow(9)
            .longValue();

    public Gigaseconds(LocalDate date) {
        this(date.atStartOfDay());
    }

    public Gigaseconds(LocalDateTime date) {
        this.date = date;
    }

    public LocalDateTime getDate() {
        return date.plusSeconds(GIGASECOND);
    }
}