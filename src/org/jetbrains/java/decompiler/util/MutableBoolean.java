package org.jetbrains.java.decompiler.util;

public final class MutableBoolean {
  private boolean value;

  public MutableBoolean(boolean value) {
    this.value = value;
  }

  public boolean getValue() {
    return value;
  }

  public void setValue(boolean value) {
    this.value = value;
  }

  @Override
  public String toString() {
    return String.valueOf(value);
  }

  @Override
  public int hashCode() {
    return Boolean.hashCode(value);
  }

  @Override
  public boolean equals(Object obj) {
    return obj instanceof MutableBoolean && value == ((MutableBoolean) obj).value;
  }
}
