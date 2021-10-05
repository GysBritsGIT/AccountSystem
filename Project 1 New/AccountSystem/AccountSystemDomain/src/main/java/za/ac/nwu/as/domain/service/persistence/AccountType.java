package za.ac.nwu.as.domain.service.persistence;

import javax.persistence.*;
import java.io.Serializable;
import java.time.LocalDate;

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

}
