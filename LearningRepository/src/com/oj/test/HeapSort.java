package com.oj.test;

public class HeapSort {  
    public static void main(String[] args) {  
        int[] array = { 9, 8, 7, 6, 5, 4, 3, 2, 1, 0, -1, -2, -3 };  

        System.out.println("Before heap:");  
        printArray(array);  

        heapSort(array);  

        System.out.println("After heap sort:");  
        printArray(array);  
    }  

    public static void heapSort(int[] array) {  
        if (array == null || array.length <= 1) {  
            return;  
        }  

        buildMaxHeap(array);  

        for (int i = array.length - 1; i >= 1; i--) {  
            exchangeElements(array, 0, i);  

            maxHeap(array, i, 0);  
        }  
    }  

    private static void buildMaxHeap(int[] array) {  
        if (array == null || array.length <= 1) {  
            return;  
        }  

        int half = array.length / 2;  
        for (int i = half; i >= 0; i--) {  
            maxHeap(array, array.length, i);  
        }  
    }  

    private static void maxHeap(int[] array, int heapSize, int index) {  
        int left = index * 2 + 1;  
        int right = index * 2 + 2;  

        int largest = index;  
        if (left < heapSize && array[left] > array[index]) {  
            largest = left;  
        }  

        if (right < heapSize && array[right] > array[largest]) {  
            largest = right;  
        }  

        if (index != largest) {  
           exchangeElements(array, index, largest);  

            maxHeap(array, heapSize, largest);  
        }  
    } 
    public static void printArray(int[] arr){
    	for (int i : arr) {
			System.out.print(i+" ");
		}
    }
    public static void exchangeElements(int[] arr,int i,int j){
    	int tmp = arr[i];
    	arr[i] = arr[j];
    	arr[j] = tmp;
    }
}  
