package com.kanior.emergencyapp.kor

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.verticalScroll
import androidx.compose.material3.Button
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavController

//@Preview(showBackground = true)
@Composable
//fun BasicQuestionMenu() {
fun BasicQuestionMenu(navController: NavController) {
    val scrollState = rememberScrollState()

    Column(
        modifier = Modifier
            .fillMaxSize()
            .padding(20.dp)
            .verticalScroll(scrollState)
    ) {
        Button(
            onClick = {
//                navController.navigate("kormenu")
            },
            modifier = Modifier
                .fillMaxWidth()
                .height(80.dp),
            contentPadding = PaddingValues(12.dp)
        ) {
            Text(
                text = "한국어를 할 줄 아세요?",
                fontSize = 20.sp,
                lineHeight = 25.sp
            )
        }
        Spacer(modifier = Modifier.height(20.dp))
        Button(
            onClick = {
//                navController.navigate("kormenu")
            },
            modifier = Modifier
                .fillMaxWidth()
                .height(80.dp),
            contentPadding = PaddingValues(12.dp)
        ) {
            Text(
                text = "주변에 한국말 가능하신 분이 있나요?",
                fontSize = 20.sp,
                lineHeight = 25.sp
            )
        }
        Spacer(modifier = Modifier.height(20.dp))
        Button(
            onClick = {
//                navController.navigate("kormenu")
            },
            modifier = Modifier
                .fillMaxWidth()
                .height(80.dp),
            contentPadding = PaddingValues(12.dp)
        ) {
            Text(
                text = "보호자가 있으신가요?",
                fontSize = 20.sp,
                lineHeight = 25.sp
            )
        }
        Spacer(modifier = Modifier.height(20.dp))
        Spacer(modifier = Modifier.height(20.dp))
        Button(
            onClick = {
//                navController.navigate("kormenu")
            },
            modifier = Modifier
                .fillMaxWidth()
                .height(80.dp),
            contentPadding = PaddingValues(12.dp)
        ) {
            Text(
                text = "보호자가 있으신가요?",
                fontSize = 20.sp,
                lineHeight = 25.sp
            )
        }
        Spacer(modifier = Modifier.height(20.dp))
        Spacer(modifier = Modifier.height(20.dp))
        Button(
            onClick = {
//                navController.navigate("kormenu")
            },
            modifier = Modifier
                .fillMaxWidth()
                .height(80.dp),
            contentPadding = PaddingValues(12.dp)
        ) {
            Text(
                text = "보호자가 있으신가요?",
                fontSize = 20.sp,
                lineHeight = 25.sp
            )
        }
        Spacer(modifier = Modifier.height(20.dp))
        Spacer(modifier = Modifier.height(20.dp))
        Button(
            onClick = {
//                navController.navigate("kormenu")
            },
            modifier = Modifier
                .fillMaxWidth()
                .height(80.dp),
            contentPadding = PaddingValues(12.dp)
        ) {
            Text(
                text = "보호자가 있으신가요?",
                fontSize = 20.sp,
                lineHeight = 25.sp
            )
        }
        Spacer(modifier = Modifier.height(20.dp))
        Spacer(modifier = Modifier.height(20.dp))
        Button(
            onClick = {
//                navController.navigate("kormenu")
            },
            modifier = Modifier
                .fillMaxWidth()
                .height(80.dp),
            contentPadding = PaddingValues(12.dp)
        ) {
            Text(
                text = "보호자가 있으신가요?",
                fontSize = 20.sp,
                lineHeight = 25.sp
            )
        }
        Spacer(modifier = Modifier.height(20.dp))
        Spacer(modifier = Modifier.height(20.dp))
        Button(
            onClick = {
//                navController.navigate("kormenu")
            },
            modifier = Modifier
                .fillMaxWidth()
                .height(80.dp),
            contentPadding = PaddingValues(12.dp)
        ) {
            Text(
                text = "보호자가 있으신가요?",
                fontSize = 20.sp,
                lineHeight = 25.sp
            )
        }
        Spacer(modifier = Modifier.height(20.dp))
        Spacer(modifier = Modifier.height(20.dp))
        Button(
            onClick = {
//                navController.navigate("kormenu")
            },
            modifier = Modifier
                .fillMaxWidth()
                .height(80.dp),
            contentPadding = PaddingValues(12.dp)
        ) {
            Text(
                text = "보호자가 있으신가요?",
                fontSize = 20.sp,
                lineHeight = 25.sp
            )
        }
        Spacer(modifier = Modifier.height(20.dp))
    }
}
