# Assignment 1
This is assiginment 1 for the course TDT4250. The task is to create a study programme model.

In the `model` you will find the ecore model and the generator model. In the same folder, a dynamic instance of the [MIDT](https://www.ntnu.no/studier/midt) studyprogramme at NTNU is available. The `src/studyprogramme` folder contains all the generated code (including manual written code).

## Domain Model

### Description
The system is mainly based on a tree structure for supporting both simple and complex study programmes. The root container is called `UOD` (Universe of Discourse). This contains all the available courses and programmes.

A `Programme` represents  a study programme, and mainly contains `academicYears`. An `AcademicYear` entry should be created for every year new students starts on the programme. Further, an `AcademicYear` contains `courseCombinations`. A `CourseCombination` represents a node in a tree structure of the study programme. For example, one might create a `CourseCombination` for each year. A `CourseCombination` may contain other `CourseCombinations`. Hence, these "nodes" plays a vital part in the organization of a programme. A `CourseCombination` can also contain a reference to a `Specialisation`, acting as a specialisation step.

A `CourseCombination` "leaf node" should contain `courseGroups` (constraints are implemented). A `CourseGroup` effectively provide a collection of one or more courses. These groups may be marked as mandatory or elective. Which courses that are available in a course group is determined by a **filtering system**. This makes it possible to provide course requirements in a modular and extendible way. It is implemented with a abstract `Criterion` class. Any class extending this `Criterion` class, can provide it's own filtering method. For example, that a course must be at a certain level.

### Model Hierarchy

![model UML](assets/ModelUML.png)

## Constraints
| Constraint | Type | Description |
| ---------- | ---- | ----------- |
| programmesMustHaveUniqueCode | OCL | Ensures that a `Programme` has a unique code.|
| hasEnoughCredits | manual | Ensures that the `AcademicYear` contains (indirectly) at least enough courses to cover the study programme credit requirement. |
| containsEitherCourseCombinationsOrCourseGroups | OCL | A `CourseCombination` can only either contain several `CourseCombination` or multiple `CourseCourseGroups`. |
| minimumOneCoursePresent | manual | A valid `CourseGroup` must (indirectly) contain at least one course. |

## Assignment summary
This project provides a ECore model capable of representing a studyprogrammes. It is possible to achieve fine grained control over a programmes structure. It's duration, specialisations, which courses are available, whether courses are mandatory or elective, etc.

Several features of Ecore have been put to use. This includes, but is not limited to:
* classes
* operations
* datatypes
  * EEnums
  * EData Type
* attributes
* references
  * ordinary references
  * containment references
  * oppsites
* constraints
  * manually written
  * OCL
* derived features
