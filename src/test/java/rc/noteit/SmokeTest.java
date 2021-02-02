package rc.noteit;

import static org.assertj.core.api.Assertions.assertThat;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import rc.noteit.api.EventController;
import rc.noteit.api.FeedbackController;
import rc.noteit.api.NoteController;
import rc.noteit.api.NotebookController;

@SpringBootTest
public class SmokeTest {

	@Autowired
	private EventController eventC;
	@Autowired
	private FeedbackController feedbackC;
	@Autowired
	private NotebookController notebookC;
	@Autowired
	private NoteController noteC;
	
	
	
	@Test
	void contextLoads() {
		assertThat(eventC).isNotNull();
		assertThat(feedbackC).isNotNull();
		assertThat(notebookC).isNotNull();
		assertThat(noteC).isNotNull();
	}
}
