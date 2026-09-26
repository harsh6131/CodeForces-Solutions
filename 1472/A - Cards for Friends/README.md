<h2><a href="https://codeforces.com/contest/1472/problem/A" target="_blank" rel="noopener noreferrer">1472A — Cards for Friends</a></h2>

| | |
|---|---|
| **Difficulty** | 800 |
| **Language** | Java 21 |
| **Verdict** | ✅ Accepted |
| **Problem Link** | [Codeforces 1472A](https://codeforces.com/contest/1472/problem/A) |

## Topics
`greedy` `math`

---

## Problem Statement

<div class="header"><div class="title">A. Cards for Friends</div><div class="time-limit"><div class="property-title">time limit per test</div>1 second</div><div class="memory-limit"><div class="property-title">memory limit per test</div>256 megabytes</div><div class="input-file input-standard"><div class="property-title">input</div>standard input</div><div class="output-file output-standard"><div class="property-title">output</div>standard output</div></div><div><p>For the New Year, Polycarp decided to send postcards to all his $$$n$$$ friends. He wants to make postcards with his own hands. For this purpose, he has a sheet of paper of size $$$w \times h$$$, which can be cut into pieces.</p><p>Polycarp can cut any sheet of paper $$$w \times h$$$ that he has in only two cases: </p><ul> <li> If $$$w$$$ is even, then he can cut the sheet in half and get two sheets of size $$$\frac{w}{2} \times h$$$; </li><li> If $$$h$$$ is even, then he can cut the sheet in half and get two sheets of size $$$w \times \frac{h}{2}$$$; </li></ul><p>If $$$w$$$ and $$$h$$$ are even at the same time, then Polycarp can cut the sheet according to any of the rules above.</p><p>After cutting a sheet of paper, the total number of sheets of paper is increased by $$$1$$$.</p><p>Help Polycarp to find out if he can cut his sheet of size $$$w \times h$$$ at into $$$n$$$ or more pieces, using only the rules described above.</p></div><div class="input-specification"><div class="section-title">Input</div><p>The first line contains one integer $$$t$$$ ($$$1 \le t \le 10^4$$$) — the number of test cases. Then $$$t$$$ test cases follow.</p><p>Each test case consists of one line containing three integers $$$w$$$, $$$h$$$, $$$n$$$ ($$$1 \le w, h \le 10^4, 1 \le n \le 10^9$$$) — the width and height of the sheet Polycarp has and the number of friends he needs to send a postcard to.</p></div><div class="output-specification"><div class="section-title">Output</div><p>For each test case, output on a separate line: </p><ul> <li> "<span class="tex-font-style-tt">YES</span>", if it is possible to cut a sheet of size $$$w \times h$$$ into at least $$$n$$$ pieces; </li><li> "<span class="tex-font-style-tt">NO</span>" otherwise. </li></ul><p>You can output "<span class="tex-font-style-tt">YES</span>" and "<span class="tex-font-style-tt">NO</span>" in any case (for example, the strings <span class="tex-font-style-tt">yEs</span>, <span class="tex-font-style-tt">yes</span>, <span class="tex-font-style-tt">Yes</span> and <span class="tex-font-style-tt">YES</span> will be recognized as positive).</p></div><div class="sample-tests"><div class="section-title">Example</div><div class="sample-test"><div class="input"><div class="title">Input<div title="Copy" data-clipboard-target="#id0015979578318821275" id="id00514854408380782" class="input-output-copier">Copy</div></div><pre id="id0015979578318821275">5
2 2 3
3 3 2
5 10 2
11 13 1
1 4 4
</pre></div><div class="output"><div class="title">Output<div title="Copy" data-clipboard-target="#id001699192481019176" id="id004632824781978787" class="input-output-copier">Copy</div></div><pre id="id001699192481019176">YES
NO
YES
YES
YES
</pre></div></div></div><div class="note"><div class="section-title">Note</div><p>In the first test case, you can first cut the $$$2 \times 2$$$ sheet into two $$$2 \times 1$$$ sheets, and then cut each of them into two more sheets. As a result, we get four sheets $$$1 \times 1$$$. We can choose any three of them and send them to our friends.</p><p>In the second test case, a $$$3 \times 3$$$ sheet cannot be cut, so it is impossible to get two sheets.</p><p>In the third test case, you can cut a $$$5 \times 10$$$ sheet into two $$$5 \times 5$$$ sheets.</p><p>In the fourth test case, there is no need to cut the sheet, since we only need one sheet.</p><p>In the fifth test case, you can first cut the $$$1 \times 4$$$ sheet into two $$$1 \times 2$$$ sheets, and then cut each of them into two more sheets. As a result, we get four sheets $$$1 \times 1$$$.</p></div>