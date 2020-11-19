package br.xksoberbado.dicasdto.dto;

import br.xksoberbado.dicasdto.model.Gender;

public class PersonDTO3 implements IDTO {

    private String firstName;
    private Gender gender;

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public Gender getGender() {
        return gender;
    }

    public void setGender(Gender gender) {
        this.gender = gender;
    }

    public boolean isMale(){
        return this.gender.equals(Gender.MALE);
    }
}
