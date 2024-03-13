package org.example;

import lombok.*;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
@AllArgsConstructor
@ToString
@EqualsAndHashCode
public class Student {
    private final Integer studentId;
    private final String firstName;
    private final String lastName;
    private final List<Integer> phoneNos;
    private final Address address;
    public Integer getStudentId() {
        return studentId;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;//val
    }

    public List<Integer> getPhoneNos() {
        List<Integer> clonedList = new ArrayList<>(phoneNos);
        return clonedList;//return cloned object
    }

    public Address getAddress() {
        Address clonedAddress = new Address(address.getCity());
        return clonedAddress;
    }
    //Lombok

}
