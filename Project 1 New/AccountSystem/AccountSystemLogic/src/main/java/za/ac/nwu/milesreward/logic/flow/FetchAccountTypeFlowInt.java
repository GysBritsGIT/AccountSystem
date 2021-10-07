package za.ac.nwu.milesreward.logic.flow;

import za.ac.nwu.milesreward.domain.dto.AccountTypeDto;

import java.util.List;

public interface FetchAccountTypeFlowInt {
    List<AccountTypeDto> getAllAccountTypes();
    AccountTypeDto getAccountTypeByMnemonic(String mnemonic);
}
