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
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import rc.noteit.db.EventRepository;
import rc.noteit.model.Event;
import rc.noteit.model.Training;

@RestController
@RequestMapping("/api/")
@CrossOrigin
public class EventController {
	
	
	@Autowired
	private EventRepository eventRepository;
	
	

	@RequestMapping(value = "/events", method = RequestMethod.GET)
	public List<Event> getEvents()
	{
		return eventRepository.findAll();
	}

	@RequestMapping(value = "/eventbyId/{id}", method = RequestMethod.GET)
	public Optional<Event> getEvent(@PathVariable Long id)
	{
		return eventRepository.findById(id);
	}

	
	 @RequestMapping(value = "/event", method = RequestMethod.POST)
	public Event save(@RequestBody Event E,BindingResult bindingResult)
	{
		 if (bindingResult.hasErrors()) {
	            throw new ValidationException();
	        }

		return eventRepository.save(E);
	}
	
	
	  @RequestMapping(value ="/deleteEvent/{id}", method = RequestMethod.DELETE)
	public boolean delete(@PathVariable Long id)
	{
		 eventRepository.deleteById(id);
		 return true;
	}
	
	 
	  @RequestMapping(value ="/")
		public String greeting()
		{
			 
			 return "Hello, world";
		}

}
