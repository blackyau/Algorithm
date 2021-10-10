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


## LeetCode_581_最短无序连续子数组

给你一个整数数组 nums ，你需要找出一个 连续子数组 ，如果对这个子数组进行升序排序，那么整个数组都会变为升序排序。

请你找出符合题意的 最短 子数组，并输出它的长度。

https://leetcode-cn.com/problems/shortest-unsorted-continuous-subarray/

难度：中等

输入[2, 3, 11, 8, 10, 9, 15, 22]
算法流程:
从左往右遍历数组, 发现 {15, 22} 是递增的, 同时 15 比前面所有的元素都大, 说明 {15, 22} 的位置已经固定了
从右往左遍历数组, 发现 {2, 3} 是递增的, 同时 3 比右边所有的元素都小, 所以 {2,3} 的位置也已经固定了

左往右遍历数组, 记录 arr[i] 左侧的最大值, 如果 arr[i]>=max, 就更新 max,
如果 arr[i]<max, 则使用变量 right 记录索引 i; 遍历结束后,right 右侧的部分不需要排序.
(right 左侧的部分可能需要全部排序或者部分排序,需要根据从右往左遍历的结果决定)

从右往左遍历数组, 记录 arr[i] 右侧的最小值, 如果 arr[i]<=min, 就更新 min,
如果 arr[i]>min, 则使用变量 left 记录索引 i; 遍历结束后, left 左侧的部分不需要排序

如果数组本身就是递增的 [1,2,3,4] 那么在遍历的时候，max 和 min 会被不停的刷新，left 和 right 会一直都是原始值 {-1, 0}，经过 `right - left + 1` 就会输出 0

[LeetCode_581.java](src/LeetCode_581.java)


## LeetCode_802_找到最终的安全状态

在有向图里面找没有环的路径

https://leetcode-cn.com/problems/find-eventual-safe-states/

难度：中等

用 DFS 遍历搜索所有节点，并使用一个单独的数组来储存该节点的信息。

- 0:该节点未被访问
- 1:该节点位于递归栈中或者在某个环上
- 2:该节点搜索完毕是个安全节点

DFS 搜索使用的以下方法

```java
class Solution {
    public boolean safe (int[][] graph, int[] flag, int x) {  // 返回 true 表示安全，返回 false 表示不安全
        if (flag[x] > 0) return flag[x] == 2;  // 当前节点值如果被遍历过，就只需要看它是否安全就行，如果没有被遍历过默认为 0 就执行下面的
        flag[x] = 1;  // 开始遍历该节点，就设置为 1
        for (int y : graph[x]) {  // 遍历该节点的所有出度
            if (!safe(graph, flag, y)) {  // 递归看看这个出度是不是安全的（有没有终点）
                return false;  // 如果这个出度没有终点，这次就返回 false
            }
        }
        flag[x] = 2;  // 这个节点所有的出度都遍历完了，都有终点或者是本来就没有出度
        return true;  // 就确定这是个安全的节点咯
    }
}
```

[LeetCode_802.java](src/LeetCode_802.java)

## LeetCode_416_分割等和子集

给你一个 只包含正整数 的 非空 数组 nums 。请你判断是否可以将这个数组分割成两个子集，使得两个子集的元素和相等。

难度：中等

背包问题练习，使用了一位空间优化的方法。一维空间的话，在遍历的时候就要从大到小进行遍历。

[LeetCode_416.java](src/LeetCode_416.java)


## LeetCode_847_访问所有节点的最短路径

存在一个由 n 个节点组成的无向连通图，图中的节点按从 0 到 n - 1 编号。

给你一个数组 graph 表示这个图。其中，graph[i] 是一个列表，由所有与节点 i 直接相连的节点组成。

返回能够访问所有节点的最短路径的长度。你可以在任一节点开始和停止，也可以多次重访节点，并且可以重用边。

难度：困难

使用的 BFS 遍历所有节点。使用了状态压缩记录遍历节点的状态信息，使用了类似于子网掩码的方式，`001` 就是节点 1 遍历过，`100` 就是节点 3 遍历过。状态压缩的基本操作如下：

