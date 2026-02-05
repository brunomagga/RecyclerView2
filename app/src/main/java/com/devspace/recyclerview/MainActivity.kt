package com.devspace.recyclerview

import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import androidx.recyclerview.widget.RecyclerView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }

        val rvList = findViewById<RecyclerView>(R.id.rv_list)

    }
}

val contacts = listOf(
    Contact(
        name = "Giovana",
        phone = "(55) 11 93231-0831",
        icon = R.drawable.sample2
    ),
    Contact(
        name = "Leticia",
        phone = "(55) 19 99845-2310",
        icon = R.drawable.sample3
    ),
    Contact(
        name = "Joana",
        phone = "(55) 11 98732-1145",
        icon = R.drawable.sample4
    ),
    Contact(
        name = "Juliana Souza",
        phone = "(55) 21 99651-8823",
        icon = R.drawable.sample5
    ),
    Contact(
        name = "Carla Oliveira",
        phone = "(55) 31 99127-4432",
        icon = R.drawable.sample6
    ),
    Contact(
        name = "Fernanda Lima",
        phone = "(55) 41 99812-7754",
        icon = R.drawable.sample7
    ),
    Contact(
        name = "Lucas Pereira",
        phone = "(55) 51 99734-6621",
        icon = R.drawable.sample8
    ),
    Contact(
        name = "Pedro Costa",
        phone = "(55) 62 99677-3309",
        icon = R.drawable.sample9
    ),
    Contact(
        name = "Rafael Gomes",
        phone = "(55) 71 99221-4488",
        icon = R.drawable.sample10
    ),
    Contact(
        name = "Patricia Alves",
        phone = "(55) 85 99105-7733",
        icon = R.drawable.sample11
    ),
    Contact(
        name = "Daniel Rocha",
        phone = "(55) 48 99890-1122",
        icon = R.drawable.sample12
    ),
    Contact(
        name = "Larissa Fernandes",
        phone = "(55) 19 99711-5523",
        icon = R.drawable.sample13
    ),
    Contact(
        name = "Gabriel Dias",
        phone = "(55) 11 99432-8891",
        icon = R.drawable.sample14
    ),
    Contact(
        name = "Eduarda Ribeiro",
        phone = "(55) 31 99876-4410",
        icon = R.drawable.sample15
    ),
    Contact(
        name = "Camila Nunes",
        phone = "(55) 21 99345-2278",
        icon = R.drawable.sample16
    ),
    )