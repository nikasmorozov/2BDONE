package lt.nikas.tobedone.mapper;

/**
 *
 * @param <E> consume type that will be mapped/transformed
 * @param <R> produce/return type
 */
@FunctionalInterface
public interface Mapper<E, R> {
    R mapToDomain(E data);
}
