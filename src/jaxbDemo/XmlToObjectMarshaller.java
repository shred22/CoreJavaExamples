package jaxbDemo;

import java.io.File;
import java.util.List;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Unmarshaller;

public class XmlToObjectMarshaller {

	public XmlToObjectMarshaller() {
		// TODO Auto-generated constructor stub
	}
	
	public static void main(String args[]) throws JAXBException {
	
		
		File xml = new File("C:\\Users\\admin\\workspace\\CoreJavaPrac\\questions.xml");
		JAXBContext ctx = JAXBContext.newInstance(Question.class);
		Unmarshaller unmarshaller = ctx.createUnmarshaller();
		Question questions = (Question) unmarshaller.unmarshal(xml);
		
		 System.out.println(" "+questions.getQuestionName());  
	        System.out.println("Answers:");  
	        List<Answer> list=questions.getAnswers();  
	        for(Answer ans:list)  
	          System.out.println(ans.getId()+" "+ans.getAnswerName()+"  "+ans.getPostedBy()); 
	}

}
