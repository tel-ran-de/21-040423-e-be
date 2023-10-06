package de.telran.khakov.rustam.classworks.cw20;

import java.util.Set;
import java.util.function.BiConsumer;
import java.util.function.BinaryOperator;
import java.util.function.Function;
import java.util.function.Supplier;
import java.util.stream.Collector;


public class IntStatisticCollector implements Collector<Integer, IntStatistic, IntStatistic> {

    @Override
    public Supplier<IntStatistic> supplier() {
        return () -> new IntStatistic();
    }

    @Override
    public BiConsumer<IntStatistic, Integer> accumulator() {
        return (statAcum, number) -> {
            statAcum.max = Math.max(statAcum.max, number);
            statAcum.min = Math.min(statAcum.min, number);
            statAcum.sum = statAcum.sum + number;
            statAcum.count++;
        };
    }

    @Override
    public Function<IntStatistic, IntStatistic> finisher() {
        return stats -> {
            stats.average = stats.sum * 1.0/ stats.count;
            return stats;
        };
    }


    @Override
    public BinaryOperator<IntStatistic> combiner() {
        return null;
    }

    @Override
    public Set<Characteristics> characteristics() {
        return Set.of();
    }
}
