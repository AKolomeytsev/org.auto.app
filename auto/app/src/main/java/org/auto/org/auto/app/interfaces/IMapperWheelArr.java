package org.auto.org.auto.app.interfaces;

import org.auto.org.auto.app.dto.SpWheelArrDTO;
import org.auto.org.auto.app.entitys.SpWheelArr;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.factory.Mappers;

@Mapper(componentModel = "spring")
public interface IMapperWheelArr {
    IMapperWheelArr INSTANS = Mappers.getMapper(IMapperWheelArr.class);

    /*@Mapping(source = "id",target = "id")
    @Mapping(source = "name", target = "name")
    @Mapping(source = "cntWheel",target = "cntWheel")*/
    SpWheelArrDTO toDto(SpWheelArr spWheelArr);

    /*@Mapping(source = "id",target = "id")
    @Mapping(source = "name", target = "name")
    @Mapping(source = "cntWheel",target = "cntWheel")*/
    SpWheelArr toEntity(SpWheelArrDTO spWheelArrDTO);
}
