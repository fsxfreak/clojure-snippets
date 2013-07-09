# daily-programmer-131

This project contains the code to solve [/r/dailyprogrammer #131 Easy](http://www.reddit.com/r/dailyprogrammer/comments/1heozl/070113_challenge_131_easy_who_tests_the_tests/)

## Usage

First, build using :

    $ lein uberjar
    
Then, navigate into `/target` and run using:
    
    $ java -jar daily-programmer-131-0.1.0-standalone.jar [args]

## Options

The program accepts a plaintext file containing test cases.

## Examples

Input:
```
0 Car raC
0 Alpha AhplA
0 Discuss noissucsiD
1 Batman BATMAN
1 Graph GRAPH
1 One one
```

Output:
```
Test positive.
Test negative.
Test negative.
Test positive.
Test positive.
Test negative.
```

## License

Copyright © 2013 Leon Cheung

Distributed under the Eclipse Public License, the same as Clojure.
