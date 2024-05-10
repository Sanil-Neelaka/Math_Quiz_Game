package com.example.mathquestiongame

data class Question(
    val question: String,
    val options: List<String>,
    val correctOption: Int
)