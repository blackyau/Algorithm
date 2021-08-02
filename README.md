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


## LeetCode_129_求根节点到叶节点数字之和

给你一个二叉树的根节点 root ，树中每个节点都存放有一个 0 到 9 之间的数字。
每条从根节点到叶节点的路径都代表一个数字：

https://leetcode-cn.com/problems/sum-root-to-leaf-numbers/

例如，从根节点到叶节点的路径 1 -> 2 -> 3 表示数字 123 。计算从根节点到叶节点生成的 所有数字之和。

难度：中等

看到题目马上就想到了二叉树的前序遍历，结合递归就行。主要就是不确定当前是第几层要乘以 10 的多少次方，看了题解才知道，可以直接一直传一个值。每递归一次就 * 10 再加上自己的值。

[LeetCode_129.java](src/LeetCode_129.java)


## LeetCode_236_二叉树的最近公共祖先

给定一个二叉树, 找到该树中两个指定节点的最近公共祖先。

https://leetcode-cn.com/problems/lowest-common-ancestor-of-a-binary-tree/

难度：中等

这个题目主要是对最近公共祖先的理解，要用递归的方式去思考。如果确认 root 节点为 q,p 的公共祖先后，而且 root.left 和 root.right 都不是 p,q 的公共祖先。那么就称 root 为**最近**公共祖先。

把整个数分成两半，使用递归的话，就假设已经找到两边的公共祖先了。那么 4 种情况：

- 左右都为空：左右都没找到，说明无解直接返回 null
- 左有右无：最近公共祖先在左边，就返回左边的。
- 左无右有：最近公共祖先在右边，就返回右边的。
- 左右都有：自己正好在 q 和 p 的中间，那就是自己。

对于最后一种情况，看起来似乎和最开始说的规则有冲突，其实不然。是因为递归出口也包含 `root == q || root == p` 因为最近公共祖先的位置肯定是高于或等于 q 或 p 的所以这里也要作为一个递归出口。

[LeetCode_236.java](src/LeetCode_236.java)


## LeetCode_113_路径总和II

给你二叉树的根节点 root 和一个整数目标和 targetSum ，找出所有从根节点到叶子节点 路径总和等于给定目标和的路径。

https://leetcode-cn.com/problems/path-sum-ii/

难度：中等

使用 DFS 的方式搜索数据，每到达一个节点就用 targetSum 减去当前节点的数值。并把自己添加到 path 里面用于储存一条路径。同时还要注意在每一条路径 return 之前都要把当前 path 的最后一个删掉，不然会导致对其他分支产生污染。这种方法也叫回溯。

[LeetCode_113.java](src/LeetCode_113.java)


## UVa133_救济金发放

n(n<20)个人站成一圈，逆时针编号为1～n。有两个官员，A从1开始逆时针数，B从n开始顺时针数。在每一轮中，官员A数k个就停下来，官员B数m个就停下来（注意有可能两个官员停在同一个人上）。接下来被官员选中的人（1个或者2个）离开队伍。
输入n，k，m输出每轮里被选中的人的编号（如果有两个人，先输出被A选中的）。

例如，n=10，k=4，m=3，输出为4 8, 9 5, 3 1, 2 6,10, 7。注意：输出的每个数应当恰好占3列。

https://onlinejudge.org/external/1/133.pdf

通过一个数组来维护每个人走没走，最主要的就是数人数，我是用了求余来确保让数字在 1~n 之间，同时还需要注意数编号时有负数的情况，所以求余的核心代码为 `now = (now + step + n + 1) % (n+1)`

看到这个就想起了，循环队列为了解决数据假满的解决方案。

[UVa133.java](src/UVa133.java)


## LeetCode_3_无重复字符的最长子串

给定一个字符串 s ，请你找出其中不含有重复字符的 最长子串 的长度。

https://leetcode-cn.com/problems/longest-substring-without-repeating-characters/

难度：中等

使用滑动窗口，右端一步一步的往右边移动，如果有重复的字符出现，就把左端的移动到重复字符第一次出现时的位置的下一个位置。

