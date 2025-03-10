package org.auto.org.auto.app.interfaces;

import org.auto.org.auto.app.entitys.SpAutoType;

import java.util.List;
import java.util.UUID;

public interface ISpAutoTypeService {
    public SpAutoType newRecord(SpAutoType spAutoType);

    public SpAutoType getRecord(UUID uuid);

    public List<SpAutoType> getRecords(String name);

    public SpAutoType remove(UUID uuid);
    public List<SpAutoType> removeAll(String name);

    public List<SpAutoType> getAll();
}

