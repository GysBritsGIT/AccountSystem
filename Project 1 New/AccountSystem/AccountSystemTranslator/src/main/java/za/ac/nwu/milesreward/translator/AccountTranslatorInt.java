package za.ac.nwu.milesreward.translator;

import za.ac.nwu.milesreward.domain.dto.AccountTypeDto;
import za.ac.nwu.milesreward.domain.persistence.AccountType;

import java.util.List;

public interface AccountTranslatorInt {
    List<AccountTypeDto> getAllAccountTypes();
    public AccountTypeDto create(AccountTypeDto accountTypeDto);
    AccountTypeDto getAccountTypeByMnemonicNativeQuery(String mnemonic);
}
