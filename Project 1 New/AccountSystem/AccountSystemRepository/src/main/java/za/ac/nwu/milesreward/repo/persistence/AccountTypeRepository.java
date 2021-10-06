package za.ac.nwu.milesreward.repo.persistence;

import org.springframework.data.jpa.repository.JpaRepository;
import za.ac.nwu.as.domain.persistence.AccountType;

public interface AccountTypeRepository extends JpaRepository<AccountType, Long> {
}