package com.example.examination.dto.mapper;

public interface Mapper <E, D> {

   abstract E toEntity (D dto);

   abstract D toDto (E entity);
}
