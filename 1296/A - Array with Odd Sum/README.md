<h2><a href="https://codeforces.com/contest/1296/problem/A" target="_blank" rel="noopener noreferrer">1296A — Array with Odd Sum</a></h2>

| | |
|---|---|
| **Difficulty** | 800 |
| **Language** | Java 21 |
| **Verdict** | ✅ Accepted |
| **Problem Link** | [Codeforces 1296A](https://codeforces.com/contest/1296/problem/A) |

## Topics
`math`

---

## Problem Statement

<div class="header"><div class="title">A. Array with Odd Sum</div><div class="time-limit"><div class="property-title">time limit per test</div>1 second</div><div class="memory-limit"><div class="property-title">memory limit per test</div>256 megabytes</div><div class="input-file input-standard"><div class="property-title">input</div>standard input</div><div class="output-file output-standard"><div class="property-title">output</div>standard output</div></div><div><p>You are given an array $$$a$$$ consisting of $$$n$$$ integers.</p><p>In one move, you can choose two indices $$$1 \le i, j \le n$$$ such that $$$i \ne j$$$ and set $$$a_i := a_j$$$. You can perform such moves any number of times (possibly, zero). You can choose different indices in different operations. The operation := is the operation of assignment (i.e. you choose $$$i$$$ and $$$j$$$ and replace $$$a_i$$$ with $$$a_j$$$).</p><p>Your task is to say if it is possible to obtain an array with an odd (not divisible by $$$2$$$) sum of elements.</p><p>You have to answer $$$t$$$ independent test cases.</p></div><div class="input-specification"><div class="section-title">Input</div><p>The first line of the input contains one integer $$$t$$$ ($$$1 \le t \le 2000$$$) — the number of test cases.</p><p>The next $$$2t$$$ lines describe test cases. The first line of the test case contains one integer $$$n$$$ ($$$1 \le n \le 2000$$$) — the number of elements in $$$a$$$. The second line of the test case contains $$$n$$$ integers $$$a_1, a_2, \dots, a_n$$$ ($$$1 \le a_i \le 2000$$$), where $$$a_i$$$ is the $$$i$$$-th element of $$$a$$$.</p><p>It is guaranteed that the sum of $$$n$$$ over all test cases does not exceed $$$2000$$$ ($$$\sum n \le 2000$$$).</p></div><div class="output-specification"><div class="section-title">Output</div><p>For each test case, print the answer on it — "<span class="tex-font-style-tt">YES</span>" (without quotes) if it is possible to obtain the array with an odd sum of elements, and "<span class="tex-font-style-tt">NO</span>" otherwise.</p></div><div class="sample-tests"><div class="section-title">Example</div><div class="sample-test"><div class="input"><div class="title">Input<div title="Copy" data-clipboard-target="#id007449890153966228" id="id002065635725635927" class="input-output-copier">Copy</div></div><pre id="id007449890153966228">5
2
2 3
4
2 2 8 8
3
3 3 3
4
5 5 5 5
4
1 1 1 1
</pre></div><div class="output"><div class="title">Output<div title="Copy" data-clipboard-target="#id002759506413200806" id="id007212043505572941" class="input-output-copier">Copy</div></div><pre id="id002759506413200806">YES
NO
YES
NO
NO
</pre></div></div></div>