# HashMaps in Java

This directory contains Java implementations of HashMap-based problems, custom HashMap implementation, and practice examples using Java's built-in `HashMap` class.

The problems focus on using key-value pairs to solve array, string, frequency-counting, pair-sum, and prefix-sum problems efficiently.

## 📌 Topics Covered

- HashMap Fundamentals
- Frequency Counting
- Pair Sum and Complement Lookup
- Duplicate Removal
- Prefix Sum
- Longest Consecutive Sequence
- Character Frequency and Tracking
- Custom HashMap Implementation
- Java Built-in HashMap API

---

## 1. HashMap Algorithm Problems

The following 8 problems demonstrate how HashMaps can be used to optimize problem-solving.

| # | Problem | File | Approach | Key Concept |
|---|---|---|---|---|
| 1 | Array Intersection with Duplicates | `ArrayIntersection.java` | Frequency Counting | Track occurrences of elements in two arrays. |
| 2 | Count Pairs with Zero Sum | `PairSum.java` | Complement Lookup | Find matching negative values using frequencies. |
| 3 | Count Pairs with Difference K | `getPairsWIthDifferenceK.java` | Frequency Counting | Check previously encountered values with difference K. |
| 4 | Remove Duplicates | `RemoveDuplicates.java` | HashMap + Traversal | Preserve the first occurrence of each element. |
| 5 | Longest Subarray with Zero Sum | `lengthOfLongestSubsetWithZeroSum.java` | Prefix Sum + HashMap | Identify repeated prefix sums. |
| 6 | Longest Consecutive Sequence | `longestConsecutiveIncreasingSequence.java` | Visited Tracking | Expand through consecutive elements. |
| 7 | Maximum Frequency Number | `maxFreqNumber.java` | Frequency Counting | Find the element with the highest occurrence. |
| 8 | Unique Characters | `uniqueChar.java` | Character Tracking | Preserve characters appearing for the first time. |

### Problem Approaches

#### 1. Array Intersection with Duplicates
**File:** `ArrayIntersection.java`

**Approach:** Frequency Counting

- Traverse the first array and store the frequency of each element in a HashMap.
- Traverse the second array.
- If an element exists in the map with a positive frequency, include it in the intersection.
- Decrease its frequency after using it.

**Key Learning:** A HashMap can maintain the occurrence count of elements and help handle duplicates correctly.

#### 2. Count Pairs with Zero Sum
**File:** `PairSum.java`

**Approach:** Complement Lookup

- Store the frequency of encountered elements.
- For every element, look for its negative counterpart.
- Use the stored frequency to calculate the number of valid pairs.
- Handle repeated zero values using the combination formula:

\[
\frac{n(n-1)}{2}
\]

**Key Learning:** Instead of searching for pairs using nested loops, use a HashMap to find complementary values.

#### 3. Count Pairs with Difference K
**File:** `getPairsWIthDifferenceK.java`

**Approach:** Frequency Counting

- Traverse the array.
- Check whether `i - K` or `i + K` has already been encountered.
- Add the corresponding stored frequency to the pair count.
- Maintain frequencies of previously encountered elements.

**Key Learning:** HashMaps help identify valid pairs by checking required differences efficiently.

#### 4. Remove Duplicates
**File:** `RemoveDuplicates.java`

**Approach:** HashMap + Traversal

- Traverse the input elements.
- Check whether an element has already appeared.
- Add only its first occurrence to the result.
- Record encountered elements in the HashMap.

**Key Learning:** HashMaps can track previously encountered elements while preserving the original traversal order in the result.

#### 5. Longest Subarray with Zero Sum
**File:** `lengthOfLongestSubsetWithZeroSum.java`

**Approach:** Prefix Sum + HashMap

- Calculate the running prefix sum while traversing the array.
- Store prefix sums and their positions.
- If the same prefix sum appears again, the subarray between those positions has a sum of zero.
- Use the positions to calculate the maximum subarray length.

**Key Learning:** Repeated prefix sums help identify subarrays with a target sum of zero.

#### 6. Longest Consecutive Sequence
**File:** `longestConsecutiveIncreasingSequence.java`

**Approach:** Visited Tracking

