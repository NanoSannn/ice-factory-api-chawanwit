package nvc.it.icefactoryapichawanwit.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import nvc.it.icefactoryapichawanwit.model.Camera;
import nvc.it.icefactoryapichawanwit.model.Event;
import nvc.it.icefactoryapichawanwit.repository.CameraRepository;

@Service
public class CameraService {
    @Autowired
    private CameraRepository cameraRepository;

    public List<Camera> getCameraAll(){
        return cameraRepository.findAll();
    }

    public Optional<Camera> getCameraById(String id){
        return cameraRepository.findById(id);
    }

    public Camera addCamera(Camera camera){
        return cameraRepository.save(camera);
    }

    public Optional<Camera> addEvent(String id, Event event){
        Camera currentCustomer = cameraRepository.findById(id).get();
        List<Event> events = currentCustomer.getEventModels();
        events.add(event);
        currentCustomer.setEventModels(events);
        return Optional.of(cameraRepository.save(currentCustomer));
    }

}