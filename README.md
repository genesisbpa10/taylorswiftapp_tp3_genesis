## Getting Started

Welcome to the VS Code Java world. Here is a guideline to help you get started to write Java code in Visual Studio Code.

## Folder Structure

The workspace contains two folders by default, where:

- `src`: the folder to maintain sources
- `app`: inside of it there is the principal file of the project. The one we need to run 
- `models`: Este subpaquete contendrá las clases que representan los modelos de datos, como las clases Album, Cancion, ListaFavoritos, ListaAlbumesFavoritos, ListaCancionesFavoritas y ItemFavorito.
- `services`: Aquí puedes colocar las clases relacionadas con la lógica de negocio y servicios de la aplicación. Por ejemplo, puedes tener una clase llamada AlbumService que se encargue de manejar la consulta y manipulación de los álbumes, y una clase CancionService para las operaciones relacionadas con las canciones. 
- `controllers`: las clases controladoras que actúan como intermediarios entre las vistas y los servicios. Por ejemplo, una clase AlbumController que maneje las solicitudes relacionadas con los álbumes y coordine la interacción entre la vista y el servicio correspondiente.
- `lib`: the folder to maintain dependencies

Meanwhile, the compiled output files will be generated in the `bin` folder by default.

> If you want to customize the folder structure, open `.vscode/settings.json` and update the related settings there.

## Dependency Management

The `JAVA PROJECTS` view allows you to manage your dependencies. More details can be found [here](https://github.com/microsoft/vscode-java-dependency#manage-dependencies).
