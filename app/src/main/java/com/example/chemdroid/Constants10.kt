package com.example.chemdroid

object Constants10{

    const val totalQuestion: String = "total_question"
    const val correctAnswer: String = "correct_answer"

    fun getQuestions(): ArrayList<Questions> {
        val  questionsList = ArrayList<Questions>()
        val que1 = Questions(1,"1. How many Sodium (Na) are in 6NaCl?",
            option1 = "1",
            option2 = "12",
            option3 = "5",
            option4 = "6",
            correctAnswer = 4
            )

        questionsList.add(que1)

        val que2 = Questions(1,"2. NH3 ---> N2 + H2 What are the products?",
            option1 = "N2 + H2",
            option2 = "N2",
            option3 = "H2",
            option4 = "NH3",
            correctAnswer = 1
        )

        questionsList.add(que2)

        val que3 = Questions(1,"3. How many atoms are there TOTAL in: H2SO4",
            option1 = "5",
            option2 = "6",
            option3 = "7",
            option4 = "3",
            correctAnswer = 3
        )

        questionsList.add(que3)

        val que4 = Questions(1,"4. Which of the following is a compound?",
            option1 = "Co",
            option2 = "O2",
            option3 = "CO2",
            option4 = "C",
            correctAnswer = 3
        )

        questionsList.add(que4)

        val que5 = Questions(1,"5. Na + MgF2 --> NaF + Mg What are the reactants?",
            option1 = "Na + MgF2",
            option2 = "NaF + Mg",
            option3 = "Na",
            option4 = "NaF",
            correctAnswer = 1
        )

        questionsList.add(que5)

        val que6 = Questions(1,"6. These particles are found in the nucleus",
            option1 = "protons and neutrons",
            option2 = "protons and electrons",
            option3 = "nucleus and neutrons",
            option4 = "electrons and neutrons",
            correctAnswer = 1
        )

        questionsList.add(que6)

        val que7 = Questions(1,"7. The substances at the beginning of a chemical equation are called the ____",
            option1 = "product",
            option2 = "yield",
            option3 = "chemical symbol",
            option4 = "reactants",
            correctAnswer = 4
        )

        questionsList.add(que7)

        val que8 = Questions(1,"8. All of the following are chemical changes except",
            option1 = "iron rusting",
            option2 = "wood burning",
            option3 = "food rotting",
            option4 = "water evaporating",
            correctAnswer = 4
        )

        questionsList.add(que8)

        val que9 = Questions(1,"9. How many atoms of carbon (C) are in C6H12O6?",
            option1 = "3",
            option2 = "5",
            option3 = "12",
            option4 = "6",
            correctAnswer = 4
        )

        questionsList.add(que9)

        val que10 = Questions(1,"10. Which is the correct formula for: three hydrogen (H) one sulfur (S) four oxygen (O)",
            option1 = "H3SO4",
            option2 = "H4S3O",
            option3 = "H2O",
            option4 = "HSO4",
            correctAnswer = 1
        )

        questionsList.add(que10)




        return questionsList
    }
}