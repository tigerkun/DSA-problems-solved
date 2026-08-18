# Day 78 - Combination Sum II

## 🚀 LeetCode #40

### Problem

Given a collection of candidate numbers and a target integer, find all unique combinations in `candidates` where the candidate numbers sum to the target.

Each number in `candidates` may be used **only once** in a combination.

The solution set must not contain duplicate combinations.

### Example

**Input:**

```text
candidates = [10,1,2,7,6,1,5]
target = 8
```

**Output:**

```text
[
  [1,1,6],
  [1,2,5],
  [1,7],
  [2,6]
]
```

### 💡 Approach

This problem can be solved using **Backtracking**.

First, sort the array:

```text
[10,1,2,7,6,1,5]
        ↓
[1,1,2,5,6,7,10]
```

Sorting helps us:

* Detect duplicate values.
* Skip duplicate combinations.
* Stop early when a value becomes larger than the remaining target.

### 🔄 Backtracking Steps

For each element:

1. Add the current element to the combination.
2. Reduce the target by its value.
3. Recursively search for the remaining target.
4. Start from `i + 1` so the same element cannot be reused.
5. Remove the element when backtracking.
6. Skip duplicates at the same recursion level.

### ⚠️ Important Duplicate Condition

```java
if (i > start && nums[i] == nums[i - 1])
    continue;
```

This skips duplicate values **at the same recursion level**.

For example:

```text
[1,1,2,5,6,7,10]
 ↑ ↑
```

We don't start two identical combinations from the same level.

However, two `1`s can still be used in the same combination when they occur at different recursion levels:

```text
[1,1,6]
```

### 🔍 Example

For:

```text
candidates = [1,1,2,5,6,7,10]
target = 8
```

One valid path is:

```text
8
↓
choose 1 → remaining 7
↓
choose 1 → remaining 6
↓
choose 6 → remaining 0
```

Therefore:

```text
[1,1,6]
```

Another path:

```text
8
↓
choose 1 → remaining 7
↓
choose 7 → remaining 0
```

Therefore:

```text
[1,7]
```

### 💻 Java Solution

```java
import java.util.*;

class Solution {
    public List<List<Integer>> combinationSum2(int[] candidates, int target) {
        Arrays.sort(candidates);

        List<List<Integer>> result = new ArrayList<>();
        backtrack(candidates, target, 0, new ArrayList<>(), result);

        return result;
    }

    private void backtrack(int[] nums, int target, int start,
                           List<Integer> current,
                           List<List<Integer>> result) {

        if (target == 0) {
            result.add(new ArrayList<>(current));
            return;
        }

        for (int i = start; i < nums.length; i++) {
            if (i > start && nums[i] == nums[i - 1])
                continue;

            if (nums[i] > target)
                break;

            current.add(nums[i]);

            backtrack(
                nums,
                target - nums[i],
                i + 1,
                current,
                result
            );

            current.remove(current.size() - 1);
        }
    }
}
```

### ⏱️ Complexity

* **Time Complexity:** `O(2^n)` in the worst case, plus sorting.
* **Space Complexity:** `O(n)` for the recursion stack and current combination, excluding the output.

### 📌 Key Takeaways

The three most important points are:

```text
1. Sort the array
2. Use i + 1 → each element used only once
3. Skip duplicates → unique combinations
```

The key duplicate-handling condition is:

```java
if (i > start && nums[i] == nums[i - 1])
    continue;
```

### 🔗 LeetCode

**Problem:** Combination Sum II
**LeetCode:** #40
**Difficulty:** Medium
