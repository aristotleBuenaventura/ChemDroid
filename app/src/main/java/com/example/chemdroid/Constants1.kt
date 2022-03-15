package com.example.chemdroid

object Constants1{

    const val totalQuestion: String = "total_question"
    const val correctAnswer: String = "correct_answer"

    fun getQuestions(): ArrayList<Questions> {
        val  questionsList = ArrayList<Questions>()
        val que1 = Questions(1,"1. The summary at the end of an experiment that explains the results.",
            option1 = "conclusion",
            option2 = "procedures",
            option3 = "materials",
            option4 = "responding variable",
            correctAnswer = 1
            )

        questionsList.add(que1)

        val que2 = Questions(1,"2. What is an observation?",
            option1 = "A scientific statement based on ideas",
            option2 = "Using your senses to notice what is going on around you",
            option3 = "To be unaware of your surroundings",
            option4 = "The question that you want an answer to.",
            correctAnswer = 2
        )

        questionsList.add(que2)

        val que3 = Questions(1,"3. During this step of the scientific method, a scientist would gather background information.",
            option1 = "Hypothesis",
            option2 = "Research",
            option3 = "Observation",
            option4 = "Experiment",
            correctAnswer = 2
        )

        questionsList.add(que3)

        val que4 = Questions(1,"4. The scientific method is made up of several:",
            option1 = "stones",
            option2 = "experiments",
            option3 = "problems",
            option4 = "steps",
            correctAnswer = 4
        )

        questionsList.add(que4)

        val que5 = Questions(1,"5. What is a hypothesis?",
            option1 = "A hypothesis is the right answer to an experiment.",
            option2 = "A hypothesis is an educated guess.",
            option3 = "A hypothesis is the wrong answer to an experiment.",
            option4 = "I don't know.",
            correctAnswer = 2
        )

        questionsList.add(que5)

        val que6 = Questions(1,"6. List the Scientific Process steps in order.",
            option1 = "Observation, Question, Hypothesis, Experiment, Data, Conclusion",
            option2 = "Observation, Experiment, Hypothesis, Conclusion, Data, Question",
            option3 = "Conclusion, Observation, Experiment, Data, Hypothesis",
            option4 = "None of the above",
            correctAnswer = 1
        )

        questionsList.add(que6)

        val que7 = Questions(1,"7. What is using your 5 senses (seeing, hearing, touching, smelling, and tasting when appropriate) along with the right tools to gather information called?",
            option1 = "hypothesizing",
            option2 = "communicating",
            option3 = "observing",
            option4 = "questioning",
            correctAnswer = 3
        )

        questionsList.add(que7)

        val que8 = Questions(1,"8. A series of steps used by scientists to solve a problem or answer a question.",
            option1 = "metric system",
            option2 = "recipe",
            option3 = "data collection",
            option4 = "scientific method",
            correctAnswer = 2
        )

        questionsList.add(que8)

        val que9 = Questions(1,"9. When making an observation, you must use...",
            option1 = "ALL 5 Senses",
            option2 = "Only Taste",
            option3 = "Smell & Touch",
            option4 = "Only Sight",
            correctAnswer = 1
        )

        questionsList.add(que9)

        val que10 = Questions(1,"10. What is the Scientific Method?",
            option1 = "The steps to making an experiment.",
            option2 = "The steps to making proving your hypothesis is right.",
            option3 = "The six steps to making an experiment.",
            option4 = "Don't know.",
            correctAnswer = 1
        )

        questionsList.add(que10)




        return questionsList
    }
}