使用了 HashMap 来快速获取，重复字符上一次出现的位置。其实也可以用 ASCII 码来存储字符出现过的下标，可以进一步降低时间复杂度。

[LeetCode_3.java](src/LeetCode_3.java)


## LeetCode_1736_替换隐藏数字得到的最晚时间

给你一个字符串 time ，格式为 hh:mm（小时：分钟），其中某几位数字被隐藏（用 ? 表示）。

有效的时间为 00:00 到 23:59 之间的所有时间，包括 00:00 和 23:59 。

替换 time 中隐藏的数字，返回你可以得到的最晚有效时间。

https://leetcode-cn.com/problems/latest-time-by-replacing-hidden-digits/

难度：简单

- 第一位最大为 2 或 1，当第二位在 [4,9] 之间的时候（注意 `'?'` 的 ASCII 码要比 `'9'` 大，还要考虑第二位为 ? 时的情况），就只能取到 1，此外都可以取到 2 。因为时只有 23,没有24,25等
- 第二位最大为 3 或 9，当第一位为 2 的时候就可以取到 3，其他时候都只能取 9
- 第三位始终为 :
- 第四位最大取 5
- 第五位最大取 9

[LeetCode_1736.java](src/LeetCode_1736.java)


## LeetCode_1743_从相邻元素对还原数组

存在一个由 n 个不同元素组成的整数数组 nums ，但你已经记不清具体内容。好在你还记得 nums 中的每一对相邻元素。

给你一个二维整数数组 adjacentPairs ，大小为 n - 1 ，其中每个 adjacentPairs[i] = [ui, vi] 表示元素 ui 和 vi 在 nums 中相邻。

题目数据保证所有由元素 nums[i] 和 nums[i+1] 组成的相邻元素对都存在于 adjacentPairs 中，存在形式可能是 [nums[i], nums[i+1]] ，也可能是 [nums[i+1], nums[i]] 。这些相邻元素对可以 按任意顺序 出现。

返回 原始数组 nums 。如果存在多种解答，返回 其中任意一个 即可。

https://leetcode-cn.com/problems/restore-the-array-from-adjacent-pairs/

难度：中等

用 HashMap 统计出来每一个数字，所有与它相邻的数字，作为 value。然后通过判断 value 数组的长度，长度为一的它就是 nums 中的开头或结尾。接下来，在依次从左到右找到每一个元素的相邻位即可。

[LeetCode_1743.java](src/LeetCode_1743.java)


## Offer_5_替换空格

请实现一个函数，把字符串 s 中的每个空格替换成"%20"。

https://leetcode-cn.com/problems/ti-huan-kong-ge-lcof/

难度：简单

用的 StringBuilder

[Offer_5.java](src/Offer_5.java)


## LeetCode_671_二叉树中第二小的节点

给定一个非空特殊的二叉树，每个节点都是正数，并且每个节点的子节点数量只能为 2 或 0。如果一个节点有两个子节点的话，那么该节点的值等于两个子节点中较小的一个。

更正式地说，root.val = min(root.left.val, root.right.val) 总成立。

给出这样的一个二叉树，你需要输出所有节点中的第二小的值。如果第二小的值不存在的话，输出 -1 。

https://leetcode-cn.com/problems/second-minimum-node-in-a-binary-tree/

难度：简单

通过题目可以得知，根节点就是最小的一个节点。所以我们的目标就是要找一个比根节点大，但是在其他节点中最小的一个节点。

而且利用题目这个含义，还可以剪枝，如果当前节点的值大于根结点的话，就可以不进入了。子树的根节点都比它大了，其他节点肯定都更大，那肯定不用继续找了。

[LeetCode_671.java](src/LeetCode_671.java)


## LeetCode_863_二叉树中所有距离为 K 的结点

给定一个二叉树（具有根结点 root）， 一个目标结点 target ，和一个整数值 K 。

返回到目标结点 target 距离为 K 的所有结点的值的列表。 答案可以以任何顺序返回。

https://leetcode-cn.com/problems/all-nodes-distance-k-in-binary-tree/

