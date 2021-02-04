package com.github.carloscoppolla.staties.repositories;

import com.github.carloscoppolla.staties.entities.State;
import org.springframework.data.jpa.repository.JpaRepository;

public interface StateRepository extends JpaRepository<State, Long> {
}
