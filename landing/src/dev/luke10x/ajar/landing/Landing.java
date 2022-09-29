package dev.luke10x.ajar.landing;

import dev.luke10x.ajar.shared.Api;

class Landing {
  public static void main(String[] args) {
    var api = new Api();
    System.out.println("📌 Response from API: " + api.getMagicPhrase() + "!");
  }
}