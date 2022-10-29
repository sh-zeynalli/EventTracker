package az.event.TrackEvent.Entity;

import javax.persistence.Entity;
import javax.persistence.Table;

import lombok.Getter;
import lombok.Setter;


@Entity
@Table(name="MusicTypes")
@Getter
@Setter
public class MusicType extends IdName {
    
}
