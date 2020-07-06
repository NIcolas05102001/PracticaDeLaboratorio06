# PracticaDeLaboratorio06
Gestion de directorios
 
En nuestro proyecto “Practica 06” Creamos nuestros paquetes tanto para el directorio como para la ventana, en los cuales se agregara la clase “ControladorDirectorio” y “VentanaPrincipal” respectivamente.
 
La clase “ControladorDirectorio” el cual contiene una ruta y archivos los cuales pueden ser directorios o archivos. Creamos el constructor para que reciba la ruta del File.
 
En el método “Listar Archivos” creamos una lista la cual será el dato que nos devolverá, aquí le pasamos un File con su respectiva ruta y con un bucle for each y un condicional if verificamos si se trata de un directorio o un archivo, si el elemento a analizar es un archivo lo añadimos a nuestra lista.
 
El método “Listar Directorios” tiene el mismo funcionamiento que “Listar Archivos” con la diferencia que en la lista ya no se añadirán archivos sino listas.
 
Los siguientes métodos tienen el mismo funcionamiento que los métodos anteriormente revisados a excepción que estos devolverán los archivos y carpetas que estén ocultas.
 
El método “Crear Directorio” Creara una nueva carpeta si esta no existe.
 
El método “Eliminar Directorio” eliminara una carpeta si y solo si esta esta vacía y también podrá eliminar archivos.
 
El método “Renombrar Directorio” Actualizara el nombre de un directorio buscando su ruta y remplazándola por la nueva que nosotros le asignemos.
 
Este método se encargara de buscar un archivo o directorio y añadir su información en una lista.
 
Funcionamiento de la aplicación.
