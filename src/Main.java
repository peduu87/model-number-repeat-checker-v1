import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Functions Functions = new Functions();
        int i, maxValue, firstSize, secondSize;

        maxValue = 20;

        System.out.println("Insert the size of the first vector (20 max):");
        firstSize = sc.nextInt();
        firstSize = (firstSize < 0) ? 0 : firstSize;
        System.out.println("Insert the size of the second vector (20 max):");
        secondSize = sc.nextInt();
        secondSize = (secondSize < 0) ? 0 : secondSize;

        firstSize = (firstSize > maxValue) ? maxValue : firstSize;
        secondSize = (secondSize > maxValue) ? maxValue : secondSize;

        int[] firstArray = new int[firstSize];
        int[] secondArray = new int[secondSize];

        System.out.println("\n***IT ONLY WORKS FOR NATURAL NUMBERS***\n");

        for (i = 0; i < firstSize; i++) {
            System.out.println("Insert a number to the first array (" + (i+1) + "):");
            firstArray[i] = sc.nextInt();
            firstArray[i] = (firstArray[i] < 0) ? 0 : firstArray[i];
        }

        for (i = 0; i < secondSize; i++) {
            System.out.println("Insert a number to the first array (" + (i+1) + "):");
            secondArray[i] = sc.nextInt();
            secondArray[i] = (secondArray[i] < 0) ? 0 : secondArray[i];
        }

        System.out.println("\n");

        Functions.verifyNumbers(firstArray, secondArray, maxValue);

    }
}

class Functions {
    public void verifyNumbers(int[] frstArr, int[] scndArr, int maxValue) {
        int x, y, z, repeatIndex;
        int[] reapetedNumbers = new int[maxValue];

        for (x = 0; x < maxValue; x++) {
            reapetedNumbers[x] = -1;
        }

        repeatIndex = 0;

        OUTERLOOP:
        for (x = 0; x < frstArr.length; x++) {
            for (y = 0; y < scndArr.length; y++) {
                for (z= 0; z < maxValue; z++) {
                    if (frstArr[x] == reapetedNumbers[z]) {
                        continue OUTERLOOP;
                    }
                }
                if (frstArr[x] == scndArr[y]) {
                    reapetedNumbers[repeatIndex] = frstArr[x];
                    repeatIndex++;
                    System.out.println(frstArr[x] + " repeats");
                    break;
                }
            }
        }
    }
}