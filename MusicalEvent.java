package az.event.TrackEvent.Entity;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.util.Set;

import javax.persistence.*;

import org.springframework.lang.Nullable;

import lombok.Getter;
import lombok.Setter;

@Entity
@Table(name="MusicalEvents")
@Getter
@Setter
public class MusicalEvent extends IdName{


    @OneToOne
    private Place place;

    @ManyToOne
    private Organizer organizer;

    @Nullable
    @ManyToMany
    private Set<Band> band;

    @ManyToMany
    @Nullable
    private Set<Musician> musician;

    private boolean isPaid;

    private BigDecimal price;

    @Nullable
    @ManyToOne
    private Festival festival;

    private LocalDate beginDate;

    private LocalDate endDate;

    private int participantLimit;
    
    // @OneToMany
    // private Image image;

    private String description;
  
}