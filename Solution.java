package PbSolving;

//class PbSolving.Solution {
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
class Solution {
    public static void main(String[] args) {
        int[][] mat = {{0, 0, 0}, {0, 1, 0}, {1, 1, 1}};
        int[][] target = {{1, 1, 1}, {0, 1, 0}, {0, 0, 0}};
        findRotation(mat, target);
    }

    public static void rotate(int[][] mat) {
        for (int i = 0; i < mat.length; i++) {
            for (int j = i+1; j < mat[i].length; j++) {
                int temp = mat[j][i];
                mat[j][i] = mat[i][j];
                mat[i][j] = temp;
            }
        }
        for (int i = 0; i < mat.length; i++) {
            int l = 0;
            int r = mat.length - 1;
            while (l < r) {
                int temp = mat[i][l];
                mat[i][l] = mat[i][r];
                mat[i][r] = temp;
                l++;
                r--;
            }
        }
    }

    public static boolean findRotation(int[][] mat, int[][] target) {
        int count = 0;
        do {
            boolean valid = true;
            for (int i = 0; i < mat.length; i++) {
                for (int j = 0; j < mat[i].length; j++) {
                    if (mat[i][j] != target[i][j]) {
                        valid = false;
                    }
                }
            }
            if (valid == true) {
                return true;
            }
            rotate(mat);
            count++;
        } while (count <= 3);
        return false;
    }
}