- 访问第 i 个点的状态：`state=(1 << i) & mask`
- 更改第 i 个点状态为 1：`mask = mask | (1 << i)`

因为题目不限制起点，所以一开始的时候，就要把所有点都压入队列中，并在状态信息里面只把他们自己设置为已遍历，其他节点都是未遍历。

然后还有一个 vis 数组用来用来储存在同一个状态下的节点访问情况，防止重复扩展。

[LeetCode_847.java](src/LeetCode_847.java)


## LeetCode_457_环形数组是否存在循环

难度：中等

使用的快慢指针，对于走过了的节点都做了置 0 处理。同时还有要在数组中训练的一些写法，就像循环队列一样吧。

`j = (i + nums[i] + 1000*nums.length) % nums.length;`

[LeetCode_457.java](src/LeetCode_457.java)


## LeetCode_1137_第 N 个泰波那契数

难度：简单

一开始直接用递归会超时，加了个数组储存计算过的数字就过了，后面看了看动态规划的也写了一遍，进一步降低空间复杂度。


## LeetCode_264_丑数 II

给你一个整数 n ，请你找出并返回第 n 个 丑数 。

丑数 就是只包含质因数 2、3 和/或 5 的正整数。

难度：中等

方法1：小顶堆和集合，先把初始值 1 放进小顶堆，弹出堆顶后，然后分别用 2,3,5 去乘再把乘了过后的值先放进 Set 去重，在放进小顶堆。后面再取出堆的顶部，再去乘，再放进堆。当第 n 次取出来的时候，就是答案了。注意一下创建集合和小顶堆（优先级队列）的方法。

```java
Set<Long> set = new HashSet<>();
Queue<Long> pq = new PriorityQueue<>();
```

方法2：使用三个指针来指向目标序列 arr 的某个下标（下标 0 作为哨兵不使用，起始都为 1），使用 arr[下标] * 质因数 代表当前使用到三个有序序列中的哪一位，同时使用 i 表示当前生成到 i 哪一位丑数。

一开始，丑数只有{1}，1可以同2，3，5相乘，取最小的1×2=2添加到丑数序列中。

现在丑数中有{1，2}，在上一步中，1已经同2相乘过了，所以今后没必要再比较1×2了，我们说1失去了同2相乘的资格。

现在1有与3，5相乘的资格，2有与2，3，5相乘的资格，但是2×3和2×5是没必要比较的，因为有比它更小的1可以同3，5相乘，所以我们只需要比较1×3，1×5，2×2。

依此类推，每次我们都分别比较有资格同2，3，5相乘的最小丑数，选择最小的那个作为下一个丑数，假设选择到的这个丑数是同i（i=2，3，5）相乘得到的，所以它失去了同i相乘的资格，把对应的pi++，让pi指向下一个丑数即可。

使用小顶堆的话，就是先存后排序，而使用动态规划就是先排序后存。

[LeetCode_264.java](src/LeetCode_264.java)


## LeetCode_313_超级丑数

超级丑数 是一个正整数，并满足其所有质因数都出现在质数数组 primes 中。

给你一个整数 n 和一个整数数组 primes ，返回第 n 个 超级丑数 。

难度：中等

