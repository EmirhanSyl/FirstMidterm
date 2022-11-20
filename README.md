# FirstMidterm
 First(?!) Computer Programming-I Midterm - 17.11.2022

## QUESTIONS

### First Question
 Design an algorithm that calculates the duration between given two times containing hour and minute information. (Take separate inputs fır hour and minute as int type)
 
 Example((11:12,13:06) should return 1 hour(s) and 54 minutes,</br>
                (15:30, 17:40) should return 2 hour(s) and 10 minutes).
                
### Answer
[Tap.this.ForTheAnswer(question1);](/src/main/java/com/blackflower/firstmidterm/FirstQuestion.java)

---

### Second Question
 Design an algorithm that produces the output below and draw the flowchart of the algorithm. Each print statement can contain only one number. (Using more than 3 print statement is prohibited.)
 
        1 
        2 4 
        4 6 8 
        8 10 12 14 16 
        16 18 20 22 24 26 28 30 32 
                
### Answer
- [Tap.this.ForTheAnswer(question2-1_Code);](/src/main/java/com/blackflower/firstmidterm/SecondQuestion.java)
- [Tap.this.ForTheAnswer(question2-2_Flowchart);](/src/main/java/com/blackflower/firstmidterm/SecondQuestion_Flowchart.png)

---

### Third Question
 Find the output of the code below.
 
  ```java
        int y = 5;
        int x = 1;
        int z = 0;

        while (z < 12) {
            if (x >= (y >> 1)) {
                System.out.println("x: " + x + " y: " + y + " z: " + z);
            }
            z = (3 * x++) + y--;
        }
        System.out.println("x: " + x + " y: " + y + " z: " + z);
  ```
                
### Answer
[Tap.this.ForTheAnswer(question3);](/src/main/java/com/blackflower/firstmidterm/ThirdQuestion.java)

---

### Fourth Question
 Design an Employee Class that has integer salary, advancePayment1 and advancePayment2 properties.
 
 Create checkAdvanceAmount method that
 - takes pAdvancePayment1 and pAdvancePayment2 parameters and
 - assing them to related instance variables and
 - checks whether the total of advance payments axceeds the employee's salary and returns true or false
 
 Create a test class to test the return value of the method of the objects.
 
                
### Answer
- [Tap.this.ForTheAnswer(question4-1_Employee);](/src/main/java/com/blackflower/firstmidterm/Employee.java)
- [Tap.this.ForTheAnswer(question4-2_Test);](/src/main/java/com/blackflower/firstmidterm/Test.java)

---

### Fifth Question
 Explain the following concepts.
 - What is the main responsibility and advantage of the labeled break?
 - Two main advantages of pseudo-code
                
### Answer

- Labelled breaks are used for stopping out-of-scope loops. The outer scope loops can be break from inner loops using labeled breaks. However, These type of structures might break the standard execution order of code. So, Labeled breaks must be use carefuly.
- Advantages of pseudo-code (Possible answers)
> - it is fairly easy to understand, even for non-programmers
> - it can be quickly and easily converted into an actual programming language as it is similar to a programming language
