# tdd-xp-60-minutes
A kata to introduce, XP practises, in 60 minutes, in a mob programming fashion

## Host manual
### Ground rules
* __TDD__
	* If needed introduce the TDD cycle and rules
* __Mob__
	* The keyboard changes hands at each step of the TDD cycle
	* The person on the keyboard can choose to listen to the mob or not. The other can change the code to their liking when it's their turn
* __Timebox__
	* The client is waiting for his product, better hurry !
	* The refactor phases must go quickly to keep the keyboard turning

### The show
__Sample introduction__ : Hi, you are my development team ! Allow me to introduce myself, my name is XXX, I'm your customer. I need you to code my revolutionnary product : a number generator !

-----------

Introduce one feature after the other (after each successful integration)

1. Even number
	* Try to make them avoid the number 2
2. Ends with the number 2
3. Superior to 9
4. Inferior to 100
5. The sum of its digits is equal to 6

### XP Principles
![Original XP principles](https://ullizee.files.wordpress.com/2009/11/kent-beck-12-xp-practices.jpg)

* Metaphor
	* To simplify it means that the business and code share the same language
* Planning Game
	* We planned one feature by release
	* We affected one person by part of the TDD cycle
* Coding Standards
	* Some very probably followed coding standards
		* The case (camel, snake)
		* Class names that start with a capital letter
		* Identation
		* ...
* Simple design. Event without reminding the definition, the code should be sufficiently simple
	* All the tests pass
	* Minimises duplication
	* Maximises clarity
	* Fewer elements