这个题和 [LeetCode_264_丑数 II](https://github.com/blackyau/Algorithm#leetcode_264_%E4%B8%91%E6%95%B0-ii) 比较类似，只是这道题指定了质因数。我就按照之前的做法，创建了一个数组用来储存每一个质因数的指针。每一趟计算完后，再去遍历一趟看看这次循环用了哪一个质因数，再去把指针 + 1。

[LeetCode_313.java](src/LeetCode_313.java)


## LeetCode_413_等差数列划分

如果一个数列 至少有三个元素 ，并且任意两个相邻元素之差相同，则称该数列为等差数列。

例如，[1,3,5,7,9]、[7,7,7,7] 和 [3,-1,-5,-9] 都是等差数列。
给你一个整数数组 nums ，返回数组 nums 中所有为等差数组的 子数组 个数。

难度：中等

先确定了数列的最后两项 `sums[i] 和 sums[i-1]` 然后求出他们两个之间的差值，如果继续往前进行遍历的时候，发现 `sums[i-1] - sums[i-2]` 的差值也和前面一样，那说明就成了一个序列，这时我们就把计数器 +1。

下一次遍历的时候，如果增加了一个数，它就会在之前数量的基础上增加一个，因为还是会遍历到上一轮遍历的位置。因此我们要计算的时候，就不用每一轮开始之前还把计数器清空。

只有当遍历的时候，发现差值和之前的不一样了，那才把计数器清空。

[LeetCode_413.java](src/LeetCode_413.java)


## LeetCode_446_等差数列划分 II - 子序列

https://leetcode-cn.com/problems/arithmetic-slices-ii-subsequence/

难度：困难

使用一个数组，下标以 nums 的下标一一对应，表示以 `nums[i]` 作为结尾的数组，有多少个不同差值的数组。也就是说 `nums[i]` 里面是一个 HashMap，其中的 Key 为差值，Value 为计数器。

将该数组初始化了之后，就使用两个 for 嵌套循环，去计算每两个数之间的差值

```java
for (int i = 1; i < len; i++) {   // 以 i 结尾的数
    for (int j = 0; j < i; j++) { // i 前面的那一位数
        long diff = (long) nums[i] - nums[j];  // 差值
        if (diff > Integer.MAX_VALUE || diff < Integer.MIN_VALUE) {  // 处理特殊情况
            continue;
        }
        // dp[i][diff] += (dp[j][diff] + 1)  先看自己在这个差值之下有多少计数，然后再把前一个数在同一个计数情况下的计数器+1，因为就相当于把这个差值数组连接上了 i 多了一位了
        dp[i].put(diff, dp[i].getOrDefault(diff, 0) + dp[j].getOrDefault(diff, 0) + 1);
        // 这次两个数的差值，与之前的等差数列公差相等的时候，说明可以接上，此时计算+1
        if (dp[j].containsKey(diff)) {
            res += dp[j].get(diff);  // 对结果的贡献「恰好是」之前的某个 j 的对应状态值，这里的 j 一定会在之前的某一个 i 加上 1，看上面有注释的那一行代码
        }
    }
}
return res;
```

[LeetCode_446.java](src/LeetCode_446.java)


## LeetCode_516_最长回文子序列

给你一个字符串 s ，找出其中最长的回文子序列，并返回该序列的长度。

子序列定义为：不改变剩余字符顺序的情况下，删除某些字符或者不删除任何字符形成的一个序列。

https://leetcode-cn.com/problems/longest-palindromic-subsequence/

难度：中等

主要参考了这个题解 [子序列问题通用思路|最长回文子序列](https://leetcode-cn.com/problems/longest-palindromic-subsequence/solution/zi-xu-lie-wen-ti-tong-yong-si-lu-zui-chang-hui-wen/)。

看题目要求一旦涉及到子序列和最值，那几乎可以肯定，考察的是动态规划技巧，时间复杂度一般都是 O(n^2)。因为字符串的子序列的可能性起码都是指数级别的，这种情况下就要使用动态规划。使用动态规划的话，就要定义 dp 数组，我们就要来找状态转移关系。

我们使用了两个指针，一前一后 i,j。然后就要开始用归纳思维了，如何从已知得到未知。具体的来说如果我们想求 `dp[i][j]`，假设你知道了子问题 `dp[i+1][j-1]` 的结果（`s[i+1..j-1]` 中最长回文子序列的长度），你是否能想办法算出 `dp[i][j]` 的值（`s[i..j]` 中，最长回文子序列的长度）呢？

我们可以直接看 `s[i]` 和 `s[j]` 的字符，如果他们两个是一样的，说明他们两个组成了一个更长的回文数。这样的话就只需要在前一个回文数的基础上 +2 就行了，也就是 `dp[i][j] = dp[i+1][j-1] + 2` 为什么这里是 `i+1` 和 `j-1` 是因为，i 在前面而 j 在后面，有点相当于是从中间开始往两边算的。

那如果 `s[i]` 和 `s[j]` 不一样的话，我们就看 `dp[i+1][j]` 和 `dp[i][j-1]` 到底哪个更大了。所以这道题的状态转移方程为

```java
if (s[i] == s[j])
    // 它俩一定在最长回文子序列中
    dp[i][j] = dp[i + 1][j - 1] + 2;
else
    // s[i+1..j] 和 s[i..j-1] 谁的回文子序列更长
    dp[i][j] = max(dp[i + 1][j], dp[i][j - 1]);
```

还有一些实现上面的问题，如果之后一个字符那么回文序列的长度也为 1，同时因为我们一开始就规定了 i 在前面，j 在后面。那么遍历的时候，如果还反了，那根本不存在，所以在 dp 数组初始化的时候要弄成 0。

以及我们在计算的时候，`dp[i][j]` 都是依赖于 `dp[i+1][j]`、`dp[i][j-1]`、`dp[i+1][j-1]` 的，所以我们要先把他们算出来。吧这个数组放在一个矩阵里面来看的时候，就相当于是要从下往上同时从左往右算。所以 for 循环的遍历，也是逆序的。

[LeetCode_516.java](src/LeetCode_516.java)


## LeetCode_233_数字 1 的个数

给定一个整数 n，计算所有小于等于 n 的非负整数中数字 1 出现的个数。

https://leetcode-cn.com/problems/number-of-digit-one/

难度：困难

把每一位数都当作一个行李箱用来拨动的密码锁，我们只需要看每一位可以波动几次 1 然后再把所有位出现 1 的次数都相加起来就可以。

通过把数分成 3 个部分来看，在左边的为高位，在中间的为当前位，在右边的为低位。通过讨论和观察规律，出现的次数与当前位的数字有关。（`num`为当前位的位因子，个位为 1，十位为 10，百位为 100）

- 当前位等于 0：次数 = 高位 * num
- 当前位等于 1：次数 = 高位 * num + 低位 + 1
- 当前位大于 1：次数 = 高位 * num + num

通过这样的规律计算每一位的次数，在全部加起来就可以了。

[LeetCode_233.java](src/LeetCode_233.java)


## LeetCode_526_优美的排列

假设有从 1 到 N 的 N 个整数，如果从这 N 个数字中成功构造出一个数组，使得数组的第 i 位 (1 <= i <= N) 满足如下两个条件中的一个，我们就称这个数组为一个优美的排列。条件：

第 i 位的数字能被 i 整除
i 能被第 i 位上的数字整除
现在给定一个整数 N，请问可以构造多少个优美的排列？

难度：中等

使用状态压缩 DP，使用一个二进制数表示当前哪些数已被选，哪些数未被选，目的是为了可以使用位运算进行加速。再使用二维数组 f[i][state] 为考虑前 i 个数，且当前选择方案为 state 的所有方案数量。

然后就可以使用 3 层 for 循环来解决该问题，最外层的枚举一共有几位数，第二层循环枚举所有排列情况，第三层循环枚举最后一位的数。

[LeetCode_526.java](src/LeetCode_526.java)


## LeetCode_552_学生出勤记录 II

https://leetcode-cn.com/problems/student-attendance-record-ii/

难度：困难

使用带记忆的 DFS 搜索，首先创建了数组 `int[last][acount][lcount] cache` 当前剩余的位置为第一个维度，a 的数量为第二个维度，l 的数量为第三个维度。一开始的时候把所有位置都初始为 `-1`。

```java
int dfs(int last, int acount, int lcount)
```

当 A 的数量达到了 2 或者是 L 的数量达到了 3 那么就返回 0，当 last 为 0 的时候就说明这是一个可行的解返回 1。同时如果遇到有重复的，就直接返回之前储存在数据中的数据。

还需要注意的是，在递归的时候，如果要填充的下一个字符是 A 或 L 的时候，调用 dfs() 的时候 lcount 就传 0 了，因为题目只是说的要连续的，当这个位置不放 L 的时候，就要把这个计数器置 0。


## LeetCode_345_反转字符串中的元音字母

编写一个函数，以字符串作为输入，反转该字符串中的元音字母。

元音字母：`aeiouAEIOU`

难度：简单

使用双指针，从左右两边往中间靠近。当左右两边都是元音的时候就交换位置，然后把两边的指针也都移动一下。

注意最外层的 while 循环的条件是 `head < tail`，同时在内部对两个指针进行更新的时候，也要实时检查指针有没有超出去。

[LeetCode_345.java](src/LeetCode_345.java)


## LeetCode_541_反转字符串 II

给定一个字符串 s 和一个整数 k，从字符串开头算起，每 2k 个字符反转前 k 个字符。

https://leetcode-cn.com/problems/reverse-string-ii/

难度：简单

使用一层 for 循环，从 0 开始到字符串结束，这个也就是需要反转字符串的起始位置，步进使用 `i += 2*k` 因为题目说了每 2k 个字符反转一次，所以这里就直接让步进为 2k。

然后在通过对左指针 `+ k -1` 就可以得到反转字符串的终点，同时还要注意这个终点有可能会超过字符串的长度，所以在确认本次反转的真正终点的时候，需要取字符串的长度和刚刚计算出来结果的最小值。

[LeetCode_541.java](src/LeetCode_541.java)


## LeetCode_443_压缩字符串

https://leetcode-cn.com/problems/string-compression/

难度：中等

定义 `i,j,idx` 分别为重复字符的第一位， 经过缩小后字符数组的最后一位（插入数的位置），重复数组的真实下标最后一位。同时我们就可以知道 `idx-i` 也就是重复数组的长度了。

因为字符数组长度被缩小了过后，我们在往数组重写入数字的时候，还需要将当前 `i` 位置上的字符搬移到 `j` 然后在 `j` 的后面写入数字，那才是正确的。

[LeetCode_443.java](src/LeetCode_443.java)


## LeetCode_1646_获取生成数组中的最大值

https://leetcode-cn.com/problems/get-maximum-in-generated-array/

难度：简单

签到题，注意一下 n 的取值范围


## LeetCode_797_所有可能的路径

https://leetcode-cn.com/problems/all-paths-from-source-to-target/

难度：中等

在有向无环图中寻找所有能够到达 n-1 节点的路径

因为节点最多只有 15 个，所以直接使用 DFS 搜索所有路径，然后还要注意回溯。在 DFS 进入下一个节点之后，还要把当前路径中的最后一个节点删掉，恢复到以前的状态。

[LeetCode_797.java](src/LeetCode_797.java)


## LeetCode_881_救生艇

https://leetcode-cn.com/problems/boats-to-save-people/

难度：简单

第 i 个人的体重为 people[i]，每艘船可以承载的最大重量为 limit。

每艘船最多可同时载两人，但条件是这些人的重量之和最多为 limit。

返回载到每一个人所需的最小船数。(保证每个人都能被船载)。

先把数组排序一下，然后用两个指针分别放在左右两边，如果 `people[l] + people[r] <= limit` 那么就让两个指针都往中间移动，此外就只移动 `r` 同时都让 `count++`。

[LeetCode_881.java](src/LeetCode_881.java)


## LeetCode_1588_所有奇数长度子数组的和

给你一个正整数数组 arr ，请你计算所有可能的奇数长度子数组的和。

https://leetcode-cn.com/problems/sum-of-all-odd-length-subarrays/

难度：简单

先说暴力法，先穷举每一位以 i 为开始的起点，然后穷举长度为 1,3,5,7 的子串，最后去计算每一个子串里面数字之和。

之后还有前缀和，先计算出 0 到每一位之间数字之和为 `int[] sum`，然后再穷举每一种长度和每一个起点，通过 `r = l + len - 1` 计算出子串的右端，最后用 `ans += sum[r+1] - sum[l]` 快速获取子串内所有数之和。

[LeetCode_1588.java](src/LeetCode_1588.java)


## LeetCode_528_按权重随机选择

https://leetcode-cn.com/problems/random-pick-with-weight/

难度：中等

将所有数都平放在数轴上，然后使用 `Math.Random()` 生成一个在数轴上的随机数，再查找看这个生成的数属于什么范围。

使用了前缀和，先计算了从 0 到每一个数之间所有数的和，把结果也放在了对应坐标的一个新数组 `int[] sum` 中。然后随机数生成一个数，再通过二分查找判断这个数对应哪一个下标的范围中，就是答案了。

[LeetCode_528.java](src/LeetCode_528.java)


## LeetCode_1109_航班预订统计

https://leetcode-cn.com/problems/corporate-flight-bookings/

难度：中等

假想成，乘客从 first 的位置上车，从 last 的位置下车，每次上下车的人数都是 seats，所以一开始就遍历 `bookings` 然后在 first 的位置增加人数也就是 `ans[first - 1] += seats` 然后在 last 的位置下车也就是 `ans[last] -= seats`。`first - 1` 是因为题目要求的编号从 1 开始，`last` 不减是因为在 `last - 1` 也就是在下车的同时，它也被算作还依然占用座位。

[LeetCode_1109.java](src/LeetCode_1109.java)


## 剑指 Offer 22 链表中倒数第k个节点

输入一个链表，输出该链表中倒数第 k 个节点。为了符合大多数人的习惯，本题从 1 开始计数，即链表的尾节点是倒数第 1 个节点。

https://leetcode-cn.com/problems/lian-biao-zhong-dao-shu-di-kge-jie-dian-lcof/

难度：简单

先遍历一次获取整个链表的长度，然后再去找 `length - k` 的那个节点。用快慢指针，快指针比慢指针快 k 个节点可以降低时间复杂度。

[Offer_22.java](src/Offer_22.java)


## 剑指 Offer 10-I. 斐波那契数列

写一个函数，输入 n ，求斐波那契（Fibonacci）数列的第 n 项（即 F(N)）

https://leetcode-cn.com/problems/fei-bo-na-qi-shu-lie-lcof/

难度：简单

使用递推实现动态规划，就用提供的公式计算出最后一个数，然后再把两个数都向前移动。

[Offer_10.java](src/Offer_10.java)


## LeetCode_470_用 Rand7() 实现 Rand10()

https://leetcode-cn.com/problems/implement-rand10-using-rand7/

难度：中等

这道题使用 `rand7() + rand7()` 再去取余是错误的，因为某些值有多种组合方式，这种单纯相加是不正确的。

这里可以想想一个密码锁，分别代表了两位数，然后使用 `rand7() - 1` 去分别获取两位数的每个位置的数字，然后组成了一个 7 进制的数字，它的范围为 `[0,48]`（6*7+6），因为是 7 进制所以不能有 6。

然后我们再进行拒绝采样，使得返回的值只在 `[1,10]` 的范围内，拒绝采样后各个数出现的概率还是均衡的。同时为了降低对 `rand7()` 的调用次数，使用了对 `[1,40]` 进行取余，实现了映射。

[LeetCode_470.java](src/LeetCode_470.java)


## LeetCode_704_二分查找

https://leetcode-cn.com/problems/binary-search/

难度：简单

就真是普通的二分搜索，要注意二分搜索修改左右指针的时候，要将 `mid - 1` 或者 `mid + 1` 再赋值，同时还要注意循环的条件要用 `l <= r` 因为会有移动指针都到了同一个位置，但是那个位置又没有和 target 比较过，会漏掉。

[LeetCode_704.java](src/LeetCode_704.java)


## LeetCode_1221_分割平衡字符串

在一个 平衡字符串 中，'L' 和 'R' 字符的数量是相同的。

给你一个平衡字符串 s，请你将它分割成尽可能多的平衡字符串。

https://leetcode-cn.com/problems/split-a-string-in-balanced-strings/

难度：简单

字符为 `L` 的时候 +1，为 `R` 的时候 -1。遍历整个字符串，当数量之差为 0 的时候说明找到了一个平衡字符串。

[LeetCode_1221.java](src/LeetCode_1221.java)


## LeetCode_1894_找到需要补充粉笔的学生编号

https://leetcode-cn.com/problems/find-the-student-that-will-replace-the-chalk/

难度：中等

先遍历一遍数组求和，然后再 `k = k % sum` 之后就只需要遍历一次了。

[LeetCode_1894.java](src/LeetCode_1894.java)


## LeetCode_678_有效的括号字符串

https://leetcode-cn.com/problems/valid-parenthesis-string/

难度：中等

设遇到一个 `(` 就 +1，遇到一个 `)` 就-1，遍历一遍字符串之后，如果最终得分为 0 那么就说明是有效的。但因为这个题有 `*` 它可以替代需要的一个括号，也可以不起作用。所以使用了一个区间，最低得分和最高得分。当遇到括号的时候，就让他们两个都同时的进行加减。

但是当遇到 `*` 号的时候，它既可以当作 `(` 增加最大值，也可以作为 `)` 减小最小值。所以遇到 `*` 的时候就同时 `min--; max++;`，那么当 `min--` 之后（就是看作 `)`），如果它值为负数了，我们这次就不能把它看作 `)`，因为这说明 `(` 已经被匹配完了，所以我们就把这个 `*` 看作空字符串。

同时还需要判断 `min > max` 如果出现这种情况，就说明 max 为负了，`)` 多了，这个字符串已经不合法了，就算后面有再多 `(` 也无法与前面出现的 `)` 进行匹配。

当循环结束后，`min` 为 0 就说明这个字符串平衡且有效，反之就是无效字符串。

[LeetCode_678.java](src/LeetCode_678.java)


## LeetCode_447_回旋镖的数量

https://leetcode-cn.com/problems/number-of-boomerangs/

难度：中等

用两层 for 穷举出所有的点 i，然后去穷举所有满足 ij 和 ik 距离相等的点有多少个，想象一个 V 形折线我们固定了最下面的拐点，然后穷举出所有的可以作为端点的点。最后在直接使用 `cnt*(cnt-1)` 计算出 cnt 个数字，两两匹配有多少种结果。

[LeetCode_447.java](src/LeetCode_447.java)


## LeetCode_524_通过删除字母匹配到字典里最长单词

给你一个字符串 s 和一个字符串数组 dictionary 作为字典，找出并返回字典中最长的字符串，该字符串可以通过删除 s 中的某些字符得到。

如果答案不止一个，返回长度最长且字典序最小的字符串。如果答案不存在，则返回空字符串。

https://leetcode-cn.com/problems/longest-word-in-dictionary-through-deleting/

难度：中等

先对字符串数组进行排序，将最长的最前面（逆序），如果长度一样的就看字典序（ASCII码）。然后遍历每一个字符串数组里面的字符串，使用双指针。

首先令 i 和 j 都为 0，然后匹配 `s[i] == dictionary[x][j]` 如果想等的话，说明找到了一个开始的，那么就将 `j++`。同时无论这个字符是否匹配，本次匹配之后都要将 `i++`，这样就可以做到”删除 s 中某些字符“。那么当某一个指针走到头的时候，就判断一下 `j` 是否与这个字符串长度相等，想等就说明这个字符串就是要找的结果了。

[LeetCode_524.java](src/LeetCode_524.java)


## LeetCode_162_寻找峰值

峰值元素是指其值严格大于左右相邻值的元素。

给你一个整数数组 nums，找到峰值元素并返回其索引。数组可能包含多个峰值，在这种情况下，返回 任何一个峰值 所在位置即可。

https://leetcode-cn.com/problems/find-peak-element/

难度：中等

一开始用的直接遍历，但是还要注意边界的问题，因为题目默认将数组的两边看作无限小，所以就算是最左边的数字，只要它比右边的大那么它也就是峰值，因为左边看作无限小。所以在遍历的时候，可以用逆向思想。一开始就把遍历的这个位置看作是峰值，只判断一下它左右两边是否有效，如果有效的话就看左右两边是不是比它要大，如果大的话这个位置就不行，如果都小的话就是这个位置了。

二分的思想是一直往最大的那个方向去靠近，对于边界的判断还是有点模糊。

[LeetCode_162.java](src/LeetCode_162.java)


## LeetCode_650_只有两个键的键盘

https://leetcode-cn.com/problems/2-keys-keyboard/

难度：中等

使用 DFS 递归，使用的参数为指定的 n、已有的 'A' 数量、剪贴板里面 'A' 的数量。

出口为：已有数量等于 n 返回 0。已有数量大于 n 返回无穷大。

- 当已有的数量和剪贴板的数量不一样的时候，就可以进行复制，同时 return 的时候要 +1。
- 当剪贴板的内容和已有数量不一样的时候，就可以进行粘贴，最后取小的那个。

[LeetCode_650.java](src/LeetCode_650.java)


## LeetCode_326_3的幂

给定一个整数，写一个函数来判断它是否是 3 的幂次方。如果是，返回 true ；否则，返回 false 。

难度：简单

https://leetcode-cn.com/problems/power-of-three/

最常规的循环写法，就是一直不停的和 3 求余看看是否为 0，如果为 0 就直接 `/=` 如果不是就停止，并判断现在这个数是否为 1，为 1 就是幂次方。同时还需要注意一下 1 也是 3 的幂次方，因为 0 次方为 1。

还有一种方法，因为 3 是一个质数而且题目范围只有 `int`，那么可以利用质数的特性求出 `int` 中最大的 3 次幂，然后看那个数能不能除尽 n。

[LeetCode_326.java](src/LeetCode_326.java)

## LeetCode_430_扁平化多级双向链表

难度：中等

https://leetcode-cn.com/problems/flatten-a-multilevel-doubly-linked-list/

链表递归模拟题，首先把当前节点的下一个节点存起来，然后去遍历整个链表 `head = head.next` 当遇到有孩子的时候停下来，还是先把 `Node tmp = head.next` 存起来，然后再递归调用这个函数，去获得扁平化了后 child 节点以及之后的节点。

那么后面就是对链表指针的变化，把 child 节点接到 `head.next`，然后再把 child 前驱改成 head，最后把 head 的 child 设为空。然后再把 `tmp` 节点接到最后面。

[LeetCode_430.java](src/LeetCode_326.java)


## LeetCode_371_两整数之和

给你两个整数 a 和 b ，不使用 运算符 + 和 - ，计算并返回两整数之和。

https://leetcode-cn.com/problems/sum-of-two-integers/

难度：中等

模拟二进制运算，逢 2 进 1，一位一位的处理。

然后对两数当前位进行分情况讨论：

 - 两个当前位均为 1：此时当前位是什么取决于前一位的进位情况，即有 ans |= (t << i)，同时进位 t = 1；
 - 两个当前位只有一位是 1：此时当前位是什么取决于前一位的进位情况（整理后可统一为 ans |= ((1 ^ t） << i)：
 
前一进位若为 1，结合该位为 1，则有当前位为 0，进位不变 t = 1；
 
前一进位若为 0，结合该位为 1，则有当前位为 1，进位不变 t = 0；

 - 两个当前位为 0：此时当前位是什么取决于前一位的进位情况，则有 ans |= (t << i)，同时进位 t = 0。

[LeetCode_371.java](src/LeetCode_371.java)


## LeetCode_441_排列硬币

你总共有 n 枚硬币，并计划将它们按阶梯状排列。对于一个由 k 行组成的阶梯，其第 i 行必须正好有 i 枚硬币。阶梯的最后一行 可能 是不完整的。

给你一个数字 n ，计算并返回可形成 完整阶梯行 的总行数。

https://leetcode-cn.com/problems/arranging-coins/

难度：简单

暴力就完事儿！虽然这个题用一元二次方程的公式法也可以解出来。

[LeetCode_441.java](src/LeetCode_441.java)
