package PbSolving;

//class PbSolving.Solution {
//976. Largest Perimeter Triangle
//    public int largestPerimeter(int[] nums) {
//        Arrays.sort(nums);
//
//        for (int i=nums.length-1; i>1; i--){
//            if(nums[i]< nums[i-1]+nums[i-2]){
//                return nums[i]+nums[i-1]+nums[i-2];
//            }
//        }
//        return 0;
////    }
////}
//class PbSolving.Solution {
//    public int nearestValidPoint(int x, int y, int[][] points) {
//        double dist=0;
//        double temp =10000;
//        int index = -1;
//        for (int i=0; i<points.length; i++){
//            if (x==points[i][0] || y==points[i][1]){
//                dist = Math.abs(x-points[i][0]) + Math.abs(y-points[i][1]);
//                if (dist<temp){
//                    temp= dist;
//                    index = i;
//                }
//            }
//        }
//    return index;
//    }
//}
//class PbSolving.Solution {
//    public int arraySign(int[] nums) {
//        int count=0;
//        for (int i=0; i<nums.length;i++){
//            if (nums[i]<0){
//                count++;
//            }
//            if (nums[i]==0){
//                return 0;
//            }
//        }
//        if (count%2==0){
//            return 1;
//        } else {
//            return -1;
//        }
//    }
//}

//class PbSolving.Solution {
//    public boolean canMakeArithmeticProgression(int[] arr) {
//        Arrays.sort(arr);
//        boolean x= false;
//        int k= arr[1]-arr[0];
//        int y=0;
//        for (int i=0; i<arr.length-1; i++){
//            y = arr[i+1]-arr[i];
//            if (y!=k){
//                return false;
//            }
//        }
//        return true;
//    }
//}
//class PbSolving.Solution {
//    public boolean isHappy(int n) {
//
//    }
//}


//pb 1790
//class Solution {
//    public boolean areAlmostEqual(String s1, String s2) {
//        if (s1.equals(s2)) {
//            return true;
//        }
//        int count = 0;
//        int x = -1;
//        int y = -1;
//        for (int i = 0; i < s1.length(); ++i) {
//            if (s1.charAt(i) != s2.charAt(i)) {
//                count++;
//                if (x == -1) {
//                    x = i;
//                } else {
//                    y = i;
//                }
//            }
//        }
//        if (count != 2) {
//            return false;
//        }
//        if (s1.charAt(x) == s2.charAt(y) && s1.charAt(y) == s2.charAt(x)) {
//            return true;
//        }
//        return false;
//    }
//}

//"abcd"
//        "abdc"

// 496
//class Solution {
//    public int[] nextGreaterElement(int[] nums1, int[] nums2) {
//        int[] res = new int[nums1.length];
//        for (int i = 0; i < nums1.length; i++) {
//            res[i] = -1;
//            for (int j = 0; j < nums2.length; j++) {
//                if (nums1[i] == nums2[j]) {
//                    for (int k = j + 1; k < nums2.length; k++) {
//                        if (nums2[k] > nums1[i]) {
//                            res[i] = nums2[j + 1];
//                            break;
//                        }
//                    }
//                }
//            }
//            return res;
//        }
//    }
//}
//
//        Input
//        [1,3,5,2,4]
//        [6,5,4,3,2,1,7]
//        Output
//        [7,-1,-1,-1,-1]
//        Expected
//        [7,7,7,7,7]

//
//1672 : CORRECT
//class Solution {
//    public int maximumWealth(int[][] accounts) {
//        int max=0;
//        int sum=0;
//    for (int i=0;i<accounts.length;i++){
//        for (int j=0; j<accounts[i].length;j++){
//            sum+= accounts[i][j];
//        }
//        if (sum>=max){
//            max=sum;
//        }
//        sum=0;
//    }
//    return max;
//    }
//}

//283
//class Solution {
//    public void moveZeroes(int[] nums) {
//        int temp=234;
//    for (int i=0; i<nums.length-1; i++){
//
//        if (nums[i]==0){
//
//
//            temp=nums[i+1];
//            nums[i+1]=nums[i];
//            nums[i]=temp;
//        }
//    }
//    }
//}
//        [0,1,0,3,12]
//        Output
//        [1,0,3,12,0]
//        Expected
//        [1,3,12,0,0]


//1588
//    class Solution {
//        int sum = 0;
//
//        public int subsum(int[] arr, int x) {
//            for (int i = 0; i < x; i++) {
//                sum += arr[i];
//            }
//            return sum;
//        }
//
//        public int sumOddLengthSubarrays(int[] arr) {
//            int x = arr.length;
//            while (x != 0) {
//                if (x % 2 != 0) {
//                    sum = sum + subsum(arr, x);
//                }
//                x = x - 1;
//            }
//            return sum;
//        }
//    }
//        Input: arr = [1,4,2,5,3]
//        Output: 58
//        Explanation: The odd-length subarrays of arr and their sums are:
//        [1] = 1
//        [4] = 4
//        [2] = 2
//        [5] = 5
//        [3] = 3
//        [1,4,2] = 7
//        [4,2,5] = 11
//        [2,5,3] = 10
//        [1,4,2,5,3] = 15
//        If we add all these together we get 1 + 4 + 2 + 5 + 3 + 7 + 11 + 10 + 15 = 58


//class Solution {
//    public int diagonalSum(int[][] mat) {
//        int sum = 0;
//        for (int i = 0; i < mat.length; i++) {
//
//            sum += mat[i][i];
//                sum += mat[i][mat.length - 1 - i];
//
//        }
//        if (mat.length %2 ==1) {
//            int x = mat.length / 2;
//            sum -= mat[x][x];
//        }
//        return sum;
//    }
//}

//
//class Solution {
//    public static void main(String[] args) {
//        int[][]temp= {{1,2},{3,4}};
//        matrixReshape(temp,1,4);
//
//
//    }
//    public static int[][] matrixReshape(int[][] mat, int r, int c) {
//        if (r * c != mat.length * mat[0].length) {
//            return mat;
//        }
//        int[][] res = new int[r][c];
//        int ptr=0;
//        int ptc=0;
//        for (int i = 0; i < mat.length; ++i) {
//            for (int j = 0; j < mat[i].length; ++j) {
//                res[ptr][ptc] =mat[i][j];
//                ptc++;
//                if (ptc==c){
//                    ptr++;
//                    ptc=0;
//                }
//            }
//        }
//        return res;
//    }
//}

