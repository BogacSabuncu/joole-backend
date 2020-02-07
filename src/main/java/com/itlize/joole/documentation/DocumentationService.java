package com.itlize.joole.documentation;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class DocumentationService {

    @Autowired
    DocumentationRepository documentationRepository;

    public void getAllDocumentation(){
        List<Documentation> documentations = new ArrayList<>();
        documentationRepository.findAll()
                .forEach(documentations::add);

    }
    public void getDocumentation(int id){}
    public void addDocumentation(Documentation documentation){}
    public void updateDocumentation(Documentation documentation, int id){}
    public void deleteDocumentation(int id){}
}
