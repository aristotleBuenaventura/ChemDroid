package com.example.chemdroid

object Constants9{

    const val totalQuestion: String = "total_question"
    const val correctAnswer: String = "correct_answer"

    fun getQuestions(): ArrayList<Questions> {
        val  questionsList = ArrayList<Questions>()
        val que1 = Questions(1,"1. The atomic number identifies the number of __________.",
            option1 = "nucleus",
            option2 = "proton",
            option3 = "electron",
            option4 = "neutron",
            correctAnswer = 2
            )

        questionsList.add(que1)

        val que2 = Questions(1,"2. The center of an atom is called the ________________.",
            option1 = "nucleus",
            option2 = "proton",
            option3 = "electron",
            option4 = "neutron",
            correctAnswer = 1
        )

        questionsList.add(que2)

        val que3 = Questions(1,"3. What type of charge does a proton have?",
            option1 = "positive",
            option2 = "negative",
            option3 = "neutral",
            option4 = "no charge",
            correctAnswer = 1
        )

        questionsList.add(que3)

        val que4 = Questions(1,"4. What charge does an electron have?",
            option1 = "positive",
            option2 = "negative",
            option3 = "neutral",
            option4 = "no charge",
            correctAnswer = 2
        )

        questionsList.add(que4)

        val que5 = Questions(1,"5. Subatomic particles that have a negative charge",
            option1 = "nucleus",
            option2 = "proton",
            option3 = "electron",
            option4 = "neutron",
            correctAnswer = 3
        )

        questionsList.add(que5)

        val que6 = Questions(1,"6. In what part of an atom can the protons and neutrons be found?",
            option1 = "nucleus",
            option2 = "neutrine",
            option3 = "proton cloud",
            option4 = "electron cloud",
            correctAnswer = 1
        )

        questionsList.add(que6)

        val que7 = Questions(1,"7. Which parts of the atom move around the nucleus?",
            option1 = "nucleus",
            option2 = "proton",
            option3 = "electron",
            option4 = "neutron",
            correctAnswer = 3
        )

        questionsList.add(que7)

        val que8 = Questions(1,"8. In an atom, the number of protons is equal to the number of ____________.",
            option1 = "energy levels",
            option2 = "electrons",
            option3 = "neurons",
            option4 = "neutrons",
            correctAnswer = 2
        )

        questionsList.add(que8)

        val que9 = Questions(1,"9. Subatomic particle that has a positive charge",
            option1 = "nucleus",
            option2 = "proton",
            option3 = "electron",
            option4 = "neutron",
            correctAnswer = 2
        )

        questionsList.add(que9)

        val que10 = Questions(1,"10. The name of this particle means indivisible and it is the building block of matter",
            option1 = "compound",
            option2 = "isotope",
            option3 = "atom",
            option4 = "molecule",
            correctAnswer = 3
        )

        questionsList.add(que10)




        return questionsList
    }
}