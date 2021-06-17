package com.tw.academy.basic.$7_long_method;

/**
 * This class is a example for bad smell;
 *
 * @author  Thoughtworks
 * @version 1.0
 * @since   2018-1-1
 */
public class OrderReceipt {
    private Order o;

    public OrderReceipt(Order o) {
        this.o = o;
    }


    public String printReceipt() {
        StringBuilder output = new StringBuilder();
        buildPrintReceipt(output);
        return output.toString();
    }

    private void buildPrintReceipt(StringBuilder output) {
        printReceiptHeaders(output, "======Printing Orders======\n");
        printCustomerInformation(output);
        printReceiptBody(output);
    }

    private void printReceiptBody(StringBuilder output) {
        double totSalesTx = 0d;
        double tot = 0d;
        for (LineItem lineItem : o.getLineItems()) {
            printLineItem(output, lineItem);
            double salesTax = calculateSalesTax(lineItem);
            totSalesTx += salesTax;
            tot = calculateTotal(tot, lineItem, salesTax);
        }
        PrintsTotalSalesTax(output, totSalesTx);
        PrintTotalAmount(output, tot);
    }

    private void PrintTotalAmount(StringBuilder output, double tot) {
        output.append("Total Amount").append('\t').append(tot);
    }

    private void PrintsTotalSalesTax(StringBuilder output, double totSalesTx) {
        output.append("Sales Tax").append('\t').append(totSalesTx);
    }

    private double calculateTotal(double tot, LineItem lineItem, double salesTax) {
        tot += lineItem.totalAmount() + salesTax;
        return tot;
    }

    private double calculateSalesTax(LineItem lineItem) {
        return lineItem.totalAmount() * .10;
    }

    private void printLineItem(StringBuilder output, LineItem lineItem) {
        output.append(lineItem.getDescription());
        output.append('\t');
        output.append(lineItem.getPrice());
        output.append('\t');
        output.append(lineItem.getQuantity());
        output.append('\t');
        output.append(lineItem.totalAmount());
        output.append('\n');
    }

    private void printCustomerInformation(StringBuilder output) {
        output.append(o.getCustomerName());
        output.append(o.getCustomerAddress());
    }

    private void printReceiptHeaders(StringBuilder output, String s) {
        output.append(s);
    }
}