package cal.domain;

public interface Operator<T, S, U> {
    T calculate(S s, U u);
}
