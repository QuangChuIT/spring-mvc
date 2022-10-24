package com.xdev.entity;

import org.hibernate.validator.constraints.Email;
import org.hibernate.validator.constraints.NotEmpty;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;
import javax.validation.constraints.Size;
import java.io.Serializable;

@Entity
@Table(name = "category")
public class Category extends AbstractEntity<Long> implements Serializable {

    @Column(name = "title", nullable = false)
    @NotEmpty
    @Size
    @Email
    private String title;


    @Column(name = "slug", nullable = false)
    private String slug;

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getSlug() {
        return slug;
    }

    public void setSlug(String slug) {
        this.slug = slug;
    }

    @Override
    public String toString() {
        return String.format("Category {id=%s, title = %s, slug=%s}", this.getId(), this.getTitle(), this.slug);
    }
}
