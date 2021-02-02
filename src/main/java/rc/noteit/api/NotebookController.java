package rc.noteit.api;

import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.*;
import rc.noteit.Mapper;
import rc.noteit.api.viewmodel.NotebookViewModel;
import rc.noteit.db.NotebookRepository;
import rc.noteit.model.Notebook;

import javax.validation.ValidationException;
import java.util.List;
import java.util.UUID;

/*
Requests can be tested using the built in HTTP Rest Client. Use the
examples found in 'noteit.http' file.
 */

@RestController
@RequestMapping("/api/")
@CrossOrigin
public class NotebookController {
    private NotebookRepository notebookRepository;
    private Mapper mapper;

    public NotebookController(NotebookRepository notebookRepository, Mapper mapper) {
        this.notebookRepository = notebookRepository;
        this.mapper = mapper;
    }

    @RequestMapping(value = "/notebooks", method = RequestMethod.GET)
    public List<Notebook> all() {
    	List<Notebook>  allCategories = this.notebookRepository.findAll();
        return allCategories;
    }

    @RequestMapping(value = "/notebooks", method = RequestMethod.POST)
    public Notebook save(@RequestBody NotebookViewModel notebookViewModel,
                         BindingResult bindingResult) {
        if (bindingResult.hasErrors()) {
            throw new ValidationException();
        }

        Notebook notebookEntity = this.mapper.convertToNotebookEntity(notebookViewModel);

        // save notebookEntity instance to db
        this.notebookRepository.save(notebookEntity);

        return notebookEntity;
    }

    @RequestMapping(value ="/deleteNotebook/{id}", method = RequestMethod.DELETE)
    public void delete(@PathVariable Long id) {
        this.notebookRepository.deleteById(id);
    }
}
