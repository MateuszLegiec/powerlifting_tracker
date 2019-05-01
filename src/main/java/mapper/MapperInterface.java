package mapper;

public interface MapperInterface<Entity,Dto> {

    Entity dtoToEntity(Dto dto);

    Dto entityToDTO(Entity entity);

}
