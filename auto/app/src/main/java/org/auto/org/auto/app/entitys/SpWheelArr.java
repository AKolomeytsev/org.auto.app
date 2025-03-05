package org.auto.org.auto.app.entitys;

import jakarta.persistence.*;
import lombok.Data;

import java.util.UUID;

@Entity
@Table(name = "sp_wheel_arr")
@Data
public class SpWheelArr {
    @Id
    @Column(name = "id")
    @GeneratedValue(strategy = GenerationType.AUTO)
    private UUID id;

    @Column(name = "name")
    private String name;

    @Column(name="cnt_wheel")
    private int cntWheel;
}
