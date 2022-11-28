package org.example;

import java.util.Objects;

public class Dot {
  private int size;

  public Dot(int size) {
    this.size = size;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    Dot dot = (Dot) o;
    return size == dot.size;
  }

  @Override
  public int hashCode() {
    return Objects.hash(size);
  }

  @Override
  public String toString() {
    return "Dot{" + "size=" + size + '}';
  }
}
