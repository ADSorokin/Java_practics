
            if (a.length <= 1) {
                return a;
            }

            int mid = a.length / 2;
            int[] leftArray = Arrays.copyOfRange(a, 0, mid);
            int[] rightArray = Arrays.copyOfRange(a, mid, a.length);

            leftArray = mergeSort(leftArray);
            rightArray = mergeSort(rightArray);

            return merge(leftArray, rightArray);
        }

        private static int[] merge(int[] leftArray, int[] rightArray) {
            int[] mergedArray = new int[leftArray.length + rightArray.length];

            int leftIndex = 0, rightIndex = 0, currentIndex = 0;

            while (leftIndex < leftArray.length && rightIndex < rightArray.length) {
                if (leftArray[leftIndex] < rightArray[rightIndex]) {
                    mergedArray[currentIndex++] = leftArray[leftIndex++];
                } else {
                    mergedArray[currentIndex++] = rightArray[rightIndex++];
                }
            }

            while (leftIndex < leftArray.length) {
                mergedArray[currentIndex++] = leftArray[leftIndex++];
            }

            while (rightIndex < rightArray.length) {
                mergedArray[currentIndex++] = rightArray[rightIndex++];
            }

            return mergedArray;
        }


    }
