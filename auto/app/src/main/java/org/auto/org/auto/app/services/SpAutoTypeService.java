package org.auto.org.auto.app.services;

import org.auto.org.auto.app.entitys.SpAutoType;
import org.auto.org.auto.app.interfaces.ISpAutoTypeService;
import org.auto.org.auto.app.repositorys.ISpAutoTypeRepository;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.UUID;

@Service
public class SpAutoTypeService implements ISpAutoTypeService {

    private final ISpAutoTypeRepository spAutoTypeRepository;

    public SpAutoTypeService(ISpAutoTypeRepository spAutoTypeRepository) {
        this.spAutoTypeRepository = spAutoTypeRepository;
    }

    @Override
    public SpAutoType newRecord(SpAutoType spAutoType) {
        return spAutoTypeRepository.save(spAutoType);
    }

    @Override
    public SpAutoType getRecord(UUID uuid) {
        return spAutoTypeRepository.findById(uuid).get();
    }

    @Override
    public List<SpAutoType> getRecords(String name) {
        return spAutoTypeRepository.findAllByName(name);
    }

    @Override
    public SpAutoType remove(UUID uuid) {
        SpAutoType spAutoType = getRecord(uuid);
        spAutoTypeRepository.deleteById(uuid);
        return spAutoType;
    }

    @Override
    public List<SpAutoType> removeAll(String name) {
        List<SpAutoType> spAutoType = getRecords(name);
        spAutoTypeRepository.deleteAll(spAutoType);
        return spAutoType;
    }

    @Override
    public List<SpAutoType> getAll() {
        return spAutoTypeRepository.findAll();
    }
}
