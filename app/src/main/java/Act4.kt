package com.example.Prak5.ui.them

import androidx.compose.foundation.layout.Column
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Modifier



@composable
fun FromDataDiri(modifier: Modifier){
    //variabel-variabel untuk mengingat nilai masukan dari keyboard
    var textNama by remember {mutableStateOf(value = "")}
    var textAlamat by remember {mutableStateOf(value = "")}
    var textJK by remember {mutableStateOf(value = "")}
    val gender:List<String> = listOf("Laki-laki","Perempuan")

    //variabel variabel untuk menyimpan data diperoleh dari komponen UI
    var nama by remember {mutableStateOf(value = "")}
    var alamat by remember {mutableStateOf(value = "")}
    var jenis by remember {mutableStateOf(value = "")}
    Column(modifier = Modifier.padding(top = 50.dp)),

}

