package wendydeluca.U5D7.entities;

import lombok.*;

import java.time.LocalDate;
@Getter
@Setter
@AllArgsConstructor
@ToString
public class Author {
    @Setter(AccessLevel.NONE)
    private long id;
    private String name;
    private String surname;
    private String email;
    private LocalDate dateOfBirth;
    private String avatar;



}
