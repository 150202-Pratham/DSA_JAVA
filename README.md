# DSA Java Practice

A learning and practice repository of independent Java examples for data structures, algorithms, recursion, and common coding-interview problems. The code is organized as exercises rather than as one application: classes may have their own `main` method, share package-level helpers, or expose methods intended to be called by another class.

## What is covered

The current source tree includes examples of:

- **Arrays and strings:** array manipulation, Kadane-style subarray problems, two pointers, sliding windows, prefix sums, and string exercises.
- **Hash maps and sets:** frequency counting, duplicates, intersections, and related problems.
- **Linked lists, stacks, queues, and heaps:** singly and doubly linked lists, stack and queue implementations, monotonic-stack questions, heap operations, top-k problems, and merging sorted lists.
- **Recursion and backtracking:** search and basic recursion, subsequences, subsets, permutations, combination sums, maze/grid problems, N-Queens, and Sudoku.
- **Graphs:** adjacency lists and matrices, BFS/DFS, cycle detection, topological sorting, shortest paths (including Dijkstra, Bellman-Ford, and Floyd-Warshall examples), and grid/island problems.
- **Trees:** binary-tree traversals and questions, binary-search-tree operations and questions, and a small tree/database-style exercise.
- **Greedy algorithms and dynamic programming:** activity selection and other greedy questions, plus take/skip problems such as House Robber and Solved By Brain Power, with recursive, memoized, or tabulated approaches in selected examples.
- **Sorting and object-oriented practice:** selection sort, merge-sort-related inversion/reverse-pair exercises, and introductory object/class examples.

These are selected implementations, not a complete or uniformly finished data-structures-and-algorithms curriculum. The names and organization of folders reflect the practice history; for example, `UCA` is retained as a directory name and is not a separate application.

## Requirements

- **JDK 23 or newer.** The IntelliJ project metadata sets its language level and project SDK name to 23. The examples can be compiled with `--release 23` using JDK 23 or newer.
- No Maven or Gradle build is configured, and no external libraries are required by the source tree.

## Compile and run an example

Run commands from the repository root. For example, `src/recursion/Factorial.java` declares the package `recursion` and has its own `main` method:

```powershell
New-Item -ItemType Directory -Force out
javac --release 23 -d out src/recursion/Factorial.java
java -cp out recursion.Factorial
```

Enter an integer when prompted. The generated classes go into `out/`, which is ignored by Git.

For an example that uses another class in the same package, compile both source files. For example, the queue demo needs `CircularQueue` as well as `Main`:

```powershell
javac --release 23 -d out src/queue/CircularQueue.java src/queue/Main.java
java -cp out queue.Main
```

Use the declared package name when running a packaged class (for example, `queue.Main`), not just its short class name. Some source files are in the default package; for those, omit a package prefix. If a class has no `main` method, compile it with the relevant helper classes and call its methods from a small driver or an IDE.

To compile the complete source tree from PowerShell, create a temporary argument file of source paths and pass it to `javac`:

```powershell
$sources = Get-ChildItem src -Recurse -Filter *.java |
    ForEach-Object { $_.FullName.Replace((Get-Location).Path + '\', '').Replace('\', '/') }
$sources | Set-Content sources.txt
New-Item -ItemType Directory -Force out
javac --release 23 -d out '@sources.txt'
Remove-Item sources.txt
```

The repository is also an IntelliJ IDEA Java module: open the root directory and configure a JDK 23 project SDK. `src/` is marked as the source root. There is no single project-wide entry point; choose the exercise class you want to run.

## Repository structure

```text
.
├── src/
│   ├── AdvancedRecursion/   # Backtracking, subsequences, graphs, trees, greedy, DP
│   ├── Heaps/               # Heap implementation and heap-based questions
│   ├── UCA/                 # Additional graph, tree, sorting, and backtracking examples
│   ├── arrays/
│   ├── hashmap/
│   ├── leetcodeStreak/
│   ├── linkedList/
│   ├── objectClass/
│   ├── queue/
│   ├── recursion/
│   └── stacks/
├── .idea/                   # IntelliJ project settings
├── DSAContent_Practise.iml  # IntelliJ module definition
├── .gitignore
├── LICENSE
└── README.md
```

Most source files declare packages that correspond to their directory structure, but a few use the default package. Package names and capitalization are not fully consistent across the tree, so use each Java file's `package` declaration as the source of truth when compiling or running it.

## Current limitations and possible next steps

- There is no automated test suite, continuous-integration workflow, Maven/Gradle build, or common command-line interface. Many examples rely on hard-coded sample data or console input; correctness and edge-case coverage vary by exercise.
- Not every file is a standalone program, and similarly named classes may occur in different packages. Compile only the files needed for an exercise, or compile the complete tree together as shown above.
- The repository is a collection of learning exercises rather than a complete catalog. A problem index mapping topics to source files, focused tests for each implementation, consistent package naming, and a reproducible build/test workflow would make it easier to navigate and extend.
- Recent commits on the `Pratham` branch add or expand take/skip dynamic programming, subsequences, backtracking exercises, and binary-search-tree examples; the codebase continues to evolve.

## License

This repository is licensed under the MIT License. See [LICENSE](LICENSE).
