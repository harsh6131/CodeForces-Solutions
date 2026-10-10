<h2><a href="https://codeforces.com/contest/1399/problem/B" target="_blank" rel="noopener noreferrer">1399B — Gifts Fixing</a></h2>

| | |
|---|---|
| **Difficulty** | 800 |
| **Language** | Java 21 |
| **Verdict** | ✅ Accepted |
| **Problem Link** | [Codeforces 1399B](https://codeforces.com/contest/1399/problem/B) |

## Topics
`greedy`

---

## Problem Statement

<div class="header"><div class="title">B. Gifts Fixing</div><div class="time-limit"><div class="property-title">time limit per test</div>1 second</div><div class="memory-limit"><div class="property-title">memory limit per test</div>256 megabytes</div><div class="input-file input-standard"><div class="property-title">input</div>standard input</div><div class="output-file output-standard"><div class="property-title">output</div>standard output</div></div><div><p>You have $$$n$$$ gifts and you want to give all of them to children. Of course, you don't want to offend anyone, so all gifts should be equal between each other. The $$$i$$$-th gift consists of $$$a_i$$$ candies and $$$b_i$$$ oranges.</p><p>During one move, you can choose some gift $$$1 \le i \le n$$$ and do one of the following operations:</p><ul> <li> eat exactly <span class="tex-font-style-bf">one candy</span> from this gift (decrease $$$a_i$$$ by one); </li><li> eat exactly <span class="tex-font-style-bf">one orange</span> from this gift (decrease $$$b_i$$$ by one); </li><li> eat exactly <span class="tex-font-style-bf">one candy</span> and exactly <span class="tex-font-style-bf">one orange</span> from this gift (decrease both $$$a_i$$$ and $$$b_i$$$ by one). </li></ul><p>Of course, you can not eat a candy or orange if it's not present in the gift (so neither $$$a_i$$$ nor $$$b_i$$$ can become less than zero).</p><p>As said above, all gifts should be equal. This means that after some sequence of moves the following two conditions should be satisfied: $$$a_1 = a_2 = \dots = a_n$$$ and $$$b_1 = b_2 = \dots = b_n$$$ (and $$$a_i$$$ equals $$$b_i$$$ is <span class="tex-font-style-bf">not necessary</span>).</p><p>Your task is to find the <span class="tex-font-style-bf">minimum</span> number of moves required to equalize all the given gifts.</p><p>You have to answer $$$t$$$ independent test cases.</p></div><div class="input-specification"><div class="section-title">Input</div><p>The first line of the input contains one integer $$$t$$$ ($$$1 \le t \le 1000$$$) — the number of test cases. Then $$$t$$$ test cases follow.</p><p>The first line of the test case contains one integer $$$n$$$ ($$$1 \le n \le 50$$$) — the number of gifts. The second line of the test case contains $$$n$$$ integers $$$a_1, a_2, \dots, a_n$$$ ($$$1 \le a_i \le 10^9$$$), where $$$a_i$$$ is the number of candies in the $$$i$$$-th gift. The third line of the test case contains $$$n$$$ integers $$$b_1, b_2, \dots, b_n$$$ ($$$1 \le b_i \le 10^9$$$), where $$$b_i$$$ is the number of oranges in the $$$i$$$-th gift.</p></div><div class="output-specification"><div class="section-title">Output</div><p>For each test case, print one integer: the <span class="tex-font-style-bf">minimum</span> number of moves required to equalize all the given gifts.</p></div><div class="sample-tests"><div class="section-title">Example</div><div class="sample-test"><div class="input"><div class="title">Input<div title="Copy" data-clipboard-target="#id0032206268744885946" id="id006581071954785813" class="input-output-copier">Copy</div></div><pre id="id0032206268744885946">5
3
3 5 6
3 2 3
5
1 2 3 4 5
5 4 3 2 1
3
1 1 1
2 2 2
6
1 1000000000 1000000000 1000000000 1000000000 1000000000
1 1 1 1 1 1
3
10 12 8
7 5 4
</pre></div><div class="output"><div class="title">Output<div title="Copy" data-clipboard-target="#id007655881877751507" id="id002985765973529858" class="input-output-copier">Copy</div></div><pre id="id007655881877751507">6
16
0
4999999995
7
</pre></div></div></div><div class="note"><div class="section-title">Note</div><p>In the first test case of the example, we can perform the following sequence of moves:</p><ul> <li> choose the first gift and eat one orange from it, so $$$a = [3, 5, 6]$$$ and $$$b = [2, 2, 3]$$$; </li><li> choose the second gift and eat one candy from it, so $$$a = [3, 4, 6]$$$ and $$$b = [2, 2, 3]$$$; </li><li> choose the second gift and eat one candy from it, so $$$a = [3, 3, 6]$$$ and $$$b = [2, 2, 3]$$$; </li><li> choose the third gift and eat one candy and one orange from it, so $$$a = [3, 3, 5]$$$ and $$$b = [2, 2, 2]$$$; </li><li> choose the third gift and eat one candy from it, so $$$a = [3, 3, 4]$$$ and $$$b = [2, 2, 2]$$$; </li><li> choose the third gift and eat one candy from it, so $$$a = [3, 3, 3]$$$ and $$$b = [2, 2, 2]$$$. </li></ul></div>