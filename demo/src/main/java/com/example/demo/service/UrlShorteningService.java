package com.example.demo.service;

import com.example.demo.domain.UrlShorteningEntity;
import com.example.demo.dto.UrlShorteningCreationRequestDto;
import com.example.demo.repository.URLShorteningRepository;
import java.net.URL;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UrlShorteningService {
  private static final String BASE62_CHARACTERS = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789";

  @Autowired
  private URLShorteningRepository urlShorteningRepository;

  public String getShortURL(URL longUrl){
    return "";
  }

  private  String encodeToBase62(long num) {
    StringBuilder sb = new StringBuilder();
    do {
      int remainder = (int)(num % 62);
      sb.insert(0, BASE62_CHARACTERS.charAt(remainder));
      num /= 62;
    } while (num > 0);
    return sb.toString();
  }

  public URL getOriginalUrl(String shortUrl) {
    UrlShorteningEntity entity = urlShorteningRepository.findUrlShorteningEntitiesByShortUrl(
     shortUrl).orElseThrow(RuntimeException::new);
    return entity.getUrl();
  }


}
