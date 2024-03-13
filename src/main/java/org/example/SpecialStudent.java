package org.example;

import java.util.List;
import java.util.Objects;

public final class SpecialStudent extends Student{

    private String role;

    public SpecialStudent(Integer studentId, String firstName, String lastName, List<Integer> phoneNos, Address address,String role) {
        super(studentId, firstName, lastName, phoneNos, address);
        this.role = role;
    }

    public String getRole() {
        return role;
    }

    public void setRole(String role) {
        this.role = role;
    }

    @Override
    public String toString() {
        return "SpecialStudent{" +
                "role='" + role + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        SpecialStudent that = (SpecialStudent) o;
        return Objects.equals(role, that.role);
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), role);
    }
}
