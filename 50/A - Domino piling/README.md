<h2><a href="https://codeforces.com/contest/50/problem/A" target="_blank" rel="noopener noreferrer">50A — Domino piling</a></h2>

| | |
|---|---|
| **Difficulty** | 800 |
| **Language** | C++17 (GCC 7-32) |
| **Verdict** | ✅ Accepted |
| **Problem Link** | [Codeforces 50A](https://codeforces.com/contest/50/problem/A) |

## Topics
`greedy` `math`

---

## Problem Statement

<div class="header"><div class="title">A. Domino piling</div><div class="time-limit"><div class="property-title">time limit per test</div>2 seconds</div><div class="memory-limit"><div class="property-title">memory limit per test</div>256 megabytes</div><div class="input-file input-standard" style="font-weight: bold"><div class="property-title">input</div>stdin</div><div class="output-file output-standard" style="font-weight: bold"><div class="property-title">output</div>stdout</div></div><div><p>You are given a rectangular board of <span class="tex-span"><i>M</i> × <i>N</i></span> squares. Also you are given an unlimited number of standard domino pieces of <span class="tex-span">2 × 1</span> squares. You are allowed to rotate the pieces. You are asked to place as many dominoes as possible on the board so as to meet the following conditions:</p><p>1. Each domino completely covers two squares.</p><p>2. No two dominoes overlap.</p><p>3. Each domino lies entirely inside the board. It is allowed to touch the edges of the board.</p><p>Find the maximum number of dominoes, which can be placed under these restrictions.</p></div><div class="input-specification"><div class="section-title">Input</div><p>In a single line you are given two integers <span class="tex-span"><i>M</i></span> and <span class="tex-span"><i>N</i></span> — board sizes in squares (<span class="tex-span">1 ≤ <i>M</i> ≤ <i>N</i> ≤ 16</span>).</p></div><div class="output-specification"><div class="section-title">Output</div><p>Output one number — the maximal number of dominoes, which can be placed.</p></div><div class="sample-tests"><div class="section-title">Examples</div><div class="sample-test"><div class="input"><div class="title">Input<div title="Copy" data-clipboard-target="#id009652396287714599" id="id0006937436220489179" class="input-output-copier">Copy</div></div><pre id="id009652396287714599">2 4<br></pre></div><div class="output"><div class="title">Output<div title="Copy" data-clipboard-target="#id0021668780835433288" id="id005052958048758179" class="input-output-copier">Copy</div></div><pre id="id0021668780835433288">4<br></pre></div><div class="input"><div class="title">Input<div title="Copy" data-clipboard-target="#id0019133075765705054" id="id003798628538489768" class="input-output-copier">Copy</div></div><pre id="id0019133075765705054">3 3<br></pre></div><div class="output"><div class="title">Output<div title="Copy" data-clipboard-target="#id00720111863459516" id="id007736370740288234" class="input-output-copier">Copy</div></div><pre id="id00720111863459516">4<br></pre></div></div></div>