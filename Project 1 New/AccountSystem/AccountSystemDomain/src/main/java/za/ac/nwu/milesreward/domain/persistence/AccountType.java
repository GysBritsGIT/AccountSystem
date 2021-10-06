package za.ac.nwu.milesreward.domain.persistence;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Objects;

@Entity
@Table(name = "Member", schema = "hr")

public class AccountType implements Serializable {

    @Id
    @SequenceGenerator(name = "hr_generic_seq", sequenceName = "hr.hr_generic_seq", allocationSize = 1)
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "hr_generic_seq")
    @Column(name = "MEM_ID")
    private Long memid;

    @Column(name = "Mem_Name")
    private Long memname;

    @Column(name = "mem_surname")
    private Long memsurname;

    public AccountType(Long memid, Long memname, Long memsurname) {
        this.memid = memid;
        this.memname = memname;
        this.memsurname = memsurname;
    }

    public AccountType() {
    }

    public Long getMemid() {
        return memid;
    }

    public void setMemid(Long memid) {
        this.memid = memid;
    }

    public Long getMemname() {
        return memname;
    }

    public void setMemname(Long memname) {
        this.memname = memname;
    }

    public Long getMemsurname() {
        return memsurname;
    }

    public void setMemsurname(Long memsurname) {
        this.memsurname = memsurname;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        AccountType that = (AccountType) o;
        return Objects.equals(memid, that.memid) && Objects.equals(memname, that.memname) && Objects.equals(memsurname, that.memsurname);
    }

    @Override
    public int hashCode() {
        return Objects.hash(memid, memname, memsurname);
    }

    @Override
    public String toString() {
        return "AccountType{" +
                "memid=" + memid +
                ", memname=" + memname +
                ", memsurname=" + memsurname +
                '}';
    }
}
