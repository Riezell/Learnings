package com.paintJob28;

public class PaintJob {

	public static void main(String[] args) {
		int num;
		num = getBucketCount(-3.4, 2.1,1.5,2);
		System.out.println(num);
		num = getBucketCount(3.4, 2.1, 1.5, 2);
		System.out.println(num);
		num = getBucketCount(2.75, 3.25, 2.5, 1);
		System.out.println(num);
		System.out.println();
		num = getBucketCount(-3.4, 2.1, 1.5);
		System.out.println(num);
		num = getBucketCount(3.4, 2.1, 1.5);
		System.out.println(num);
		num = getBucketCount(7.25, 4.3, 2.35);
		System.out.println(num);
		System.out.println();
		num = getBucketCount(3.4, 1.5);
		System.out.println(num);
		num = getBucketCount(6.26, 2.2);
		System.out.println(num);
		num = getBucketCount(3.26, 0.75);
		System.out.println(num);
			

	}
	public static int getBucketCount (double width, double height,
			double areaPerBucket, int extraBucket) {
		
		int totalbuckets =0;
		
		if(width <= 0 || height<= 0 || areaPerBucket <= 0|| extraBucket < 0) {
			return -1;
		}else {
			double area = width * height;
			int total = (int)Math.ceil(area/areaPerBucket);
			total -= extraBucket;
			totalbuckets = total;			
		}
		return totalbuckets;	
	}
public static int getBucketCount (double width,
		double height, double areaPerBucket) {
	
	int bucketsNeededToBuy = 0;
	
	if( width <= 0 || height <= 0 || areaPerBucket <= 0) {
		return -1;
	}else {
		double area = width * height;
		int total = (int)Math.ceil(area/areaPerBucket);
	 bucketsNeededToBuy = total;
	}
	return bucketsNeededToBuy;
   }
public static int getBucketCount (double area, double areaPerBucket ){
	
	int bucketsNeededToBuy = 0;
	if(area <= 0 || areaPerBucket <= 0) {
		return -1;
	}else {
		int total = (int)Math.ceil(area/areaPerBucket);
		bucketsNeededToBuy = total;
	}
	return bucketsNeededToBuy;
  }
}
