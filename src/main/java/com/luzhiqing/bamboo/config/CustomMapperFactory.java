package com.luzhiqing.bamboo.config;

import ma.glasnost.orika.MapperFactory;
import ma.glasnost.orika.converter.BidirectionalConverter;
import ma.glasnost.orika.impl.DefaultMapperFactory;
import ma.glasnost.orika.metadata.Type;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;

/**
 * TODO:设置为单例
 */
public class CustomMapperFactory {
    public CustomMapperFactory() {
    }

    public static MapperFactory build() {
        MapperFactory mapperFactory = (new DefaultMapperFactory.Builder()).build();
        mapperFactory.getConverterFactory().registerConverter(new CustomMapperFactory.LocalDateConverter());
        mapperFactory.getConverterFactory().registerConverter(new CustomMapperFactory.LocalDateTimeConverter());
        mapperFactory.getConverterFactory().registerConverter(new CustomMapperFactory.LocalTimeConverter());
        return mapperFactory;
    }

    private static class LocalTimeConverter extends BidirectionalConverter<LocalTime, LocalTime> {
        private LocalTimeConverter() {
        }

        @Override
        public LocalTime convertTo(LocalTime source, Type<LocalTime> destinationType) {
            return LocalTime.from(source);
        }

        @Override
        public LocalTime convertFrom(LocalTime source, Type<LocalTime> destinationType) {
            return LocalTime.from(source);
        }
    }

    private static class LocalDateConverter extends BidirectionalConverter<LocalDate, LocalDate> {
        private LocalDateConverter() {
        }

        @Override
        public LocalDate convertTo(LocalDate source, Type<LocalDate> destinationType) {
            return LocalDate.from(source);
        }

        @Override
        public LocalDate convertFrom(LocalDate source, Type<LocalDate> destinationType) {
            return LocalDate.from(source);
        }
    }

    private static class LocalDateTimeConverter extends BidirectionalConverter<LocalDateTime, LocalDateTime> {
        private LocalDateTimeConverter() {
        }

        @Override
        public LocalDateTime convertTo(LocalDateTime source, Type<LocalDateTime> destinationType) {
            return LocalDateTime.from(source);
        }

        @Override
        public LocalDateTime convertFrom(LocalDateTime source, Type<LocalDateTime> destinationType) {
            return LocalDateTime.from(source);
        }
    }
}
