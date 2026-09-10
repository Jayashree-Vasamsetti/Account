package com.gayatri.accounts.service.Impl;

import com.gayatri.accounts.dto.CustomerDto;
import com.gayatri.accounts.repository.AccountsRepository;
import com.gayatri.accounts.repository.CustomerRepository;
import com.gayatri.accounts.service.IAccountsService;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@AllArgsConstructor
public class AccountsServiceImpl implements IAccountsService {

    private AccountsRepository accountsRepository;
    private CustomerRepository customerRepository;

    @Override
    public void createAccount(CustomerDto customerDto) {

    }
}
