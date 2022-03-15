package com.example.chemdroid

object Constants5{

    const val totalQuestion: String = "total_question"
    const val correctAnswer: String = "correct_answer"

    fun getQuestions(): ArrayList<Questions> {
        val  questionsList = ArrayList<Questions>()
        val que1 = Questions(1,"1. How would you write 4.3756 x 10^4 in standard form?",
            option1 = "437,560,000",
            option2 = "0.00043756",
            option3 = "43,756",
            option4 = "4,3756",
            correctAnswer = 3
            )

        questionsList.add(que1)

        val que2 = Questions(1,"2. How many significant figures should your answer have for the following multiplication problem 19.10 X 18.0 X 22",
            option1 = "2",
            option2 = "3",
            option3 = "4",
            option4 = "5",
            correctAnswer = 1
        )

        questionsList.add(que2)

        val que3 = Questions(1,"3. The students measured length during a science experiment, they got 12 cm. But the actual measurement was 14.25 cm. What was the percent error?",
            option1 = "16%",
            option2 = "18.75%",
            option3 = "18%",
            option4 = "2.25%",
            correctAnswer = 1
        )

        questionsList.add(que3)

        val que4 = Questions(1,"4. The students measured length during a science experiement, they got 12 cm. But the actual measurement was 14.25 cm. What was the percent error?",
            option1 = "15.79%",
            option2 = "2.25%",
            option3 = "18%",
            option4 = "18.75%",
            correctAnswer = 1
        )

        questionsList.add(que4)

        val que5 = Questions(1,"5. Convert 39.45 g/mL into kg/L",
            option1 = "0.03945",
            option2 = "0.3945",
            option3 = "3.945",
            option4 = "39.45",
            correctAnswer = 4
        )

        questionsList.add(que5)

        val que6 = Questions(1,"6. How many sig figs are in 0.0045670?",
            option1 = "8",
            option2 = "4",
            option3 = "5",
            option4 = "7",
            correctAnswer = 3
        )

        questionsList.add(que6)

        val que7 = Questions(1,"7. Which of the following numbers has three significant figures?",
            option1 = "1014 miles",
            option2 = "101 feet",
            option3 = "all of the choices",
            option4 = "1000 yards",
            correctAnswer = 2
        )

        questionsList.add(que7)

        val que8 = Questions(1,"8. Calculate 5.50 cm + 5.5 cm and give your answer with the correct number of significant figures.",
            option1 = "11 cm",
            option2 = "11.00 cm",
            option3 = "11.000 cm",
            option4 = "11.0 cm",
            correctAnswer = 4
        )

        questionsList.add(que8)

        val que9 = Questions(1,"9. Which is the more precise measurement?",
            option1 = "4 mL",
            option2 = "4.3 mL",
            option3 = "4.300 mL",
            option4 = "4.30 mL",
            correctAnswer = 3
        )

        questionsList.add(que9)

        val que10 = Questions(1,"10. How many sig. fig. are in the number below: 705000",
            option1 = "2",
            option2 = "3",
            option3 = "4",
            option4 = "5",
            correctAnswer = 2
        )

        questionsList.add(que10)




        return questionsList
    }
}