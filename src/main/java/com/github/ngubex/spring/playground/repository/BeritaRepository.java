package com.github.ngubex.spring.playground.repository;

import com.github.ngubex.spring.playground.entity.Berita;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.stereotype.Repository;

/**
 * Created by Ipan Taupik Rahman.
 * Date: 27/12/17
 * Time: 18:08
 * Project spring-data-jpa
 * Package com.github.ipan97.springdatajpa.repository
 */
@Repository
public interface BeritaRepository extends PagingAndSortingRepository<Berita, Long> {
    Berita findOneById(Long id);
}