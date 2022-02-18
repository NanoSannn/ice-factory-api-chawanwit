package nvc.it.icefactoryapichawanwit.controller;

import java.util.HashMap;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PatchMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import nvc.it.icefactoryapichawanwit.model.Camera;
import nvc.it.icefactoryapichawanwit.model.Event;
import nvc.it.icefactoryapichawanwit.service.CameraService;

@RestController
@RequestMapping("/camera")
public class CameraController {
    @Autowired
    private CameraService cameraService;

    @GetMapping("")
    public ResponseEntity<Object> getCameraAll(){
        List<Camera> customers = cameraService.getCameraAll();
        HashMap<String, Object> map = new HashMap<>();
        map.put("msg", "Search Camera All Succes!");
        map.put("data", customers);
        return new ResponseEntity<Object>(map, HttpStatus.OK);
    }

    @GetMapping("/{id}")
    public ResponseEntity<Object> getCameraById(@PathVariable String id){
        HashMap<String, Object> map = new HashMap<>();
        map.put("msg", "Search Camera By ID Succes!");
        map.put("data", cameraService.getCameraById(id));
        return new ResponseEntity<Object>(map, HttpStatus.OK);
    }

    @PostMapping("")
    public ResponseEntity<Object> addCamera(@RequestBody Camera camera){
        HashMap<String, Object> map = new HashMap<>();
        map.put("msg", "Add Camera Succes!");
        map.put("data", cameraService.addCamera(camera));
        return new ResponseEntity<Object>(map, HttpStatus.OK);
    }

    @PatchMapping("/camera/{id}")
    public ResponseEntity<Object> addEvent(@PathVariable String id, @RequestBody Event event){
        HashMap<String, Object> map = new HashMap<>();
        map.put("msg", "Update Event In Camera Succes!");
        map.put("data", cameraService.addEvent(id, event));
        return new ResponseEntity<Object>(map, HttpStatus.OK);
    }
}
