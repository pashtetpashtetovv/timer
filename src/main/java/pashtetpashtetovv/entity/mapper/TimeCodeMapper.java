package pashtetpashtetovv.entity.mapper;

import org.mapstruct.Mapper;
import pashtetpashtetovv.entity.TimeCode;
import pashtetpashtetovv.entity.dto.TimeCodeDTO;

@Mapper(componentModel="spring")
public interface TimeCodeMapper {

    TimeCodeDTO toDTO(TimeCode tc);

}
