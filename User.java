package az.event.TrackEvent.Entity;

import java.util.Set;

import javax.persistence.*;

import lombok.Getter;
import lombok.Setter;

@Entity
@Table(name="Users")
@Getter
@Setter
public class User extends IdName {

    
    private String username;
    private String email;
    @ManyToMany
    private Set<Role> role;

    private String password;
    
}
