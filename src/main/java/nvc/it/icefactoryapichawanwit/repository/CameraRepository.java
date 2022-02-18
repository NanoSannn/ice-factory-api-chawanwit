package nvc.it.icefactoryapichawanwit.repository;

import org.springframework.data.mongodb.repository.MongoRepository;

import nvc.it.icefactoryapichawanwit.model.Camera;

public interface CameraRepository extends MongoRepository<Camera, String>{
    
}
