//Program to test Modified Binary Search Algorithm
class ModifiedBinarySearch
  {
    static int a[] = {32, 41, 79, 82, 89, 95, 160, 288, 300, 769};

    static int Msearch(int key)
    {
      int low = 0, high = 9;
      int mid = (low + high)/2;
      while(low < high)
      {
        if(a[low] > key || a[high] < key)
        {
          return -1;
        }
        else if(a[low] == key)
        {
          return low;
        }
        else if(a[high] == key)
        {
          return high;
        }

        if(a[mid] == key)
        {
          return mid;
        }
        else if(a[mid] < key)
        {
          low = mid + 1;
          high--;
        }
        else
        {
          high = mid - 1;
          low++;
        }
      }
      return -1;
    }

    public static void main(String args[])
    {
      int res = Msearch(69);
      if(res == -1)
      {
        System.out.println("Key is out of bounds");
      }
      else if(res != -1 )
      {
        System.out.println("key found");
      }
    }
  }
