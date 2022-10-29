package az.event.TrackEvent.Entity;

import javax.persistence.Entity;
import javax.persistence.Table;

import lombok.Getter;
import lombok.Setter;


@Entity
@Table(name="FestivalTypes")
@Getter
@Setter
public class FestivalType  extends IdName {
    private String type;
}
