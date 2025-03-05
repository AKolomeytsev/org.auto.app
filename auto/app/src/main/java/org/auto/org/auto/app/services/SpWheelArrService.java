package org.auto.org.auto.app.services;

import org.auto.org.auto.app.dto.SpWheelArrDTO;
import org.auto.org.auto.app.entitys.SpWheelArr;
import org.auto.org.auto.app.interfaces.IMapperWheelArr;
import org.auto.org.auto.app.interfaces.ISpWheelArrSevice;
import org.auto.org.auto.app.repositorys.ISpWheelArrRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.UUID;

@Service
public class SpWheelArrService implements ISpWheelArrSevice {

    @Autowired
    private final ISpWheelArrRepository spWheelArrRepository;

    public SpWheelArrService(ISpWheelArrRepository spWheelArrRepository) {
        this.spWheelArrRepository = spWheelArrRepository;
    }

    @Override
    public SpWheelArr newRecord(SpWheelArr spWheelArr) {
        return spWheelArrRepository.save(spWheelArr);
    }

    @Override
    public SpWheelArr getRecord(UUID uuid) {
        return spWheelArrRepository.findById(uuid).get();
    }

    @Override
    public SpWheelArr removeRecord(UUID uuid) {
        return null;
    }

    @Override
    public SpWheelArr getRecord(String name) {
        return spWheelArrRepository.findByName(name);
    }

    @Override
    public List<SpWheelArr> getRecords(int cnt) {
        return spWheelArrRepository.findByCntWheel(cnt);
    }

    @Override
    public SpWheelArr remove(UUID uuid) {
        SpWheelArr spWheelArr = getRecord(uuid);
        spWheelArrRepository.deleteById(uuid);
        return spWheelArr;
    }

    @Override
    public SpWheelArr remove(String name) {
        SpWheelArr spWheelArr = getRecord(name);
        spWheelArrRepository.delete(spWheelArr);
        return spWheelArr;
    }

    @Override
    public List<SpWheelArr> getAll() {
        return spWheelArrRepository.findAll();
    }
}
