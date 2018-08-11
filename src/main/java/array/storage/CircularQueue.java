package array.storage;

public class CircularQueue {

  private char[] queue;
  private int tailIndex = -1;
  private int headIndex = -1;
  private int size;
  private int elementCount;

  public CircularQueue(int size) {
    queue = new char[size];
    this.size = size;
  }

  private CircularQueue() {
  }

  public void insert(char input) {
    if (elementCount == size) {
      return; //throw exception
    }

    if (tailIndex == size - 1 && headIndex > -1) {
      tailIndex = -1;
    }
    elementCount++;
    queue[++tailIndex] = input;
  }

  public char remove() {
    if (elementCount <= 0) {
      return ' '; //throw exception
    }

    if (headIndex == size - 1 && tailIndex < headIndex) {
      headIndex = -1;
    }

    elementCount--;
    return queue[++headIndex];
  }

  public char[] getQueue() {
    return queue;
  }
}
