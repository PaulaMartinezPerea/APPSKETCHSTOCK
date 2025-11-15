#SketchStock App - Proyecto Login y Registro con Firebase -Paula Martínez Perea

##Descripción
Aplicación Android en Kotlin con Jetpack Compose. Implementa un sistema de autenticación utilizando Firebase.

##Tecnologías Utilizadas
- Kotlin
- Jetpack Compose
- Firebase

##Requisitos Previos
- Android Studio
- JDK 11 o superior
- Cuenta de Firebase con mi proyecto añadido

##Configuración del Proyecto
Paso 1: Crear en Android Studio un proyecto nuevo

Paso 2: Configurar Firebase
- En la página oficial de Firebase seguí la guía para asociar mi proyecto, añadiendo las dependencias y el json que necesita Firebase

Paso 3: Habilitar servicios en Firebase
- Tuve que mirar entre las opciones de Firebase y elegir el tipo de Authentication, en mi caso fue: Email/Contraseña
- También en la opción de Realtime Database seguí los pasos para crear la base de datos que voy a usar

##Credenciales de Prueba
###Usuario de prueba creado:
- Email: martinezpereapaula@gmail.com
- Contraseña: usuario
- Nombre: Paula
- Teléfono: 607 64 22 30

###Crear un nuevo usuario:
Para registrar un nuevo usuario desde la pantalla de registro se debe rellenar:
- Nombre
- Teléfono
- Email
- Contraseña

##Funcionalidades de la App
###Pantalla de Login
- Campos para rellenar: email y contraseña
- Validación de campos vacíos
- Botón de "Login" para iniciar la sesión
- Enlace para ir a la pantalla de registro
- Mensajes de error si las credenciales son incorrectas

###Pantalla de Registro
- Formulario que pide para registrarse:
  - Nombre
  - Teléfono
  - Email
  - Contraseña
- Validación de todos los datos
- Creación de usuario en Firebase
- Guarda los datos en Firebase
- Vuelve a la pantalla de Home tras registrarse

###Pantalla Home
- Muestra un mensaje de bienvenida con el nombre del usuario o el email
- Botón "Cerrar sesión"
- Al cerrar sesión, regresa a la pantalla de Login

###Navegación
- Si el usuario ya está autenticado, mi aplicación inicia directamente en la pantalla de Home
- Si no hay usuario autenticado, inicia en la pantalla de Login
- Al cerrar la sesión, elimina el historial de navegación para evitar volver atrás

##Estructura del Proyecto
com.example.sketchstock/
├── MainActivity.kt                
├── MyApp.kt                       
├── navigation/
│   └── AppNavigation.kt           
├── ui/
│   ├── login/
│   │   └── LoginScreen.kt        
│   ├── register/
│   │   └── RegisterScreen.kt      
│   └── home/
│       └── HomeScreen.kt          
└── model/
    └── User.kt                     

##Modelo de Datos
###En mi User.kt
data class User(
    val nombre: String = "",
    val telefono: String = "",
    val email: String = ""
)
