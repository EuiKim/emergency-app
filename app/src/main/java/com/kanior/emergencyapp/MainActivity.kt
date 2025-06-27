package com.kanior.emergencyapp

import android.os.Bundle
import android.webkit.WebView
import android.widget.Button
import android.widget.Toast
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.foundation.verticalScroll
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.Divider
import androidx.compose.material3.HorizontalDivider
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.material3.TextField
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableIntStateOf
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.compose.ui.viewinterop.AndroidView
import androidx.navigation.NavController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.kanior.emergencyapp.ui.theme.EmergencyAppTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            EmergencyAppTheme {
                WebViewEx()
            }
        }
    }
}

//@Preview(showBackground = true)
@Composable
fun AppNavigation() {
    val navController = rememberNavController()
    NavHost(navController, startDestination = "languages") {
        composable("languages") { Languages(navController) }
        composable("korMenu") { KorMenu(navController) }
//        composable("korBasicQuestionMenu") { BasicQuestionMenu(navController) }
    }
}

@Composable
fun Languages(navController: NavController) {
    val scrollState = rememberScrollState()

    Column(
        modifier = Modifier
            .fillMaxSize()
            .padding(20.dp)
            .verticalScroll(scrollState)
    ) {
        Button(
            onClick = {
                navController.navigate("kormenu")
            },
            modifier = Modifier
                .fillMaxWidth()
                .height(80.dp),
            contentPadding = PaddingValues(12.dp)
        ) {
            Text(
                text = "한국어",
                fontSize = 25.sp
            )
        }
    }
}

@Composable
fun KorMenu(navController: NavController) {
    val scrollState = rememberScrollState()

    Column(
        modifier = Modifier
            .fillMaxSize()
            .padding(20.dp)
            .verticalScroll(scrollState)
    ) {
        Button(
            onClick = {
                navController.navigate("korBasicQuestionMenu")
            },
            modifier = Modifier
                .fillMaxWidth()
                .height(80.dp),
            contentPadding = PaddingValues(12.dp)
        ) {
            Text(
                text = "초기 질문",
                fontSize = 25.sp
            )
        }
        Spacer(modifier = Modifier.height(20.dp))
        Button(
            onClick = {
                navController.navigate("korBasicQuestionMenu")
            },
            modifier = Modifier
                .fillMaxWidth()
                .height(80.dp),
            contentPadding = PaddingValues(12.dp)
        ) {
            Text(
                text = "증상",
                fontSize = 25.sp
            )
        }
        Spacer(modifier = Modifier.height(20.dp))
        Button(
            onClick = {
                navController.navigate("korBasicQuestionMenu")
            },
            modifier = Modifier
                .fillMaxWidth()
                .height(80.dp),
            contentPadding = PaddingValues(12.dp)
        ) {
            Text(
                text = "병력",
                fontSize = 25.sp
            )
        }
    }
}

//@Preview(showBackground = true)
@Composable
fun TextEx() {
    Text(
        text = "텍스트 예제입니다",
        fontSize = 30.sp,
        color = Color.Red,
        fontStyle = FontStyle.Italic,
        fontWeight = FontWeight.Bold,
        modifier = Modifier.padding(30.dp),
        style = TextStyle(background = Color.Blue)
    )
}

//@Preview(showBackground = true)
@Composable
fun ButtonEx() {
    val context = LocalContext.current

    Button(
        onClick = {
            Toast.makeText(context, "클릭됨", Toast.LENGTH_SHORT).show()
        },
        colors = ButtonDefaults.buttonColors(
            containerColor = Color.Yellow,
            contentColor = Color.Black
        ),
        modifier = Modifier
            .width(200.dp)
            .height(200.dp)
    ) {
        Text(
            text = "버튼 팀버튼 엘버튼 버튼버튼",
            lineHeight = 40.sp,
            fontSize = 30.sp,
            color = Color.Red
        )
    }
}

//@Preview(showBackground = true)
@Composable
fun RememberEx() {
    var count by remember { mutableIntStateOf(0) }

    Button(
        onClick = {
            count++
        },
        modifier = Modifier.fillMaxSize()
    ) {
        Text(
            text = "Count : $count",
            fontSize = 30.sp
        )
    }
}

