/* The isBadVersion API is defined in the parent class VersionControl.
      boolean isBadVersion(int version); */

public class Solution extends VersionControl {

    boolean isBadVersion(int version) {
        return true;
    }

    public int firstBadVersion(int n) {
        int i = 1, j = n, middle , result = n;
        boolean status;

        while (i <= j) {
            middle = (i + j) / 2;
            status = isBadVersion(middle);

            if (status) {
                result = middle;
                j = middle - 1;
            } else{ 
                i = middle + 1;
            }

        }

        return result;
    }
}


public class Main {

}
