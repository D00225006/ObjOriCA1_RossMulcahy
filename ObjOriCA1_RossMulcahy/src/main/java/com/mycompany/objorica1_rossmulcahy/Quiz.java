package com.mycompany.objorica1_rossmulcahy;

import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;
/**
 *
 * @author Rossm
 */
public class Quiz 
{
    private static Random random = new Random();
    private static Scanner keyboard = new Scanner(System.in);
    
    public static void question5()
    {
        int randomNumber = random.nextInt(10);
        ArrayList<String> questions = questions();
        ArrayList<String> answers = answers();
        
        QandA(randomNumber, questions, answers);
    }
    
    public static ArrayList<String> questions()
    {
        ArrayList<String> questions = new ArrayList<String>();
        questions.add("What colour is the sun?");
        questions.add("Do fish sleep?");
        questions.add("Are there any vehicles that do not have gears?");
        questions.add("How many continents are there?");
        questions.add("Is magenta a real colour?");
        questions.add("How many licks does it take to get to the center of a tootsie?");
        questions.add("Are you intelligent?");
        questions.add("What is the name of the tenth planet in our Solar System?");
        questions.add("Who is famously quoted for having said 'Do you think God stays in heaven because he too, lives in fear of what he's created?'");
        questions.add("Who invented 'Yo momma' jokes");
        
        return questions;
    }
    
    public static ArrayList<String> answers()
    {
        ArrayList<String> answers = new ArrayList<String>();
        answers.add("white");
        answers.add("yes");
        answers.add("no");
        answers.add("7");
        answers.add("no");
        answers.add("364");
        answers.add("no");
        answers.add("planet nine");
        answers.add("dr romero");
        answers.add("william shakespeare");
        
        return answers;
    }
    
    public static void QandA(int random, ArrayList<String> questions, ArrayList<String> answers)
    {
        System.out.println(questions.get(random) + "\nPlease enter your answer:");
        String answer = keyboard.nextLine().toLowerCase();
        if(answer.equals(answers.get(random)))
        {
            System.out.println("Correct!");
        }
        else
        {
            System.out.println("Incorrect!");
        }
    }
}
