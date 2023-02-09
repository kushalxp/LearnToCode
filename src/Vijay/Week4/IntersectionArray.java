package Vijay.Week4;

import java.util.ArrayList;
import java.util.Arrays;

public class IntersectionArray {
    //Failing for below case:
    //[180,395,311,750,949,164,212,968,978,404,381,1,265,92,331,350,375,451,903,932,129,590,771,883,900,344,712,804,367,547,596,533,22,691,125,558,450,74,771,673,778,45,44,172,63,260,669,374,526,337,138,459,724,458,428,851,536,387,93,586,453,715,29,330,60,648,541,923,244,377,164,780,748,831,708,544,176,985,1,308,256,922,645,121,42,855,667,730,115,677,289,355,478,298,849,218,730,449,621,957,244,25,22,866,287,704,841,757,916,439,124,316,575,642,4,84,345,157,4,578,359,223,936,275,997,197,478,795,369,963,733,252,18,872,690,851,985,49,124,646,153,396,150,499,96,699,848,541,214,201,544,249,974,599,937,583,711,298,375,137,829,913,625,897,757,795,266,298,6,404,809,6,879,20,943,293,717,146,634,835,805,532,75,256,115,994,147,368,784,716,579,127,341,195,233,75,194,858,741,507,932,648,610,239,604,626,67,203,793,769,429,760,466,540,258,977,614,781,276,832,771,538,296,990,832,146,895,42,458,681,582,444,301,72,786,977,483,266,868,693,703,593,536,581,594,448,793,606,71,556,230,652,711,704,8,871,700,681,431]
    //[867,616,238,748,559,454,139,699,763,776,47,123,14,332,545,680,562,478,593,401,396,75,489,880,142,965,795,544,691,981,711,470,172,965,167,223,690,100,934,402,699,260,944,904,659,412,934,86,733,83,189,631,542,392,424,739,167,342,695,160,648,441,885,631,637,910,528,299,137,342,115,839,62,660,285,578,992,38,287,669,534,469,464,282,788,283,701,122,818,140,330,684,524,994,419,920,191,110,619,389,575,365,916,188,396,454,115,639,784,873,511,337,308,895,313,300,672,277,297,518,545,297,847,6,395,196,791,246,586,331,547,382,443,103,174,942,890,530,590,660,899,651,837,732,180,979,517,47,241,290,571,985,590,613,580,290,549,770,99,922,70,538,24,263,327,445,220,577,584,473,710,893,59,961,189,278,454,515,678,143,46,588,901,55,382,456,337,715,331,155,178,547,491,977,832,193,124,571,896,834,6,655,712,229,954,308,491,820,891,903,839,61,244,0,832,862,15,861,738,189,489,311,888,661,158,65,724,374,431,957,387,80,795,702,798,702,93,761,659,423,984,522,656,449,271,123,499,723,588,216,961,357,57,495,171,656]

    public int[] intersection(int[] nums1, int[] nums2) {
        Arrays.sort(nums1);
        Arrays.sort(nums2);
        ArrayList<Integer> result = new ArrayList<Integer>();

        ArrayList<Integer> list1 = new ArrayList<Integer>();
        ArrayList<Integer> list2 = new ArrayList<Integer>();

        list1.add(nums1[0]);
        for(int i = 1, j = 0; i < nums1.length; i++) {
            if(nums1[i] != list1.get(j)) {
                list1.add(nums1[i]);
                j++;
            }
        }
        System.out.println("list1: " + list1);
        System.out.println("\n");

        list2.add(nums2[0]);
        for(int i = 1,j = 0; i < nums2.length; i++) {
            if(nums2[i] != list2.get(j)) {
                list2.add(nums2[i]);
                j++;
            }
        }
        System.out.println("list2: " + list2);
        System.out.println("\n");

        int size;
        if(list1.size() < list2.size()) {
            size = list1.size();
            for(int i = 0; i < size; i++) {
                for(int j = 0; j < list2.size(); j++) {
                    if(list1.get(i) == list2.get(j)) {
                        result.add(list1.get(i));
                    }
                }
            }
        }
        else {
            size = list2.size();
            for(int i = 0; i < size; i++) {
                for(int j = 0; j < list1.size(); j++) {
                    if(list2.get(i) == list1.get(j)) {
                        result.add(list2.get(i));
                    }
                }
            }
        }

        return result.stream().mapToInt(i -> i).toArray();
    }
}