////1768
//class Solution {
//    public String mergeAlternately(String word1, String word2) {
//
//        char[] word11 = word1.toCharArray();
//        char[] word22 = word2.toCharArray();
//        char[] k = new char[word11.length + word22.length];
//
//        if (word11.length <= word22.length) {
//            for (int i = 0; i < word11.length; i = i + 2) {
//                int j = i + 1;
//                k[i] = word11[i];
//                k[j] = word22[i];
//            }
//            int h = k.length;
//            int q = h - word22.length;
//            for (int i = 0; i < q; ++i) {
//                k[h] = word22[word11.length + i];
//                i++;
//                h = h + 1;
//            }
//        }
//        if (word11.length > word22.length) {
//            for (int i = 0; i < word22.length; i = i + 2) {
//                int j = i + 1;
//                k[i] = word11[i];
//                k[j] = word22[i];
//            }
//            int h = k.length;
//            int q = h - word11.length;
//            for (int i = 0; i < q; ++i) {
//                k[h] = word11[word22.length + i];
//                i++;
//                h = h + 1;
//            }
//        }
//        return k.toString();
//    }
//}

//1768 (the following two solutions)
//class Solution {
//    public String mergeAlternately(String word1, String word2) {
//
//        char[] word11 = word1.toCharArray();
//        char[] word22 = word2.toCharArray();
//        char[] k = new char[word11.length + word22.length];
//
//        if (word11.length <= word22.length) {
//            for (int i = 0; i < word11.length; i = i + 1) {
//                k[i * 2] = word11[i];
//                k[i * 2 + 1] = word22[i];
//            }
//            int h = word11.length * 2;
//
//            for (int i = 0; i < word22.length - word11.length; ++i) {
//                k[h] = word22[word11.length + i];
//                h = h + 1;
//            }
//        }
//        if (word11.length > word22.length) {
//            for (int i = 0; i < word22.length; i = i + 1) {
//                k[i * 2] = word11[i];
//                k[i * 2 + 1] = word22[i];
//            }
//            int h = word22.length * 2;
//
//            for (int i = 0; i < word11.length - word22.length; ++i) {
//                k[h] = word11[word22.length + i];
//                h = h + 1;
//            }
//        }
//        String str = String.valueOf(k);
//        return str;
//    }
//}

//class Solution {
//    public String mergeAlternately(String word1, String word2) {
//        StringBuilder res = new StringBuilder();
//        int pointer1 = 0;
//        int pointer2 = 0;
//        while (pointer1 < word1.length() && pointer2 < word2.length()) {
//            res.append(word1.charAt(pointer1++));
//            res.append(word2.charAt(pointer2++));
//        }
//        while (pointer1 < word1.length()) {
//            res.append(word1.charAt(pointer1++));
//        }
//        while (pointer2 < word2.length()) {
//            res.append(word2.charAt(pointer2++));
//        }
//        return res.toString();
//    }
//}

//1678 CORRECT
//class Solution {
//    public String interpret(String command) {
//        String x = new String();
//        char[] y = command.toCharArray();
//        int p =command.length();
//        for (int i=0; i<command.length();i++) {
//            if (y[i] == 'G') {
//                x = x + 'G';
//                p--;
//            }
//            else if (y[i] == '(' && y[i + 1] == 'a') {
//                x = x + 'a' + 'l';
//                i++;
//                p--;
//            }
//                else if (y[i] == '(' && y[i + 1] == ')') {
//                        x = x + 'o';
//                        i++;
//                        p--;
//                    }
//                }
//        return x;
//            }
//
//        }
////1678. Use string builder (because
//class Solution {
//    public String interpret(String command) {
//        String x = new String();
//        char[] y = command.toCharArray();
//        int p =command.length();
//        for (int i=0; i<command.length();i++) {
//            if (y[i] == 'G') {
//                x = x + 'G';
//
//            }
//            else if (y[i] == '(' && y[i + 1] == 'a') {
//                x = x + 'a' + 'l';
//
//            }
//            else if (y[i] == '(' && y[i + 1] == ')') {
//                x = x + 'o';
//
//            }
//        }
//        return x;
//    }
//
//}


////389 correct solution
//class Solution {
//    public char findTheDifference(String s, String t) {
//        int[] freq = new int[26];
//
//        for (int i = 0; i < s.length(); i++) {
//            freq[s.charAt(i) - 'a']++;
//        }
//        for (int i = 0; i < t.length(); i++) {
//            freq[t.charAt(i) - 'a']++;
//        }
//        for (int i = 0; i < 26; i++) {
//            if (freq[i] % 2 != 0) {
//                return (char) (i + 'a');
//            }
//        }
//        return 's';
//    }
//}
////389
//class Solution {
//    public char findTheDifference(String s, String t) {
//        char[] s2 = s.toCharArray();
//        char[] t2 = t.toCharArray();
//        int i;
//
//        for (i = 0; i < t2.length; i++) {
//            boolean x = false;
//            for (int j = 0; j < s2.length; ++j) {
//                if (t2[i] == s2[j]) {
//                    x = true;
//                    break;
//                }
//            }
//            if (x == false) {
//                break;
//            }
//        }
//        return t2[i];
//    }
//}
//
//}
//
//709 CORRECT
//class Solution {
//    public String toLowerCase(String s) {
//        StringBuilder str = new StringBuilder();
//        for (int i = 0; i < s.length(); ++i) {
//            if (s.charAt(i) >= 'A' && s.charAt(i) <= 'Z') {
//            str.append((char)(s.charAt(i)+32));
//            } else {
//                str.append(s.charAt(i));
//            }
//        }
//        return str.toString();
//    }
//}

//242

//import java.util.Arrays;

//class Solution {
//    public static void main(String[] args) {
//        isAnagram("anagram", "mnraaag");
//        System.out.println(isAnagram("anagram", "mnraaag"));
//    }
//
//    public static boolean isAnagram(String s, String t) {
//        char[] s1 = s.toCharArray();
//        char[] t2 = t.toCharArray();
//        Arrays.sort(s1);
//        Arrays.sort(t2);
//        s = Arrays.toString(s1);
//        t = Arrays.toString(t2);
//        if (s.equals(t)) {
//            return true;
//        } else {
//            return false;
//        }
//    }
//}

