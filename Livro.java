package com.SA.bibliocrud.entities;

import java.sql.Date;

import jakarta.persistence.Entity;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "Livros")

public class Livro {
private long ISBN;
private String Nome;
private String Autor;
private String Editora; 
private Date DataPublicacao;
}


