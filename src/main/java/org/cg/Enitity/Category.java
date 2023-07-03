package org.cg.Enitity;

// Generated 20/10/2012 11:23:03 AM by Hibernate Tools 3.4.0.CR1

import javax.persistence.*;
import java.util.Date;
import java.util.List;

import static javax.persistence.GenerationType.IDENTITY;

/**
 * Category generated by hbm2java
 */
@Entity
@Table(name = "category", catalog = "sakila")
public class Category implements java.io.Serializable {

    private static final long serialVersionUID = 1L;
    private Byte categoryId;
    private String name;
    private Date lastUpdate;
    private List<FilmCategory> filmCategories;

    public Category() {
    }

    public Category(String name, Date lastUpdate) {
        this.name = name;
        this.lastUpdate = lastUpdate;
    }

    public Category(String name, Date lastUpdate,
                    List<FilmCategory> filmCategories) {
        this.name = name;
        this.lastUpdate = lastUpdate;
        this.filmCategories = filmCategories;
    }

    @Id
    @GeneratedValue(strategy = IDENTITY)
    @Column(name = "category_id", unique = true, nullable = false)
    public Byte getCategoryId() {
        return this.categoryId;
    }

    public void setCategoryId(Byte categoryId) {
        this.categoryId = categoryId;
    }

    @Column(name = "name", nullable = false, length = 25)
    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Temporal(TemporalType.TIMESTAMP)
    @Column(name = "last_update", nullable = false, length = 19)
    public Date getLastUpdate() {
        return this.lastUpdate;
    }

    public void setLastUpdate(Date lastUpdate) {
        this.lastUpdate = lastUpdate;
    }

    @OneToMany(fetch = FetchType.LAZY, mappedBy = "category")
    public List<FilmCategory> getFilmCategories() {
        return this.filmCategories;
    }

    public void setFilmCategories(List<FilmCategory> filmCategories) {
        this.filmCategories = filmCategories;
    }

}