////1232
//class Solution {
//    public boolean checkStraightLine(int[][] coordinates) {
//        if ((coordinates[1][1] - coordinates[0][1]) / (coordinates[1][0] - coordinates[0][0])==NaN) {
//            return false;
//        }
//        if ((coordinates[1][1] - coordinates[0][1]) / (coordinates[1][0] - coordinates[0][0]) == (coordinates[2][1] - coordinates[1][1]) / (coordinates[2][0] - coordinates[1][0])) {
//            return true;
//        } else {
//            return false;
//        }
//
//    }
//}
//1309
//ASCII 0-> 48
//class Solution {
//    public String freqAlphabets(String s) {
//        StringBuilder res = new StringBuilder();
//        for (int i = 0; i < s.length(); i++) {
//            if (i+2<s.length() && s.charAt(i + 2) == '#') {
//                int firstdigit = s.charAt(i) - '0';
//                int seconddigit = s.charAt(i + 1) - '0';
//                int curr = firstdigit * 10 + seconddigit + 96;
//                res.append((char) curr);
//                i += 2;
//            } else {
//                res.append((char) (s.charAt(i) - '0' + 96));
//            }
//        }
//        return res.toString();
//    }
//}
///217. Contains Duplicate -- I couldn't solve it with a freq. array because I couldn't handle negative numbers (negative indexes!)
//the following solution works here, but exceeded time limit on leetcode
//
//
//import java.util.ArrayList;
//import java.util.Collections;
//import java.util.HashMap;
//import java.util.Map;
//
//class Solution {
//    public static boolean containsDuplicate(int[] nums) {
//        Map<Integer, Integer> x = new HashMap<Integer, Integer>();
//        for (int i = 0; i < nums.length; i++) {
//            if (x.containsKey(nums[i])) {
//                return true;
//            }
//            x.put(nums[i], 1);
//        }
//        return false;
//    }
//}
//

//class Solution {
//
//    public static void main(String[] args) {
//        int[] x = new int[]{-800, 122, 459, -871, 156, -877, 268, -578, 17, 394, 89, -124, 592, -356};
//        Boolean y = containsDuplicate(x);
//        System.out.println(y);
//    }
//
//    public static boolean containsDuplicate(int[] nums) {
//        int max = Arrays.stream(nums).max().getAsInt();
//        int min = Arrays.stream(nums).min().getAsInt();
//        if (Math.abs(min) > max) {
//            max = Math.abs(min);
//        }
//        if (nums.length == 0) {
//            return false;
//        }
//        int[] fr = new int[(Math.abs(max)) * 2];
//
//        for (int i = 0; i < nums.length; i++) {
//            if (nums[i] >= 0) {
//                fr[nums[i]]++;
//            } else if (nums[i] < 0) {
//                nums[i] = nums[i] * -1;
//                fr[nums[i] + nums.length]++;
//            }
//        }
//        for (int i = 0; i < fr.length; i++) {
//            if (fr[i] > 1) {
//                return true;
//            }
//        }
//        return false;
//    }
//}

//    public static boolean containsDuplicate(int[] nums) {
//        for (int i = 0; i < nums.length; i++) {
//            for (int j = i+1; j < nums.length; j++) {
//                if (nums[i] == nums[j]) {
//                    return true;
//                }
//            }
//        }
//    return false;
//    }
//}
//896: CORRECTTTTTTTTTT!
//class Solution {
//    public boolean isMonotonic(int[] nums) {
//        boolean x = false;
////        int i = 0;
//        for (int i = 0; i < nums.length-1; i++) {
//            if (nums[i + 1] >= nums[i]) {
//                x = true;
//            } else {
//                x = false;
//                break;
//            }
//
//        }
//        if (x == true) {
//            return true;
//        } else {
//            for (int i = 0; i < nums.length-1; i++) {
//                if (nums[i + 1] <= nums[i]) {
//                    x = true;
//                } else {
//                    x = false;
//                    break;
//                }
//            }
//            if (x == true) {
//                return true;
//            }
//        }
//        return false;
//    }
//}
// 1356

//class Solution {
//    public int[] sortByBits(int[] arr) {
//
//        ArrayList<Integer>[] bits = new ArrayList[14];
//        for (int i = 0; i < 14; i++) {
//            bits[i] = new ArrayList<Integer>();
//        }
//        for (int i = 0; i < arr.length; ++i) {
//            String temp = Integer.toBinaryString(arr[i]);
//            int ones = 0;
//            for (int j = 0; j < temp.length(); j++) {
//                if (temp.charAt(j) == '1') {
//                    ones++;
//                }
//            }
//            bits[ones].add(arr[i]);
//        }
//        int pointer = 0;
//        for (int i = 0; i < 14; i++) {
//            Collections.sort(bits[i]);
//            for (int j = 0; j < bits[i].size(); j++) {
//                arr[pointer++] = bits[i].get(j);
//            }
//        }
//        return arr;
//    }
//}

//class Solution {
//    public int[] sortByBits(int[] arr) {
//        String[] x = new String[arr.length];
//
//        for (int i = 0; i < arr.length; i++) {
//            x[i] = Integer.toBinaryString(arr[i]);
//        }
//        int[] count = new int[arr.length];
//        for (int i = 0; i < x.length; i++) {
//            for (int j = 0; j < x[i].length(); j++) {
//                if (x[i].charAt(j) == '1') {
//                    count[i]++;
//                }
//            }
//        }
//        int temp = 0;
//        for (int i = 0; i < count.length - 1; i++) {
//            if (count[i] == count[i + 1]) {
//                if (arr[i] > arr[i + 1]) {
//                    temp = arr[i + 1];
//                    arr[i + 1] = arr[i];
//                    arr[i] = temp;
//                    x[i]=Integer.toBinaryString(arr[i]);
//                    x[i+1]=Integer.toBinaryString(arr[i+1]);
//                }
//            }
//
//        }
//
//        int[] q = new int[arr.length];
//        for (int i = 0; i < arr.length; i++) {
//            q[count[i]] = arr[i];
//        }
//
//
//    }
//}
//66 Plus One
//class Solution {
//
//    public int[] plusOne(int[] digits) {
//        ArrayList<Integer> res = new ArrayList<Integer>();
//        int pointer = digits.length - 1;
//        while (pointer > -1) {
//            if (digits[pointer] == 9) {
//                res.add(0);
//            } else {
//                break;
//            }
//            pointer--;
//        }
//        if (pointer == -1) {
//            res.add(1);
//        } else {
//            res.add(digits[pointer] + 1);
//            --pointer;
//            while (pointer > -1) {
//                res.add(digits[pointer]);
//                pointer--;
//            }
//        }
//        int[] result = new int[res.size()];
//        for (int i=0;i< res.size();i++){
//            result[res.size()-1-i]= res.get(i);
//        }
//        return result;
//    }
//}
//28
//class Solution {
//    public int strStr(String haystack, String needle) {
//        for (int i = 0; i < haystack.length() - needle.length() + 1; i++) {
//            boolean match = true;
//            for (int j = 0; j < needle.length(); j++) {
//                if (haystack.charAt(i + j) != needle.charAt(j)) {
//                    match = false;
//                }
//            }
//            if (match) {
//                return i;
//            }
//        }
//        return -1;
//    }
//}
// Pb. 67: RUNTIME ERROR
//class Solution {
//    public String addBinary(String a, String b) {
//        int pointerb = b.length() - 1;
//        int pointera = a.length() - 1;
//        int carry = 0;
//        StringBuilder ans = new StringBuilder();
//        while (pointera > -1 && pointerb > -1) {
//            int current = a.charAt(pointera) - '0' + b.charAt(pointerb) - '0' + carry;
//            ans.append(current % 2);
//            carry = current / 2;
//            pointerb--; pointera--;
//        }
//        while (pointera > -1) {
//            int current = a.charAt(pointera) - '0' + carry;
//            ans.append(current % 2);
//            carry = current / 2;
//            pointera--;
//        }
//        while (pointerb > -1) {
//            int current = b.charAt(pointerb) - '0' + carry;
//            ans.append(current % 2);
//            carry = current / 2;
//            pointerb--;
//        }
//        if (carry!=0){
//            ans.append(carry);
//        }
//        return ans.reverse().toString();
//    }
//}
//Pb. 989 Add to Array-Form of Integer: SOLVED
//class Solution {
//    public List<Integer> addToArrayForm(int[] num, int k) {
//        int carry = 0;
//        List<Integer> ans = new ArrayList<Integer>();
//        for (int i = num.length - 1; i >= 0; i--) {
//            int current = k % 10 + num[i] + carry;
//            ans.add(current % 10);
//            carry = current / 10;
//            k = k / 10;
//        }
//        while (k != 0) {
//            int current = k % 10 + carry;
//            ans.add(current % 10);
//            carry = current / 10;
//            k = k / 10;
//        }
//        if (carry != 0) {
//            ans.add(carry);
//        }
//        Collections.reverse(ans);
//        return ans;
//    }
//}
//} salary : [1100,1300,400] the length of the array is 6
//           [200000, 150000, 50, 490]
// int min =1000;
// max =1;
//max =2;
//

