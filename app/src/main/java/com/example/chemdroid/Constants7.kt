package com.example.chemdroid

object Constants7{

    const val totalQuestion: String = "total_question"
    const val correctAnswer: String = "correct_answer"

    fun getQuestions(): ArrayList<Questions> {
        val  questionsList = ArrayList<Questions>()
        val que1 = Questions(1,"1. Rutherford discovered what part of the atom",
            option1 = "nucleus",
            option2 = "proton",
            option3 = "electron",
            option4 = "neutron",
            correctAnswer = 1
            )

        questionsList.add(que1)

        val que2 = Questions(1,"2. JJ Thomson discovered what subatomic particle",
            option1 = "nucleus",
            option2 = "proton",
            option3 = "electron",
            option4 = "neutron",
            correctAnswer = 3
        )

        questionsList.add(que2)

        val que3 = Questions(1,"3. Which of the following shows the correct order of Atomic Theory Timeline",
            option1 = "Rutherford, Bohr, Dalton, Democritus, Thomson",
            option2 = "Bohr, Democritus, Thomson, Rutherford, Dalton",
            option3 = "Democritus, Dalton, Thomson, Rutherford, Bohr",
            option4 = "Dalton, Thomson, Rutherford, Bohr, Democritus",
            correctAnswer = 3
        )

        questionsList.add(que3)

        val que4 = Questions(1,"4. Thomson Experimented with ______",
            option1 = "Gold Foil",
            option2 = "cathode rays",
            option3 = "protons",
            option4 = "alpha particles",
            correctAnswer = 2
        )

        questionsList.add(que4)

        val que5 = Questions(1,"5. This particle balances the charges from the protons to make the atom neutral",
            option1 = "nucleus",
            option2 = "proton",
            option3 = "electron",
            option4 = "neutron",
            correctAnswer = 3
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

        val que7 = Questions(1,"7. Who proposed the theory that atoms orbit the nucleus in specific orbits.",
            option1 = "Bohr",
            option2 = "Rutherford",
            option3 = "Chadwick",
            option4 = "Democritus",
            correctAnswer = 1
        )

        questionsList.add(que7)

        val que8 = Questions(1,"8. Rutherford experimented with ____",
            option1 = "Gold foil and alpha particles",
            option2 = "electron and alpha particles",
            option3 = "gold foil and cathode rays",
            option4 = "Cathode rays and alpha particles",
            correctAnswer = 1
        )

        questionsList.add(que8)

        val que9 = Questions(1,"9. First person to propose the concept of an atom",
            option1 = "Bohr",
            option2 = "Rutherford",
            option3 = "Chadwick",
            option4 = "Democritus",
            correctAnswer = 4
        )

        questionsList.add(que9)

        val que10 = Questions(1,"10. His atomic model was depicted similar to a planetary/solar system",
            option1 = "Bohr",
            option2 = "Rutherford",
            option3 = "Chadwick",
            option4 = "Democritus",
            correctAnswer = 1
        )

        questionsList.add(que10)




        return questionsList
    }
}