<h2><a href="https://codeforces.com/contest/1955/problem/A" target="_blank" rel="noopener noreferrer">1955A — Yogurt Sale</a></h2>

| | |
|---|---|
| **Difficulty** | 800 |
| **Language** | C++17 (GCC 7-32) |
| **Verdict** | ✅ Accepted |
| **Problem Link** | [Codeforces 1955A](https://codeforces.com/contest/1955/problem/A) |

## Topics
`math`

---

## Problem Statement

<div class="header"><div class="title">A. Yogurt Sale</div><div class="time-limit"><div class="property-title">time limit per test</div>1 second</div><div class="memory-limit"><div class="property-title">memory limit per test</div>256 megabytes</div><div class="input-file input-standard"><div class="property-title">input</div>standard input</div><div class="output-file output-standard"><div class="property-title">output</div>standard output</div></div><div><p>The price of one yogurt at the "Vosmiorochka" store is $$$a$$$ burles, but there is a promotion where you can buy two yogurts for $$$b$$$ burles.</p><p>Maxim needs to buy <span class="tex-font-style-bf">exactly</span> $$$n$$$ yogurts. When buying two yogurts, he can choose to buy them at the regular price or at the promotion price.</p><p>What is the minimum amount of burles Maxim should spend to buy $$$n$$$ yogurts?</p></div><div class="input-specification"><div class="section-title">Input</div><p>The first line contains a single integer $$$t$$$ ($$$1 \le t \le {10}^{4}$$$) — the number of test cases.</p><p>The first and only line of each test case contains three integers $$$n$$$, $$$a$$$, and $$$b$$$ ($$$1 \le n \le 100$$$, $$$1 \le a, b \le 30$$$) — the number of yogurts Maxim wants to buy, the price for one yogurt, and the price for two yogurts on promotion.</p></div><div class="output-specification"><div class="section-title">Output</div><p>For each test case, print in a separate line the minimum cost of buying $$$n$$$ yogurts at "Vosmiorochka".</p></div><div class="sample-tests"><div class="section-title">Example</div><div class="sample-test"><div class="input"><div class="title">Input<div title="Copy" data-clipboard-target="#id0024286907644465583" id="id00774782086693315" class="input-output-copier">Copy</div></div><pre id="id0024286907644465583"><div class="test-example-line test-example-line-even test-example-line-0">4</div><div class="test-example-line test-example-line-odd test-example-line-1">2 5 9</div><div class="test-example-line test-example-line-even test-example-line-2">3 5 9</div><div class="test-example-line test-example-line-odd test-example-line-3">3 5 11</div><div class="test-example-line test-example-line-even test-example-line-4">4 5 11</div></pre></div><div class="output"><div class="title">Output<div title="Copy" data-clipboard-target="#id009759357120080109" id="id009738614009511568" class="input-output-copier">Copy</div></div><pre id="id009759357120080109">9
14
15
20
</pre></div></div></div><div class="note"><div class="section-title">Note</div><p>In the third test case of the example, it is more advantageous to buy three yogurts for $$$15$$$ burles than two for $$$11$$$ and one for $$$5$$$.</p><p>In the fourth test case of the example, you need to buy four yogurts, each for $$$5$$$ burles.</p></div>