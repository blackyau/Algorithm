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


## LeetCode_232_用栈实现队列

请你仅使用两个栈实现先入先出队列。队列应当支持一般队列支持的所有操作（push、pop、peek、empty）

https://leetcode-cn.com/problems/implement-queue-using-stacks/

难度：简单

要保证两个栈在进行操作到时候，都是整体进行操作。
- 1 号栈要往 2 号栈压入数据时，必须要一次性把所有数据压入。 
- 1 号栈迁移数据至 2 号栈的时候，要确定 2 号栈为空才行。

[LeetCode_232.java](src/LeetCode_232.java)


## LeetCode_239_滑动窗口最大值

给你一个整数数组 nums，有一个大小为 k 的滑动窗口从数组的最左侧移动到数组的最右侧。你只可以看到在滑动窗口内的 k 个数字。滑动窗口每次只向右移动一位。返回每一个滑动窗口中的最大值。

https://leetcode-cn.com/problems/sliding-window-maximum/

难度：困难

遍历整个数组，然后使用双端队列（弹出和入队在两边都行的队列）。一直让最大的数字保持在队列的头部，如果尾部来了更大的数字，就把头部弹出。同时如果队列的队头等于 `i-w` 就说明队头已过期，需要弹出队头。

[LeetCode_239.java](src/LeetCode_239.java)
