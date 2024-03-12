This assignment is evaluated according to four dimensions, with a score from 0 to 4. 
The four dimensions and their weights are:
- Metamodel Completeness (30%)
- Metamodel Consistency	(40%)
- Constraints and Derived Features (10%)
- Project Setup (20%)

The score is then converted in a scale from 0 to 10. You find below the corresponding values, last one being the grade. You will find the grade on Blackboard as well.

4	3	4	2
8.0

This is a nice model, although some things are probably a bit off from what was expected. I am not sure how those filters would work, but I think I got the idea. It is particularly nice that you have implemented those operations in the code. You forgot to set the multiplicity to attributes: almost all of them are with the default multiplicity 0..1, which is probably not appropriate for most of them. The are some relations that I do not understand, and I think there is room for some inconsistencies in the model. For example the fact that a course combination may have subcombinations. The configuration of the repository can be improved: I had to re-create the project configuration because it was missing in the repository, so I could not import the project. Also the edit and editor projects have not been included. Overall, good job :)

