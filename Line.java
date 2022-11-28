package org.example;

import java.util.Objects;

public class Line {
  private int size;
  private Dot start;
  private Dot end;

  public Line(int size, Dot start, Dot end) {
    this.size = size;
    this.start = start;
    this.end = end;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    Line line = (Line) o;
    return size == line.size && start.equals(line.start) && end.equals(line.end);
  }

  @Override
  public int hashCode() {
    return Objects.hash(size, start, end);
  }

  @Override
  public String toString() {
    return "Line{" + "size=" + size + ", start=" + start + ", end=" + end + '}';
  }
}
