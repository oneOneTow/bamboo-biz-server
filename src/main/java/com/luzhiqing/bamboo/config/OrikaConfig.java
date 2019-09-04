package com.luzhiqing.bamboo.config;

import ma.glasnost.orika.MapperFactory;
import ma.glasnost.orika.converter.BidirectionalConverter;
import ma.glasnost.orika.metadata.Type;
import org.jooq.types.UInteger;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class OrikaConfig {

    @Bean
    public MapperFactory getFactory() {
        MapperFactory mapperFactory = CustomMapperFactory.build();
        mapperFactory.getConverterFactory().registerConverter(new UIntegerConverter());
        return mapperFactory;
    }

    /**
     * 实现jooq UInteger和Integer相互转换
     */
    private static class UIntegerConverter
            extends BidirectionalConverter<UInteger, Integer> {

        @Override
        public Integer convertTo(UInteger source, Type<Integer> destinationType) {
            return source.intValue();
        }

        @Override
        public UInteger convertFrom(Integer source, Type<UInteger> destinationType) {
            return UInteger.valueOf(source);
        }
    }
}