- Store array values and their indices.
- Maintain a visited structure to avoid processing elements repeatedly.
- Expand in both upward and downward directions through consecutive numbers.
- Track the longest consecutive sequence.

**Key Learning:** HashMaps can be used for efficient value lookup and index tracking.

#### 7. Maximum Frequency Number
**File:** `maxFreqNumber.java`

**Approach:** Frequency Counting

- Count the frequency of every number using a HashMap.
- Identify the maximum frequency.
- Traverse the original array to return the first element having that maximum frequency.

**Key Learning:** Frequency maps are useful for identifying the most frequently occurring elements.

#### 8. Unique Characters
**File:** `uniqueChar.java`

**Approach:** Character Tracking

- Traverse the input string character by character.
- Maintain a character-to-boolean mapping.
- Append a character only if it has not appeared previously.
- Mark the character as encountered.

**Key Learning:** HashMaps can track character occurrences and help remove duplicate characters while preserving their original order.

---

## 2. Custom HashMap Implementation from Scratch

This section contains a generic HashMap implementation built using arrays and linked lists.

Unlike using Java's built-in HashMap, this implementation demonstrates how a HashMap works internally.

### Files

| File | Description |
|---|---|
| `MapNode.java` | Defines a linked-list node containing a key, value, and next pointer. |
| `Map.java` | Implements the generic HashMap and its core operations. |
| `MapUse.java` | Demonstrates inserting, retrieving, and removing entries using the custom HashMap. |

### Internal Architecture

The custom HashMap uses:

- An array of buckets.
- Hashing to determine bucket positions.
- Linked lists to handle collisions.
- Rehashing to increase capacity when necessary.

### How Hashing Works

The process of storing a key-value pair:

```text
        Key
         |
         v
     hashCode()
         |
         v
  Hash Code Calculation
         |
         v
  Bucket Index Calculation
         |
         v
       Bucket
         |
         v
 Linked List of MapNodes
         |
         v
    Key-Value Pair
```

The hash code is used to determine the bucket in which an entry should be stored.

### Collision Handling – Separate Chaining

A collision occurs when multiple keys map to the same bucket.

This implementation handles collisions using **Separate Chaining**.

Each bucket can contain a linked list of nodes.

```text
Bucket Array

Index 0  --->  Node A  --->  Node B  --->  null

Index 1  --->  Node C  --->  null

Index 2  --->  null

Index 3  --->  Node D  --->  Node E  --->  null
```

Multiple key-value pairs can exist in the same bucket through linked-list connections.

### Operations Implemented

| Operation | Description |
|---|---|
| `insert()` | Inserts a key-value pair into the HashMap. |
| `getValue()` | Retrieves the value associated with a given key. |
| `removeKey()` | Removes an entry using its key. |
| `size()` | Returns the number of stored entries. |
| `loadFactor()` | Represents the ratio of stored entries to bucket capacity. |
| `reHash()` | Increases bucket capacity and redistributes existing entries. |

### Load Factor and Rehashing

The load factor represents how full the HashMap is.

The implementation uses a threshold of `0.7`.

When the load factor exceeds this threshold, rehashing is triggered.

```java
if ((1.0 * count) / numBuckets > 0.7) {
    reHash();
}
```

**Rehashing process:**

1. Increase the number of buckets.
2. Create a new bucket array.
3. Recalculate the bucket positions of existing keys.
4. Reinsert all existing entries into the new array.

The bucket count is doubled during rehashing.

**Key Learning:** Rehashing helps maintain efficient HashMap operations as the number of stored entries increases.

---

## 3. Java Built-in HashMap Practice

**File:** `InbuiltMapUse.java`

This file demonstrates the usage of Java's built-in `HashMap` class.

### Important Methods

| Method | Description |
|---|---|
| `put()` | Inserts or updates a key-value pair. |
| `get()` | Retrieves the value associated with a key. |
| `containsKey()` | Checks whether a particular key exists. |
| `remove()` | Removes an entry using its key. |
| `keySet()` | Returns the set of keys. |
| `size()` | Returns the number of entries. |

### Example