//class Solution {
//    public static void main(String[] args) {
//        int [] ahmed= new int [4];
//        ahmed[0]=10;
//        ahmed[1]=20;
//        ahmed[2]=30;
//        ahmed[3]=40;
//        //ahmed= [10,20,30,40]
//        double z= average(ahmed);
//        System.out.println(z);
//    }
//    public double average(int[] salary) {
//        //int max = Arrays.stream(arr).max().getAsInt();
//        int max = 0;
//        int min = 1000000;
//        for (int i = 0; i < salary.length; i++) {
//            if (salary[i] > max) {
//                max = salary[i];
//            }
//            if (salary[i] < min) {
//                min = salary[i];
//            }
//        }
//        int sum = 0;
//        for (int i = 0; i < salary.length; i++) {
//            if (salary[i] != max && salary[i] != min) {
//                sum += salary[i];
//            }
//        }
////        double avg = sum / (salary.length - 2);
//        return (double) sum/(salary.length-2);
//    }
//}
////Problem 58
//    class Solution {
//        public int lengthOfLastWord(String s) {
//            if (s.length()==1){
//                return 1;
//            }
//            int i = s.length() - 1;
//            while (s.charAt(i) == ' ') {
//                i--;
//            }
//            int count=0;
//            while (i>=0) {
//                if (s.charAt(i) != ' ') {
//                    count++;
//                    i--;
//                } else {
//                    break;
//                }
//            }
//            return count;
//        }
//    }
//459. Repeated Substring Pattern. CORRECT SOLUTION BELOW
//    class Solution {
//        public boolean repeatedSubstringPattern(String s) {
//            ArrayList<Integer> arr = new ArrayList<Integer>();
//            for (int i = 1; i < s.length(); i++) {
//                if (s.charAt(i) == s.charAt(0)) {
//                    if (s.length() % i == 0) {
//                        arr.add(i);
//                    }
//                }
//            }
//            while (!arr.isEmpty()) {
//                int k = arr.get(arr.size() - 1);
//                int y=k;
//                arr.remove(arr.size()-1);
//                Boolean valid=true;
//                for (int i = s.length() - 1; i >=0; i--) {
//                    if (s.charAt(i) != s.charAt(k - 1)) {
//                        valid=false;
//                    }
//                    if (k == 1) {
//                        k = y;
//                    } else {
//                        k = k - 1;
//                    }
//                }
//                if (valid==true){
//                    return true;
//                }
//            }
//            return false;
//        }
//    }
//Another solution
//    class Solution {
//        public boolean repeatedSubstringPattern(String s) {
//            for (int i = 1; i < s.length(); i++) {
//                if (s.length() % i == 0) {
//                    Boolean valid = true;
//                    for (int j = 0; j < s.length()-i; j++) {
//                        if (s.charAt(j)!=s.charAt(i+j)){
//                            valid=false;
//                        }
//                    }
//                    if (valid==true){
//                        return true;
//                    }
//                }
//            }
//            return false;
//        }
//    }
//1886: Determine whether matrix can be obtained by rotation:SOLVED
//class Solution {
//    public static void main(String[] args) {
//        int[][] mat = {{0, 0, 0}, {0, 1, 0}, {1, 1, 1}};
//        int[][] target = {{1, 1, 1}, {0, 1, 0}, {0, 0, 0}};
//        findRotation(mat, target);
//    }
//
//    public static void rotate(int[][] mat) {
//        for (int i = 0; i < mat.length; i++) {
//            for (int j = i+1; j < mat[i].length; j++) {
//                int temp = mat[j][i];
//                mat[j][i] = mat[i][j];
//                mat[i][j] = temp;
//            }
//        }
//        for (int i = 0; i < mat.length; i++) {
//            int l = 0;
//            int r = mat.length - 1;
//            while (l < r) {
//                int temp = mat[i][l];
//                mat[i][l] = mat[i][r];
//                mat[i][r] = temp;
//                l++;
//                r--;
//            }
//        }
//    }
//
//    public static boolean findRotation(int[][] mat, int[][] target) {
//        int count = 0;
//        do {
//            boolean valid = true;
//            for (int i = 0; i < mat.length; i++) {
//                for (int j = 0; j < mat[i].length; j++) {
//                    if (mat[i][j] != target[i][j]) {
//                        valid = false;
//                    }
//                }
//            }
//            if (valid == true) {
//                return true;
//            }
//            rotate(mat);
//            count++;
//        } while (count <= 3);
//        return false;
//    }
//}
//438. Find All Anagrams in a String
// class Solution {
//    public List<Integer> findAnagrams(String s, String p) {
//        if (s.length()<p.length()){
//            return new ArrayList<Integer>();
//        }
//        ArrayList<Integer> answer = new ArrayList<Integer>();
//        int[] freq1 = new int[26];
//        int[] freq2 = new int[26];
//
//        for (int i = 0; i < p.length(); i++) {
//            freq1[p.charAt(i) - 'a']++;
//        }
//        for (int i = 0; i < p.length(); i++) {
//            freq2[s.charAt(i) - 'a']++;
//        }
//        for (int i = 0; i + p.length() - 1 < s.length(); i++) {
//            Boolean identical = true;
//            for (int j = 0; j < 26; j++) {
//                if (freq1[j] != freq2[j]) {
//                    identical = false;
//                }
//            }
//            if (identical) {
//                answer.add(i);
//            }
//            freq2[s.charAt(i) - 'a']--;
//            if (i + p.length() < s.length()) {
//                freq2[s.charAt(i + p.length()) - 'a']++;
//            }
//        }
//        return answer;
//    }
//}
//713. Subarray products less than K
//class Solution {
//    public int numSubarrayProductLessThanK(int[] nums, int k) {
//        if (k == 0) {
//            return 0;
//        }
//        int answer = 0;
//        int ans = 1;
//        int count = 0;
//        for (int i = 0; i < nums.length; i++) {
//            while (count < nums.length && ans * nums[count] < k) {
//                ans *= nums[count];
//                count++;
//            }
//            answer += count - i;
//            if (count != i) {
//                ans /= nums[i];
//
//            }else {
//                count++;
//            }
//        }
//
//        return answer;
//    }
//}
//910. smallest range
//class Solution {
//    public int smallestRangeII(int[] nums, int k) {
//        Arrays.sort(nums);
//        int best = nums[nums.length-1] - nums[0];
//
//        for (int i=0;i<nums.length-1;i++){
//            int max = Math.max(nums [i] +k, nums[nums.length-1]-k);
//            int min= Math.min(nums[0]+k,nums[i+1]-k);
//            best = Math.min(best, max-min);
//        }
//        return best;
//    }
//}

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Stack;

