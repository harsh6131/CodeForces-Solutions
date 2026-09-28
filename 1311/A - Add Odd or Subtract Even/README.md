<h2><a href="https://codeforces.com/contest/1311/problem/A" target="_blank" rel="noopener noreferrer">1311A — Add Odd or Subtract Even</a></h2>

| | |
|---|---|
| **Difficulty** | 800 |
| **Language** | Java 21 |
| **Verdict** | ✅ Accepted |
| **Problem Link** | [Codeforces 1311A](https://codeforces.com/contest/1311/problem/A) |

## Topics
`greedy` `implementation` `math`

---

## Problem Statement

<div class="header"><div class="title">A. Add Odd or Subtract Even</div><div class="time-limit"><div class="property-title">time limit per test</div>2 seconds</div><div class="memory-limit"><div class="property-title">memory limit per test</div>256 megabytes</div><div class="input-file input-standard"><div class="property-title">input</div>standard input</div><div class="output-file output-standard"><div class="property-title">output</div>standard output</div></div><div><p>You are given two positive integers $$$a$$$ and $$$b$$$.</p><p>In one move, you can <span class="tex-font-style-bf">change</span> $$$a$$$ in the following way:</p><ul> <li> Choose any positive <span class="tex-font-style-bf">odd</span> integer $$$x$$$ ($$$x  \gt  0$$$) and replace $$$a$$$ with $$$a+x$$$; </li><li> choose any positive <span class="tex-font-style-bf">even</span> integer $$$y$$$ ($$$y  \gt  0$$$) and replace $$$a$$$ with $$$a-y$$$. </li></ul><p>You can perform as many such operations as you want. You can choose the same numbers $$$x$$$ and $$$y$$$ in different moves.</p><p>Your task is to find the minimum number of moves required to obtain $$$b$$$ from $$$a$$$. It is guaranteed that you can always obtain $$$b$$$ from $$$a$$$.</p><p>You have to answer $$$t$$$ independent test cases.</p></div><div class="input-specification"><div class="section-title">Input</div><p>The first line of the input contains one integer $$$t$$$ ($$$1 \le t \le 10^4$$$) — the number of test cases.</p><p>Then $$$t$$$ test cases follow. Each test case is given as two space-separated integers $$$a$$$ and $$$b$$$ ($$$1 \le a, b \le 10^9$$$).</p></div><div class="output-specification"><div class="section-title">Output</div><p>For each test case, print the answer — the minimum number of moves required to obtain $$$b$$$ from $$$a$$$ if you can perform any number of moves described in the problem statement. It is guaranteed that you can always obtain $$$b$$$ from $$$a$$$.</p></div><div class="sample-tests"><div class="section-title">Example</div><div class="sample-test"><div class="input"><div class="title">Input<div title="Copy" data-clipboard-target="#id009555244109555606" id="id0011801307160365515" class="input-output-copier">Copy</div></div><pre id="id009555244109555606">5
2 3
10 10
2 4
7 4
9 3
</pre></div><div class="output"><div class="title">Output<div title="Copy" data-clipboard-target="#id004445089877729538" id="id009505615903147568" class="input-output-copier">Copy</div></div><pre id="id004445089877729538">1
0
2
2
1
</pre></div></div></div><div class="note"><div class="section-title">Note</div><p>In the first test case, you can just add $$$1$$$.</p><p>In the second test case, you don't need to do anything.</p><p>In the third test case, you can add $$$1$$$ two times.</p><p>In the fourth test case, you can subtract $$$4$$$ and add $$$1$$$.</p><p>In the fifth test case, you can just subtract $$$6$$$.</p></div>