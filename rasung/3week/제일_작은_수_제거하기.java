class Solution {
    public int[] solution(int[] arr) {
        if (arr.length == 1) {
            return new int[]{-1};
        }

        int[] answer = new int[arr.length - 1];
        int index = 0;
        int min = Integer.MAX_VALUE;
        for (int i = 0; i < arr.length; i++) {
            if (min > arr[i]) {
                index = i;
                min = arr[i];
            }
        }

        int answerIndex = 0;
        for (int i = 0; i < arr.length; i++) {
            if (i == index) continue;
            answer[answerIndex] = arr[i];
            answerIndex++;
        }

        return answer;
    }
}
