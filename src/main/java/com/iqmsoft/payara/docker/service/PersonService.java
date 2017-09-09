package com.iqmsoft.payara.docker.service;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import com.iqmsoft.payara.docker.entity.Person;


public class PersonService {

    private static List<Person> pessoas;

    private static PersonService ourInstance = new PersonService();

    public static PersonService getInstance() {

        return ourInstance;
    }

    private PersonService() {

        if (this.pessoas == null) {
            this.pessoas = new ArrayList<Person>();
        }
    }

    public void add (Person p){
        this.pessoas.add(p);
    }

    public List<Person> getAll(){
        return Collections.unmodifiableList(this.pessoas);
    }

}
