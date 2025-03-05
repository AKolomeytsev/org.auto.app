package org.auto.org.auto.app.controllers;

import org.auto.org.auto.app.dto.SpWheelArrDTO;
import org.auto.org.auto.app.entitys.SpWheelArr;
import org.auto.org.auto.app.interfaces.IMapperWheelArr;
import org.auto.org.auto.app.services.SpWheelArrService;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.UUID;

@RestController
@RequestMapping("/wheelarr")
public class SpWheelArrController {

    private final SpWheelArrService spWheelArrService;

    public SpWheelArrController(SpWheelArrService spWheelArrService) {
        this.spWheelArrService = spWheelArrService;
    }

    @PostMapping(path = "/add/")
    public SpWheelArrDTO addWheelArr(@RequestBody SpWheelArrDTO spWheelArrDTO){
        SpWheelArrDTO wheelArrDTO = IMapperWheelArr.INSTANS.toDto(spWheelArrService.newRecord(IMapperWheelArr.INSTANS.toEntity(spWheelArrDTO)));
        return wheelArrDTO;
    }

    @PutMapping(path = "/put/")
    public SpWheelArrDTO putWheelArr(@RequestBody SpWheelArrDTO spWheelArrDTO){
        SpWheelArrDTO wheelArrDTO = IMapperWheelArr.INSTANS.toDto(spWheelArrService.newRecord(IMapperWheelArr.INSTANS.toEntity(spWheelArrDTO)));
        return wheelArrDTO;
    }

    @GetMapping("/getAll/")
    public List<SpWheelArr> getAll(){
        return spWheelArrService.getAll();
    }
    @GetMapping("/get/{string}")
    public SpWheelArrDTO getSpWheelArr(@PathVariable("string") UUID uuid){
        return IMapperWheelArr.INSTANS.toDto(spWheelArrService.getRecord(uuid));
    }

    @GetMapping("/getByName/{name}")
    public SpWheelArrDTO getByNameSpWheelArr(@PathVariable("name") String name){
        return IMapperWheelArr.INSTANS.toDto(spWheelArrService.getRecord(name));
    }

    @GetMapping("/getByCntWheel/{cnt}")
    public List<SpWheelArr> getByNameSpWheelArr(@PathVariable("cnt") int cnt){
        return spWheelArrService.getRecords(cnt);
    }

    @DeleteMapping("/delete/{uuid}")
    public SpWheelArrDTO removeSpWheelArr(@PathVariable("uuid") UUID uuid){
        return IMapperWheelArr.INSTANS.toDto(spWheelArrService.remove(uuid));
    }

    @DeleteMapping("/deleteByName/{name}")
    public SpWheelArrDTO removeSpWheelArr(@PathVariable("name") String name){
        return IMapperWheelArr.INSTANS.toDto(spWheelArrService.remove(name));
    }

}
