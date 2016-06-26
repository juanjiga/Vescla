package com.juanjiga.vescla;

// Basado en Codigo Alonso

public class Constantes {

    //Nombre de la base de datos y versión
    public static final String DB_NAME = "base-dat.db";
    public static final int DB_VERSION = 1;

    //Nombre de la tabla, "claves" y nombres de los campos (columnas)
    public static final String TABLA_CLAVES = "claves";

    public static final String ID = "id";
    public static final String NOMBRE = "nombre";
    public static final String USUARIO = "usuario";
    public static final String PASSWORD = "password";

    //Sentencia SQL para la creación de la tabla
    public static final String TABLA_CLIENTES_SQL =
            "CREATE TABLE  " + TABLA_CLAVES + "(" +
                    ID + " INTEGER PRIMARY KEY AUTOINCREMENT," +
                    NOMBRE + " TEXT NOT NULL," +
                    USUARIO   + " TEXT," +
                    PASSWORD   + " TEXT);" ;





}