```java
import java.util.HashMap;

public class InbuiltMapUse {

    public static void main(String[] args) {

        HashMap<String, Integer> map = new HashMap<>();

        // Insert key-value pairs
        map.put("Java", 90);
        map.put("Python", 85);
        map.put("JavaScript", 95);

        // Retrieve a value
        System.out.println(map.get("Java"));

        // Check whether a key exists
        System.out.println(map.containsKey("Python"));

        // Remove an entry
        map.remove("Python");

        // Display all keys
        System.out.println(map.keySet());

        // Display size
        System.out.println(map.size());
    }
}
```

**Key Learning:** Understanding Java's built-in HashMap methods and their usage in practical programming.

---

## 4. Dynamic Programming Files Currently in This Folder

The following three files are currently located inside the `HashMaps` directory, but they implement Dynamic Programming concepts rather than HashMap algorithms.

| File | Problem | Approach |
|---|---|---|
| `MinSquares.java` | Minimum number of perfect-square components | Dynamic Programming |
| `countMinStepsToOne.java` | Minimum steps to reduce a number to one | Memoization |
| `staircase.java` | Count ways to climb a staircase | Tabulation |

### Problem Overview

**MinSquares.java**
- Finds the minimum number of perfect-square components required.
- Uses Dynamic Programming to calculate the result.

**countMinStepsToOne.java**
- Calculates the minimum operations required to reduce a number to one.
- Uses memoized recursion with operations involving `n-1`, `n/2`, and `n/3`.

**staircase.java**
- Calculates the number of ways to reach a staircase using jumps of 1, 2, or 3 steps.
- Uses tabulation to build the solution.

**Note:** These files are documented here because they currently exist in the directory. They can be moved into a separate Dynamic Programming package to maintain better project organization.

---

## 5. Important HashMap Patterns Practiced

The following patterns are covered through the problems in this directory.

| # | Pattern | Where It Is Used | Purpose |
|---|---|---|---|
| 1 | Frequency Counting | Array Intersection, Pair Sum, Maximum Frequency | Count occurrences of elements. |
| 2 | Complement Lookup | Pair Sum | Find matching values using a target or complementary value. |
| 3 | Visited-Element Tracking | Longest Consecutive Sequence | Avoid processing elements repeatedly. |
| 4 | Prefix-Sum Lookup | Longest Subarray with Zero Sum | Identify subarrays using repeated prefix sums. |
| 5 | Value-to-Index Mapping | Longest Consecutive Sequence | Associate values with their original positions. |
| 6 | Duplicate Removal | Remove Duplicates, Unique Characters | Track previously encountered elements. |
| 7 | Separate Chaining | Custom HashMap | Handle collisions using linked lists. |
| 8 | Rehashing | Custom HashMap | Expand bucket capacity when the load factor exceeds the threshold. |

---

## 6. Key Takeaways

By working through these implementations, the following concepts are practised:

- Using key-value pairs for efficient data lookup.
- Maintaining element frequencies with HashMaps.
- Solving pair-counting problems using complement lookup.
- Applying prefix sums to identify subarrays with zero sum.
- Tracking visited elements to avoid redundant processing.
- Preserving the order of unique elements.
- Understanding collision handling through separate chaining.
- Implementing rehashing to manage HashMap capacity.
- Working with Java's built-in HashMap API.

---

## 7. Directory Overview

```text
HashMaps/
│
├── ArrayIntersection.java
├── PairSum.java
├── getPairsWIthDifferenceK.java
├── RemoveDuplicates.java
├── lengthOfLongestSubsetWithZeroSum.java
├── longestConsecutiveIncreasingSequence.java
├── maxFreqNumber.java
├── uniqueChar.java
│
├── MapNode.java
├── Map.java
├── MapUse.java
│
├── InbuiltMapUse.java
│
├── MinSquares.java
├── countMinStepsToOne.java
└── staircase.java
```

---

## 8. Summary

| Category | Number of Files |
|---|---:|
| HashMap Algorithm Problems | 8 |
| Custom HashMap Implementation | 2 |
| Custom HashMap Demonstration | 1 |
| Built-in HashMap Practice | 1 |
| Dynamic Programming Files | 3 |
| **Total** | **15** |

**Overall:** This directory covers HashMap-based problem-solving, practical usage of Java's built-in HashMap, and the internal implementation of a generic HashMap using hashing, buckets, linked lists, collision handling, and rehashing.
