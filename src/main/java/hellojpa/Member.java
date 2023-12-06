package hellojpa;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity// JPA가 관리하는 Entity
public class Member {
    @Id // PK
    private Long id;
    private String name;
//Getter, Setter ...

    public Member() {
    }

    public Member(Long id, String name) {
        this.id = id;
        this.name = name;
    }

    public Member(String name) {
        this.name = name;
    }

    public Long getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public void setId(Long id) {
        this.id= id;
    }

    public void setName(String name) {
        this.name = name;
    }
}