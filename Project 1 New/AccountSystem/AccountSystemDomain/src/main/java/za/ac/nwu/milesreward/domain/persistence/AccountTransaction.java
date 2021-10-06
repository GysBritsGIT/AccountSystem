package za.ac.nwu.milesreward.domain.persistence;

import lombok.*;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Objects;

@Getter
@Setter
@EqualsAndHashCode
@ToString
//@AllArgsConstructor
//@NoArgsConstructor
@NonNull
@Entity


public class AccountTransaction implements Serializable {

    @Id
    @SequenceGenerator(name = "hr_generic_seq", sequenceName = "hr.hr_generic_seq", allocationSize = 1)
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "hr_generic_seq")
    @Column(name = "MEM_ID")
    private Long memid;

    @Column(name = "Mem_Name")
    private Long memname;

    @Column(name = "mem_surname")
    private Long memsurname;

    public AccountTransaction(Long memid, Long memname, Long memsurname) {
        this.memid = memid;
        this.memname = memname;
        this.memsurname = memsurname;
    }

    public AccountTransaction() {
    }

    public Long getMemid() {
        return memid;
    }

    public Long getMemname() {
        return memname;
    }

    public Long getMemsurname() {
        return memsurname;
    }

    public void setMemid(Long memid) {
        this.memid = memid;
    }

    public void setMemname(Long memname) {
        this.memname = memname;
    }

    public void setMemsurname(Long memsurname) {
        this.memsurname = memsurname;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        AccountTransaction that = (AccountTransaction) o;
        return Objects.equals(memid, that.memid) && Objects.equals(memname, that.memname) && Objects.equals(memsurname, that.memsurname);
    }

    @Override
    public int hashCode() {
        return Objects.hash(memid, memname, memsurname);
    }


}
