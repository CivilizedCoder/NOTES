    <a href="https://youtube.com"> Youtube </a>


## Recursion
- Calling the same function from a function.
- Problem solved in terms of a smaller problem of the same type.
- Crash due due overused memory issues.

## Factorial
- 2 \* 1 
- 6 \* 5 \* 4 \* 3 \* 2 \* 1


### Iterative

	int n = 6;
	int fact = 1;
	for( int i = n; i > 0; i--){
		fact \*= n;
	}

### Recursive
	int fact(int n){
		if(n == 1)
			return 1;
		else{
			return (n *fact(n-1));
		}
	}

- [x] Homework


## Tracing single recursion

____________________________________
| 1    1
| 2    2
| 3    6
| 4    24
| 5    120
| 6    720

---


## Indirect Recursion
- Function A calls function B which calls Function C Which calls function A
- Think of it like a form of GOTO code from assembly
- Dangerous and difficult to debug
- Infinite recursion crashes form running our of memory

## Calculating the Golden ratio
- Occurs in nature a lot
- Humans are hardwired to find it beautiful
- close to 3 x 5
- Infinite decimal, we use recursion to approximate it.

## Recursive Iteration through lists
- Adding

	public int arrSum(int[] arr, int index){
		if(index < 0){ //?
			return 0;
		}
		else{
			return arr\[index] + arrSum(arr, index -1);
		}
	}

## Double recursion
- Fibonacci
	1, 1, 2, 3, 5, 8, 13, 21, 34, etc.


	inf fibo(int n){
		if(n\==0 || n\==1){
			return 1;
		}
		else{
			return fibo(n-1) + fibo(n-2);		
		}
	}
O(2^n)



## Fractals
- Self similarity

## Cheerful Song - Mandelbrot Set

- [ ] Homework
## State machines and Deterministic Finite State Machines
- States are circles
- Move to the next state on an input symbol
- Have a specific start state
- Elevator as a state machine
- Useful for string matching


## State machine as parity checker
- check for corrupted data
- Used in networks and storage system
- Store one bit
- If the binary string has an even number of 1's, parity bit is zero
- if the binary string has an odd number of 1's the parity bit is one.
- ##### Finds 50% of all errors

Even                                                                          Odd
Input {0,1} ------------------------------------- Output{0,1}

Switch on 1.
Stay on 0.

10011 switches 3 times leaving us on odd.


## Formal Definition of a language (Mathematical)
- A set of strings
- Sigma = {a, b, c, d}
- We make make a finite state machine to recognize words in the language (set of string)
- All possible strings using symbols from sigma.

## Language Definition includes
- input signals
- transitions in the state machine
- a start state
- one or more final accept states


If you get to the final state, the string is in the lagnuage.

->(q0)---a->(q1)
only string a is in this language.

final states and dead states.


Sigma = {a,b,c,d}
example strings using symbols from sigma*
a,b,c,d,aa,bb,cc,dd,etc


\*Example must start with prefix ab
State transition Table \*pen and paper

--------------
Current state           a       |        b
q0                           q1                q3
q1                           q3                q2
q2                           q2                q2
q3                           q3                q3




## Determinism
---
- The belief that all events are caused by things that happen before them, therefore eliminating free will.

#### Deterministic finite state (Machine|Automata)
- There is exactly one state to go to next on a unique symbol.
- [ ] Homework will operate on this principle (due wednesday)


## Regular Language
- Any language (set of strings) that is accepted by a DFA
- Sigma\* is all possible strings using symbols from Sigma = {0, 1}
- {Empty, 000, 001, 010, 011, 100, 101, 110, 111}

# If the start state is also the end state, EMPTY is a member or the language (Probably Homework)

L = {words elements {a,b}\*} : w contains no more than one b
- some strings = EMPTY, a, b, ab, aba, aa, etc.
- 



## Compiler
- machine code (binary)
- Assembler 
- Assembly Code
- .                                              Parse tree (check for correct grammar)
- Syntactic Analysis                                Symbol table (items you name)
- Lexical Analysis.

## Deterministic Finite State Machines
- -> Q2< Q2
-             Q4
- NOT ALLOWED


