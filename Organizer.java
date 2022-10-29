package az.event.TrackEvent.Entity;

import java.util.Set;

import javax.persistence.Entity;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import lombok.Getter;
import lombok.Setter;


@Entity
@Table(name="Organizers")
@Getter
@Setter
public class Organizer extends IdName {

    private String phone;
    
}
