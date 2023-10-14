package userAnotation;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

public class Example
{
	private String subject;

	public void setSubject(String subject) {
		this.subject = subject;
	}

	public Example() {
		super();
		// TODO Auto-generated constructor stub
	}

	@Override
	public String toString() {
		return "Example [subject=" + subject + "]";
	}
	
	@PostConstruct
	public void Start()
	{
	System.out.println("Start");	
	}
	@PreDestroy
	public void End()
	{
	System.out.println("End");	
	}

}
