package az.event.TrackEvent.Entity;

import javax.persistence.Entity;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import lombok.Getter;
import lombok.Setter;

@Entity
@Table(name="Festivals")
@Getter
@Setter
public class Festival extends IdName {
    
    @ManyToOne
    private FestivalType festivalType;

    private int duration;

}
