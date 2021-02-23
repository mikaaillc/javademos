public interface IEntityRepository<T extends IEntity >{// interfaceler implement ederler
    void add(T entity);
    void delete(T entity);
    void  update(T entity);
}
