package org.auto.org.auto.app.entitys;

import jakarta.persistence.*;
import lombok.Data;

import java.util.UUID;

@Entity
@Data
@Table(name = "sp_auto_type")
public class SpAutoType {
    @Id
    @Column(name = "id")
    @GeneratedValue(strategy = GenerationType.AUTO)
    private UUID id;

    @Column(name = "name")
    private String name;

    @Column(name = "wheel_arr_id")
    private UUID wheelArrId;
}
