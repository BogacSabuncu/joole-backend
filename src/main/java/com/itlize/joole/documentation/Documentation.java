package com.itlize.joole.documentation;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Documentation {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int documentationId;
    private String docName;
    private String docType;

    public Documentation(int documentationId, String docName, String docType) {
        super();
        this.documentationId = documentationId;
        this.docName = docName;
        this.docType = docType;
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
}
