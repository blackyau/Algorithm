# Algorithm
刷题记录

## LeetCode_155_最小栈

设计一个支持 push ，pop ，top 操作，并能在常数时间内检索到最小元素的栈。

https://leetcode-cn.com/problems/min-stack/

难度：简单

在类初始化的时候就用两个栈，一个是用来储存栈里面的数，另一个用来储存当前最小的那个数。

每一次 push 的时候，就取 当前最小数栈顶 和 当前数 之间最小的一个数进入最小栈。

相当于空间换时间吧，因为用了 1 倍的空间，储存了在每一个位置上的最小数。

[LeetCode_155.java](src/LeetCode_155.java)
