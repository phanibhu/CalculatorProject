# Calculator project

## Installations:
* Java JDK
* Gradle
* Git
## Used Dependencies:
* TestNg
## Information About Project:
### Logic Code (Dev)
#### 1.Basic Operations
    1.Addition
    2.Subtraction
    3.Multipication
    4.Division

    DESCRIPTION : This Program will do operations like Addition,
                   Subraction, Multiplication and division for more than two numbers
                   (For two numbers) -- send numbers as parameters
                   (For Multiple numbers)-- send numbers in an array
#### 2.Store Calculated History
    DESCRIPTION : It Can store calucaltors that we did throught this program and whenever we want we an view history

#### 3.Handle Exceptions
    DESCRIPTION : If any Unchecked exceptions like Arithmetic exception And Array index out of bounds Exception

### Tests (Tester)

#### 1.Basic Operations

     STEPS TO TEST :

      1. Declare values in two variables (If Values are more than two declare it in array)
      2. call the related function and send these array or two variables in the methos
      3. Get the result from the function and stroed it in a variable (Result)
      4. By Using testNg or Junit 5 compare the result with expected value
      5. Run the test 

#### 2.Calculation History
    STEPS TO TEST:

      1. Declare values in two variables (If Values are more than two declare it in array)
      2. call the related function and send these array or two variables in the methos
      3. Get the result from the function and stroed it in a variable (Result)
      4. Follow above 3 steps to do multiple operations
      5. After getting results store Input and  Result it in calculator history
         EX : Input : 10 + 3
              Output : 13
      6. After adding to using Any Frame Work
         --> like Size of the History
         --> First Calculated History 
      7. Run the test

#### 3.Handle Exceptions
       STEPS TO TEST:

       1. Provide Divisor value as 0(Zero) or using index value more than or equal to size of the array
       2. Using any frame work Compare it with exception
       3. Run the test
# Authors
_**Phanibhushan Rao**