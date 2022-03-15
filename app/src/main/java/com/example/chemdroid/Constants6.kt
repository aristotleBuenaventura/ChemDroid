package com.example.chemdroid

object Constants6{

    const val totalQuestion: String = "total_question"
    const val correctAnswer: String = "correct_answer"

    fun getQuestions(): ArrayList<Questions> {
        val  questionsList = ArrayList<Questions>()
        val que1 = Questions(1,"1. N2 + 3H2 ---> 2NH3 What is the molar ratio between H2 and NH3?",
            option1 = "1: 3",
            option2 = "3 : 2",
            option3 = "1 : 6",
            option4 = "2 : 3",
            correctAnswer = 2
            )

        questionsList.add(que1)

        val que2 = Questions(1,"2. N2 + 3H2 → 2NH3 How many moles of hydrogen, H2, are needed to react with 2.0 moles of nitrogen, N2?",
            option1 = "3 mol H2O",
            option2 = "1 mol H2O",
            option3 = "2 mol H2O",
            option4 = "6 mol H2O",
            correctAnswer = 4
        )

        questionsList.add(que2)

        val que3 = Questions(1,"3. N2 + 3H2 → 2NH3 How many moles of hydrogen, H2, are needed to react with 1.0 moles of nitrogen, N2?",
            option1 = "3 mol H2O",
            option2 = "1 mol H2O",
            option3 = "2 mol H2O",
            option4 = "6 mol H2O",
            correctAnswer = 1
        )

        questionsList.add(que3)

        val que4 = Questions(1,"4. 2H2 + O2 ---> 2H2O What is the molar ratio between O2 and H2O?",
            option1 = "2 : 1",
            option2 = "1 : 2",
            option3 = "4: 2",
            option4 = "2: 2",
            correctAnswer = 2
        )

        questionsList.add(que4)

        val que5 = Questions(1,"5. 2H2O ---> 2H2 + O2 How many moles of hydrogen gas, H2, result from the electrolysis of 78.4 moles of water, H2O?",
            option1 = "78.4 mol H2O",
            option2 = "39.2 mol H2O",
            option3 = "8651 mol H2O",
            option4 = "156.8 mol H2O",
            correctAnswer = 1
        )

        questionsList.add(que5)

        val que6 = Questions(1,"6. 2H2 + O2 ---> 2H2O What is the molar ratio between H2 and O2?",
            option1 = "2 : 1",
            option2 = "2: 2",
            option3 = "4: 2",
            option4 = "1 : 2",
            correctAnswer = 1
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

        val que8 = Questions(1,"8. N2 + 3H2 ---> 2NH3 What is the molar ratio between N2 and H2?",
            option1 = "1: 3",
            option2 = "1 : 2",
            option3 = "1 : 6",
            option4 = "3 : 2",
            correctAnswer = 1
        )

        questionsList.add(que8)

        val que9 = Questions(1,"9. 2H2O ---> 2H2 + O2 How many moles of water, H2O, are required to produce 905 moles of hydrogen, H2?",
            option1 = "905 mol H2O",
            option2 = "1810 mol H2O",
            option3 = "1018 mol H2O",
            option4 = "452.5 mol H2O",
            correctAnswer = 1
        )

        questionsList.add(que9)

        val que10 = Questions(1,"10. N2 + 3H2 ---> 2NH3 What is the molar ratio between N2 and NH3?",
            option1 = "1: 3",
            option2 = "1 : 2",
            option3 = "1 : 6",
            option4 = "3 : 2",
            correctAnswer = 2
        )

        questionsList.add(que10)




        return questionsList
    }
}