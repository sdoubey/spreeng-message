package com.spreeng.message.common;

import java.util.List;

import lombok.AllArgsConstructor;
import lombok.Getter;

@Getter
@AllArgsConstructor
public class Pageable<T> {
  private Long totalElements;
  private List<T> elements;
}
