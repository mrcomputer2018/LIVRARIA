package entities;

@FunctionalInterface
public interface Promocional {
    public abstract boolean aplicaDescontoDe(double porcentagem);
    default boolean aplicaDescontoDe10Porcento(){
        return aplicaDescontoDe(0.1);
    };
}
