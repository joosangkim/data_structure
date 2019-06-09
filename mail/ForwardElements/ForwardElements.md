## Answer
```java
int search(int arr[], int start, int end, int k)
{
  if (start > end) {
    return -1;
  }

  int mid = (start+end)/2;
  if (arr[mid] == k) {
    return mid;
  }

  if (arr[start] <= arr[mid]) {
    if (k >= arr[start] && k <= arr[mid]) {
      return search(arr, start, mid-1, k);
    }
    return search(arr, mid+1, end, k);
  }

  if (k >= arr[mid] && k <= arr[end]) {
    return search(arr, mid+1, end, k);
  }

  return search(arr, start, mid-1, k);
}

search(arr, 0, n-1, k);
```