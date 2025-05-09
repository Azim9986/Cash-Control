package com.azim.cashcontrol.category;

import com.azim.cashcontrol.model.Expense;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface ExpenseRepository extends JpaRepository<Expense, Long> {

    @Query("SELECT c FROM Expense c WHERE c.name = ?1")
    Optional<Expense> findExpenseByName(String expenseName);
}
