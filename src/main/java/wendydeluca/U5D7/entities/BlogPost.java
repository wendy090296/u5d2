package wendydeluca.U5D7.entities;

import lombok.*;

@Getter
@Setter
@AllArgsConstructor
@ToString
public class BlogPost {
//    @Setter(AccessLevel.NONE)
    private long id;
    private String category;
    private String title;
    private String cover;
    private String content;
    private int timeOfReading;
}
