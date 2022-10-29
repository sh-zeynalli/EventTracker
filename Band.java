package az.event.TrackEvent.Entity
;
import java.util.Set;

import javax.persistence.Entity;
import javax.persistence.ManyToMany;
import javax.persistence.Table;

import lombok.Getter;
import lombok.Setter;

@Entity
@Table(name="Bands")
@Getter
@Setter
public class Band extends IdName {

    @ManyToMany
    private Set<Music> music;

    @ManyToMany
    private Set<Musician> musician;

    


}
