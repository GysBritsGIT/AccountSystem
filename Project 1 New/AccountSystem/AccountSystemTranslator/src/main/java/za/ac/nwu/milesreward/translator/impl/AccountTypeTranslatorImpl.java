package za.ac.nwu.milesreward.translator.impl;


import org.springframework.stereotype.Component;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import za.ac.nwu.milesreward.domain.dto.AccountTypeDto;
import za.ac.nwu.milesreward.domain.persistence.AccountType;
import za.ac.nwu.milesreward.repo.persistence.AccountTypeRepository;
import za.ac.nwu.milesreward.translator.AccountTranslatorInt;

import java.util.ArrayList;
import java.util.List;

@Component

public class AccountTypeTranslatorImpl implements AccountTranslatorInt {
    private final AccountTypeRepository accountTypeRepository;

    @Autowired
    public AccountTypeTranslatorImpl(AccountTypeRepository accountTypeRepository) {
        this.accountTypeRepository = accountTypeRepository;
    }

    @Override
    public List<AccountTypeDto> getAllAccountTypes() {

        List<AccountTypeDto> accountTypeDtos = new ArrayList<>();
        try {
            for (AccountType accountType : accountTypeRepository.findAll()) {
                accountTypeDtos.add(new AccountTypeDto(accountType));
            }
        } catch (Exception e) {
            throw new RuntimeException("Unable to read from the DB", e);
        }
        return accountTypeDtos;
    }

    @Override
    public AccountTypeDto create(AccountTypeDto accountTypeDto){
        try {
            AccountType accountType = accountTypeRepository.save(accountTypeDto.getAccountType());
            return new AccountTypeDto(accountType);
        } catch (Exception e) {
            throw new RuntimeException("Unable to save to the DB", e);
        }
    }

    @Override
    public AccountTypeDto getAccountTypeByMnemonicNativeQuery(String mnemonic) {
        try {
            AccountType accountType = accountTypeRepository.getAccountTypeByMnemonicNativeQuery(mnemonic);
            return new AccountTypeDto((accountType));
        } catch (Exception e) {
            throw new RuntimeException("Unable to read from the DB", e);
        }
    }
}
