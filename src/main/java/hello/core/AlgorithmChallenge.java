package hello.core;

public class AlgorithmChallenge {

    public static void main(String[] args) {

//      1~100까지의 숫자가 무작위로 들어있는 100개의 데이터를 가진 배열을 만들고, 해당 배열을 버블 정렬로 가작 작은 숫자부터 시작해 마지막에
//      가장 큰 숫자가 나오도록 정렬하는 알고리즘을 작성하시오.

        int[] randomArray = new int[100];

        for (int i = 0; i < 100; i++) {
            randomArray[i] = (int) Math.floor((Math.random()*100)+1);
        }

//        for (int i = 0; i < randomArray.length; i++) {
//            System.out.println("index " + i + " : " + randomArray[i]);
//        }
        int n = randomArray.length;
        boolean swapped = false;

        for (int i = 0; i < n - 2; i++) {
            for (int j = 0; j < n - 1 - i; j++) {
                if (randomArray[j] > randomArray[j+1]) {
                    int tmp;
                    tmp = randomArray[j+1];
                    randomArray[j+1] = randomArray[j];
                    randomArray[j] = tmp;
                    swapped = true;
                }
            }
            if (!swapped) break;
        }

        for (int i = 0; i < randomArray.length; i++) {
            System.out.println("index " + i + " : " + randomArray[i]);
        }

    }

}