//@Preview(showBackground = true)
@Composable
fun ColumnEx() {
    Column(
        modifier = Modifier.padding(30.dp)
    ) {
        Text(
            text = "안녕하세요 1",
            fontSize = 30.sp
        )
        Spacer(modifier = Modifier.padding(30.dp))
        HorizontalDivider(
            thickness = 4.dp,
            color = Color.Blue
        )
        Spacer(modifier = Modifier.padding(30.dp))
        Text(
            text = "안녕하세요 2",
            fontSize = 30.sp
        )
        Text(
            text = "안녕하세요 3",
            fontSize = 30.sp
        )
    }
}

//@Preview(showBackground = true)
@Composable
fun TextFieldEx() {
    var textState by remember { mutableStateOf("") }
    var enteredText by remember { mutableStateOf("") }

    Column(
        modifier = Modifier.fillMaxSize(),
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        TextField(
            value = textState,
            onValueChange = {
                textState = it
            },
            label = {
                Text("입력하는 공간")
            }
        )
        Spacer(modifier = Modifier.padding(10.dp))
        OutlinedTextField(
            value = textState,
            onValueChange = {
                textState = it
            },
            label = {
                Text("입력하는 공간")
            }
        )
        Spacer(modifier = Modifier.padding(10.dp))
        Row(
            modifier = Modifier.height(60.dp)
        ) {
            TextField(
                value = textState,
                onValueChange = {
                    textState = it
                },
                label = {
                    Text("입력하는 공간")
                },
                modifier = Modifier
                    .width(210.dp)
                    .padding(end = 10.dp)
            )
            Button(
                onClick = {
                    enteredText = textState
                },
                modifier = Modifier
                    .width(80.dp)
                    .height(50.dp)
            ) {
                Text("입력")
            }
        }
        Spacer(modifier = Modifier.padding(10.dp))
        Text(text = "결과값 : $enteredText")
        Spacer(modifier = Modifier.padding(10.dp))
    }
}

//@Preview(showBackground = true)
@Composable
fun ImageEx() {
    Image(
        painter = painterResource(id = R.drawable.sample),
        contentDescription = "sample"
    )
}

//@Preview(showBackground = true)
@Composable
fun BoxEx() {
    Box(
        modifier = Modifier
            .fillMaxSize()
            .background(color = Color.Red)
    ) {
        Box(
            modifier = Modifier
                .size(100.dp)
                .background(color = Color.Blue)
                .padding(16.dp)
                .align(Alignment.TopStart)
        ) {
            Text("왼쪽 위")
        }
        Box(
            modifier = Modifier
                .size(100.dp)
                .background(color = Color.Green)
                .padding(16.dp)
                .align(Alignment.TopCenter)
        ) {
            Text("중앙 위")
        }
        Box(
            modifier = Modifier
                .size(100.dp)
                .background(color = Color.Gray)
                .padding(16.dp)
                .align(Alignment.TopEnd)
        ) {
            Text("오른쪽 위")
        }
        Button(
            onClick = {},
            modifier = Modifier.align(Alignment.CenterStart)
        ) {
            Text("중앙 왼쪽")
        }
        Button(
            onClick = {},
            modifier = Modifier.align(Alignment.Center)
        ) {
            Text("정중앙")
        }
        Button(
            onClick = {},
            modifier = Modifier.align(Alignment.CenterEnd)
        ) {
            Text("중앙 오른쪽")
        }
    }
}

//@Preview(showBackground = true)
@Composable
fun RowEx() {
    Row(
        modifier = Modifier
            .fillMaxSize()
            .background(Color.Gray),
        horizontalArrangement = Arrangement.SpaceEvenly, // 가로로 동일한 간격
        verticalAlignment = Alignment.CenterVertically
    ) {
        Text(
            text = "Item1",
            style = TextStyle(background = Color.Blue),
            fontSize = 30.sp
        )
        Text(
            text = "Item2",
            style = TextStyle(background = Color.Red),
            fontSize = 30.sp
        )
        Text(
            text = "Item3",
            style = TextStyle(background = Color.Green),
            fontSize = 30.sp
        )
    }
}

//@Preview(showBackground = true)
@Composable
fun ColumnRowEx() {
    Column(
        modifier = Modifier
            .fillMaxSize()
            .padding(20.dp)
            .background(Color.Gray)
    ) {
        Text(
            text = "안녕하세요",
            color = Color.Blue,
            fontSize = 20.sp
        )
        Row(
            modifier = Modifier.fillMaxWidth(),
            horizontalArrangement = Arrangement.SpaceBetween
//            horizontalArrangement = Arrangement.SpaceAround
//            horizontalArrangement = Arrangement.SpaceEvenly
        ) {
            Text("왼쪽")
            Text("중앙")
            Text("오른쪽")
        }
    }
}

