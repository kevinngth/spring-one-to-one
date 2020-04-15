package com.training.one_to_one;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

@Repository
@Transactional
public interface OwnerRepository extends CrudRepository<Owner, Long> {
}
