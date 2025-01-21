package dataJpa.relationship.model;

import jakarta.persistence.*;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.ArrayList;
import java.util.List;

@Entity
@Data
@NoArgsConstructor
@Table(name = "catogory")
public class Catogory {

  @Id
  @GeneratedValue(strategy = GenerationType.AUTO)
  private Long id;

  private  String name;

  @OneToMany(mappedBy = "category",cascade = CascadeType.ALL,fetch = FetchType.LAZY)
  private List<Book> books=new ArrayList<>();

  public Catogory(String name, List<Book> books) {
    this.name = name;
    this.books = books;
  }
}
