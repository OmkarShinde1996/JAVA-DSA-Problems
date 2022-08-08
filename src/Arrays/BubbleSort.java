package Arrays;
//in bubble sort we perform sorting operations till n-1 rounds and in each round largest element gets placed at last
//position. so we need to perform 2 for loops 1 to complete rounds and another one to complete steps in each
//round. and if left element in array is greater than right element then we swap them.


public class BubbleSort {
    public static void bubbleSort(int arr[]){
        for (int j = 0; j<arr.length; j++){ // to complete rounds n-1
            for(int i =0; i<arr.length-j-1; i++){//to complete steps in each round and i<arr.length-j-1 because we
                // don't need to compare last sorted positions again
                if(arr[i]>arr[i+1]){
                    int temp = arr[i];
                    arr[i] = arr[i+1];
                    arr[i+1] = temp;
                }
            }
        }
    }

    public static void main(String[] args) {
        int arr[] = {1505,3099,3038,4260,1002,3944,3785,1954,2585,111,2842,2425,3877,3355,881,2703,4366,3055,2930,3243,26,1763,4308,1050,2553,2925,3507,1865,3805,130,2369,2508,2884,959,3561,1747,2126,526,4639,1089,4149,98,1752,693,48,4776,4326,221,3745,1063,4935,4793,4486,283,905,2397,3514,2257,1128,1005,1927,337,2948,1423,4873,3866,2,334,2281,2437,2341,2342,3481,2836,200,4841,2246,4401,2351,395,4954,1638,4052,2953,2817,4319,3203,1606,4386,4972,1515,3794,1809,1614,132,3852,3667,4824,1385,2509,3539,2761,96,3506,1861,539,4113,4811,4027,1442,4582,3996,150,1821,1780,215,1367,4173,2211,3896,4089,3805,2064,4683,2123,3691,1070,3378,2184,4641,4239,4662,897,3630,1972,4128,1041,2215,1551,724,1439,4279,80,4083,3598,2949,518,288,3934,453,3590,4576,3179,1813,3978,149,4336,3761,4410,3733,2398,3982,948,779,2887,2807,2032,1238,2136,4781,2617,634,194,1111,3032,794,2124,842,32,4921,498,3787,4897,2891,865,1617,295,4575,3009,254,4111,1717,3917,1676,4341,2388,3435,1524,4703,1324,765,434,608,4536,4090,1854,4686,2382,1822,2227,177,1971,2211,783,4088,2130,3275,893,176,2387,2347,2859,4510,1364,3809,4270,3541,4754,4973,3571,1410,3564,3445,266,4429,4631,4686,1291,1545,2511,1009,2423,4867,4725,2626,1245,4271,976,2973,4119,4433,1433,3994,3802,1631,4350,2686,1837,1058,4330,2802,628,3442,4298,228,4137,2246,1826,2224,3472,4799,3791,4422,4269,2294,2472,188,1629,4703,1109,4726,565,2313,2622,1081,369,754,1666,2030,29,1133,2447,695,3858,1088,2758,3599,1788,1393,3501,2800,2360,1017,2571,3682,3308,1396,2325,1969,4760,3046,1058,2520,3536,4528,805,3526,3678,223,1530,2773,3385,4333,267,2763,1738,4007,3047,3612,213,4534,2512,1789,3738,4086,4977,3991,4213,4581,2291,3647,792,3862,1307,2826,867,2541,1910,4580,3709,1514,3550,125,4885,3398,4972,1567,4151,2853,2363,4286,2276,2063,2453,3518,3348,3398,4205,2087,3474,1692,592,751,4419,3370,640,4118,1669,4097,1323,3625,572,546,4142,4656,1758,331,2218,2470,2719,2158,483,1241,1577,768,4163,2187,1300,3289,4057,452,3321,232};
        bubbleSort(arr);
        for(int i = 0; i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
    }
}

//{4,1,2,5,7,3,8,0,6,9} N=10, rounds = n-1 = 9
//
//        1st
//        1 4 2 5 7 3 8 0 6 9
//        1 2 4 5 7 3 8 0 6 9
//        1 2 4 5 7 3 8 0 6 9
//        1 2 4 5 7 3 8 0 6 9
//        1 2 4 5 3 7 8 0 6 9
//        1 2 4 5 3 7 8 0 6 9
//        1 2 4 5 3 7 0 8 6 9
//        1 2 4 5 3 7 0 6 8 9
//
//        2nd
//        1 2 4 5 3 7 0 6 8 9
//        1 2 4 5 3 7 0 6 8 9
//        1 2 4 5 3 7 0 6 8 9
//        1 2 4 3 5 7 0 6 8 9
//        1 2 4 3 5 7 0 6 8 9
//        1 2 4 3 5 0 7 6 8 9
//        1 2 4 3 5 0 6 7 8 9
//
//        3rd
//        1 2 4 3 5 0 6 7 8 9
//        1 2 3 4 5 0 6 7 8 9
//        1 2 3 4 0 5 6 7 8 9
//
//        4th
//        1 2 3 4 0 5 6 7 8 9
//        1 2 3 0 4 5 6 7 8 9
//
//        5th
//        1 2 3 0 4 5 6 7 8 9
//        1 2 0 3 4 5 6 7 8 9
//
//        6th
//        1 2 0 3 4 5 6 7 8 9
//        1 0 2 3 4 5 6 7 8 9
//
//        7th
//        1 0 2 3 4 5 6 7 8 9
//        0 1 2 3 4 5 6 7 8 9