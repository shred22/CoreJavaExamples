package jaxbDemo;

import java.util.List;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement
public class Question {

	
	private String questionName;
	
	private List<Answer> answers;
	
	public Question() {
		// TODO Auto-generated constructor stub
	}

	public Question(String questionName, List<Answer> answers) {
		super();
		this.questionName = questionName;
		this.answers = answers;
	}

	@XmlElement
	public String getQuestionName() {
		return questionName;
	}

	public void setQuestionName(String questionName) {
		this.questionName = questionName;
	}

	@XmlElement
	public List<Answer> getAnswers() {
		return answers;
	}

	public void setAnswers(List<Answer> answers) {
		this.answers = answers;
	}
	
	

}