/**
 * Definition for singly-linked list.
 * public class ListNode {
 * int val;
 * ListNode next;
 * ListNode() {}
 * ListNode(int val) { this.val = val; }
 * ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
//2. Add two numbers
//class Solution {
//    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
//        int carry = 0;
//        ListNode result = null;
//        ListNode r = null;
//
//        while (l1 != null && l2 != null) {
//            int current = l1.val + l2.val + carry;
//
//            if (result != null) {
//                result.next = new ListNode(current % 10);
//                result = result.next;
//            } else {
//                result = new ListNode(current % 10);
//                r=result;
//            }
//            carry = current / 10;
//            l1=l1.next;
//            l2=l2.next;
//        }
//        while (l1 != null) {
//            int current = l1.val + carry;
//            result.next = new ListNode(current % 10);
//            result = result.next;
//            carry = current / 10;
//            l1= l1.next;
//        }
//        while (l2 != null) {
//            int current = l2.val + carry;
//            result.next = new ListNode(current % 10);
//            result = result.next;
//            carry = current / 10;
//            l2= l2.next;
//        }
//        if (carry != 0){
//            result.next = new ListNode(carry);
//            result =result.next;
//        }
//        return r;
//    }
//}
////973. K closest points to origin
//class Solution {
//    public int[][] kClosest(int[][] points, int k) {
//        Arrays.sort(points, new Comparator<int[]>() {
//            @Override
//            public int compare(int[] o1, int[] o2) {
//                double dist1 = Math.sqrt(Math.pow(o1[0], 2) + Math.pow(o1[1], 2));
//                double dist2 = Math.sqrt(Math.pow(o2[0], 2) + Math.pow(o2[1], 2));
//                if (dist1 < dist2) {
//                    return -1;
//                } else if (dist2 < dist1) {
//                    return 1;
//                }
//                return 0;
//            }
//        });
//        int[][] ans = new int[k][2];
//
//        for (int i = 0; i < k; i++) {
//            ans[i]= points[i].clone();
//        }
//        return ans;
//    }
//}
//1630. Arthimetic arrays
//class Solution {
//    public List<Boolean> checkArithmeticSubarrays(int[] nums, int[] l, int[] r) {
//        List<Boolean> ans = new ArrayList<>(l.length);
//
//        for (int t = 0; t < l.length; t++) {
//            int begin = l[t];
//            int end = r[t];
//
//            int range = end - begin + 1;
//            int[] x = new int[range];
//            int k = 0;
//
//            for (int i = begin; i <= end; i++) {
//                x[k] = nums[i];
//                k++;
//            }
//
//            Arrays.sort(x);
//            int d = x[1] - x[0];
//            Boolean y = true;
//            for (int i = 0; i < x.length - 1; i++) {
//                if (x[i + 1] - x[i] != d) {
//                    y = false;
//                }
//            }
//            ans.add(y);
//        }
//        return ans;
//    }
//}
//503. Next Greater Element II
//class Solution {
//    public int[] nextGreaterElements(int[] nums) {
//        int[] x = new int[nums.length * 2];
//        int[] ans = new int[nums.length];
//        for (int i = 0; i < nums.length; i++) {
//            x[i] = nums[i];
//            x[i + nums.length] = nums[i];
//        }
//        for (int i = 0; i < nums.length; i++) {
//            ans[i]=-1;
//            for (int j = i + 1; j < x.length; j++) {
//                if (x[j] > nums[i]) {
//                    ans[i] = x[j];
//                    break;
//                }
//            }
//        }
//        return ans;
//    }
//}
////49. Group Anagrams
//class Solution {
//    public List<List<String>> groupAnagrams(String[] strs) {
//        HashMap<String, List<String>> groups = new HashMap<String, List<String>>();
//
//        for (int i = 0; i < strs.length; i++) {
//
//            String temp = strs[i];
//            char[] x = temp.toCharArray();
//            Arrays.sort(x);
//            temp = new String (x);
//
//            if (!groups.containsKey(temp)){
//                groups.put(temp, new ArrayList<String>());
//            }
//            groups.get(temp).add(strs[i]);
//
//        }
//        // List<List<String>> answer = new ArrayList<List<String>>();
//        // for (List<String>i : groups.values()){
//        //     answer.add(i);
//        // }
//        return new ArrayList<>(groups.values());
//    }
//}
// 896. Monotonic Array
//class Solution {
//    public boolean isMonotonic(int[] nums) {
//        boolean inc =true, dec=true;
//
//        for (int i=0;i<nums.length-1;i++){
//            inc = inc && (nums[i]<=nums[i+1]);
//            dec= dec && (nums[i]>=nums[i+1]);
//        }
//        return (inc || dec);
//    }

//191. Number of 1 bits
//public class Solution {
//    // you need to treat n as an unsigned value
//    public int hammingWeight(int n) {
//
//
//    }
//}
//1281. Subtract the Product and Sum of Digits of an Integer
//class Solution {
//    public int subtractProductAndSum(int n) {
//        int sum=0;
//        int product= 1;
//        while (n!=0){
//            int x = n%10;
//            sum= sum+x;
//            product = product*x;
//
//            n=n/10;
//        }
//        return (product-sum);
//    }
//}
////155. Min Stack
//class MinStack {
//
//    Stack<Integer> s1, s2;
//
//    public MinStack() {
//        s1 = new Stack<Integer>();
//        s2 = new Stack<Integer>();
//
//    }
//
//    public void push(int val) {
//        s1.push(val);
//        if (s2.empty()) {
//            s2.push(val);
//        } else {
//            s2.push(Math.min(val, s2.peek()));
//        }
//    }
//
//    public void pop() {
//        s1.pop();
//        s2.pop();
//    }
//
//    public int top() {
//        return (s1.peek());
//    }
//
//    public int getMin() {
//        return (s2.peek());
//    }
//}
//
///**
// * Your MinStack object will be instantiated and called as such:
// * MinStack obj = new MinStack();
// * obj.push(val);
// * obj.pop();
// * int param_3 = obj.top();
// * int param_4 = obj.getMin();
// */
//class Solution {
//    public boolean lemonadeChange(int[] bills) {
//
//        int count5 = 0;
//        int count10 = 0;
//
//        for (int i = 0; i < bills.length; i++) {
//
//            if (bills[i] == 5) {
//                count5++;
//            } else if (bills[i] == 10) {
//                count10++;
//                if (count5 != 0) {
//                    count5--;
//                } else {
//                    return false;
//                }
//            } else {
//                if (count10 != 0 && count5 != 0) {
//                    count10--;
//                    count5--;
//                } else if (count5 > 2) {
//                    count5 = count5 - 3;
//                } else {
//                    return false;
//                }
//            }
//
//        }
//        return true;
//    }
//}
//
////1845. Seat Reservation Manager
//class SeatManager {
//    PriorityQueue<Integer> x;
//
//    public SeatManager(int n) {
//        x = new PriorityQueue<Integer>();
//        for (int i = 1; i <= n; i++) {
//            x.add(i);
//        }
//    }
//
//    public int reserve() {
//        return (x.poll());
//    }
//
//    public void unreserve(int seatNumber) {
//        x.add(seatNumber);
//    }
//}
////622. Design Circular Queue
//
///**
// * Your SeatManager object will be instantiated and called as such:
// * SeatManager obj = new SeatManager(n);
// * int param_1 = obj.reserve();
// * obj.unreserve(seatNumber);
// */
//class MyCircularQueue {
//    int[] q;
//    int front;
//    int rear;
//    int size;
//
//    public MyCircularQueue(int k) {
//        q = new int[k];
//        front = 0;
//        rear = 0;
//        size = 0;
//    }
//
//    public boolean enQueue(int value) {
//        if (size < q.length) {
//            q[rear++] = value; //value is put at rear, and then rear is incremented
//            rear %= q.length;
//            size++;
//            return true;
//        }
//        return false;
//    }
//
//    public boolean deQueue() {
//        if (size > 0) {
//            front++;
//            front %= q.length;
//            size--;
//            return true;
//        }
//        return false;
//    }
//
//    public int Front() {
//        if (size == 0) {
//            return -1;
//        }
//        return q[front];
//    }
//
//    public int Rear() {
//        if (size == 0) {
//            return -1;
//        }
//        return q[(rear - 1 + q.length) % q.length];
//    }
//
//    public boolean isEmpty() {
//        return (size == 0);
//    }
//
//    public boolean isFull() {
//        return (size == q.length);
//    }
//}
//
//// 729. My Calendar I
//class MyCalendar {
//    TreeMap<Integer, Integer> x;
//
//    public MyCalendar() {
//        x = new TreeMap<Integer, Integer>();
//    }
//
//    public boolean book(int start, int end) {
//        if (x.isEmpty()) {
//            x.put(start, end);
//            return true;
//        }
//        Map.Entry<Integer, Integer> entry1 = x.firstEntry();
//        Map.Entry<Integer, Integer> entry2 = x.lastEntry();
//        if (end <= entry1.getKey()) {
//            x.put(start, end);
//            return true;
//        }
//        if (start >= entry2.getValue()) {
//            x.put(start, end);
//            return true;
//        }
//        if (x.floorKey(start) != null && x.ceilingKey(start) != null) {
//            int before = x.floorKey(start);
//            int after = x.ceilingKey(start);
//
//            if (x.get(before) <= start && after >= end) {
//                x.put(start, end);
//                return true;
//            }
//        }
//
//
//        return false;
//    }
//}
//// 1797. Design Authentication Manager
//
//class AuthenticationManager {
//    int timeTolive;
//    TreeMap<String, Integer> map;
//    TreeMap<Integer, String> mapreverse;
//
//    public AuthenticationManager(int timeToLive) {
//        timeToLive = timeTolive;
//        map = new TreeMap<String, Integer>();
//        mapreverse = new TreeMap<Integer, String>();
//    }
//
//    public void generate(String tokenId, int currentTime) {
//        map.put(tokenId, currentTime + timeTolive);
//        mapreverse.put(currentTime + timeTolive, tokenId);
//    }
//
//    public void renew(String tokenId, int currentTime) {
//        if (map.containsKey(tokenId) && currentTime < map.get(tokenId)) {
//
//            mapreverse.remove(map.get(tokenId));
//            map.put(tokenId, currentTime + timeTolive);
//            mapreverse.put(currentTime + timeTolive, tokenId);
//        }
//
//    }
//
//    public int countUnexpiredTokens(int currentTime) {
//        // mapreverse.tailMap(currentTime); //will return a map with all keys bigger than current time
//        return mapreverse.tailMap(currentTime).size();
//    }
//}
//
////53. max subarray
//class Solution {
//    public int maxSubArray(int[] nums) {
//        int max = -10000;
//        for (int i = 0; i < nums.length; i++) {
//            int currentmax = 0;
//            for (int j = i; j < nums.length; j++) {
//                currentmax += nums[j];
//                if (currentmax > max) {
//                    max = currentmax;
//                }
//            }
//        }
//        return max;
//    }
//}
//
////53.
//
//class Solution {
//    public int maxSubArray(int[] nums) {
//        int previous = 0, best = -10000;
//        for (int i = 0; i < nums.length; i++) {
//            best = Math.max(best, nums[i] + previous);
//            previous = Math.max(0, nums[i] + previous);
//        }
//        return best;
//    }
//}
//
////1. Two Sum
//class Solution {
//    public int[] twoSum(int[] nums, int target) {
//        boolean y = false;
//        for (int i = 0; i < nums.length; i++) {
//            int x = target - nums[i];
//            for (int j = i + 1; j < nums.length; j++) {
//                if (nums[j] == x) {
//                    return (new int[]{i, j});
//                }
//            }
//        }
//        return new int[]{1, 1};
//    }
//}
//
////1. Two Sum
//class Solution {
//    public int[] twoSum(int[] nums, int target) {
//        TreeMap<Integer, Integer> ans = new TreeMap<Integer, Integer>();
//        for (int i = 0; i < nums.length; i++) {
//            ans.put(nums[i], i);
//        }
//        for (int i = 0; i < nums.length; i++) {
//            if (ans.containsKey(target - nums[i]) && i != ans.get(target - nums[i])) {
//                return new int[]{i, ans.get(target - nums[i])};
//            }
//        }
//
//        return new int[]{};
//    }
//}
//
//
//// 88. Merge Sorted Array
//
//class Solution {
//    public void merge(int[] nums1, int m, int[] nums2, int n) {
//
//
//        int j = 0;
//        for (int i = nums1.length - nums2.length; i < nums1.length; i++) {
//            nums1[i] = nums2[j];
//            j++;
//        }
//        Arrays.sort(nums1);
//    }
//}
//
////88.
//class Solution {
//    public void merge(int[] nums1, int m, int[] nums2, int n) {
//        int[] ans = new int[nums1.length];
//        int pointer1 = 0;
//        int pointer2 = 0;
//        int pointer3 = 0;
//        while (pointer1 < nums1.length - nums2.length && pointer2 < nums2.length) {
//            if (nums1[pointer1] < nums2[pointer2]) {
//                ans[pointer3] = nums1[pointer1];
//                pointer1++;
//            } else {
//                ans[pointer3] = nums2[pointer2];
//                pointer2++;
//            }
//            pointer3++;
//        }
//        while (pointer1 < nums1.length - nums2.length) {
//            ans[pointer3] = nums1[pointer1];
//            pointer1++;
//            pointer3++;
//        }
//        while (pointer2 < nums2.length) {
//            ans[pointer3] = nums2[pointer2];
//            pointer2++;
//            pointer3++;
//        }
//
//        for (int i = 0; i < nums1.length; i++) {
//            nums1[i] = ans[i];
//        }
//    }
//}
//
////350. Intersection of Two Arrays II
//class Solution {
//    public int[] intersect(int[] nums1, int[] nums2) {
//
//        ArrayList<Integer> ans = new ArrayList<Integer>();
//        boolean[] bool = new boolean[nums2.length];
//
//        for (int i = 0; i < nums1.length; i++) {
//            for (int j = 0; j < nums2.length; j++) {
//                if (nums1[i] == nums2[j] && bool[j] == false) {
//                    ans.add(nums1[i]);
//                    bool[j] = true;
//                    break;
//                }
//            }
//        }
//        int[] answer = new int[ans.size()];
//        for (int i = 0; i < ans.size(); i++) {
//            answer[i] = ans.get(i);
//        }
//        return answer;
//
//    }
//}
//
////350.
//class Solution {
//    public int[] intersect(int[] nums1, int[] nums2) {
//
//        int[] freq1 = new int[1001];
//        int[] freq2 = new int[1001];
//        ArrayList<Integer> ans = new ArrayList<Integer>();
//
//        for (int i = 0; i < nums1.length; i++) {
//            freq1[nums1[i]]++;
//        }
//        for (int i = 0; i < nums2.length; i++) {
//            freq2[nums2[i]]++;
//        }
//        for (int i = 0; i < freq1.length; i++) {
//            int x = Math.min(freq1[i], freq2[i]);
//            for (int j = 0; j < x; j++) {
//                ans.add(i);
//            }
//        }
//        int[] answer = new int[ans.size()];
//        for (int i = 0; i < ans.size(); i++) {
//            answer[i] = ans.get(i);
//        }
//        return answer;
//    }
//}
//
//121. Best Time to Buy and Sell Stock
class Solution {
    public int maxProfit(int[] prices) {

        int[] prefixsum = new int[prices.length];
        prefixsum[0] = prices[0];
        for (int i = 1; i < prices.length; i++) {
            prefixsum[i] = prefixsum[i - 1] + prices[i];
        }

    }
}

