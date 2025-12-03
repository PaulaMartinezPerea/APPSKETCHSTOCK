#SketchStock App - Proyecto Login y Registro con Firebase - Paula Martínez Perea
##Descripción Aplicación Android en Kotlin con Jetpack Compose. Implementa un sistema de autenticación utilizando Firebase. Gestión de papelerías con sistema de autenticación y roles de usuario (Admin/Usuario).

#Credenciales de Prueba
- Usuario Administrador
- Email: martinezpereapaula@gmail.com
- Contraseña: usuario
- Permisos: Ver, crear, editar y eliminar artículos de papelería
- Usuario Normal 
- Puedes crear tu propia cuenta desde el registro
- Permisos: Solo ver el catálogo de papelería

#Pasos para Probar la Aplicación
#Prueba con Usuario Administrador

#Paso 1: Iniciar Sesión
- Abre la aplicación
- En la pantalla de Login, introduce:
- Email: martinezpereapaula@gmail.com
- Contraseña: usuario
- Pulsa el botón "Iniciar Sesión"
- Deberías ver la pantalla de bienvenida con el badge "Admin"

#Paso 2: Ver el Catálogo
- Desde la pantalla Home, pulsa "Ver Papelerías"
- Verás la lista de artículos de papelería existentes
- Cada tarjeta muestra:
  - Nombre del artículo
  - Descripción
  - Fecha de creación
  - Botones de Editar y Eliminar (solo visibles para admin)

#Paso 3: Crear un Nuevo Artículo
- En la pantalla del catálogo, pulsa el botón flotante "+" 
- Rellena el formulario:
  - Nombre
  - Descripción
- Pulsa "Guardar"
- Verás un mensaje de confirmación
- El nuevo artículo aparecerá en la lista

#Paso 4: Editar un Artículo
- En cualquier tarjeta de artículo, pulsa "Editar"
- Modifica el nombre o descripción
- Pulsa "Guardar"
- Los cambios se reflejarán inmediatamente

#Paso 5: Eliminar un Artículo
- En cualquier tarjeta de artículo, pulsa "Eliminar"
- El artículo se eliminará inmediatamente
- Verás un mensaje de confirmación

#Paso 6: Cerrar Sesión
- Vuelve a la pantalla Home
- Pulsa "Cerrar Sesión"
- Regresarás a la pantalla de Login

#Prueba con Usuario Normal (Nuevo Registro)

#Paso 1: Registrar Nueva Cuenta
- Desde la pantalla de Login, pulsa "Regístrate"
- Rellena todos los campos:
  - Nombre (mínimo 3 caracteres, solo letras)
  - Teléfono: (9-15 dígitos)
  - Email
  - Contraseña: Mínimo 6 caracteres con al menos un número
  - Confirmar contraseña
- Pulsa "Registrarse"
- Se creará tu cuenta y accederás automáticamente

#Paso 2: Verificar Rol de Usuario
- En la pantalla Home verás el badge "Usuario"
- Solo aparecerá el botón "Ver Papelerías"
- No verás el botón "Crear Papelería" (solo para admins)

#Paso 3: Ver el Catálogo (Solo Lectura)
- Pulsa "Ver Papelerías"
- Verás la lista completa de artículos
- Las tarjetas NO mostrarán botones de editar o eliminar
- No verás el botón flotante "+" para crear artículos

#Paso 4: Cerrar Sesión
- Vuelve a la pantalla Home
- Pulsa "Cerrar Sesión"

#Pruebas de Validación
#Validación en Login
- Intenta iniciar sesión con campos vacíos → Verás mensajes de error
- Introduce un email con formato incorrecto → Error de formato
- Introduce una contraseña corta (menos de 6 caracteres) → Error de longitud
- Introduce credenciales incorrectas → Mensaje "Email o contraseña incorrectos"

#Validación en Registro
- Nombre:
  - Deja vacío → "El nombre es obligatorio"
  - Escribe menos de 3 caracteres → "El nombre debe tener al menos 3 caracteres"
  - Incluye números → "El nombre solo puede contener letras"
- Teléfono:
  - Deja vacío → "El teléfono es obligatorio"
  - Escribe letras → No permite introducirlas
  - Escribe menos de 9 dígitos → "El teléfono debe tener al menos 9 dígitos"
- Email:
  - Deja vacío → "El email es obligatorio"
  - Formato incorrecto → "El formato del email no es válido"
  - Email ya registrado → "Este email ya está registrado"
- Contraseña:
  - Deja vacío → "La contraseña es obligatoria"
  - Menos de 6 caracteres → "La contraseña debe tener al menos 6 caracteres"
  - Sin números → "La contraseña debe contener al menos un número"
- Confirmar contraseña:
  - No coincide → "Las contraseñas no coinciden"

#Validación en Formulario de Artículo
#Intenta guardar con campos vacíos:
- Sin nombre → "El nombre es obligatorio"
- Sin descripción → "La descripción es obligatoria"

#Checklist de Funcionalidades a Probar
- Autenticación
  - Login con credenciales correctas
  - Login con credenciales incorrectas
  - Registro de nuevo usuario
  - Validaciones de formulario de registro
  - Cerrar sesión
  - Persistencia de sesión (cerrar y abrir app)

- Funcionalidades de Admin
  - Ver listado de papelerías
  - Crear nuevo artículo de papelería
  - Editar artículo existente
  - Eliminar artículo
  - Botón flotante "+" visible
  - Botones de editar/eliminar en tarjetas

- Funcionalidades de Usuario Normal
  - Ver listado de papelerías (solo lectura)
  - Botón flotante "+" no visible
  - Botones de editar/eliminar no visibles
  - Acceso a "Crear Papelería" no disponible en Home

- UI/UX
  - Estados de carga visibles
  - Mensajes de éxito (Toasts)
  - Mensajes de error apropiados
  - Navegación fluida entre pantallas
  - Logo visible en pantallas correspondientes
  - Gradientes y diseño Material 3
