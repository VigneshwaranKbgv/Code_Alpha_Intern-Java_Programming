import java.util.*;

public class OnlineQuizPlatform {

	public static void main(String[] args) {
		
		//At first Will create 10 quiz question and answers and assign it to individual string variable
		
		String q1 = "Who invented Java Programming?\n"
				+ "a) Guido van Rossum\nb) James Gosling\nc) Dennis Ritchie\nd) Bjarne Stroustrup";
		
		String q2 = "Which statement is true about Java?\n"
				+ "a) Java is a sequence-dependent programming language\nb) Java is a code dependent programming language\nc) Java is a platform-dependent programming language\nd) Java is a platform-independent programming language";
		
		String q3 = "Which component is used to compile, debug and execute the java programs?\n"
				+ "a) JRE\nb) JIT\nc) JDK\nd) JVM";
		
		String q4 = "Which one of the following is not a Java feature?\n"
				+ "a) Object-oriented\nb) Use of pointers\nc) Portable\nd) Dynamic and Extensible";
		
		String q5 = "Which of these cannot be used for a variable name in Java?\n"
				+ "a) identifier & keyword\nb) identifier\nc) keyword\nd) none of the mentioned";
		
		String q6 = "What is the extension of java code files?\n"
				+ "a) .js\nb) .txt\nc) .class\nd) .java";
		
		String q7 = "Which environment variable is used to set the java path?\n"
				+ "a) MAVEN_Path\nb) JavaPATH\nc) JAVA\nd) JAVA_HOME";
		
		String q8 = "Which of the following is not an OOPS concept in Java?\n"
				+ "a) Polymorphism\nb) Inheritance\nc) Compilation\nd) Encapsulation";
		
		String q9 = "What is not the use of “this” keyword in Java?\n"
				+ "a) Referring to the instance variable when a local variable has the same name\nb) Passing itself to the method of the same class\nc) Passing itself to another method\nd) Calling another constructor in constructor chaining";
		
		String q10 = "Which of the following is a type of polymorphism in Java Programming?\n"
				+ "a) Multiple polymorphism\nb) Compile time polymorphism\nc) Multilevel polymorphism\nd) Execution time polymorphism";
		
		//create 10 question objects by passing string and answer into question class
		
		QuizQuestion[] questions = { new QuizQuestion(q1,"b"),
				new QuizQuestion(q2,"d"),
				new QuizQuestion(q3,"c"),
				new QuizQuestion(q4,"b"),
				new QuizQuestion(q5,"c"),
				new QuizQuestion(q6,"d"),
				new QuizQuestion(q7,"d"),
				new QuizQuestion(q8,"c"),
				new QuizQuestion(q9,"b"),
				new QuizQuestion(q10,"b")};
		
		takeTest(questions);

	}
	
	public static void takeTest(QuizQuestion[] questions)
	{
		int score = 0;
		Scanner input = new Scanner(System.in);
		
		for(int i=0; i<questions.length; i++) 
		{
			System.out.println(questions[i].question);
			System.out.println("Enter your option: ");
			String ans = input.nextLine().toLowerCase();
			while(!((ans.equals("a")) || (ans.equals("b")) || (ans.equals("c")) || (ans.equals("d")))) {
				System.out.println("Invalid Option. Please enter correct option: ");
				ans = input.nextLine().toLowerCase();
			}
			if(ans.equals(questions[i].answer))
			{
				score++;
			}
		}
		System.out.println("Your final score out of " + questions.length + " is : " + score);
		input.close();
	}

}
