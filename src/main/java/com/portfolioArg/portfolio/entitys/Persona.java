package com.portfolioArg.portfolio.entitys;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonManagedReference;
import jakarta.persistence.*;
import jakarta.transaction.Transactional;


import java.util.Date;
import java.util.List;
import java.util.Objects;

@Entity
@Transactional
@JsonIgnoreProperties({"hibernateLazyInitializer", "handler"})
public class Persona {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    @Column(name = "nombre")
    private String nombre;

    @Column(name = "apellido")
    private String apellido;

    @Column(name = "titulo")
    private String titulo;

    @Column(name = "descripcion")
    @Lob
    private String descripcion;

    @Column(name = "img")
    private String img;

    @Column(name = "email")
    private String email;

    @Column(name = "curriculum")
    private String curriculum;


    @Column(name = "nacimiento")
    @Temporal(TemporalType.DATE)
    private Date nacimiento;

    @JsonManagedReference
    @OneToMany(mappedBy="persona", cascade = CascadeType.ALL)
    private List<Educacion> educaciones;

    @JsonManagedReference
    @OneToMany (mappedBy="persona", cascade = CascadeType.ALL, fetch = FetchType.EAGER )
    private List<Contacto> contactos;

    @JsonManagedReference
    @OneToMany (mappedBy="persona", cascade = CascadeType.ALL, fetch = FetchType.EAGER )
    private List<Experiencia> experiencias;

    @JsonManagedReference
    @OneToMany (mappedBy="persona", cascade = CascadeType.ALL, fetch = FetchType.EAGER )
    private List<Herramienta> herramientas;

    @JsonManagedReference
    @OneToMany (mappedBy="persona", cascade = CascadeType.ALL, fetch = FetchType.EAGER )
    private List<Proyecto> proyectos;


    public Persona() {
    }
    public Persona(String nombre, String apellido, String titulo, String descripcion, String img, String email, String curriculum, Date nacimiento) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.titulo = titulo;
        this.descripcion = descripcion;
        this.img = img;
        this.email = email;
        this.curriculum = curriculum;
        this.nacimiento = nacimiento;
    }



    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public String getImg() {
        return img;
    }

    public void setImg(String img) {
        this.img = img;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getCurriculum() {
        return curriculum;
    }

    public void setCurriculum(String curriculum) {
        this.curriculum = curriculum;
    }

    public Date getNacimiento() {
        return nacimiento;
    }

    public void setNacimiento(Date nacimiento) {
        this.nacimiento = nacimiento;
    }

    public List<Educacion> getEducaciones() {
        return educaciones;
    }

    public void setEducaciones(List<Educacion> educaciones) {
        this.educaciones = educaciones;
    }

    public List<Contacto> getContactos() {
        return contactos;
    }

    public void setContactos(List<Contacto> contactos) {
        this.contactos = contactos;
    }

    public List<Experiencia> getExperiencias() {
        return experiencias;
    }

    public void setExperiencias(List<Experiencia> experiencias) {
        this.experiencias = experiencias;
    }

    public List<Herramienta> getHerramientas() {
        return herramientas;
    }

    public void setHerramientas(List<Herramienta> herramientas) {
        this.herramientas = herramientas;
    }

    public List<Proyecto> getProyectoss() {
        return proyectos;
    }

    public void setProyectoss(List<Proyecto> proyectoss) {
        this.proyectos = proyectoss;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Persona persona = (Persona) o;
        return id == persona.id && Objects.equals(nombre, persona.nombre) && Objects.equals(apellido, persona.apellido) && Objects.equals(titulo, persona.titulo) && Objects.equals(descripcion, persona.descripcion) && Objects.equals(img, persona.img) && Objects.equals(email, persona.email) && Objects.equals(curriculum, persona.curriculum) && Objects.equals(nacimiento, persona.nacimiento) && Objects.equals(educaciones, persona.educaciones) && Objects.equals(contactos, persona.contactos) && Objects.equals(experiencias, persona.experiencias) && Objects.equals(herramientas, persona.herramientas) && Objects.equals(proyectos, persona.proyectos);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, nombre, apellido, titulo, descripcion, img, email, curriculum, nacimiento, educaciones, contactos, experiencias, herramientas, proyectos);
    }

    @Override
    public String toString() {
        return "Persona{" +
                "id=" + id +
                ", nombre='" + nombre + '\'' +
                ", apellido='" + apellido + '\'' +
                ", titulo='" + titulo + '\'' +
                ", descripcion='" + descripcion + '\'' +
                ", img='" + img + '\'' +
                ", email='" + email + '\'' +
                ", curriculum='" + curriculum + '\'' +
                ", nacimiento=" + nacimiento +
                ", educaciones=" + educaciones +
                ", contactos=" + contactos +
                ", experiencias=" + experiencias +
                ", herramientas=" + herramientas +
                ", proyectoss=" + proyectos +
                '}';
    }
}
