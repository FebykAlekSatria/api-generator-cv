package string_sout.restful_jpa.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Setter
@Getter
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "languages")
public class Language {

    @Id
    private String id;

    private String language;

    private String level;

    @ManyToOne
    @JoinColumn(name = "user_id", referencedColumnName ="id")
    private User user;
}
