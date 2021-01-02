package com.kodilla.hibernate.invoice.dao;

import com.kodilla.hibernate.invoice.Invoice;
import com.kodilla.hibernate.invoice.Item;
import com.kodilla.hibernate.invoice.Product;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.math.BigDecimal;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;

@SpringBootTest
public class InvoiceDaoTestSuite {

    @Autowired
    private InvoiceDao invoiceDao;

    @Test
    void testInvoiceDaoSave() {
        //Given
        Product product1 = new Product("Product1");
        Product product2 = new Product("Product2");
        Item item1 = new Item(product1, new BigDecimal(10.1), 2, new BigDecimal(20.2));
        Item item2 = new Item(product2, new BigDecimal(20.50), 2, new BigDecimal(41.0));
        Invoice invoice = new Invoice("001");
        item1.setProduct(product1);
        item2.setProduct(product2);
        invoice.getItems().add(item1);
        invoice.getItems().add(item2);
        item1.setInvoice(invoice);
        item2.setInvoice(invoice);

        //When
        invoiceDao.save(invoice);
        int id = invoice.getId();
        int invoiceItemsNumber = invoice.getItems().size();
        Product expectedProduct1 = item1.getProduct();
        Product expectedProduct2 = item2.getProduct();

        //Then
        assertNotEquals(0, id);
        assertEquals(2, invoiceItemsNumber);
        assertEquals(product1, expectedProduct1);
        assertEquals(product2, expectedProduct2);

        //CleanUp
        invoiceDao.deleteById(id);
    }
}
