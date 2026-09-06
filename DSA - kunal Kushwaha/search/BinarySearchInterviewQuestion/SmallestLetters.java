package search.BinarySearchInterviewQuestion;

public class SmallestLetters {
    public static void main(String[] args) {
        char[] letters = {'c','f','j'};
        char target = 'c';
        char result = binarySearch(letters,target);
        System.out.println(result);
    }

    static char binarySearch(char[] letters,char target) {
        int start = 0, end = letters.length - 1;

        while(start <= end) {
            int mid = start + (end - start)/2;

            if(target < letters[mid]) {
                end = mid - 1;
            } else {
                start = mid + 1;
            }
        }

        return letters[start%letters.length];
    }
}
