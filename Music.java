package az.event.TrackEvent.Entity;

import javax.persistence.ManyToOne;

import javax.persistence.Entity;
import javax.persistence.Table;

import lombok.Getter;
import lombok.Setter;


@Entity
@Table(name="Musics")
@Getter
@Setter
public class Music extends IdName {

    
    @ManyToOne
    private MusicType musicType;

    private String originalSinger;

}
