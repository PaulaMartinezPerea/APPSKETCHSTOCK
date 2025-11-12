package com.example.sketchstock.ui.home

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Button
import androidx.compose.material3.Text
import androidx.compose.runtime.*
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import androidx.navigation.NavController
import com.example.sketchstock.model.User
import com.google.firebase.auth.FirebaseAuth
import com.google.firebase.database.ktx.database
import com.google.firebase.ktx.Firebase

@Composable
fun HomeScreen(navController: NavController) {
    val auth = FirebaseAuth.getInstance()
    val db = Firebase.database.reference
    val uid = auth.currentUser?.uid
    var user by remember { mutableStateOf<User?>(null) }

    LaunchedEffect(uid) {
        if (uid != null) {
            db.child("users").child(uid).get().addOnSuccessListener { snapshot ->
                user = snapshot.getValue(User::class.java)
            }
        }
    }

    Column(modifier = Modifier.padding(16.dp)) {
        Text(text = "Bienvenida, ${user?.nombre ?: user?.email ?: "Profesora!"}")
        Button(onClick = {
            auth.signOut()
            navController.navigate("login") { popUpTo("home") { inclusive = true } }
        }) {
            Text("Cerrar sesión")
        }
    }
}
