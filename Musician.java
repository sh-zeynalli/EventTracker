package az.event.TrackEvent.Entity;

import java.util.Set;

import javax.persistence.ManyToMany;

import org.springframework.lang.Nullable;

import javax.persistence.Entity;
import javax.persistence.Table;

import lombok.Getter;
import lombok.Setter;


@Entity
@Table(name="Musicians")
@Getter
@Setter
public class Musician  extends IdName {

    @ManyToMany
    private Set<Music> music;

    private String speciality;

    @Nullable
    @ManyToMany
    private Set<Band> band;

}
