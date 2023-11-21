package com.SA.bibliocrud.entities;

import java.util.Date;
import com.SA.bibliocrud.enums.StatusLivro;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@Entity

@NoArgsConstructor
@AllArgsConstructor
@Table(name = "Emprestimos")

public class Emprestimo {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column (name = "IdEmprestimo")
    private Integer IdEmprestimo;
    private Date Prazo;
    private StatusLivro Status;
  
}
