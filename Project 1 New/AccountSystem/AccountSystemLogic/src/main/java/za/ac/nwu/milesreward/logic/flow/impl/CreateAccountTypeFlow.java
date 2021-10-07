package za.ac.nwu.milesreward.logic.flow.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import za.ac.nwu.milesreward.domain.dto.AccountTypeDto;
import za.ac.nwu.milesreward.logic.flow.CreateAccountTypeFlowInt;
import za.ac.nwu.milesreward.translator.impl.AccountTypeTranslatorImpl;

import javax.transaction.Transactional;
import java.time.LocalDate;

@Transactional
@Component("createAccountTypeFlowName")
public class CreateAccountTypeFlow implements CreateAccountTypeFlowInt {

    public final AccountTypeTranslatorImpl accountTypeTranslator;

    @Autowired
    public CreateAccountTypeFlow(AccountTypeTranslatorImpl accountTypeTranslator) {
        this.accountTypeTranslator = accountTypeTranslator;
    }

    public AccountTypeDto create(AccountTypeDto accountType){
        if (accountType.getCreationDate() == null){
            accountType.setCreationDate(LocalDate.now());
        }

        return accountTypeTranslator.create(accountType);
    }
}
