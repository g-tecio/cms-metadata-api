package com.cwgx.metadata.repositories;

import com.cwgx.metadata.models.Metadata;
import org.bson.types.ObjectId;
import org.springframework.data.mongodb.repository.MongoRepository;

import java.util.List;

public interface MetadataRepository extends MongoRepository<Metadata, String> {

    List<Metadata> findById(ObjectId id);

    List<Metadata> findByName(String name);


}
