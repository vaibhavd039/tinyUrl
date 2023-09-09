package com.example.demo.repository;

import com.example.demo.domain.UrlShorteningEntity;
import java.net.URL;
import java.util.Optional;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface URLShorteningRepository extends JpaRepository<UrlShorteningEntity, Long> {

  Optional<UrlShorteningEntity> findUrlShorteningEntitiesByShortUrl(String shortUrl);
}
