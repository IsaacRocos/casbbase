package com.mit.genesis.casbase.casbase.domain.repository;

import com.mit.genesis.casbase.casbase.domain.model.User;

public interface UserRepository {

	User save(User user);

	User findById(Long id);

}
