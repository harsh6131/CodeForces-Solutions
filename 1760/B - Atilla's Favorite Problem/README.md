<h2><a href="https://codeforces.com/contest/1760/problem/B" target="_blank" rel="noopener noreferrer">1760B — Atilla's Favorite Problem</a></h2>

| | |
|---|---|
| **Difficulty** | 800 |
| **Language** | Java 21 |
| **Verdict** | ✅ Accepted |
| **Problem Link** | [Codeforces 1760B](https://codeforces.com/contest/1760/problem/B) |

## Topics
`greedy` `implementation` `strings`

---

## Problem Statement

<div class="header"><div class="title">B. Atilla's Favorite Problem</div><div class="time-limit"><div class="property-title">time limit per test</div>1 second</div><div class="memory-limit"><div class="property-title">memory limit per test</div>256 megabytes</div><div class="input-file input-standard"><div class="property-title">input</div>standard input</div><div class="output-file output-standard"><div class="property-title">output</div>standard output</div></div><div><p>In order to write a string, Atilla needs to first learn all letters that are contained in the string.</p><p>Atilla needs to write a message which can be represented as a string $$$s$$$. He asks you what is the minimum alphabet size required so that one can write this message.</p><p>The alphabet of size $$$x$$$ ($$$1 \leq x \leq 26$$$) contains <span class="tex-font-style-bf">only the first</span> $$$x$$$ Latin letters. For example an alphabet of size $$$4$$$ contains <span class="tex-font-style-bf">only</span> the characters $$$\texttt{a}$$$, $$$\texttt{b}$$$, $$$\texttt{c}$$$ and $$$\texttt{d}$$$.</p></div><div class="input-specification"><div class="section-title">Input</div><p>The first line contains a single integer $$$t$$$ ($$$1 \leq t \leq 1000$$$) — the number of test cases.</p><p>The first line of each test case contains a single integer $$$n$$$ ($$$1 \leq n \leq 100$$$) — the length of the string.</p><p>The second line of each test case contains a string $$$s$$$ of length $$$n$$$, consisting of lowercase Latin letters.</p></div><div class="output-specification"><div class="section-title">Output</div><p>For each test case, output a single integer — the minimum alphabet size required to so that Atilla can write his message $$$s$$$.</p></div><div class="sample-tests"><div class="section-title">Example</div><div class="sample-test"><div class="input"><div class="title">Input<div title="Copy" data-clipboard-target="#id0023409255641455762" id="id00043297495383991746" class="input-output-copier">Copy</div></div><pre id="id0023409255641455762"><div class="test-example-line test-example-line-even test-example-line-0">5</div><div class="test-example-line test-example-line-odd test-example-line-1">1</div><div class="test-example-line test-example-line-odd test-example-line-1">a</div><div class="test-example-line test-example-line-even test-example-line-2">4</div><div class="test-example-line test-example-line-even test-example-line-2">down</div><div class="test-example-line test-example-line-odd test-example-line-3">10</div><div class="test-example-line test-example-line-odd test-example-line-3">codeforces</div><div class="test-example-line test-example-line-even test-example-line-4">3</div><div class="test-example-line test-example-line-even test-example-line-4">bcf</div><div class="test-example-line test-example-line-odd test-example-line-5">5</div><div class="test-example-line test-example-line-odd test-example-line-5">zzzzz</div></pre></div><div class="output"><div class="title">Output<div title="Copy" data-clipboard-target="#id009692804372072503" id="id0014989003760810793" class="input-output-copier">Copy</div></div><pre id="id009692804372072503">1
23
19
6
26
</pre></div></div></div><div class="note"><div class="section-title">Note</div><p>For the first test case, Atilla needs to know only the character $$$\texttt{a}$$$, so the alphabet of size $$$1$$$ which only contains $$$\texttt{a}$$$ is enough.</p><p>For the second test case, Atilla needs to know the characters $$$\texttt{d}$$$, $$$\texttt{o}$$$, $$$\texttt{w}$$$, $$$\texttt{n}$$$. The smallest alphabet size that contains all of them is $$$23$$$ (such alphabet can be represented as the string $$$\texttt{abcdefghijklmnopqrstuvw}$$$).</p></div>