package az.event.TrackEvent.Entity;

import java.time.LocalDate;

import javax.persistence.*;

import lombok.Getter;
import lombok.Setter;

@Entity
@Table(name="UserRefreshToken")
@Getter
@Setter
public class UserRefreshToken extends IdName {

    private String refreshToken;
    private boolean isDeleted;
    private LocalDate expireDate;
    @OneToOne
    private User user;


}
