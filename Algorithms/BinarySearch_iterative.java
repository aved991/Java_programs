// Binary Search is a divide and conquer algorithm
// The array must be already sorted to apply this Search Algo

// logic-  3 pinters  low, high & mid ...mid=(low+high)/2
// if mid!= key,
// case 1: low=mid+1, when key>mid
// case 2: high=mid-1, when key<mid

public class BinarySearch_iterative
{
    int BinSearch(int [] A, int n, int key)
{
    int l=1, h=n;
    while(l<=h)
    {
        int mid=(l+h)/2;
        if(key==A[mid])
            return mid;
        if(key<A[mid])
            h=mid-1;
        else
            l=mid+1;
    }
    return -1;
}
}
