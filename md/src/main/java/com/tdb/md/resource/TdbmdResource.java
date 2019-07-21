package com.tdb.md.resource;

import java.util.List;

import com.tdb.md.model.Tdbmd;
import com.tdb.md.repository.TdbmdRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/rest/tdbmd")
public class TdbmdResource {

    @Autowired
    TdbmdRepository tdbmdRepository;

    @GetMapping(value = "/all")
    public List<Tdbmd> getAll(){
        List<Tdbmd> ll = tdbmdRepository.findAll();
        return ll;
    }

    @GetMapping(value = "/byid")
    public List<Tdbmd> getByUserId(@RequestParam(name="uid") String uid){
        List<Tdbmd> ll = tdbmdRepository.findByUserId(uid);
        return ll;
    }

    @GetMapping(value = "/modules")
    public String getModules(@RequestParam(name="uid") String uid){
        List<Tdbmd> ll = tdbmdRepository.findByUserId(uid);

        String ss = "modules:[";
        for(int ii = 0; ii<ll.size(); ii++)
        {
            if (ii != 0 && ii+1 < ll.size()){
                ss += ",";
            }
            Tdbmd mm = ll.get(ii);
            ss += String.format("{moduleName:%s,moduleOrder:%d}", mm.getModuleName(), mm.getModuleOrder());
        }
        ss += "]";
        return ss;
    }
}