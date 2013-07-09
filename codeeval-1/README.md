# codeeval-1

This project contains the code to solve codeeval.com's Fizz Buzz challenge.

Please do not directly copy my code; instead, try to code the solution by yourself.

## Usage

First, build using :

    $ lein uberjar
    
Then, navigate into `/target` and run using

    $ java -jar codeeval-1-0.1.0-standalone.jar input.txt (sample input can be taken from codeeval)

## Options

The program accepts a plaintext file containing test cases.

## Examples

Input:
```
3 5 10
2 7 15
```

Output:
```
1 2 F 4 B F 7 8 F B
1 F 3 F 5 F B F 9 F 11 13 FB 15
```

## License

Copyright © 2013 Leon Cheung

Distributed under the Eclipse Public License, the same as Clojure.
