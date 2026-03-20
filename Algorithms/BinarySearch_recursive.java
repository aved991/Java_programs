class BinarySearch_recursive {
    int RBinSearch(int[] A, int l, int h, int key) {
        if (l > h)          // ✅ Proper base case for "not found"
            return -1;

        int mid = (l + h) / 2;

        if (key == A[mid])
            return mid;
        else if (key < A[mid])
            return RBinSearch(A, l, mid - 1, key);
        else
            return RBinSearch(A, mid + 1, h, key);
    }
}