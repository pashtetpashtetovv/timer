package pashtetpashtetovv.entity.mapper;

import org.mapstruct.Mapper;
import pashtetpashtetovv.entity.Task;
import pashtetpashtetovv.entity.dto.TaskDTO;

@Mapper(componentModel = "spring")
public interface TaskMapper {

    TaskDTO toDTO(Task task);

}
