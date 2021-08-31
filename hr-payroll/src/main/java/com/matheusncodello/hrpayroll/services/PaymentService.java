package com.matheusncodello.hrpayroll.services;

import com.matheusncodello.hrpayroll.entities.Payment;
import com.matheusncodello.hrpayroll.entities.Worker;
import com.matheusncodello.hrpayroll.feignclients.WorkerFeignClient;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


@Service
public class PaymentService {

    @Autowired
    private WorkerFeignClient workerFeignClient;

    public Payment getPayment(long workerId, int days) {
        Worker worker = workerFeignClient.findById(workerId).getBody();
        return new Payment(worker.getName(), worker.getDailyIncome(), days);
    }
}