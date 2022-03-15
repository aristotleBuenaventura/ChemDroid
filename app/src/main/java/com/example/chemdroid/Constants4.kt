package com.example.chemdroid

object Constants4{

    const val totalQuestion: String = "total_question"
    const val correctAnswer: String = "correct_answer"

    fun getQuestions(): ArrayList<Questions> {
        val  questionsList = ArrayList<Questions>()
        val que1 = Questions(1,"1. How many cm^3 are in 0.00424 dm^3?",
            option1 = "4.24 cm^3",
            option2 = "424 cm^3",
            option3 = "0.424 cm^3",
            option4 = "0.0424 cm^3",
            correctAnswer = 1
            )

        questionsList.add(que1)

        val que2 = Questions(1,"2. Which is the longest measurement?",
            option1 = "10 mm",
            option2 = "10 dm",
            option3 = "10 cm",
            option4 = "10 micrometer",
            correctAnswer = 2
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

        val que4 = Questions(1,"4. An empty volumetric flask, weighing 27.16 grams, has a volume of 100.4 cm^3. How much would it weigh when filled with bromine, an element that has a density of 3.1028 g/cm^3?",
            option1 = "395.8 g",
            option2 = "338.7 g",
            option3 = "311.5 g",
            option4 = "284.4 g",
            correctAnswer = 2
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

        val que6 = Questions(1,"6. Convert 2.5 kg/m^3 into g/m^3",
            option1 = "0.25",
            option2 = "0.0025",
            option3 = "0.00025",
            option4 = "0.25",
            correctAnswer = 2
        )

        questionsList.add(que6)

        val que7 = Questions(1,"7. The momentum of an object is its mass times its velocity. What is the derived SI unit for momentum?",
            option1 = "kg/m",
            option2 = "g m/s",
            option3 = "kg m/s",
            option4 = "m/s^2",
            correctAnswer = 3
        )

        questionsList.add(que7)

        val que8 = Questions(1,"8. The boiling point of chlorine is ‑34.6 °C. This temperature expressed in kelvins is",
            option1 = "-30.3K",
            option2 = "177.4K",
            option3 = "238.6K",
            option4 = "243.0K",
            correctAnswer = 3
        )

        questionsList.add(que8)

        val que9 = Questions(1,"9. The diameter of a certain atom was found to be 2.35 x 10^‑8 cm. How many nanometers is this?",
            option1 = "2.35 x 10^1 nm",
            option2 = "2.35 x 10^‑19 nm",
            option3 = "2.35 x 10^‑10 nm",
            option4 = "2.35 x 10^‑1 nm",
            correctAnswer = 4
        )

        questionsList.add(que9)

        val que10 = Questions(1,"10. The density of gold, expressed in non-SI units is 19.3 g/cm^3. In SI units, the density is",
            option1 = "0.0193 kg/cm^3",
            option2 = "1.93 x 10^4 kg/m^3",
            option3 = "1.93 x 10^4 kg/cm^3",
            option4 = "193 kg/m^3",
            correctAnswer = 2
        )

        questionsList.add(que10)




        return questionsList
    }
}