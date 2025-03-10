package org.auto.org.auto.app.interfaces;

import org.auto.org.auto.app.dto.SpAutoTypeDTO;
import org.auto.org.auto.app.entitys.SpAutoType;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.factory.Mappers;

@Mapper(componentModel = "spring")
public interface IMapperAutoType {
    IMapperAutoType INSTANS = Mappers.getMapper(IMapperAutoType.class);

    @Mapping(source = "id",target = "id")
    @Mapping(source = "name", target = "name")
    @Mapping(source = "wheelArrId",target = "wheelArrId")
    SpAutoTypeDTO toDto(SpAutoType spAutoType);

    @Mapping(source = "id",target = "id")
    @Mapping(source = "name", target = "name")
    @Mapping(source = "wheelArrId",target = "wheelArrId")
    SpAutoType toEntity(SpAutoTypeDTO spAutoTypeDTO);
}
