
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class Post {
  String nombre;
  String hora;
  String titulo;
  String contenido;
  
    Scanner scn;
    File file;
    FileWriter fw;
    public String datos = "C:\\Users\\e013253\\Documents\\NetBeansProjects\\Reddit\\Documentos\\Posts.daniel";
    public String users = "C:\\Users\\e013253\\Documents\\NetBeansProjects\\Reddit\\Documentos\\Users.daniel";

  // contructor
  public Post(String nombre, String hora, String titulo, String contenido) throws IOException {
    this.nombre = nombre;
    this.hora = hora;
    this.titulo = titulo;
    this.contenido = contenido;
     file = new File(datos);
     
        if(!file.exists()){
            if(!file.createNewFile()){
                System.out.println("No se pudo crear el archivo");
        }else{
                fw = new FileWriter(file,false);
            }
        
       }
        file = new File(datos);
  }
  
    

    public void Addposts() throws IOException{
        fw = new FileWriter(file,true);
        fw.write(nombre + "%");
        fw.write(hora + "%");
        fw.write(titulo +"%");
        fw.write(contenido +"%");
        //Recibe post y con fw saca los .nombre.hora.etc y despues les agrega "%"
        
        fw.close();
    }

  
  }
