package test;

import org.junit.jupiter.api.extension.ParameterContext;
import org.junit.jupiter.params.aggregator.ArgumentsAccessor;
import org.junit.jupiter.params.aggregator.ArgumentsAggregationException;
import org.junit.jupiter.params.aggregator.ArgumentsAggregator;

import java.util.ArrayList;
import java.util.List;

public class IntegerArrayArgument implements ArgumentsAggregator {

    @Override
    public Integer[] aggregateArguments(ArgumentsAccessor accessor, ParameterContext context) throws ArgumentsAggregationException {
        List<Integer> arrays = new ArrayList<>();

        for (int i = 0; i < accessor.size(); i++) {
            arrays.add(accessor.getInteger(i));
        }

        return arrays.toArray(new Integer[0]);
    }
}