class Solution {
    public int maxProfit(int[] prices) {
        int[] suffixmax = new int[prices.length];
        suffixmax[prices.length - 1] = prices[prices.length - 1];
        for (int i = prices.length - 2; i >= 0; i--) {
            suffixmax[i] = Math.max(suffixmax[i + 1], prices[i]);
        }
        int diff = 0;
        for (int i = 0; i < suffixmax.length - 1; i++) {
            int currentdiff = suffixmax[i + 1] - prices[i];
            diff = Math.max(diff, currentdiff);
        }
        return diff;
    }
}

// 74. Search a 2D Matrix
class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        int k = -1;
        for (int i = 0; i < matrix.length; i++) {
            if (matrix[i][0] > target) {
                k = i - 1;
                break;
            }
        }
        if (k != -1) {
            for (int j = 0; j < matrix[k].length; j++) {
                if (matrix[k][j] == target) {
                    return true;
                }
            }
        }
        return false;
    }
}

class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        int low = 0;
        int high = matrix.length * matrix[0].length - 1;
        while (low <= high) {
            int mid = (low + high) / 2;
            int r, c;
            c = mid % matrix[0].length;
            r = mid / matrix[0].length;
            if (target == matrix[r][c]) {
                return true;
            }
            if (target > matrix[r][c]) {
                low = mid + 1;
            } else {
                high = mid - 1;
            }
        }
        return false;
    }
}

