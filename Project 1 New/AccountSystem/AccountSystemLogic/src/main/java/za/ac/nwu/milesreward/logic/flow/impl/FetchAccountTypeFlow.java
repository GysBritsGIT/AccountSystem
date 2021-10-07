package za.ac.nwu.milesreward.logic.flow.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import za.ac.nwu.milesreward.domain.dto.AccountTypeDto;
import za.ac.nwu.milesreward.logic.flow.FetchAccountTypeFlowInt;
import za.ac.nwu.milesreward.translator.impl.AccountTypeTranslatorImpl;

import javax.transaction.Transactional;
import java.util.List;

@Transactional
@Component

public class FetchAccountTypeFlow implements FetchAccountTypeFlowInt {
    public final AccountTypeTranslatorImpl accountTypeTranslator;

    @Autowired
    public FetchAccountTypeFlow(AccountTypeTranslatorImpl accountTypeTranslator) {
        this.accountTypeTranslator = accountTypeTranslator;
    }

    @Override
    public List<AccountTypeDto> getAllAccountTypes() {
        return accountTypeTranslator.getAllAccountTypes();
    }

    public AccountTypeDto getAccountTypeByMnemonic(String mnemonic) {
        return accountTypeTranslator.getAccountTypeByMnemonicNativeQuery(mnemonic);
    }
}

