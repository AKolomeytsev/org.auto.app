package org.auto.org.auto.app.controllers;

import org.auto.org.auto.app.dto.SpAutoTypeDTO;
import org.auto.org.auto.app.entitys.SpAutoType;
import org.auto.org.auto.app.interfaces.IMapperAutoType;
import org.auto.org.auto.app.services.SpAutoTypeService;
import org.mapstruct.Mapper;
import org.springframework.web.bind.annotation.*;

import java.util.Collections;
import java.util.List;
import java.util.UUID;

@RestController
@RequestMapping("/auto_type")
public class SpAutoTypeController {
    private final SpAutoTypeService autoTypeService;

    public SpAutoTypeController (SpAutoTypeService autoTypeService){
        this.autoTypeService = autoTypeService;
    }

    @GetMapping("/getAll/")
    public List<SpAutoType> getAllSpAutoType(){
        return autoTypeService.getAll();
    }

    @GetMapping("/get/{uuid}")
    public SpAutoTypeDTO getSpAutoTypeById(@PathVariable("uuid")UUID id){
        return IMapperAutoType.INSTANS.toDto(autoTypeService.getRecord(id));
    }

    @GetMapping("/getByName/{name}")
    public List<SpAutoType> getSpAutoTypeByName(@PathVariable("name") String name){
        return autoTypeService.getRecords(name);
    }

    @PostMapping(path = "/add/")
    public SpAutoTypeDTO addSpAutoType(@RequestBody SpAutoTypeDTO spAutoTypeDTO){
        SpAutoType sAutoType = IMapperAutoType.INSTANS.toEntity(spAutoTypeDTO);
        return IMapperAutoType.INSTANS.toDto(autoTypeService.newRecord(sAutoType));
    }

    @PutMapping(path = "/put/")
    public SpAutoTypeDTO putSpAutoType(@RequestBody SpAutoTypeDTO spAutoTypeDTO){
        SpAutoType spAutoType = IMapperAutoType.INSTANS.toEntity(spAutoTypeDTO);
        return IMapperAutoType.INSTANS.toDto(autoTypeService.newRecord(spAutoType));
    }

    @DeleteMapping("/delete/{uuid}")
    public SpAutoTypeDTO deleteSpAutoTypeById(@PathVariable("uuid") UUID id){
        return IMapperAutoType.INSTANS.toDto(autoTypeService.remove(id));
    }

    @DeleteMapping("/deleteByName/{name}")
    public List<SpAutoType> deleteSpAutoTypeByName(@PathVariable("name") String name){
        return autoTypeService.removeAll(name);
    }
}
