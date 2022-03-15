package com.example.chemdroid

object Constants2{

    const val totalQuestion: String = "total_question"
    const val correctAnswer: String = "correct_answer"

    fun getQuestions(): ArrayList<Questions> {
        val  questionsList = ArrayList<Questions>()
        val que1 = Questions(1,"1. The ability of a metal to allow heat or electricity to pass through it.",
            option1 = "conductivity",
            option2 = "insulator",
            option3 = "density",
            option4 = "mass",
            correctAnswer = 1
            )

        questionsList.add(que1)

        val que2 = Questions(1,"2. The amount of space something takes up",
            option1 = "density",
            option2 = "mass",
            option3 = "volume",
            option4 = "matter",
            correctAnswer = 3
        )

        questionsList.add(que2)

        val que3 = Questions(1,"3. What are the three states of matter?",
            option1 = "solid, volume, mass",
            option2 = "density, volume, mass",
            option3 = "density, gas, volume",
            option4 = "solid, liquid, gas",
            correctAnswer = 4
        )

        questionsList.add(que3)

        val que4 = Questions(1,"4. Shape is a ____ that helps identify an object.",
            option1 = "physical property",
            option2 = "chemical property",
            option3 = "mass",
            option4 = "matter",
            correctAnswer = 1
        )

        questionsList.add(que4)

        val que5 = Questions(1,"5. A watermelon has more matter than a grape, so it has more",
            option1 = "mass",
            option2 = "eat",
            option3 = "solid",
            option4 = "greater",
            correctAnswer = 1
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

        val que7 = Questions(1,"7. A measure of how much mass is contained in a given unit of volume.",
            option1 = "mass",
            option2 = "density",
            option3 = "volume",
            option4 = "matter",
            correctAnswer = 2
        )

        questionsList.add(que7)

        val que8 = Questions(1,"8. Iron + oxygen = rust is an example of a ___________.",
            option1 = "physical property/change",
            option2 = "mass",
            option3 = "chemical property/change",
            option4 = "volume",
            correctAnswer = 3
        )

        questionsList.add(que8)

        val que9 = Questions(1,"9. Liquid matter takes the shape of _______.",
            option1 = "a gas",
            option2 = "water",
            option3 = "a pet",
            option4 = "Its container",
            correctAnswer = 4
        )

        questionsList.add(que9)

        val que10 = Questions(1,"10. Solids have a definite _______________.",
            option1 = "smell",
            option2 = "shape",
            option3 = "sound",
            option4 = "picture",
            correctAnswer = 2
        )

        questionsList.add(que10)




        return questionsList
    }
}