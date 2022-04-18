public class Post {
  String titulo;
  String contenido;
  Usuario autor;
  int likes;
  int dislikes;

  // contructor
  public Post(String titulo, String contenido, Usuario autor) {
    this.titulo = titulo;
    this.contenido = contenido;
    this.autor = autor;
    this.likes = 0;
    this.dislikes = 0;
  }
}
