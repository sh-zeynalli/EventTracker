package az.event.TrackEvent.Entity;

import javax.persistence.Entity;
import javax.persistence.Table;

import lombok.Getter;
import lombok.Setter;


@Entity
@Table(name="Places")
@Getter
@Setter
public class Place  extends IdName {

    private String address;
    private String phone;
    
    private String description;

    //menu functionality
}
