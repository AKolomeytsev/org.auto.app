package org.auto.org.auto.app.interfaces;

import javax.annotation.processing.Generated;
import org.auto.org.auto.app.dto.SpWheelArrDTO;
import org.auto.org.auto.app.entitys.SpWheelArr;
import org.springframework.stereotype.Component;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2025-03-05T21:06:33+0300",
    comments = "version: 1.5.5.Final, compiler: javac, environment: Java 17.0.8 (Oracle Corporation)"
)
@Component
public class IMapperWheelArrImpl implements IMapperWheelArr {

    @Override
    public SpWheelArrDTO toDto(SpWheelArr spWheelArr) {
        if ( spWheelArr == null ) {
            return null;
        }

        SpWheelArrDTO spWheelArrDTO = new SpWheelArrDTO();

        return spWheelArrDTO;
    }

    @Override
    public SpWheelArr toEntity(SpWheelArrDTO spWheelArrDTO) {
        if ( spWheelArrDTO == null ) {
            return null;
        }

        SpWheelArr spWheelArr = new SpWheelArr();

        return spWheelArr;
    }
}
