package com.abc.searcher.commons;

import com.abc.searcher.service.NamesAggOutboundDto;
import com.abc.searcher.service.NameOutboundDto;
import org.apache.dubbo.common.serialize.support.SerializationOptimizer;

import java.util.Arrays;
import java.util.Collection;

public class SerializationOptimizerImpl implements SerializationOptimizer {
    @Override
    public Collection<Class<?>> getSerializableClasses() {
        return Arrays.asList(
                NameOutboundDto.class,
                NamesAggOutboundDto.class
        );
    }
}