L = {w E {a,b}\*: w has an even number of a's}
- (q0) 
	- b

## State transition Table
---
q0    a      b
q0    q1    q0
q1    q0    q1



L  = {w E {a,b}\*: w has no two consecutive characters that are the same}
Give samples first
ab, ba, aba, eps, a...

(q0)      a->      (q1)    a-> q2
        b-> (q3)      b ->q2

node      a      b
q0         q1     q3
q1         q2      q3
...


L = { w E{a,b}\* : w contains aab}
examples:
	aab,baab,aaab,aaaab, etc.

L = {w E {a,b}\* : w does not contain aab}

DMSM recognizes strings in a 'regular' language
"computer scientists love generic words." (more like foundational)


## Homeworks Explained
- 
# Regular Expressions
- Feel free to test regex after writing them all



/regex/i = case insensitive

preg_match
preg_replace(pattern, replacement, string)

PHP is big in web dev, important to get it down
## Regex <--> DFA
- Extra credit question
- DUE FRIDAY
- Regex vary among some languages. PHP is standard
- DFA = EXACT string matches /^9$/
- /ab$/ = /(ab\$)/


## DFA to regex
- Remove dead states
- Work each path from start or OR | for alternates
- epsilon means ()* 0 OR more
- (a|ab|a(ba)\*|a(bab)\*)
- two separate regex if epsilon is in the set '\/^\$/'

![[Pasted image 20240919103853.png]]



# Exam Review
---
### Readability
- C++ > Java cause of header files
#### Writability
- C++ > Java with simpler print statements etc.

#### Portability
- Python > Assembly in portability as python has interpreter for most platforms
- Assembly compiles to different architectures which have different syntax.

#### Reliability
- Python > Assembly. Assembly has direct memory access, pointer arithmatic, go to. 
- array {0,1,2,3,4,5,6}
- get arr\[0] + 100;


## Compiler Stages
- 



lexicographical - analysis with symbol table(names of functions/vars/etc.) header builds.
Syntactic analysis - parse tree
Intermediate -uses symbol and parse.
Assembler
Binary



![[Pasted image 20240920094328.png]]





# Grammar
- meta-language
- aid in acquisition of new languages

- Syntax
	- The form or structure of expressions, statements, and program.

- Semantics
	- The meaning of expressions, statements, and other program units.

- Syntax + semantics gives us the language definition.
- Sentence or statement
	- a string of characters over some alphabet.

- Language
	- a set of statements/sentences.
	- contains an alphabet of symbols
	- many possible sentences that will not be in the language.

//don't split on vertical bar in java
- Lexeme/Token
	- the lowest syntactic unit
	- possible a single symbol or string of symbols.
	- A word (could be a character)
	- Lexicographical order = alphabetical order

- Lexical analyzer
	- recognize valid lexemes
	- E.G. DFMS or RegEx

- Syntax analyzer
	- decide whether sentences with valid lexemes have been put together correctly
	
//chatgpt doesn't analyze, it guesses the missing word/char

- Recognizer
	- decides whether input strings are in the language.
	- Program interpreters and compilers

- Generator
	- generate sentences in a language
	- javadox, chatGPT, etc

- Grammar
	- A finite, non-empty set of rules to describe the syntax.

- Backus-Nuar Form(1959) - BNF
	- 

- Context-Free Grammars
	- Mathematical formalism

- Ingredients
	- Non-terminals are used to represent classes of syntactic structures
	- assignment statement
		- if-else, branching, etc
	- Appear in the language like variables in closed brackets \<statement\>

	
- Terminals are Lexemes = {a, b, c, if}


Conclusion of HW.
Next HW explanation examples:
	leaves of parse tree are all terminals
	leftmost/rightmost derivations
<\expr> --> <\expr><\op><\expr> | const
<\op> --> /  |  -
Derive const - const / const

<\expr> <\op> <\expr>
<\expr> <\op> <\expr> / const
const - const              / const

We would like the parse tree to be unambiguous and express precedence.

<\expr> --> <\expr> - <\term> <\term>
<\term> --> <\term> / const | const
<\expr> - <\term>
<\term>    <\term>/<\const>
const     -     const  / const


Operator associativity: example:
Go left to right for equal precedence operations. Force leftmost derivation.


<\expr> -> <\expr> + const | const

if else if else


<\stmt> -> <\if_stmt> | <\print_stmt>
if( x > 5) {
all terminals but x and 5
key words are terminals. symbols are terminals.
we have to come up with the abstractions
single item | single +
}



### Grammar HW extended
- case-switch example
1. Interleave terminals with nonterminals
2. category for non-terminals
<\switch_stmt> --> switch(<\var>){<\cases>}
<\cases> --> <\case> | <\case><\cases>|<\default>
<\case> --> case <\val>: <\stmts> | case <\value>:<\stmts> break;
<\default> --> default:<\stmts>



- [ ] HW due Friday:
	- Extended BNF
	- [] means optoinal
	- ( | ) parentheses around alternate (either or) terminals or non-terminals
	- {} zero or more

###### Unambiguous
<\expr> --> <\expr> + <\term> | <\expr> - <\term> | <\term>
<\term> --> <\term> * <\factor> | <\term> / <\factor> | <\factor>

THESE ARE EQUIVALENT

<\expr> --> {<\expr> (+|-)} <\term>
<\term> --> {<\term> (+|-)} <\factor>


<\items> --> <\item> | <\item>, <\items>
<\list> --> <\item> {, <\items>}


#### Chomsky:
- Non-terminals are uppercase letters, terminals are lower case letters
- There is a start symbol
S --> a|Sa|B
\
B --> bB|b|Eps

aabbb X
bbbaa Y
b Y
aba X
bab X


decorating parse tree




#### BNE Explanation

### Functional programming paradigm
- Functional programming is Declarative rather than imperative
- so simple that there are obviously no deficiencies
- so complected that there are no obvious deficiencies.
- Side Effect:
	- changing the value of a variable that is outside a function from within a function.
	- used constantly in OOP
- code more readable and more mathematical
- NO LOOPS! YOU WILL LOSE POINTS

#### Mathematical function
- a mapping from one set of numbers, called the domain to another set, called the range.
- **Lambda Expression**
	- specifies the parameters and mapping of a function in the following form
	- L(x)   \*x\*x\*x

Functional VS Imperative:
- **Referential Transparency** 
	- The evaluation of a function always produces the same result for the same set of inputs.
	- easier to reason about the behavior of the program
- Imperative languages have more difficulty due to side effects, in-out parameters, etc.

**Lambda expression example**
Lambda(x) x\*x\*x


Imperative languages are greatly concerned with management of variables.

Functional languages often find variables unnecessary.
- Referential transparency
- no side-effects

Function composition
- F of G  f(g(x))
- Higher order functions
	- functions that have functions as parameters
	- Map
	- Filter
- Lambda Expressions
	- anonymous functions (no name)

- Extras
	- de-structured assignment statements
	- Guards (conditionals)
	- Recursion
	- List comprehensions

- JavaScript
	- not purely functional programming language
	- Functions don't have to have a return value
	- allows for side-effects (change class vars in function)
	- We will now focus on the functional aspects of this language

We use arrow functions:
	const function_name = (x,y) => {expression(s); return val;
	map takes a list in a function and applies the function to every element in the list and returns a new list

Map used often in machine learning


Destructured assignment



Guards
	piecewise function



Recursion



Lists, list comprehensions



Lambda function:
const numbers = \[2, 3, 4, 5]
document.write(numbers.map(x => x\*x\*x));

We use the "let" keyword. Variables declared with let inside a {block} cannot be accessed from outside a block.
This goes with finctional style. No glabals, no side effects, values only leave a function as a return valueDIBT HAVE STATE 






the let keyword disallows a var to exist outside of {}


















### Do python in separate file
Upload zip file

To debug html, go to console in webdev tools

For recursion on lists

\[...list1, ...list2]
gives a copy  of list1 and list2

z = \[1,2,3,4,4,5,6];
copy = \[...z];

Safest way to deal with list
1. case of empty list
2. list containing 1 element //if you forget this case, you will error with infinite recursion
3. More than one element: recursion

tail recursion is fast!



Homework due MONDAY
use ... for deep copy on HW
push and pop, append
tail recursion is more efficient compiler.

list comprehension
Expression, generator, filter



Map Reduce



- [ ] Exam FRIDAY Nov 1st

Lazy evaluation:
put off mathematical epression until result is nevessary.
items within nparentheses only computed once needed.
lets you compute more without being bogged down.
eretosthenes primes.
We don't look ahead, we look behind.

Haskell lets you pass in operators in functions. 

Function composition
List functions
Higher order functions
Map
Lambda functions



\[a, b] = \[3, 4]
used in js and python


#### Name-Scope-Binding
High level lang have abstractions.
Low level lang represent archetecture
	machine independence
	ease of programming

Core issues for lang design
	control flow (aka branching)
	types (data, functions, classes, structs, etc)
	subroutines (functions or methods)
	classes
	names

Identifiers
- a fundamental abstraction to denote procedure, constant, variable, types
- A declaration of a name introduces a new sense in which the name may be used
	- print = 5;
	- print += 1
	- print =>6

Names:
- A name is a mnemonic string meant to represent something else.
- Allow us to refer to variables, constants, operations, types, etc. using symbolic identifiers rather than addresses.



Languages have rules for names so that the compiler/interpreter can recognize them.
- Max Length
- chars used
- case sensitivity/insensitivity
- certain words are reserved (keywords)


KeyWords:
- special only in a special context
- can be redefined

Reserved:
- never usable as a name



fortran:

PROGRAM my_first_fortran  
IMPLICIT NONE  
!Comments  
       INTEGER :: first_int, INTEGER  
       INTEGER = 5  
       WRITE(*,*) "INTEGER:", INTEGER  
END PROGRAM my_first_fortran



Variables:
- abstraction for a memory location
- int x = 5 ==> 5 at 0xAB572
- Name
- Address
- assigned value
- associated data type
- lifetime
- scope: where the value is readable and/or writable


Binding
- association between a name and the thing named
- binding time is the time when the association is created.

Possible binding times:
Static binding:
	- language design
	- language implementation
	- program writing
	- Linking time
		- C links to the library, but it isnt loaded until needed.
	- Loading time
Dynamic Binding
- Run time
	- new mallov

winddows.dll = dynamically loaded library


Static binding of type in Java
A b  = new A();

a = new A(); //runtime

final classes can't have subclasses.
- public final class A...

In java you cant change array size or type, so its static


C++ arrays allocated at compile.
pointer at run time.


char \*c pointer is a memory adress
& get the memory adress of a variable that is not a pointer
get the value at a pointer's adress \*c

Object o = new String("hello");

disadvantage of dynamic allocation is time spent to dynamically typecheck at runtime.

scope within block.

lifetime - may exist outside the FOR LOOP, 

nesting keywords to modify



10/28/24
Scope VS Lifetime
Dynamic Scoping - a weird thing.
Call Stack destructors
Garbage collection
- reference counting
- mark a sweep
- stop & copy


Scope = where variable accessible
Lifetime = when variable accessible

Java Static lifetime = entire program.

Lifetimes
javascript function
java block


Dynamic scoping
- instead of the scope depending on block or function, the scope depends on the sequence of function calls rather than the location , or by special keywords in the language.
- The value of a variable is bound to the most recently assigned value during exectuion.

Static Scoping vs dynamic



Lifetime:
	period between creation of binding and destruction of binding of a name to an object.

in java, we use the keyword static.

Other than globals, two ways to control a variable's lifetime:
- program stack and program heap

In a scripting language almost everything

Dynamically allocated objects use memory until deallocated explicitly by the programmer or by garbage collection.



Parse Tree For Grammar:
<\stmt> -> <\if_stmt> | <\print_stmt>
<\if_stmt> -> if<\logic_expr> <\stmt> | if<\logic_expr> <\stmt> else <\stmt>

<\logical_expr> -> <\var> == <\val> | <\var> != <\val>
<\stmt> -> <\var>=<\val>
<\print_stmt> -> print(<\var>); | print(<\val>);
<\var> = A|B|C
<\val> = 1|2|3|4

if c == 3
	if B != 1
		print B
	else
		b = 4


const varName = (list) => {stmts};

<\functionHeader> -> const <\var> = (<\list>) => {<\stmts>};
<\var> => <\letters>|<\digits>| _ | <\mixture>

EBNF:
functionHeader => const varname = blah blah blah with "("list")"

[] optional
( | ) choices
{,} 0 or more




S -> Xq
X -> q| rX | qrs

S, Xq, rX, qrs


arr = \[2, 4, 6, 8, 10]

const add = (x) => x + 1;
y = arr.map(add);

remove elements divisible by 4.
filter removes elements

arr.filter(x => x%4 != 0); adds on true, removes on false.

