<h2><a href="https://codeforces.com/contest/2000/problem/A" target="_blank" rel="noopener noreferrer">2000A — Primary Task</a></h2>

| | |
|---|---|
| **Difficulty** | 800 |
| **Language** | Java 21 |
| **Verdict** | ✅ Accepted |
| **Problem Link** | [Codeforces 2000A](https://codeforces.com/contest/2000/problem/A) |

## Topics
`implementation` `math` `strings`

---

## Problem Statement

<div class="header"><div class="title">A. Primary Task</div><div class="time-limit"><div class="property-title">time limit per test</div>1 second</div><div class="memory-limit"><div class="property-title">memory limit per test</div>256 megabytes</div><div class="input-file input-standard"><div class="property-title">input</div>standard input</div><div class="output-file output-standard"><div class="property-title">output</div>standard output</div></div><div><p>Dmitry wrote down $$$t$$$ integers on the board, and that is good. He is sure that he lost an <span class="tex-font-style-it">important</span> integer $$$n$$$ among them, and that is bad.</p><p>The integer $$$n$$$ had the form $$$\text{10^x}$$$ ($$$x \ge 2$$$), where the symbol '$$$\text{^}$$$' denotes exponentiation.. Something went wrong, and Dmitry missed the symbol '$$$\text{^}$$$' when writing the <span class="tex-font-style-it">important</span> integer. For example, instead of the integer $$$10^5$$$, he would have written $$$105$$$, and instead of $$$10^{19}$$$, he would have written $$$1019$$$.</p><p>Dmitry wants to understand which of the integers on the board could have been the <span class="tex-font-style-it">important</span> integer and which could not.</p></div><div class="input-specification"><div class="section-title">Input</div><p>The first line of the input contains one integer $$$t$$$ ($$$1 \le t \le 10^4$$$) — the number of integers on the board.</p><p>The next $$$t$$$ lines each contain an integer $$$a$$$ ($$$1 \le a \le 10000$$$) — the next integer from the board.</p></div><div class="output-specification"><div class="section-title">Output</div><p>For each integer on the board, output "<span class="tex-font-style-tt">YES</span>" if it could have been the <span class="tex-font-style-it">important</span> integer and "<span class="tex-font-style-tt">NO</span>" otherwise.</p><p>You may output each letter in any case (lowercase or uppercase). For example, the strings "<span class="tex-font-style-tt">yEs</span>", "<span class="tex-font-style-tt">yes</span>", "<span class="tex-font-style-tt">Yes</span>", and "<span class="tex-font-style-tt">YES</span>" will be accepted as a positive answer.</p></div><div class="sample-tests"><div class="section-title">Example</div><div class="sample-test"><div class="input"><div class="title">Input<div title="Copy" data-clipboard-target="#id008599045828464617" id="id007949885652104612" class="input-output-copier">Copy</div></div><pre id="id008599045828464617"><div class="test-example-line test-example-line-even test-example-line-0">7</div><div class="test-example-line test-example-line-odd test-example-line-1">100</div><div class="test-example-line test-example-line-even test-example-line-2">1010</div><div class="test-example-line test-example-line-odd test-example-line-3">101</div><div class="test-example-line test-example-line-even test-example-line-4">105</div><div class="test-example-line test-example-line-odd test-example-line-5">2033</div><div class="test-example-line test-example-line-even test-example-line-6">1019</div><div class="test-example-line test-example-line-odd test-example-line-7">1002</div></pre></div><div class="output"><div class="title">Output<div title="Copy" data-clipboard-target="#id005073218735684818" id="id0027528031454994273" class="input-output-copier">Copy</div></div><pre id="id005073218735684818">NO
YES
NO
YES
NO
YES
NO
</pre></div></div></div>