118.Pascal's Triangle

class Solution {


    public static List<List<Integer>> generate(int numRows) {
        List<List<Integer>> list = new ArrayList<List<Integer>>();
        for (int i = 0; i < numRows; i++) {
            list.add(new ArrayList());
        }
        list.get(0).add(1);
        for (int i = 1; i < numRows; i++) {
            int c = i + 1;
            list.get(i).add(1);
            for (int j = 1; j < c - 1; j++) {
                list.get(i).add(list.get(i - 1).get(j - 1) + list.get(i - 1).get(j));
            }
            list.get(i).add(1);
        }
        return list;
    }
}

//36. Valid Sudoko
class Solution {
    public boolean isValidSudoku(char[][] board) {

        for (int i = 0; i < board.length; i += 3) {
            for (int j = 0; j < board.length; j += 3) {
                int[] freq = new int[10];
                for (int i1 = i; i1 < i + 3; i1++) {
                    for (int j1 = j; j1 < j + 3; j1++) {
                        char q = board[i1][j1];
                        if (q >= '0' && q <= '9') {
                            freq[q - 48]++;
                            if (freq[q - 48] > 1) {
                                return false;
                            }
                        }
                    }
                }
            }
        }

        for (int i = 0; i < board.length; i++) {
            int[] freq = new int[10];
            for (int j = 0; j < board[0].length; j++) {
                char q = board[i][j];
                if (q >= '0' && q <= '9') {
                    freq[q - 48]++;
                    if (freq[q - 48] > 1) {
                        return false;
                    }
                }
            }
        }
        for (int j = 0; j < board.length; j++) {
            int[] freq = new int[10];
            for (int i = 0; i < board[0].length; i++) {
                char q = board[i][j];
                if (q >= '0' && q <= '9') {
                    freq[q - 48]++;
                    if (freq[q - 48] > 1) {
                        return false;
                    }
                }
            }
        }
        return true;

    }
}

