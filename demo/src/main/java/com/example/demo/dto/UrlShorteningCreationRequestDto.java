package com.example.demo.dto;

import java.net.URL;
import lombok.Data;
import lombok.NonNull;

@Data
public class UrlShorteningCreationRequestDto {
  @NonNull  private URL originalUrl;
}
