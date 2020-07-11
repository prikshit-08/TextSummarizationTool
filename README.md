# TextSummarizationTool
Text Summarization Tool built in Java

### List of contents

- [Introduction](#introduction)
- [Working](#working)
- [Installation](#installation)
- [Running](#running)


## Introduction
---
[(Back to top)](#list-of-contents)
GUI based tool that summarize the text file given by the user.

## Working
---
[(Back to top)](#list-of-contents)

- Following is a list of the functional components of the tool

1. Sentence separator:  This goes through the document and separates the sentences based on the rules (a sentence ending is determined by a dot.).
2. Word-frequency calculator: This calculates the number of times a word appears in the document and also the number of sentences that word appears in the document.
3. Scoring algorithm: This algorithm determines the score of each sentence.The score is inversely proportional to the number of sentences in which the words in the sentence appear in the document.
4. Ranking: The sentences will be ranked according to the scores.Top k sentences will comprises the summary.
5. Summarizing: Based on the user input on the size of the summary, the sentences will be picked from the ranked list and concatenated. The resulting summary is diplayed on the console.
6. User Interface: The tool use a GUI having the the required options to help user to summarize text esily.

## Installation
---
[(Back to top)](#list-of-contents)

- To run the program simply run the SummaryTool.java file in any java complier.

## Running


- Snapshots from working program.

- Start Screen
![text1](https://user-images.githubusercontent.com/32899655/87234232-ba172a80-c3ec-11ea-87c5-33c99144de64.png)

- Selecting File & Extracting sentences
![text2](https://user-images.githubusercontent.com/32899655/87234233-bb485780-c3ec-11ea-9421-4e6d44a75d88.png)

- Generating Stats and Summary
![text3](https://user-images.githubusercontent.com/32899655/87234235-bc798480-c3ec-11ea-9191-3d4f58bc3ef8.png)
