package com.portfolioArg.portfolio.entitys;

import com.fasterxml.jackson.annotation.JsonBackReference;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;


import javax.persistence.*;
import javax.transaction.Transactional;
import javax.xml.crypto.Data;
import java.util.Date;

@Entity
@Transactional
@JsonIgnoreProperties({"hibernateLazyInitializer", "handler"})
public class Experiencia {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    @Column(name = "puesto")
    private String puesto;

    @Lob
    @Column(name = "descripcion")
    private String descripcion;

    @Column(name = "img")
    private String img;

    @Column(name = "empresa")
    private String empresa;

    @Column(name = "url")
    private String url;

    @Column(name = "activo")
    private boolean activo;

    @Temporal(TemporalType.DATE)
    @Column(name = "inicio")
    private Date inicio;

    @Temporal(TemporalType.DATE)
    @Column(name = "fin")
    private Date fin;

    @JsonBackReference
    @ManyToOne(fetch = FetchType.EAGER)
    private Persona persona;

    public Experiencia() {
    }

    public Experiencia(String puesto, String descripcion, String img, String empresa, String url, boolean activo, Date inicio, Date fin, Persona persona) {
        this.puesto = puesto;
        this.descripcion = descripcion;
        this.img = img;
        this.empresa = empresa;
        this.url = url;
        this.activo = activo;
        this.inicio = inicio;
        this.fin = fin;
        this.persona = persona;
    }
}
