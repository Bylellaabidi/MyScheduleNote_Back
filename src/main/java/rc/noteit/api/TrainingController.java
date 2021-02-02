package rc.noteit.api;

import java.util.List;
import java.util.Optional;

import javax.validation.ValidationException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;

import org.springframework.web.bind.annotation.RestController;

import rc.noteit.db.TrainingRepository;
import rc.noteit.model.Training;

@RestController
@RequestMapping("/api/training")
@CrossOrigin
public class TrainingController {
	
	@Autowired
	private TrainingRepository trainingRepository;
	
	 	 @GetMapping("/all")
	public List<Training> getTraining()
	{
		return trainingRepository.findAll();
	}

	 @GetMapping("/byTraining/{Id}")
	public Optional<Training> getTraining(@PathVariable Long id)
	{
		return trainingRepository.findById(id);
	}

	
	@PostMapping
	public Training save(@RequestBody Training T,BindingResult bindingResult)
	{
		 if (bindingResult.hasErrors()) {
	            throw new ValidationException();
	        }

		return trainingRepository.save(T);
	}
	
	
	@DeleteMapping("/{id}")
	public boolean delete(@PathVariable Long id)
	{
		 trainingRepository.deleteById(id);
		 return true;
	}
	

}
