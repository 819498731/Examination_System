package com.system.po;

public class Test {

    public static void main(String[] args) {
        int[] numbers={1,5,6,8,9,10,11,7,15,14,13,15,35};
            int temp = 0;
            int size = numbers.length;
            for(int i = 0 ; i < size-1; i ++)
            {
                for(int j = 0 ;j < size-1-i ; j++)
                {
                    if(numbers[j] > numbers[j+1])  //交换两数位置
                    {
                        temp = numbers[j];
                        numbers[j] = numbers[j+1];
                        numbers[j+1] = temp;
                    }
                }
            }
        for(int i=0;i<numbers.length;i++){
            System.out.print(numbers[i]+" ");
        }
    }
}
