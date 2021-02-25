Lift Kata
==========

This repo has a starting position for doing the Lift Kata.

Lift Kata Description
---------------------

Since lifts are everywhere and they contain software, how easy would it be to write a basic one? Let’s TDD a lift, starting with simple behaviors and working toward complex ones. Assume good input from calling code and concentrate on the main flow.

Lift features:

- a lift moves between a number of floors.
- a lift has a panel of buttons passengers can press to _request_ floors.
- people can call the lift from other floors. A _call_ has both a floor and a desired direction.
- a lift has doors which may be open or closed.

In this repository, that much is already implemented. The following features are not yet implemented:

- a lift fulfills a _request_ when it moves to the requested floor and opens the doors.
- a lift can only move between floors if the doors are closed.
- a lift fulfills a _call_ when it moves to the correct floor, is about to go in the called direction, and opens the doors.

Lifts do not respond immediately or do everything at once. To simplify handling time in this exercise, the provided LiftSystem class has a 'tick' method. Every time you call it, the lift system should simulate a unit of time passing, and update its state according to what changes occurred during that time period. Lifts can move between floors or open their doors for example.

To simplify things, Lifts only accept new calls and requests when they are on a floor. (Then we don't have to model what happens when they are between floors).

The starting code has a Lift class with basic attributes like a floor, requests and doors. Can you build on this code and create something that fulfills all the desired features? Consider Object-Oriented design principles. Can you make Lift and LiftSystem into a well-designed encapsulated objects? 

### Multiple lifts
When you have a single lift working well, you may want to tackle these further features: 

- there can be more than one lift.
- only one lift needs to respond to each call.
- on each floor there is a monitor above each lift door. While the lift is moving it shows which floor it is on.
- when the lift stops at a floor to answer a call, the monitor shows which direction it will go in.
- when fulfilling a call, the relevant lift makes a 'DING' as it opens the doors.

Note: the printer does not currently show the lift monitor and the ding.


Acknowledgements
----------------
Based in the Lift Kata exercise prepared by Emily Bache https://github.com/emilybache/Lift-Kata
and the original kata described at https://kata-log.rocks/lift-kata
