package fileSysTree;

public interface Position<E> {
    E getElement() throws IllegalStateException;
}
