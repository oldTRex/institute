package ir.mapsa.institute.model;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;

import java.io.Serializable;

@Getter
@Setter
@NoArgsConstructor
@MappedSuperclass

public abstract class BaseEntity <T extends Serializable>{

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private T id;

    public void setId(T id) {
        this.id = id;
    }

    public T getId() {
        return id;
    }
}
