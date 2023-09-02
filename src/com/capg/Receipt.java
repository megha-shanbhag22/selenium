package com.capg;

class Receipt {
    TransactionParty transactionParty;
    public String productsQR;

 

    Receipt(TransactionParty transactionParty, String productsQR) {
        this.transactionParty = transactionParty;
        this.productsQR = productsQR;
    }
}