//@Preview(showBackground = true)
@Composable
fun ColumnRowEx2() {
    Column(
        modifier = Modifier
            .fillMaxWidth()
            .padding(20.dp)
            .background(Color.Cyan)
            .border(BorderStroke(5.dp, Color.Blue)),
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        Box(
            modifier = Modifier.padding(top = 20.dp)
        ) {
            Image(
                painter = painterResource(id = R.drawable.sample),
                contentDescription = "profile image",
                modifier = Modifier
                    .size(100.dp)
                    .clip(RoundedCornerShape(50.dp))
            )
        }
        Text(
            text = "개발자 A",
            color = Color.Blue,
            fontSize = 20.sp,
            fontWeight = FontWeight.Bold,
            modifier = Modifier.padding(top = 50.dp)
        )
        Text(
            text = "Developer",
            fontSize = 15.sp,
            modifier = Modifier.padding(10.dp)
        )
        Row(
            modifier = Modifier.fillMaxWidth(),
            verticalAlignment = Alignment.CenterVertically
        ) {
            Text(
                text = "이메일",
                fontSize = 15.sp,
                fontWeight = FontWeight.Bold,
                modifier = Modifier.padding(10.dp)
            )
            Text(
                text = "kanior@naver.com",
                fontSize = 15.sp,
                modifier = Modifier.padding(10.dp),
                color = Color.Blue
            )
        }
        Row(
            modifier = Modifier.fillMaxWidth(),
            verticalAlignment = Alignment.CenterVertically
        ) {
            Text(
                text = "연락처",
                fontSize = 15.sp,
                fontWeight = FontWeight.Bold,
                modifier = Modifier.padding(10.dp)
            )
            Text(
                text = "010-1111-2222",
                fontSize = 15.sp,
                modifier = Modifier.padding(10.dp)
            )
        }
    }
}

//@Preview(showBackground = true)
@Composable
fun CardEx() {
    Column {
        CardInner("1")
        CardInner("2")
    }
}

@Composable
fun CardInner(txt: String) {
    Card(
        modifier = Modifier
            .fillMaxWidth()
            .height(100.dp)
            .padding(10.dp),
        elevation = CardDefaults.cardElevation(
            defaultElevation = 3.dp
        ),
        shape = RoundedCornerShape(50.dp),
        border = BorderStroke(1.dp, Color.Black)
    ) {
        Box(
            modifier = Modifier
                .fillMaxSize()
                .background(Color.LightGray),
            contentAlignment = Alignment.Center
        ) {
            Text(
                text = txt,
                fontSize = 30.sp
            )
        }
    }

}

//@Preview(showBackground = true)
@Composable
fun WebViewEx() {
    AndroidView(
        factory = {
            WebView(it).apply {
                loadUrl("https://www.naver.com")
            }
        }
    )
}

//@Preview(showBackground = true)
@Composable
fun SurfaceEx() {
    Surface(
        modifier = Modifier
            .fillMaxWidth()
            .padding(10.dp),
        color = Color.Red,
        shape = RoundedCornerShape(200.dp),
        shadowElevation = 20.dp
    ) {
        Button(
            onClick = {},
            colors = ButtonDefaults.outlinedButtonColors(
                contentColor = Color.Green
            )
        ) {
            Text("클릭해보세요!")
        }
    }
}

@Preview(showBackground = true)
@Composable
fun SurfaceEx2() {
    Surface(
        modifier = Modifier
            .fillMaxSize(),
        color = Color.LightGray,
        border = BorderStroke(2.dp, Color.Red),
        contentColor = Color.Blue
    ) {
        Column(
            modifier = Modifier
                .fillMaxSize()
                .padding(20.dp),
            verticalArrangement = Arrangement.Center,
            horizontalAlignment = Alignment.CenterHorizontally
        ) {
            Surface(
                modifier = Modifier
                    .size(200.dp),
                color = Color.Red
            ) {
                Text("This is Jetpack Compose")
            }
            Spacer(modifier = Modifier.height(20.dp))
            Text("This is Jetpack Compose Ex")
        }
    }
}































