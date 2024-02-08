package com.thefactory.shoppingapp.repository;

import com.thefactory.shoppingapp.model.TransactionReport;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TransactionReportRepo extends JpaRepository<TransactionReport,Long> {
}
