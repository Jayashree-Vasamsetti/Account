package com.gayatri.accounts.repository;

import com.gayatri.accounts.entity.Accounts;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AccountsRepository extends JpaRepository<Accounts, Long> {
    
}
