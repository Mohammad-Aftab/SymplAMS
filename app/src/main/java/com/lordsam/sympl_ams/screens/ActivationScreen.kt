package com.lordsam.sympl_ams.screens

import android.annotation.SuppressLint
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.*
import androidx.compose.material.*
import androidx.compose.runtime.*
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.lordsam.sympl_ams.R


@SuppressLint("UnusedMaterialScaffoldPaddingParameter")
@Preview
@Composable
fun Activation() {

    var isLogin by remember {
        mutableStateOf(true)
    }

    Scaffold(
        topBar = {
            TopAppBar(
                elevation = 4.dp
            ) {
                Text(
                    text = if (isLogin)
                        stringResource(R.string.login)
                    else
                        stringResource(R.string.register)
                )
            }
        }
    ) {
        Column(
            verticalArrangement = Arrangement.Center,
            horizontalAlignment = Alignment.CenterHorizontally,
            modifier = Modifier
                .padding(8.dp)
                .fillMaxSize()
        ) {
            if (isLogin) {
                LoginContent(){
                    isLogin = false
                }
            } else {
                RegistrationContent(){
                    isLogin = true
                }
            }
        }
    }
}

@Composable
fun LoginContent(onTextClick: () -> Unit) {

    var email by remember {
        mutableStateOf("")
    }
    var password by remember {
        mutableStateOf("")
    }

    OutlinedTextField(
        value = email,
        onValueChange = { email = it },
        label = {
            Text(
                text = stringResource(R.string.email)
            )
        },
        modifier = Modifier
            .fillMaxWidth()
    )
    OutlinedTextField(
        value = password,
        onValueChange = { password = it },
        label = {
            Text(
                text = stringResource(R.string.password)
            )
        },
        modifier = Modifier
            .fillMaxWidth()
    )
    Text(
        text = stringResource(R.string.text_1),
        textAlign = TextAlign.Start,
        color = Color.Blue,
        modifier = Modifier
            .padding(4.dp)
            .fillMaxWidth()
            .clickable {
                onTextClick()
            }
    )
    Button(onClick = { /*TODO*/ }) {
        Text(
            text = stringResource(R.string.submit)
        )
    }
}

@Composable
fun RegistrationContent(onTextClick: () -> Unit) {

    var firstName by remember {
        mutableStateOf("")
    }
    var secondName by remember {
        mutableStateOf("")
    }
    var contactNumber by remember {
        mutableStateOf("")
    }
    var email by remember {
        mutableStateOf("")
    }
    var password by remember {
        mutableStateOf("")
    }
    var confirmPassword by remember {
        mutableStateOf("")
    }

    OutlinedTextField(
        value = firstName,
        onValueChange = { firstName = it },
        label = {
            Text(
                text = stringResource(R.string.first_name)
            )
        },
        modifier = Modifier
            .fillMaxWidth()
    )
    OutlinedTextField(
        value = secondName,
        onValueChange = { secondName = it },
        label = {
            Text(
                text = stringResource(R.string.second_name)
            )
        },
        modifier = Modifier
            .fillMaxWidth()
    )
    OutlinedTextField(
        value = contactNumber,
        onValueChange = { contactNumber = it },
        label = {
            Text(
                text = stringResource(R.string.contact_number)
            )
        },
        modifier = Modifier
            .fillMaxWidth()
    )
    OutlinedTextField(
        value = email,
        onValueChange = { email = it },
        label = {
            Text(
                text = stringResource(R.string.email)
            )
        },
        modifier = Modifier
            .fillMaxWidth()
    )
    OutlinedTextField(
        value = password,
        onValueChange = { password = it },
        label = {
            Text(
                text = stringResource(R.string.password)
            )
        },
        modifier = Modifier
            .fillMaxWidth()
    )
    OutlinedTextField(
        value = confirmPassword,
        onValueChange = { confirmPassword = it },
        label = {
            Text(
                text = stringResource(R.string.confirm_password)
            )
        },
        modifier = Modifier
            .fillMaxWidth()
    )
    Text(
        text = stringResource(R.string.text_2),
        textAlign = TextAlign.Start,
        color = Color.Blue,
        modifier = Modifier
            .padding(4.dp)
            .fillMaxWidth()
            .clickable {
                onTextClick()
            }
    )
    Button(onClick = { /*TODO*/ }) {
        Text(
            text = stringResource(R.string.submit)
        )
    }
}
