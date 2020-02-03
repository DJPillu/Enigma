//Program to test the Binary Search Algorithm
class BinarySearch
  {
    static int a[] = {32, 41, 79, 82, 89, 95, 160, 288, 300, 769};

    static int search(int key)
    {
      int low = 0, high = 9;

      while(low <= high)
      {
        int  mid = (low + high)/2;
        if(a[mid] == key)
        {
          return mid;
        }
        else if(a[mid] < key)
        {
          low = mid + 1;
        }
        else if(a[mid] > key)
        {
          high = mid - 1;
        }
      }
      return -1;
    }

    public static void main(String args[])
    {
      int res = search(69);
      System.out.println(res);
      if(res != -1)
      {
        System.out.println("Key is present in the array");
      }
      else if(res == -1)
      {
        System.out.println("Key is not present in the array");
      }
    }
  }