难度：中等

先遍历整个树，把所有节点的父节点都储存起来。然后再用 DFS，从 target 开始同时遍历左节点、右节点、父节点。

为层数使用了参数传递，每递归一次就 + 1，所以还需要使用了 from 参数，用来确定这一次递归时是从哪里来的。当从上往下进行递归的时候，就要确保它不会从下网上走回头路。

[LeetCode_863.java](src/LeetCode_863.java)


## LeetCode_1104_二叉树寻路

在一棵无限的二叉树上，每个节点都有两个子节点，树中的节点 逐行 依次按 “之” 字形进行标记。

如下图所示，在奇数行（即，第一行、第三行、第五行……）中，按从左到右的顺序进行标记；

而偶数行（即，第二行、第四行、第六行……）中，按从右到左的顺序进行标记。

给你树上某一个节点的标号 label，请你返回从根节点到该标号为 label 节点的路径，该路径是由途经的节点标号所组成的。

https://leetcode-cn.com/problems/path-in-zigzag-labelled-binary-tree/

难度：中等

重点在对于完全二叉树公式的应用，当前节点所在层数 log_2{N} 向下取整，当前节点的父节点 N/2，当前节点的上一层节点的第一个 2^{当前节点层数-1}，当前节点的上一层节点的最后一个 2^{当前节点层数}-1。

对于这里的之字排序，可以找规律。当前节点的上一层其中的最左边的数字 + 最右边的数字的和，用来减去 (当前节点值/2) 就是当前节点的父节点了。这到题就用数学的方式解出来了。

[LeetCode_1104.java](src/LeetCode_1104.java)


## LeetCode_171_Excel表列序号

给定一个Excel表格中的列名称，返回其相应的列序号。

https://leetcode-cn.com/problems/excel-sheet-column-number/

难度：简单

26 进制数转 10 进制。学习到一种新方法 `ans = ans * 进制 + 当前位数` 用这种方式在 for 循环里面也可以计算出来进制转换之后的数，比 当前位数 * 权值要更优雅一点。

本质也就是把数往前面推进一位，比如 100 -> 1000 也就是把最前面的 1 往前推进了一位，也就是乘了一个进制。

[LeetCode_171.java](src/LeetCode_171.java)


## LeetCode_987_二叉树的垂序遍历

https://leetcode-cn.com/problems/vertical-order-traversal-of-a-binary-tree/

难度：困难

首先建立一个 HashMap 将节点作为 Key，在使用 DFS 遍历每一个节点的 [row, col, val] 作为 value。

然后使用排序，首先将列比较小的放在最前面，其次就是把行比较小的放前面，最后就是看 val 最小的放前面。

排序完毕后，再遍历所有数据的这个列表，把为同一列的节点数据放在一个 tmpList 中。这里使用了双指针，for 循环最外部的为 i，内部有一个自增的 j。

- 每次循环的时候都先判断一下，j 是否还在合法的范围内
- 再判断是否为同一列
- 最后再将 val 添加进 tmpList
- 循环结束后将 `i = j`

[LeetCode_987.java](src/LeetCode_987.java)


## LeetCode_1337_矩阵中战斗力最弱的 K 行

https://leetcode-cn.com/problems/the-k-weakest-rows-in-a-matrix/

难度：简单

遍历矩阵的每一行，用一个新的数组用来储存那一行里面 1 的个数和行数。然后按个数排序一下，最后输出。

[LeetCode_1337.java](src/LeetCode_1337.java)


## LeetCode_743_网络延迟时间

https://leetcode-cn.com/problems/network-delay-time/

难度：中等
 
最短路径，使用了堆优化版的 Dijkstra 算法，使用邻接表储存节点信息。从一个节点出发，每次都找一下从起始点开始的权值到下一个节点的权值之和谁最小。遍历完毕后的 dis[] 数组储存的就是，从起始节点到 i 节点的权值最小值是多少。最后返回权值最大的一个节点的权值就行。

[LeetCode_743.java](src/LeetCode_743.java)

