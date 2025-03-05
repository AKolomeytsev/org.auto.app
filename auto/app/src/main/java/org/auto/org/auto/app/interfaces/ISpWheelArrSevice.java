package org.auto.org.auto.app.interfaces;

import org.auto.org.auto.app.dto.SpWheelArrDTO;
import org.auto.org.auto.app.entitys.SpWheelArr;

import java.util.List;
import java.util.UUID;

public interface ISpWheelArrSevice {
    public SpWheelArr newRecord(SpWheelArr spWheelArr);

    public SpWheelArr getRecord(UUID uuid);

    public  SpWheelArr removeRecord(UUID uuid);

    public  SpWheelArr getRecord(String name);

    public List<SpWheelArr> getRecords(int cnt);

    public SpWheelArr remove(UUID uuid);
    public SpWheelArr remove(String name);

    public List<SpWheelArr> getAll();
}
