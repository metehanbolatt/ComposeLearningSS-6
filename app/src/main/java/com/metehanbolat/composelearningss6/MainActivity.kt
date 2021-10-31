package com.metehanbolat.composelearningss6

import android.os.Bundle
import android.util.Log
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.foundation.lazy.itemsIndexed
import androidx.compose.ui.unit.dp
import com.metehanbolat.composelearningss6.repository.PersonRepository
import com.metehanbolat.composelearningss6.ui.theme.ComposeLearningSS6Theme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            ComposeLearningSS6Theme {

                val personRepository = PersonRepository()
                val getAllData = personRepository.getAllData()

                LazyColumn(
                    contentPadding = PaddingValues(all = 12.dp),
                    verticalArrangement = Arrangement.spacedBy(12.dp)
                ){
                    /*
                    items(items = getAllData){ person ->
                        CustomItem(person = person)
                    }

                     */
                    itemsIndexed(
                        items = getAllData,
                        key = { index, person ->
                            person.id
                        }
                    ){ index, person ->
                        CustomItem(person = person)
                    }
                }
            }
        }
    }
}
