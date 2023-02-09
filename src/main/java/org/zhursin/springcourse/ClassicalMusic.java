package org.zhursin.springcourse;

public class ClassicalMusic implements Music {
  private ClassicalMusic() {}

  private static ClassicalMusic getClassicalMusic() {
    return new ClassicalMusic();
  }
  public void init() {
    System.out.println("Doing initialization...");
  }

  public void destroy() {
    System.out.println("Destroying...");
  }

  @Override public String getSong() {
    return "Classical song";
  }
}
