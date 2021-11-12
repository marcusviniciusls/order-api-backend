package br.com.order.api.backend.document;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;


@Document(collection = "order")
public class Orderdocument {
    @Id
    private String id;

}
