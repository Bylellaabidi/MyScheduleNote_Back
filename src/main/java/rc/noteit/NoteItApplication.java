package rc.noteit;


import java.text.DateFormat;
import java.text.SimpleDateFormat;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;

import rc.noteit.db.EventRepository;
import rc.noteit.db.NoteRepository;
import rc.noteit.db.NotebookRepository;
import rc.noteit.db.TrainingRepository;
import rc.noteit.model.Event;
import rc.noteit.model.Note;
import rc.noteit.model.Notebook;
import rc.noteit.model.Training;

@SpringBootApplication
public class NoteItApplication extends SpringBootServletInitializer implements CommandLineRunner{
	
	@Autowired
	private NoteRepository noteRepository; 
	@Autowired
	private NotebookRepository notebookRepository; 
	@Autowired
	private TrainingRepository trainingRepository;
	@Autowired 
	private EventRepository eventRepository;

    public static void main(String[] args) {
        SpringApplication.run(NoteItApplication.class, args);
    }

	@Override
	public void run(String... args) throws Exception {
		
        // Save a default notebook
//        Notebook defaultNotebook = new Notebook("Default");
//        this.notebookRepository.save(defaultNotebook);
//
//        Notebook quotesNotebook = new Notebook("Quotes");
//        this.notebookRepository.save(quotesNotebook);

        // Save the welcome note
//        Note note = new Note("Hello", "Welcome to Note It", defaultNotebook);
//        Note note1 = new Note("Hello", "Welcome to Note It", defaultNotebook);
//        Note note2 = new Note("Hello", "Welcome to Note It", defaultNotebook);
//        this.noteRepository.save(note);
//        this.noteRepository.save(note1);
//        this.noteRepository.save(note2);
//        // Save a quote note
//        Note quoteNote = new Note("Latin Quote", "Carpe Diem", quotesNotebook);
//        this.noteRepository.save(quoteNote);


        

		DateFormat df = new SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ss");
//		df.parse("2020-11-16T12:00:00")
		
//        Event e1 =new Event("Meeting",true, df.parse("2020-11-22T08:00:00"),df.parse("2020-11-22T18:00:00"));
//        Event e2 =new Event("Interview",false ,df.parse("2020-11-21T10:00:00"),df.parse("2020-11-21T16:00:00"));
//        Event e3 =new Event("Montée en competence", false,df.parse("2020-11-20T12:00:00"),df.parse("2020-11-20T13:00:00"));
//        
//        eventRepository.save(e1);
//        eventRepository.save(e2);
//        eventRepository.save(e3);
////        
        
        eventRepository.findAll().forEach(c->{
        	
        	System.out.println("Event : "+ c.getTitle() +" Date : "+c.getStartDate());
        });
//        notebookRepository.findAll().forEach(c->{
//			
//			System.out.println("Notebook :"+c.getName());
//		});
//	
	System.out.println("------------------------------------------------------------");
	noteRepository.findAll().forEach(c->{
			
			System.out.println("Note : "+c.getId()+" Date : "+c.getLastModifiedOn());
		});
	
        
        System.out.println("Initialized database");
		
	}
}