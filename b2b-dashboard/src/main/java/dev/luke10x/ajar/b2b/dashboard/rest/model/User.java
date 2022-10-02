package dev.luke10x.ajar.b2b.dashboard.rest.model;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class User {
  final private String email;
  final private String password;
}
