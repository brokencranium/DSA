package array.storage;

public class PriorityQueue {

  private int size;
  private int elementCount = -1;
  private int[] queue;
  private char temp;

  public PriorityQueue(int size) {
    this.size = size;
    queue = new int[size];
  }

  private PriorityQueue() {
  }

  public void add(int input) {
    boolean isUpdated = false;
    for (int i = 0; i <= elementCount; i++) {
      if (input > queue[i]) {
        shift(i);
        queue[i] = input;
        elementCount++;
        isUpdated = true;
        break;
      }
    }

    if (isUpdated == false) {
      queue[++elementCount] = input;
    }
  }

  private void shift(int index) {
    for (int i = elementCount; i >= index; i--) {
      queue[i + 1] = queue[i];
    }
  }

  public int remove() {
    return queue[elementCount--];
  }

  public int[] getQueue() {
    return queue;
  }
}
