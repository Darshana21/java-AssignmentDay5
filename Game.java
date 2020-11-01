	package com.quizapplication;

public class Game {
 
	Question[] questions=new Question[5];
	Player player=new Player();
	
	String[] questionsdata={"Who is the stronger avenger?",
							"What is the closest planet to sun?",
							"What is the capital of australia"};
	String[] options1= {"ironman","Earth","Sydney"};
	String[] options2= {"Thor","venus","Melbourne"};
	String[] options3= {"Hulk","mercury","Perth"};
	String[] options4= {"Dr. Strange","jupiter","Canberra"};
	int[] answers= {2,3,4};
	
	
	public void initGame()
	{
		
		//created 5 objects
		for(int i=0;i<5;i++)
		{
			questions[i]=new Question();   
			
//single object array for all 5 questions
		}
//		questions[0].question="Who is the stronger avenger?";
//		questions[0].option1="ironman";
//		questions[0].option2="Thor";
//		questions[0].option3="Hulk";
//		questions[0].option4="Dr. Strange";//
//		questions[0].correctAnswer=2;
//		
//		questions[1].question="What is the closest planet to sun?";
//		questions[1].option1="Earth";
//		questions[1].option2="venus";
//		questions[1].option3="mercury";
//		questions[1].option4="jupiter";
//		questions[1].correctAnswer=3;
//		
//		
//		questions[2].question="What is the capital of australia";
//		questions[2].option1="Sydney";
//		questions[2].option2="Melbourne";
//		questions[2].option3="Perth";
//		questions[2].option4="Canberra";
//		questions[2].correctAnswer=4;
		
		for(int i=0;i<3;i++) 
		{
			questions[i].question=questionsdata[i];
			questions[i].option1=options1[i];
			questions[i].option2=options2[i];
			questions[i].option3=options3[i];
			questions[i].option4=options4[i];
			questions[i].correctAnswer=answers[i];
		}
//
	}
	
	
	//applying values to variables of the objects
	public void play()
	{
		
		player.getDetails();
		for (int i=0;i<3;i++)
		{
			
		 	boolean status=questions[i].askQuestion();
			if(status==true) {
				System.out.println("well played!");
				player.score++;
			}
			else{
				System.out.println("sorry I can't help you");
			}
		}
			
		System.out.println(player.name+" your score is "+player.score);
		
		
	}
	
	
}
