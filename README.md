

<style>
mark{
    font-size:4em;
    background: transparent;
    color:  black;
       
}

</style>






<body>

<mark> PRACTICA 4 </mark>

```mermaid
    graph LR;
        master((v1.0.0))------->masterfinal((v1.0.1))
        master((v1.0.0))---->development(development)
        development(development)---->masterfinal((v1.0.1))
    
    classDef purple fill:#C261EC ,stroke: black,stroke-width:4px
    classDef red fill:#EC6161 ,stroke: black,stroke-width:4px

    class master purple
    class masterfinal purple
    class development red
    
        
    
```

# Crear un repositorio. 

Una vez tenemos la terminal de git, iremos a la carpeta donde queramos hacer el repositorio y usaremos el comando siguiente :

``git init`` 


# Repositorio remoto
Vincularemos el repositorio local con el repositorio remoto con :\
`` git remote add origin https://github.com/MateuSanta/practica4.git``

# Añadimos los archivos a un repositorio local
Una vez hemos creado el repositorio tenemos que añadir los archivos que hay en la carpeta con el comando siguiente :

``git add .``

# Subimos el contenido a GitHub
Haremos el primer commit :

``git commit -m "Juntar Practica Marc``

Subiremos a GitHub y pondremos el primer tag :

``git push -u origin master``


Creamos un tag y lo subimos el tag a GitHub :

``git tag 1.0.0`` \
``git push origin 1.0.0``


# Creamos una rama de desarrollo


Creamos una rama de desarrollo la cual usaremos para ir probando las nuevas implementaciones y refactorizaciones.

``git branch development``

# Cambiamos a la rama de desarrollo y la subimos a GitHub.

Cambiamos a la rama development :

``git checkout development`` 

``git push -u origin development``

# Ahora haremos las refactorizaciones en la rama de desarrollo.

Añadimos to Strings que nos faltaban por implementar y añadimos algunos setters & getters.

``git add .``
``git commit -m "Implementacion de toString en todas las clases"``


``git push -u origin development``

# Añadiremos los cambios a la rama principal y lo subimos a GitHub.

``git checkout master``

``git merge development``

``git push``

# Implementaremos JavaDoc en las clases.

Una vez echo los cambios.

``git add .`` 

``git commit -m "Implementacion de toString en todas las clases"`` 


Cuando vemos que todo esta correcto cambiamos a la rama master y la actualizamos.

``git checkout master``

``git merge development``

``git push``

# Actualizamos la version del tag a 1.0.1

``git tag 1.0.1`` 

``git push origin 1.0.1``

# Git Log 

![](gitlog.PNG)

</body>




