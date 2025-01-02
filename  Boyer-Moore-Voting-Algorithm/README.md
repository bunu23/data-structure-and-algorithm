# Boyer-Moore Voting Algorithm

The Boyer-Moore Voting Algorithm is used to find the majority element in an array, which is the element that appears more than `n/2` times where `n` is the size of the array.

## Algorithm Explanation

1. **Initialization**: Start with a candidate element and a count initialized to zero.
2. **Candidate Selection**: Traverse through the array. If the count is zero, set the current element as the candidate.
3. **Count Adjustment**: Increment the count if the current element is the candidate, otherwise decrement the count.
4. **Verification**: After the first pass, the candidate is the majority element. Verify it by counting its occurrences in the array.

## Java Implementation

```java
public class BoyerMooreVotingAlgorithm {
    public static int findMajorityElement(int[] nums) {
        int candidate = 0;
        int count = 0;

        // Phase 1: Find a candidate
        for (int num : nums) {
            if (count == 0) {
                candidate = num;
            }
            count += (num == candidate) ? 1 : -1;
        }

        // Phase 2: Verify the candidate
        count = 0;
        for (int num : nums) {
            if (num == candidate) {
                count++;
            }
        }

        if (count > nums.length / 2) {
            return candidate;
        } else {
            throw new IllegalArgumentException("No majority element found");
        }
    }

    public static void main(String[] args) {
        int[] nums = {3, 3, 4, 2, 4, 4, 2, 4, 4};
        System.out.println("Majority Element: " + findMajorityElement(nums));
    }
}
```

### **Complexity Analysis**

#### **Time Complexity**

- \( O(n) \): The algorithm traverses the array twice — once to select the candidate and once to verify it.

#### **Space Complexity**

- \( O(1) \): The algorithm uses a constant amount of additional space (variables for `candidate` and `count`).

---

### **Example Walkthrough**

#### Input: `nums = [3, 3, 4, 2, 4, 4, 2, 4, 4]`

1. **Phase 1: Candidate Selection**

   - Start with `candidate = null` and `count = 0`.
   - Process the array:
     - `3`: `candidate = 3`, `count = 1`
     - `3`: `count = 2`
     - `4`: `count = 1`
     - `2`: `count = 0` (reset candidate)
     - `4`: `candidate = 4`, `count = 1`
     - `4`: `count = 2`
     - `2`: `count = 1`
     - `4`: `count = 2`
     - `4`: `count = 3`

   Candidate after this phase: `4`.

2. **Phase 2: Verification**

   - Count occurrences of `4`:
     - \( \text{Occurrences of } 4 = 5 \)
   - Check if \( 5 > 9/2 \): Yes.

   Output: `The majority element is: 4`.

---

### **Edge Cases**

1. **No Majority Element**:

   - Input: `[1, 2, 3, 4]`
   - Candidate: `4` (after selection)
   - Verification: No element appears more than \( n/2 \).
   - Output: `No majority element found.`

2. **All Elements Same**:
   - Input: `[7, 7, 7, 7]`
   - Candidate: `7` (after selection)
   - Verification: `7` appears \( 4 > 4/2 \).
   - Output: `The majority element is: 7`.
