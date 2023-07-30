package Staffdetail.kailash;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.awt.*;
import java.util.List;
import java.util.Optional;
import java.util.OptionalInt;

@RestController
public class kailashdetailcontrol {
    @Autowired

    kailashdetailservice servi;
    //post
    @PostMapping("/kailashdetail")

    public String adding (@RequestBody kailashdetail kailas)
    {
        return servi.creation(kailas).getStaffname()+"has been add success";
    }
    //get
    @GetMapping("visiblity")
    public List<kailashdetail> viewall()
    {
        return servi.listallkailasdetail();
    }
    //change for put
    @PutMapping("updateonput")
    public String upadte (@RequestBody kailashdetail kal)
    {
        kailashdetail col=servi.creation(kal);
        return col.getStaffname()+"update success";
    }

    //delete
    @DeleteMapping("/deletebyid/{id}")
    public String remove(@PathVariable("id")int id)
    {
        return servi.Deleting(id);
    }
    //read
    @GetMapping("/readbylist/{id}")
    public Optional<kailashdetail> gettingon(@PathVariable("id")int id)
    {
        return servi.readlist(id);
    }
}
