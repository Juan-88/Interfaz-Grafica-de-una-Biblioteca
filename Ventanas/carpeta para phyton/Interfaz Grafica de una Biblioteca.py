import tkinter as tk
from tkinter import messagebox

class Libro:
    def __init__(self, titulo, id, autor, categoria):
        self.titulo = titulo
        self.id = id
        self.autor = autor
        self.categoria = categoria

    def mostrar_info(self):
        return f"Titulo: {self.titulo} \nId: {self.id} \nAutor: {self.autor.mostrar_info()} \nCategoria: {self.categoria.mostrar_info()}"

class Autor:
    def __init__(self, nombre, apellido):
        self.nombre = nombre
        self.apellido = apellido

    def mostrar_info(self):
        return f"Autor: {self.nombre} {self.apellido}"

class Usuario:
    def __init__(self, nombre, apellido, id_usuario):
        self.nombre = nombre
        self.apellido = apellido
        self.id_usuario = id_usuario

    def mostrar_info(self):
        return f"Usuario: {self.nombre} {self.apellido} \nId: {self.id_usuario}"

class Prestamo:
    def __init__(self, libro, usuario, fecha_prestamo, fecha_devolucion):
        self.libro = libro
        self.usuario = usuario
        self.fecha_prestamo = fecha_prestamo
        self.fecha_devolucion = fecha_devolucion

    def mostrar_info(self):
        return f"Prestamo\nLibro: {self.libro.mostrar_info()} \nUsuario: {self.usuario.mostrar_info()} \nFecha prestamo: {self.fecha_prestamo} \nFecha devolucion: {self.fecha_devolucion}"

class Categoria:
    def __init__(self, nombre):
        self.nombre = nombre

    def mostrar_info(self):
        return f"Categoria: {self.nombre}"

class Biblioteca:
    def __init__(self):
        self.libros = []
        self.usuarios = []
        self.prestamos = []

    def registrar_libro(self, libro):
        self.libros.append(libro)

    def registrar_usuario(self, usuario):
        self.usuarios.append(usuario)

    def realizar_prestamo(self, prestamo):
        self.prestamos.append(prestamo)

    def devolver_libro(self, prestamo):
        self.prestamos.remove(prestamo)

    def mostrar_libros(self):
        info_libros = '\n'.join([libro.mostrar_info() for libro in self.libros])
        return info_libros if info_libros else "No hay libros registrados"

def registrar_libro():
    autor = Autor(entry_autor_nombre.get(), entry_autor_apellido.get())
    categoria = Categoria(entry_categoria.get())
    libro = Libro(entry_titulo.get(), entry_id_libro.get(), autor, categoria)
    biblioteca.registrar_libro(libro)
    messagebox.showinfo("Registro", "Libro registrado con éxito")

def registrar_usuario():
    usuario = Usuario(entry_usuario_nombre.get(), entry_usuario_apellido.get(), entry_id_usuario.get())
    biblioteca.registrar_usuario(usuario)
    messagebox.showinfo("Registro", "Usuario registrado con éxito")

def realizar_prestamo():
    try:
        libro = next((libro for libro in biblioteca.libros if libro.id == entry_id_prestamo_libro.get()), None)
        usuario = next((usuario for usuario in biblioteca.usuarios if usuario.id_usuario == entry_id_prestamo_usuario.get()), None)
        if libro and usuario:
            prestamo = Prestamo(libro, usuario, entry_fecha_prestamo.get(), entry_fecha_devolucion.get())
            biblioteca.realizar_prestamo(prestamo)
            messagebox.showinfo("Prestamo", "Prestamo realizado con éxito")
        else:
            messagebox.showerror("Prestamo", "Error: No se encontró el libro o el usuario")
    except StopIteration:
        messagebox.showerror("Prestamo", "Error: No se pudo realizar el prestamo")

def mostrar_libros():
    info_libros = biblioteca.mostrar_libros()
    messagebox.showinfo("Libros en Biblioteca", info_libros)

ventana = tk.Tk()
ventana.title("Sistema de Gestión Biblioteca")
ventana.configure(bg="blue")
ventana.geometry("400x500")

biblioteca = Biblioteca()

tk.Label(ventana, text="Registrar libro", bg="blue").grid(row=0, column=0, columnspan=2)

tk.Label(ventana, text="Titulo", bg="blue").grid(row=1, column=0)
entry_titulo = tk.Entry(ventana)
entry_titulo.grid(row=1, column=1)

tk.Label(ventana, text="ID", bg="blue").grid(row=2, column=0)
entry_id_libro = tk.Entry(ventana)
entry_id_libro.grid(row=2, column=1)

tk.Label(ventana, text="Autor Nombre", bg="blue").grid(row=3, column=0)
entry_autor_nombre = tk.Entry(ventana)
entry_autor_nombre.grid(row=3, column=1)

tk.Label(ventana, text="Autor Apellido", bg="blue").grid(row=4, column=0)
entry_autor_apellido = tk.Entry(ventana)
entry_autor_apellido.grid(row=4, column=1)

tk.Label(ventana, text="Categoria", bg="blue").grid(row=5, column=0)
entry_categoria = tk.Entry(ventana)
entry_categoria.grid(row=5, column=1)

boton_registrar_libro = tk.Button(ventana, text="Registrar Libro", command=registrar_libro)
boton_registrar_libro.grid(row=6, column=0, columnspan=2)

tk.Label(ventana, text="Registrar Usuario", bg="blue").grid(row=7, column=0, columnspan=2)

tk.Label(ventana, text="Nombre", bg="blue").grid(row=8, column=0)
entry_usuario_nombre = tk.Entry(ventana)
entry_usuario_nombre.grid(row=8, column=1)

tk.Label(ventana, text="Apellido", bg="blue").grid(row=9, column=0)
entry_usuario_apellido = tk.Entry(ventana)
entry_usuario_apellido.grid(row=9, column=1)

tk.Label(ventana, text="ID", bg="blue").grid(row=10, column=0)
entry_id_usuario = tk.Entry(ventana)
entry_id_usuario.grid(row=10, column=1)

boton_registrar_usuario = tk.Button(ventana, text="Registrar Usuario", command=registrar_usuario)
boton_registrar_usuario.grid(row=11, column=0, columnspan=2)

tk.Label(ventana, text="Realizar Prestamos", bg="blue").grid(row=12, column=0, columnspan=2)

tk.Label(ventana, text="ID Libro", bg="blue").grid(row=13, column=0)
entry_id_prestamo_libro = tk.Entry(ventana)
entry_id_prestamo_libro.grid(row=13, column=1)

tk.Label(ventana, text="ID Usuario", bg="blue").grid(row=14, column=0)
entry_id_prestamo_usuario = tk.Entry(ventana)
entry_id_prestamo_usuario.grid(row=14, column=1)

tk.Label(ventana, text="Fecha Prestamo", bg="blue").grid(row=15, column=0)
entry_fecha_prestamo = tk.Entry(ventana)
entry_fecha_prestamo.grid(row=15, column=1)

tk.Label(ventana, text="Fecha Devolucion", bg="blue").grid(row=16, column=0)
entry_fecha_devolucion = tk.Entry(ventana)
entry_fecha_devolucion.grid(row=16, column=1)

boton_realizar_prestamo = tk.Button(ventana, text="Registrar Prestamo", command=realizar_prestamo)
boton_realizar_prestamo.grid(row=17, column=0, columnspan=2)

boton_mostrar_libros = tk.Button(ventana, text="Mostrar Libros", command=mostrar_libros)
boton_mostrar_libros.grid(row=18, column=0, columnspan=2)

ventana.mainloop()
