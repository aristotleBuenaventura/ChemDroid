package com.example.chemdroid

object Constants8{

    const val totalQuestion: String = "total_question"
    const val correctAnswer: String = "correct_answer"

    fun getQuestions(): ArrayList<Questions> {
        val  questionsList = ArrayList<Questions>()
        val que1 = Questions(1,"1. Which scientist developed the atomic theory?",
            option1 = "JJ Thomson",
            option2 = "John Dalton",
            option3 = "Ernest Rutherford",
            option4 = "James Chadwick",
            correctAnswer = 2
            )

        questionsList.add(que1)

        val que2 = Questions(1,"2. A tiny but very dense, positively charged portion of the atom that holds most of the atomic mass",
            option1 = "Electron Shells",
            option2 = "Electron Cloud",
            option3 = "Orbitals",
            option4 = "Nucleus",
            correctAnswer = 4
        )

        questionsList.add(que2)

        val que3 = Questions(1,"3. Subatomic particles that are neutral in charge",
            option1 = "Neutrons",
            option2 = "Nucleus",
            option3 = "Electrons",
            option4 = "Protons",
            correctAnswer = 1
        )

        questionsList.add(que3)

        val que4 = Questions(1,"4. What did Thomson discover?",
            option1 = "electron",
            option2 = "proton",
            option3 = "electron cloud",
            option4 = "neutron",
            correctAnswer = 1
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

        val que6 = Questions(1,"6. Electron cloud is based on",
            option1 = "Gold Foil Experiment",
            option2 = "Quantum Mechanics",
            option3 = "Matter is made up of small particles called atoms",
            option4 = "Nuclear Theory",
            correctAnswer = 2
        )

        questionsList.add(que6)

        val que7 = Questions(1,"7. He developed the planetary model of the atom.",
            option1 = "Rutherford",
            option2 = "Dalton",
            option3 = "Bohr",
            option4 = "Democritus",
            correctAnswer = 3
        )

        questionsList.add(que7)

        val que8 = Questions(1,"8. James Chadwick discovered the ________.",
            option1 = "Electrons",
            option2 = "Protons",
            option3 = "Quarks",
            option4 = "Neutrons",
            correctAnswer = 4
        )

        questionsList.add(que8)

        val que9 = Questions(1,"9. John Dalton stated:",
            option1 = "Atoms are tiny, invisible particles.",
            option2 = "Compounds form by combining atoms.",
            option3 = "Atoms of different elements are different.",
            option4 = "All of the statements listed.",
            correctAnswer = 4
        )

        questionsList.add(que9)

        val que10 = Questions(1,"10. Subatomic particles with a negative charge",
            option1 = "Electrons",
            option2 = "Protons",
            option3 = "Quarks",
            option4 = "Neutrons",
            correctAnswer = 1
        )

        questionsList.add(que10)




        return questionsList
    }
}