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
