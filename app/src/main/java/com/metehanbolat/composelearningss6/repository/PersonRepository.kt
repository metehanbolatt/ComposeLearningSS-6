package com.metehanbolat.composelearningss6.repository

import com.metehanbolat.composelearningss6.model.Person


class PersonRepository {
    fun getAllData(): List<Person>{
        return listOf(
            Person(
                id = 0,
                firstName = "Metehan",
                lastName = "Bolat",
                age = 27
            ),
            Person(
                id = 1,
                firstName = "Ahmet",
                lastName = "Altın",
                age = 20
            ),
            Person(
                id = 2,
                firstName = "Mehmet",
                lastName = "Ersoy",
                age = 21
            ),
            Person(
                id = 3,
                firstName = "Nazım",
                lastName = "Erkin",
                age = 23
            ),
            Person(
                id = 4,
                firstName = "Caner",
                lastName = "Gönül",
                age = 19
            ),
            Person(
                id = 5,
                firstName = "Mesut",
                lastName = "Bayındır",
                age = 17
            ),
            Person(
                id = 6,
                firstName = "Altay",
                lastName = "Özil",
                age = 22
            ),
            Person(
                id = 7,
                firstName = "Selçuk",
                lastName = "Korkmaz",
                age = 35
            ),
            Person(
                id = 8,
                firstName = "Burak",
                lastName = "İnan",
                age = 32
            ),
            Person(
                id = 9,
                firstName = "Hüsnü",
                lastName = "Çoban",
                age = 31
            ),
        )
    }
}