package com.chanti.versions;

import java.io.Serializable;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;
import java.util.stream.Stream;

class Book implements Serializable {
    private  int id;
    private String name;
    private float cost;
    public Book(){}

    public Book(int id, String name, float cost) {
        this.id = id;
        this.name = name;
        this.cost = cost;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public float getCost() {
        return cost;
    }

    public void setCost(float cost) {
        this.cost = cost;
    }

    @Override
    public String toString() {
        return "Book{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", cost=" + cost +
                '}';
    }
}
public class OptionalClassMethodsDemo
{

    public static void main(String[] args) throws NullBookNameException {
        List<Book> bookList= Stream.of(
                new Book(1,"Let Us C",450F),
                new Book(2,"Let Us Cpp",350F),
                new Book(3,"Head First Java",500F),
                new Book(4,"Head First Servlets",100F)
        ).collect(Collectors.toList());

        //1.empty()
        System.out.println(Optional.empty());   //Optional.empty
        Book book=new Book(55,"JavaByChanti",50000);
        //2.of()
        //System.out.println(Optional.of(book.getName()));  //NPE
        //3.ofNullable()
        System.out.println(Optional.ofNullable(book.getName()));
        //4.get()
        System.out.println(Optional.ofNullable(book.getName()).get());
        //5.isPresent()
        book.setName(null);
        System.out.println(Optional.ofNullable(book.getName()).isPresent()?book.getName():"No Name Given");
        //6.orElse()
        System.out.println(Optional.ofNullable(book.getName()).orElse("Book Name is not given"));
        //7.orElseGet()
        System.out.println(Optional.ofNullable(book.getName()).orElseGet(()->"Book Name is Null"));
        //8.orElseThrow()
        System.out.println(Optional.ofNullable(book.getName()).orElseThrow(()->new NullBookNameException()));
    }
}
