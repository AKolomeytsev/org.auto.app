package org.auto.org.auto.app.repositorys;

import org.auto.org.auto.app.entitys.SpWheelArr;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;
import java.util.UUID;

public interface ISpWheelArrRepository extends JpaRepository<SpWheelArr, UUID> {
    public SpWheelArr findByName(String name);

    public List<SpWheelArr> findByCntWheel(int cnt);

    public void deleteByName(String name);
}

