package com.lntech.ecommerce.dto;

import com.lntech.ecommerce.domain.Categorie;

import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.Size;
import java.io.Serializable;

public class CategorieDTO implements Serializable {
    private static final long serialVersionUID = 1L;

    private Integer id;

    @NotEmpty(message = "Preenchimento obrigatório!")
    @Size(min = 3,max = 80,message = "O tamanho deve ser entre 3 e 80!")
    private String name;


    public CategorieDTO() {
    }

    public CategorieDTO(Categorie obj){
        id = obj.getId();
        name = obj.getName();
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

}
