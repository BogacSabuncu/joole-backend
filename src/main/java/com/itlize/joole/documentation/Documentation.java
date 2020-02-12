package com.itlize.joole.documentation;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.itlize.joole.product.Product;

import javax.persistence.*;

@Entity
public class Documentation {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int documentationId;
    private String docName;
    private String docType;

    @JsonIgnore
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "productId", nullable = false)
    private Product product;

    public Documentation(int documentationId, String docName, String docType, int productId) {
        super();
        this.documentationId = documentationId;
        this.docName = docName;
        this.docType = docType;
        this.product = new Product(productId);
    }

    public Documentation(){

    }

    public int getDocumentationId() {
        return documentationId;
    }

    public void setDocumentationId(int documentationId) {
        this.documentationId = documentationId;
    }

    public String getDocName() {
        return docName;
    }

    public void setDocName(String docName) {
        this.docName = docName;
    }

    public String getDocType() {
        return docType;
    }

    public void setDocType(String docType) {
        this.docType = docType;
    }

    public Product getProduct() {
        return product;
    }

    public void setProduct(Product product) {
        this.product = product;
    }
}
