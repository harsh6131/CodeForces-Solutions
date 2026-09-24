<h2><a href="https://codeforces.com/contest/2044/problem/C" target="_blank" rel="noopener noreferrer">2044C — Hard Problem</a></h2>

| | |
|---|---|
| **Difficulty** | 800 |
| **Language** | Java 21 |
| **Verdict** | ✅ Accepted |
| **Problem Link** | [Codeforces 2044C](https://codeforces.com/contest/2044/problem/C) |

## Topics
`greedy` `math`

---

## Problem Statement

<div class="header"><div class="title">C. Hard Problem</div><div class="time-limit"><div class="property-title">time limit per test</div>1 second</div><div class="memory-limit"><div class="property-title">memory limit per test</div>256 megabytes</div><div class="input-file input-standard"><div class="property-title">input</div>standard input</div><div class="output-file output-standard"><div class="property-title">output</div>standard output</div></div><div><p>Ball is the teacher in Paperfold University. The seats of his classroom are arranged in $$$2$$$ rows with $$$m$$$ seats each.</p><p>Ball is teaching $$$a + b + c$$$ monkeys, and he wants to assign as many monkeys to a seat as possible. Ball knows that $$$a$$$ of them only want to sit in row $$$1$$$, $$$b$$$ of them only want to sit in row $$$2$$$, and $$$c$$$ of them have no preference. Only one monkey may sit in each seat, and each monkey's preference must be followed if it is seated.</p><p>What is the maximum number of monkeys that Ball can seat?</p></div><div class="input-specification"><div class="section-title">Input</div><p>The first line contains an integer $$$t$$$ ($$$1 \leq t \leq 10^4$$$) — the number of test cases.</p><p>Each test case contains four integers $$$m$$$, $$$a$$$, $$$b$$$, and $$$c$$$ ($$$1 \leq m, a, b, c \leq 10^8$$$).</p></div><div class="output-specification"><div class="section-title">Output</div><p>For each test case, output the maximum number of monkeys you can seat.</p></div><div class="sample-tests"><div class="section-title">Example</div><div class="sample-test"><div class="input"><div class="title">Input<div title="Copy" data-clipboard-target="#id00346458221215562" id="id0034656889033177407" class="input-output-copier">Copy</div></div><pre id="id00346458221215562"><div class="test-example-line test-example-line-even test-example-line-0">5</div><div class="test-example-line test-example-line-odd test-example-line-1">10 5 5 10</div><div class="test-example-line test-example-line-even test-example-line-2">3 6 1 1</div><div class="test-example-line test-example-line-odd test-example-line-3">15 14 12 4</div><div class="test-example-line test-example-line-even test-example-line-4">1 1 1 1</div><div class="test-example-line test-example-line-odd test-example-line-5">420 6 9 69</div></pre></div><div class="output"><div class="title">Output<div title="Copy" data-clipboard-target="#id009249974824157822" id="id0014427783546189976" class="input-output-copier">Copy</div></div><pre id="id009249974824157822">20
5
30
2
84
</pre></div></div></div><div class="note"><div class="section-title">Note</div><p>In the second test case, $$$6$$$ monkeys want to sit in the front row, but only $$$3$$$ seats are available. The monkeys that have no preference and the monkeys who prefer sitting in the second row can sit in the second row together. Thus, the answer is $$$3+2=5$$$.</p></div>