import com.example.demo.Repository.PrinterRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PrinterService {

    @Autowired
    private PrinterRepository repository;

    public List<Printer>listAll(){

        return repository.findAll();
    }

    public void save(Printer printer){
        repository.save(printer);
    }

    public Printer get(Integer id){
        return repository.findById(id).get();
    }

    public void Delete(Integer id){
        repository.deleteById(id);

    }





}
