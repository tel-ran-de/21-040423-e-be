package de.telran.khakov.rustam.classworks.cw20;

import java.util.Set;
import java.util.function.BiConsumer;
import java.util.function.BinaryOperator;
import java.util.function.Function;
import java.util.function.Supplier;
import java.util.stream.Collector;

// Stream<String>    -> String
// String -> "frirst" + "sec" ...
// StringBuilder ->
public class UnionStringCollector implements Collector<String, StringBuilder, String> {

    // Stream<String>
    // StringBuilder acum = new StringBuilder(); // List list = new ArrayList();
    // for (String elem: elements) {
    //  acum.append(elem); /// list.add()
    // }
    // return acum.toString(); // list

    String prefix;
    String suffix;
    String delimeter;

    public UnionStringCollector(String delimeter, String prefix, String suffix) {
        this.prefix = prefix;
        this.suffix = suffix;
        this.delimeter = delimeter;
    }

    static UnionStringCollector joining(String prefix, String suffix) {
        return new UnionStringCollector("", prefix, suffix);
    }

    static UnionStringCollector joining(String delimeter, String prefix, String suffix) {
        return new UnionStringCollector(delimeter, prefix, suffix);
    }

    @Override
    public Supplier<StringBuilder> supplier() {
        return () -> new StringBuilder();
    }

    @Override
    public BiConsumer<StringBuilder, String> accumulator() {
        return (acum, elem) -> {
            if (!acum.isEmpty()) {
                acum.append(delimeter);
            }
            acum.append(elem);
        };
    }

    @Override
    public Function<StringBuilder, String> finisher() {
        return acum -> {
            if (suffix != null) {
                acum.append(suffix);
            }
            if (prefix != null) {
                return prefix + acum.toString();
            }
            return acum.toString();
        };
    }


    @Override
    public Set<Characteristics> characteristics() {
        return Set.of();
    }

    @Override
    public BinaryOperator<StringBuilder> combiner() {
        return (acum1, acum2) -> acum1.append(acum2.toString());
    }
}
