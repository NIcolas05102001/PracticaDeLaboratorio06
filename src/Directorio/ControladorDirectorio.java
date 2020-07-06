/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Directorio;

import java.io.File;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author nicol
 */
public class ControladorDirectorio {

    private String ruta;
    private File archivo;
    private File[] archivos;

    public ControladorDirectorio(String ruta) {
        this.ruta = ruta;
    }

    public List<String> listarArchivos() {

        List<String> archivos1 = new ArrayList<>();
        this.archivo = new File(this.ruta);
        this.archivos = archivo.listFiles();
        for (File directorio : archivos) {
            if (directorio.isDirectory()) {
                File[] subelementos = directorio.listFiles();
                for (File subelemento : subelementos) {
                    archivos1.add(subelemento.getName());
                }
            } else {
                archivos1.add(directorio.getName());
            }
        }
        return archivos1;
    }

    public List<String> listarDirectorios() {
        List<String> directorios = new ArrayList<String>();
        this.archivo = new File(this.ruta);
        this.archivos = archivo.listFiles();
        for (File directorio : archivos) {
            if (directorio.isDirectory()) {
                directorios.add(directorio.getAbsolutePath());
            }
        }
        return directorios;
    }

    public List<String> listarArchivosOcultos() {
        List<String> archivos1 = new ArrayList<>();
        this.archivo = new File(this.ruta);
        this.archivos = archivo.listFiles();
        for (File directorio : archivos) {
            if (directorio.isDirectory() && directorio.isHidden()) {
                File[] subelementos = directorio.listFiles();
                for (File subelemento : subelementos) {
                    archivos1.add(subelemento.getName());
                }
            } else if (directorio.isHidden()) {
                archivos1.add(directorio.getName());
            }
        }
        return archivos1;
    }

    public List<String> listarDirectoriosOcultos() {
        List<String> directorios = new ArrayList<String>();
        this.archivo = new File(this.ruta);
        this.archivos = archivo.listFiles();
        for (File directorio : archivos) {
            if (directorio.isDirectory() && directorio.isHidden()) {
                directorios.add(directorio.getAbsolutePath());
            }
        }
        return directorios;
    }

    public void crearDirectorio(String nombre) {
        File directorio = new File(nombre);
        if (directorio.exists() == false) {
            directorio.mkdir();
        }
    }

    public void eliminarDirectorio(String nombre) {
        this.archivo = new File(nombre);
        File[] contenidos = archivo.listFiles();
        if (contenidos != null) {
            for (File contenido : contenidos) {
                String eliminar = contenido.getAbsolutePath();
                eliminarDirectorio(eliminar);
            }
        }
        archivo.delete();
    }

    public void renombrarDirectorio(String actual, String nuevo) {
        this.archivo = new File(actual);
        archivo.renameTo(new File(nuevo));
    }

    public List<String> mostrarInformacion(String nombre) {
        List<String> informacion = new ArrayList<>();
        String path;
        String tamaño;
        String lectura;
        String escritura;
        String modificacion;
        this.archivo = new File(this.ruta);
        this.archivos = archivo.listFiles();
        for (File directorio : archivos) {
            if (directorio.isDirectory() && directorio.getName().equalsIgnoreCase(nombre)) {
                path = directorio.getAbsolutePath();
                tamaño = directorio.length() + "";
                lectura = directorio.canRead() + "";
                escritura = directorio.canWrite() + "";
                modificacion = directorio.lastModified() + "";
                informacion.add(path);
                informacion.add(tamaño);
                informacion.add(lectura);
                informacion.add(escritura);
                informacion.add(modificacion);
            } else if (directorio.getName().equalsIgnoreCase(nombre)) {
                path = directorio.getAbsolutePath();
                tamaño = directorio.length() + "";
                lectura = directorio.canRead() + "";
                escritura = directorio.canWrite() + "";
                modificacion = directorio.lastModified() + "";
                informacion.add(path);
                informacion.add(tamaño);
                informacion.add(lectura);
                informacion.add(escritura);
                informacion.add(modificacion);
            }
        }
        return informacion;
    }
}
