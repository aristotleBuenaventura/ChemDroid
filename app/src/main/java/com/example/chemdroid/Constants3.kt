package com.example.chemdroid

object Constants3{

    const val totalQuestion: String = "total_question"
    const val correctAnswer: String = "correct_answer"

    fun getQuestions(): ArrayList<Questions> {
        val  questionsList = ArrayList<Questions>()
        val que1 = Questions(1,"1. Sour Taste: Chemical or Physical Property",
            option1 = "Chemical Property",
            option2 = "Physical Change",
            option3 = "Physical Property",
            option4 = "Chemical Change",
            correctAnswer = 3
            )

        questionsList.add(que1)

        val que2 = Questions(1,"2. Frank has a paper clip. It has a mass of 9g and a volume of 3cm3. What is its density?",
            option1 = "3 g/cm^3",
            option2 = "1/3 g/cm^3",
            option3 = "27 g/cm^3",
            option4 = "39 g/cm^3",
            correctAnswer = 1
        )

        questionsList.add(que2)

        val que3 = Questions(1,"3. What is calculated by multiplying l x w x h?",
            option1 = "mass",
            option2 = "grades",
            option3 = "volume",
            option4 = "weight",
            correctAnswer = 3
        )

        questionsList.add(que3)

        val que4 = Questions(1,"4. Which of the following is a chemical change?",
            option1 = "human digestion",
            option2 = "melting a chocolate bar",
            option3 = "cutting a tree down",
            option4 = "Has a density of 1 gm/mL",
            correctAnswer = 1
        )

        questionsList.add(que4)

        val que5 = Questions(1,"5. Which units of measurement are used for volume?",
            option1 = "grams",
            option2 = "grams/milliliter",
            option3 = "centimeters",
            option4 = "milliliter",
            correctAnswer = 4
        )

        questionsList.add(que5)

        val que6 = Questions(1,"6. You can measure ______ with grams.",
            option1 = "mass",
            option2 = "volume",
            option3 = "conductivity",
            option4 = "melting point",
            correctAnswer = 1
        )

        questionsList.add(que6)

        val que7 = Questions(1,"7. Which of the following is not a chemical property?",
            option1 = "rusting",
            option2 = "boiling",
            option3 = "rotting",
            option4 = "burning",
            correctAnswer = 2
        )

        questionsList.add(que7)

        val que8 = Questions(1,"8. Which one of these is a chemical property?",
            option1 = "melting point",
            option2 = "color",
            option3 = "boiling point",
            option4 = "flammability",
            correctAnswer = 4
        )

        questionsList.add(que8)

        val que9 = Questions(1,"9. Which is an example of a physical property?",
            option1 = "ability to react with acid",
            option2 = "flammability",
            option3 = "ability to react with oxygen",
            option4 = "state of matter",
            correctAnswer = 4
        )

        questionsList.add(que9)

        val que10 = Questions(1,"10. The tool used to measure the mass of a substance or object is a ______________.",
            option1 = "balance",
            option2 = "ruler",
            option3 = "thermometer",
            option4 = "graduated cylinder",
            correctAnswer = 1
        )

        questionsList.add(que10)




        return questionsList
    }
}