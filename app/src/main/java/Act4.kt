package com.example.Prak5.ui.them

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.RadioButton
import androidx.compose.material3.Text
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp


@composable
fun FormDataDiri(modifier: Modifier){
    //variabel-variabel untuk mengingat nilai masukan dari keyboard
    var textNama by remember {mutableStateOf(value = "")}
    var textAlamat by remember {mutableStateOf(value = "")}
    var textJK by remember {mutableStateOf(value = "")}
    val gender:List<String> = listOf("Laki-laki","Perempuan")

    //variabel variabel untuk menyimpan data diperoleh dari komponen UI
    var nama by remember {mutableStateOf(value = "")}
    var alamat by remember {mutableStateOf(value = "")}
    var jenis by remember {mutableStateOf(value = "")}
    Column(modifier = Modifier.padding(top = 50.dp),
    verticalArrangement = Arrangement.Top,
    horizontalAlignment = Alignment.CenterHorizontally) {
        OutlinedTextField(
            value = textNama,
            singleLine = true,
            shape = MaterialTheme.shapes.large,
            modifier = Modifier.width(250,dp),
            label = { Text(text = "Nama lengkap")},
            onValueChange = {
                textNama = it
            }
        )
Row {
    gender.forEach { item ->}
        Row(modifier = Modifier.selecttable(
            selected = textJk == item,
            onClick = { textJK = item}
        ), verticalAlignment = Alignment.CenterVertivcally) {
            RadioButton(
                selected = textJK == item,
                onClick = {
                    textJK = item
                })
            Text(item)
        }

        )
}
        OutlinedTextField(
            Value =textAlamat,
            singleLine = true,
            modifier = Modifier.width(250,dp),
            label = { Text("Alamat") },
            onValueChange = {
                textAlamat = it
            }
        )


    }
}

