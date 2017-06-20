package laicode_java;

import java.util.Arrays;
import java.io.*;

//Selection Sort
public class Solution1 {
	//����java�ļ�
	//for i in {3..100}; do cp Solution2.java "Solution$i.java"; done
	//����ĳһ��Ȼ���滻
	//for i in {3..100}; do head -3 "Solution$i.java" | tail -1 $1 | awk '{split($0, a, ' '); print a[3]' ; done
	//sed -i ' ' 's/hi/hello/' file1
	//���ĺ��Ƶ����ļ�
	//awk 'NR==2{gsub("hi", "Hello", $1)}; {print $0}' file1 > newfile
	//�������ͱ���Ҫ�á���˫����
	//for i in {3..100}; do sed -i " " "3s/Solution/Solution$i/" Solution$i.java ; done

    public void swap(int[] array, int left, int right) {
        int temp=array[left];
        array[left]=array[right];
        array[right]=temp;
    }
    public int[] selectionSort(int[]  array) {
        if (array==null || array.length<=1) {
            return array;
        }
        for (int i=0;i<array.length-1;i++) {
            int min=i;
            for (int j=i+1;j<array.length;j++) {
                if (array[j]<array[min]) {
                    min=j;
                }
            }
            swap(array, i, min);
        }
        return array;
    }
    public static void main(String[] args) throws IOException {
        // write your code here
    	Solution1 solu1 = new Solution1();
        int[] array=null;
        array=solu1.selectionSort(array);
        System.out.println(Arrays.toString(array));
        array=new int[0];
        array=solu1.selectionSort(array);
        System.out.println(Arrays.toString(array));
        array=new int[]{1,2,3,4};
        array=solu1.selectionSort(array);
        System.out.println(Arrays.toString(array));
        array=new int[]{4,3,2,1};
        array=solu1.selectionSort(array);
        System.out.println(Arrays.toString(array));
        array=new int[]{4,3,5,2,1};
        array=solu1.selectionSort(array);
        System.out.println(Arrays.toString(array));
        InputStreamReader cin=null;
        try {
        	cin=new InputStreamReader(System.in);
        	System.out.println("Enter:");
        	StringBuffer userinput=new StringBuffer();
        	while(true) {
        		char c=(char)cin.read();
        		if(c=='q') {
        			break;
        		}
        		userinput.append(c);
    		}
        	System.out.println(userinput);
    	}
        finally {
        	if(cin!=null) {
        		cin.close();
        	}
        }
    }
}
