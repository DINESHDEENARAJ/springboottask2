package Staffdetail.kailash;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.List;
import java.util.Optional;

@Service
public class kailashdetailservice {
    @Autowired
    kailashdetailrepository kail;
//post
    public  kailashdetail creation(kailashdetail kaila) {
        return kail.save(kaila);
    }

    //get
    public List<kailashdetail> listallkailasdetail()
    {
        return (List<kailashdetail>)  kail.findAll();
    }

//
    //DELETE
    public String Deleting(int id)
    {
        kailashdetail sd = kail.findById(id).orElse(new kailashdetail());
        kail.delete(sd);
        return sd.getStaffname() + "has been delete passed ";

    }
    //read by list
    public Optional<kailashdetail> readlist(int id)
    {
        return kail.findById(id);
    }


}