class Solution {
    public boolean isValidSudoku(char[][] board) {

        for (int i = 0; i < board.length; i += 3) {
            for (int j = 0; j < board.length; j += 3) {
                int[] freq = new int[10];
                for (int i1 = i; i1 < i + 3; i1++) {
                    for (int j1 = j; j1 < j + 3; j1++) {
                        char q = board[i1][j1];
                        if (q >= '0' && q <= '9') {
                            freq[q - 48]++;
                            if (freq[q - 48] > 1) {
                                return false;
                            }
                        }
                    }
                }
            }
        }

        for (int i = 0; i < board.length; i++) {
            int[] freq1 = new int[10];
            int[] freq2 = new int[10];

            for (int j = 0; j < board[0].length; j++) {
                char q1 = board[i][j];
                char q2 = board[j][i];

                if (q1 >= '0' && q1 <= '9') {
                    freq1[q1 - 48]++;
                    if (freq1[q1 - 48] > 1) {
                        return false;
                    }
                }
                if (q2 >= '0' && q2 <= '9') {
                    freq2[q2 - 48]++;
                    if (freq2[q2 - 48] > 1) {
                        return false;
                    }
                }
            }
        }

        return true;

    }
}

//387. First Unique Character in a String

class Solution {
    public int firstUniqChar(String s) {
        int[] freq = new int[26];
        for (int i = 0; i < s.length(); i++) {
            freq[s.charAt(i) - 'a']++;
        }
        for (int i = 0; i < s.length(); i++) {
            int y = s.charAt(i) - 'a';
            if (freq[y] == 1) {
                return i;
            }
        }
        return -1;
    }
}

// 383. Ransom Note
class Solution {
    public boolean canConstruct(String ransomNote, String magazine) {
        int[] freq1 = new int[26];
        int[] freq2 = new int[26];

        for (int i = 0; i < ransomNote.length(); i++) {
            freq1[ransomNote.charAt(i) - 'a']++;
        }
        for (int i = 0; i < magazine.length(); i++) {
            freq2[magazine.charAt(i) - 'a']++;
        }
        boolean can = false;
        for (int i = 0; i < freq1.length; i++) {
            if (freq2[i] >= freq1[i]) {
                can = true;
            } else {
                return false;
            }
        }
        return can;
    }
}

// 20. Valid Parentheses

class Solution {
    public boolean isValid(String s) {

        Stack<Character> x = new Stack<Character>();
        for (int i = 0; i < s.length(); i++) {
            if ((s.charAt(i) == '(' || s.charAt(i) == '[') || (s.charAt(i) == '{')) {
                x.push(s.charAt(i));
            } else {
                if (x.empty()) {
                    return false;
                }
                if ((x.peek() == '(' && s.charAt(i) == ')') || (x.peek() == '[' && s.charAt(i) == ']') || (x.peek() == '{' && s.charAt(i) == '}')) {
                    x.pop();
                } else {
                    return false;
                }
            }

        }
        return x.empty();
    }
}

class ListNode {
    int val;
    ListNode next;

    ListNode() {
    }

    ListNode(int val) {
        this.val = val;
    }

    ListNode(int val, ListNode next) {
        this.val = val;
        this.next = next;
    }
}
//141.

//class ListNode {
//    int val;
//    ListNode next;
//
//    ListNode(int x) {
//        val = x;
//        next = null;
//    }
//}

public class Solution {
    public boolean hasCycle(ListNode head) {
        HashMap<ListNode, Boolean> ans = new HashMap<ListNode, Boolean>();
        while (head != null) {
            if (ans.containsKey(head)) {
                return true;
            }
            ans.put(head, true);
            head = head.next;
        }
        return false;

    }
}

//another solution -- turtoise and hare algorithm
//class ListNode {
//    int val;
//    ListNode next;
//
//    ListNode(int x) {
//        val = x;
//        next = null;
//    }
//}

public class Solution {
    public boolean hasCycle(ListNode head) {
        if (head == null || head.next == null) {
            return false;
        }
        ListNode slow = head;
        ListNode fast = head.next;

        while (slow != fast) {
            if (slow.next == null || fast.next == null || fast.next.next == null) {
                return false;
            }
            slow = slow.next;
            fast = fast.next.next;
        }
        return true;

    }
}

//142. Linked List Cycle II

//class ListNode {
//    int val;
//    ListNode next;
//
//    ListNode(int x) {
//        val = x;
//        next = null;
//    }
//}

public class Solution {
    public ListNode detectCycle(ListNode head) {
        if (head == null || head.next == null) {
            return null;
        }
        ListNode slow = head;
        ListNode fast = head.next;

        int size = 1;
        while (slow != fast) {
            if (slow.next == null || fast.next == null || fast.next.next == null) {
                return null;
            }
            slow = slow.next;
            fast = fast.next.next;
            size++;
        }
        slow = head;
        fast = head;
        for (int i = 0; i < size; i++) {
            fast = fast.next;
        }
        while (slow != fast) {
            slow = slow.next;
            fast = fast.next;
        }
        return slow;
    }
}
//21.

class Solution {
    public ListNode mergeTwoLists(ListNode list1, ListNode list2) {
        ListNode current = new ListNode();
        ListNode result = current;
        while (list1 != null && list2 != null) {
            if (list1.val < list2.val) {
                current.next = new ListNode(list1.val);
                list1 = list1.next;
            } else {
                current.next = new ListNode(list2.val);
                list2 = list2.next;

            }
            current = current.next;
        }
        while (list1 != null) {
            current.next = new ListNode(list1.val);
            list1 = list1.next;
            current = current.next;
        }
        while (list2 != null) {
            current.next = new ListNode(list2.val);
            list2 = list2.next;
            current = current.next;
        }
        return result.next;
    }
}

//203.
class Solution {
    public ListNode removeElements(ListNode head, int val) {
        ListNode x = new ListNode();
        ListNode ans = x;

        while (head != null) {
            if (head.val != val) {
                x.next = new ListNode(head.val);
                x = x.next;
            }
            head = head.next;
        }
        return ans.next;
    }
}

//203.
class Solution {
    public ListNode removeElements(ListNode head, int val) {
        while (head != null && head.val == val) {
            head = head.next;
        }
        if (head == null) {
            return null;
        }

        ListNode previous = head;
        ListNode answer= head;
        head = head.next;
        while (head != null) {
            if (head.val == val) {
                previous.next = head.next;
            } else {
                previous=head;
            }
            head=head.next;
        }
        return answer;
    }
}








