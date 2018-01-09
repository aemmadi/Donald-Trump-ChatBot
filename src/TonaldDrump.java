/**
 * TonaldDrump.java  11/4/2016
 *
 * @author - Anirudh R Emmadi
 * @author - Emmadi Anirudh
 * @author - ARE5037
 *
 * This is the Java Code for Tonald Drump, a chatbot that resembles Donald Trump.
 *
 */



import java.util.Random;
import java.util.*;

/**
 * The AP Comp Sci Magpie Assignment
 * by Anirudh Emmadi
 */

public class TonaldDrump
{
  private String previousStatement = "";   // Keeps track of what the user previously said.
  private String previousResponse = "";   // Keeps track of what the computer previously said.
  private String [][] keyboard = {   // An array that recreates a computer's keyboard
    { "q", "w", "e", "r", "t", "y", "u", "i", "o", "p"},
    { "a", "s", "d", "f", "g", "h", "j", "k", "l" },
    { "z", "x", "c", "v", "b", "n", "m" }
  };
  private String [] randomGreeting = {"We need somebody who can take the brand of the United States and make it great again. Ladies and gentlemen: I am officially running for president of the United States, and we are going to make our country great again.We need somebody who can take the brand of the United States and make it great again. Ladies and gentlemen: I am officially running for president of the United States, and we are going to make our country great again.",
 "Vote for me or Get FIRED !", "I am Tonald Drump - A digital copy of Donald Trump", "Let the Rich guy win and cut taxes" };   // An array of some random greetings

  public String getGreeting() {
    Random r = new Random();
    return randomGreeting [r.nextInt(randomGreeting.length)];
  }

  /**
   * Gives a response to a user statement
   * ASSIGNMENTS 2-3
   */


  public String getResponse(String statement) {
    String response = "";
    if (statement.trim().length() == 0) {   // Checks to make sure that the user typed in characters.
      response = "Stop wasting my time, I have a wall to build...";
    }
    else if (statement.equalsIgnoreCase(previousStatement)) {   // Checks to see if the user typed the same thing as they did before.
      response = "I might be a blonde old man, but I know you typed the same thing.";
    }
    else if (findKeyword(statement, "no") >= 0) {
      response = "WRONG";
    }
    else if (findKeyword(statement, "offended") >= 0) {
      response = "I dont care as long as my wall is being built";
    }
    else if (findKeyword(statement, "offensive") >= 0) {
      response = "I dont care as long as my wall is being built";
    }
    else if (findKeyword(statement, "Mr.G") >= 0 || findKeyword(statement, "Mr. G") >= 0) {
      response = "Oh yes, Mr. G is the one who is helping me build my wall";  // New response
   }
////   else if (findKeyword(statement, "who are you") >= 0 || findKeyword(statement, "what is your name") >= 0) {
   //   response = "I am Tonald Drump, Make America Great Again!";
 //   }
   else if (findKeyword(statement, "Version") >= 0) {
      response = "Version 1.4";  // New response
    }
 //   else if (findKeyword(statement, "Processing") >= 0) {
  //    response = "I thought only I was a robot....";  // New response

    else if (findKeyword(statement, "mother") >= 0 || findKeyword(statement, "father") >= 0 || findKeyword(statement, "sister") >= 0 || findKeyword(statement, "brother") >= 0) {
      response = "I dont care about your family as long as they don't interfere with my wall";
    }
    else if (findKeyword(statement, "Hillary Clinton") >= 0) {  // New keyword and response
      response = "Screw her and Obama! They made America into a total disaster" ;
    }
     else if (findKeyword(statement, "Hillary") >= 0) {  // New keyword and response
      response = "She will destroy U.S. She funds ISIS as a mean of solving the population crisis of the world!" ;
    }
    else if (findKeyword(statement, "Obamacare") >= 0 || (findKeyword(statement, "Obama Care") >= 0)) {  // New keyword and response
      response = "I will destroy them, once I am the President.";
    }
    else if (findKeyword(statement, "Coppell") >= 0) {  // New keyword and response
      response = "Is it in Mexico? I dont care...";
    }
    else if (findKeyword(statement, "bored") >= 0) {
      response = "Get the energy to trash talk Hillary  - http://www.bit.ly/CM_AniHD";
    }
    else if (findKeyword(statement, "color") >= 0) {
      response = "Red, I am going to paint my wall RED";
    }
    else if (findKeyword(statement, "blue") >= 0) {
      response = "If I see that, you are fired!";
    }
    else if (findKeyword(statement, "pizza") >= 0) {
      response = "Mmmm. Pizza.";
    }
    else if (findKeyword(statement, "Who made you") >= 0) {
      response = "I was made by Anirudh from 2nd Period Class";
    }
     else if (findKeyword(statement, "joke") >= 0) {
      response = "Donald Trump answers the question: What is 2+2? I have to say a lot of people have been asking this question. No, really. A lot of people come up to me and they ask me. They say, What's 2+2? And I tell them look, we know what 2+2 is. We've had almost eight years of the worst kind of math you can imagine. Oh my god, I can't believe it. Addition and subtraction of the 1s the 2s and the 3s. Its terrible. Its just terrible. Look, if you want to know what 2+2 is, do you want to know what 2+2 is?";
    }
else if (findKeyword(statement, "Hey") >= 0) {
      response = "Wanna make America Great Again !?";
    }
    else if (findKeyword(statement, "what will you do") >= 0 || findKeyword(statement, "America") >=0) {
      response = "Well, number one, I'd create economic zones. I'd create incentives for companies to move in. I'd work on spirit because the spirit is so low, it's incredible, the unemployment, you look at unemployment for black youth in this country, African American youth, is 58-59 percent. It's unthinkable. Unemployment for African Americans – not youth, but African Americans – is very high. And I would create in the inner cities, which is what I really do best, that's why when I open a building and I show you it's way ahead of schedule, under budget and everything else	—I think it was the Rite Aid store, the store in Baltimore it took them 20 years to get it built, one store, and then it burned down in one night—we have to create incentives for people to love what they are doing, and to make money. And to create, you know, to really create a better life for themselves.";
    }    else if (findKeyword(statement, "dog") >= 0 || findKeyword(statement, "cat") >= 0 || findKeyword(statement, "dogs") >= 0 || findKeyword(statement, "cats") >= 0) {
      response = "I will pass an amendment that restricts pets from leaving the house";  // New response
    }
    else if (findKeyword(statement, "thanks") >= 0 || findKeyword(statement, "thank you") >= 0) {
      response = "You are very welcome.";
    }
    else if (findKeyword(statement, "Hi") >= 0 || findKeyword(statement, "Hello") >= 0 ) {
      response = "Wanna make America Great Again !?";
    }

    else if (findKeyword(statement, "I want to", 0) >= 0) {
      response = transformIWantToStatement(statement);
    }
    else if (findKeyword(statement, "I want", 0) >=0) {   // New keyphrase
      response = transformIWantStatement(statement);
    }
       else if (findKeyword(statement, "nothing") >= 0) {
      response = "oh, you must be bored with your life";
       }
       else if (findKeyword(statement, "who are you") >= 0 || findKeyword(statement, "whats your name") >= 0) {
      response = "I am Tonald Drump, Digital Copy of Donald Trump";
       }
        else if (findKeyword(statement, "what is your name") >= 0) {
      response = "I am Tonald Drump, Digital Copy of Donald Trump";
       }
       else if (findKeyword(statement, "Trump") >= 0) {
      response = "What about Trump? I resemble him";
       }

    else {
      // Look for a two word (you <something> me)
      int psn = findKeyword(statement, "you", 0);
      int psnI = findKeyword(statement, "I", 0);
      if (psn >= 0 && findKeyword(statement, "me", psn) >= 0) {
        response = transformYouMeStatement(statement);
      }
      else if (psnI >= 0 && findKeyword(statement, "you", psn) >= 0) {   // New keyphrase
        response = transformIYouStatement(statement);
      }
      else {
        response = getRandomResponse();
      }
    }
    previousStatement = statement;
    previousResponse = response;
    response = spellingError(response);   // Adds a possible spelling error to the computer's response
    return response;
  }

  private String spellingError(String correctResponse) {
    String newResponse = correctResponse;
    int errorChance = (int)((Math.random()*(300)+1));   // Generates a random number between 1 and 300.
    int errorCharacter = 0;
    if (errorChance == 1) {   // Checks if the errorChance is 1 and generates an error if it is.
      do {
        errorCharacter = (int)((Math.random()*newResponse.length()-1)+1);   // Takes a random character from the computer's response
      } while(newResponse.toLowerCase().substring(errorCharacter, errorCharacter+1).compareTo("a") < 0 || newResponse.substring(errorCharacter, errorCharacter+1).compareTo("z") > 0);   // Checks to make sure that the random character is a letter
      int errorType = (int)((Math.random()*3));   // Generates a random number from 0 - 3
      if (errorType == 0) {   // Checks if the random number was 0.
        String differentCharacter = newCharacter(errorCharacter, newResponse);
        newResponse = newResponse.substring(0,errorCharacter) + differentCharacter + newResponse.substring(errorCharacter+1);   // Replaces the chosen character from the response with a letter that is either right or left of it on the keyboard.
      }
      else if (errorType == 1) {   // Checks if the random number was 1.
        newResponse = newResponse.substring(0,errorCharacter) + newResponse.substring(errorCharacter+1);   // Deletes the chosen character from the response.
      }
      else if (errorType == 2) {   // Checks if the random number was 2.
        String differentCharacter = newCharacter(errorCharacter, newResponse);
        newResponse = newResponse.substring(0,errorCharacter+1) + differentCharacter + newResponse.substring(errorCharacter+1);   // Adds a letter that is either right or left of the chosen character, on the keyboard.
      }
    }
    return newResponse;
  }

  private String newCharacter(int changedCharacter, String editedResponse) {   // A method to choose the new letter when a spelling error occurs. (Will only use the letter to the sides of the character that will be changed.
    int newX = 0;   // The x value of the new character on the keyboard (if the keyboard was on a graph.)
    int newY = 0;   // The y value of the new character on the keyboard (if the keyboard was on a graph.)
    boolean newCharacterFound = false;   // A boolean to keep track of whether a new letter has been chosen.
    for (int y = 0; y < 2; y++){
      for (int x = 0; x < 9; x++) {
        if (keyboard[y][x].equalsIgnoreCase(editedResponse.substring(changedCharacter, changedCharacter+1))) {   // Systematically cycles through every letter on the keyboard array and checks if it is the same letter as the one that will be changed in the computer's response.
          newY = y;   // Sets the new letter's y value to be that of the current y value in the for loop.
          do {
            newX = x;   // Sets the new letter's true x value to be that of the current x value in the for loop.
            if (newY == 0 && x == 9) {   // Checks if the changed letter is in the top row and the very right of the keyboard.
              newX = 8;   // Sets the new letter's x value to be 1 less than that of the changed letter's.
            }
            else if (newY == 1 && x == 8) {   // Checks if the changed letter is in the second row and the very right of the keyboard.
              newX = 7;   // Sets the new letter's x value to be 1 less than that of the changed letter's.
            }
            else if (newY == 2 && x == 6) {   // Checks if the changed letter is in the bottom row and the very right of the keyboard.
              newX = 5;   // Sets the new letter's x value to be 1 less than that of the changed letter's.
            }
            else if ((int)((Math.random()*2)+1) == 1) {   // Chooses 1 or 2 randomly.
              newX = x+1;   // Sets the new letter's x value to be 1 greater than that of the changed letter's.
            }
            else {
              newX = x-1;   // Sets the new letter's x value to be 1 less than that of the changed letter's.
            }
            newCharacterFound = true;
            if (newX < 0) {   // Checks to make sure the new letter's x value is not less than 0.
              newCharacterFound = false;
            }
          } while (newCharacterFound == false);
        }
      }
    }
    return keyboard[newY][newX];   // Returns the new letter from the keyboard
  }

  // ASSIGNMENT 4


  /**
   * Take a statement with "I want to <something>." and transform it into
   * "What would it mean to <something>?"
   * @param statement the user statement, assumed to contain "I want to"
   * @return the transformed statement
   */


  private String transformIWantToStatement(String statement) {
    //  Remove the final period, if there is one
    statement = statement.trim();
    String lastChar = statement.substring(statement.length() - 1);
    if (lastChar.equals(".")) {
      statement = statement.substring(0, statement.length() - 1);
    }
    int psn = findKeyword (statement, "I want to", 0);
    String restOfStatement = statement.substring(psn + 9).trim();
    return "What would it mean to " + restOfStatement + "?";
  }



  /**
   * Take a statement with "I want to <something>." and transform it into
   * "What would it mean to <something>?"
   * @param statement the user statement, assumed to contain "I want"
   * @return the transformed statement
   */

  // New transformation with reply
  private String transformIWantStatement(String statement) {
    //  Remove the final period, if there is one
    statement = statement.trim();
    String lastChar = statement.substring(statement.length() - 1);
    if (lastChar.equals(".")) {
      statement = statement.substring(0, statement.length() - 1);
    }
    int psn = findKeyword (statement, "I want to", 0);
    String restOfStatement = statement.substring(psn + 8).trim();
    return "Would you really be happy if you had " + restOfStatement + "?";
  }



  /**
   * Take a statement with "I <something> you." and transform it into
   * "Why do you <something> me?"
   * @param statement the user statement, assumed to contain "I" followed by "you"
   * @return the transformed statement
   */

  // New transformation with reply
  private String transformIYouStatement(String statement) {
    //  Remove the final period, if there is one
    statement = statement.trim();
    String lastChar = statement.substring(statement.length() - 1);
    if (lastChar.equals(".")) {
      statement = statement.substring(0, statement.length() - 1);
    }

    int psnIWant = findKeyword (statement, "I", 0);
    int psnYou = findKeyword (statement, "you", psnIWant + 1);
    String restOfStatement = statement.substring(psnIWant + 1, psnYou).trim();
    return "Why do you " + restOfStatement + " me?";
  }



  /**
   * Take a statement with "you <something> me" and transform it into
   * "What makes you think that I <something> you?"
   * @param statement the user statement, assumed to contain "you" followed by "me"
   * @return the transformed statement
   */
  private String transformYouMeStatement(String statement) {
    //  Remove the final period, if there is one
    statement = statement.trim();
    String lastChar = statement.substring(statement.length() - 1);
    if (lastChar.equals(".")) {
      statement = statement.substring(0, statement.length() - 1);
    }

    int psnOfYou = findKeyword (statement, "you", 0);
    int psnOfMe = findKeyword (statement, "me", psnOfYou + 3);

    String restOfStatement = statement.substring(psnOfYou + 3, psnOfMe).trim();
    return "What makes you think that I " + restOfStatement + " you?";
  }


  // Activity 3


  /**
   * Search for one word in phrase. The search is not case
   * sensitive. This method will check that the given goal
   * is not a substring of a longer string (so, for
   * example, "I know" does not contain "no").
   *
   * @param statement
   *      the string to search
   * @param goal
   *      the string to search for
   * @param startPos
   *      the character of the string to begin the
   *      search at
   * @return the index of the first occurrence of goal in
   *     statement or -1 if it's not found
   */



  private int findKeyword(String statement, String goal, int startPos) {
    String phrase = statement.trim();
    // The only change to incorporate the startPos is in the line below
    int psn = phrase.toLowerCase().indexOf(goal.toLowerCase(), startPos);

    // Refinement -- make sure the goal isn't part of a word
    while (psn >= 0) {
      // Find the string of length 1 before and after the word
      String before = " ", after = " ";
      if (psn > 0) {
        before = phrase.substring(psn - 1, psn).toLowerCase();
      }
      if (psn + goal.length() < phrase.length()) {
        after = phrase.substring(psn + goal.length(), psn + goal.length() + 1).toLowerCase();
      }
      // If before and after aren't letters, we've found the word
      if (((before.compareTo("a") < 0) || (before.compareTo("z") > 0)) // before is not a
            // letter
            && ((after.compareTo("a") < 0) || (after.compareTo("z") > 0))) {
        return psn;
      }
      // The last position didn't work, so let's find the next, if there is one.
      psn = phrase.indexOf(goal.toLowerCase(), psn + 1);

    }
    return -1;
  }


  private int findKeyword(String statement, String goal) {
    return findKeyword(statement, goal, 0);
  }


  // ACTIVITY 5


  /**
   * Pick a default response to use if nothing else fits.
   * @return a non-committal string
   */
  private String getRandomResponse () {
    Random r = new Random();
    return randomResponses [r.nextInt(randomResponses.length)];
  }
  private String [] randomResponses = { "We will have so much winning if I get elected that you may get bored with winning.",
  "It is very hard for them to attack me on looks, because I am so good looking.","The American Dream is dead. But if I get elected president I will bring it back bigger and better and stronger than ever before and we will make America great again.",
   "I have a star on the Hollywood Walk of Fame.", "Hillary won't call out radical Islam! She will be soundly defeated.",
   	"An extremely credible source has called my office and told me that Barack Obama's birth certificate is a fraud!",
   	"You know, it really doesn't matter what the media write as long as you've got a young, and beautiful, piece of ass.",
   	"I will build a great wall – and nobody builds walls better than me, believe me – and I'll build them very inexpensively. I will build a great, great wall on our southern border, and I will make Mexico pay for that wall. Mark my words.",
   	"The voting system is RIGGED", "You are disgusting!", "Hillary should be ashamed!", "Who in the world deletes 33,000 E-mails in 1 day?",
   	"Hillary's Phone got hacked and guess what she was talking to her husband - Im just thinking to myself right now, we should just cancel the election and just give it to Trump, right?",
   	"The beauty of me is that Im very rich.", "Sorry losers and haters, my I.Q. is one of the highest - and you all know it! Please don't feel insecure or stupid, its not your fault!",
   	"The concept of Global Warming was created by and for Chinese in order to make U.S. Manufacturing non - competitive",
   	"You know a funny thing, I get along with middle class and poor people, instead of rich people",
   	"As everybody knows, but the haters & losers refuse to acknowledge, I do not wear a wig. My hair may not be perfect but it's mine."
   		, "I think if this country gets any kinder or gentler, it's literally going to cease to exist.",
   		"Bing bing, bong bong, bing bing bing",
   		"How stupid are the people of Iowa?",
   			"I'm a negotiator, like you folks",
   			"I don't want to use the word 'screwed', but I screwed him.",
   				"I've always thought about the issue of nuclear war; it's a very important element in my thought process. It's the ultimate, the ultimate catastrophe, the biggest problem this world has,		 and nobody's focusing on the nuts and bolts of it. It's a little like sickness. People don't believe they're going to get sick until they do. Nobody wants to talk about it. I believe the greatest of all stupidities is people's believing it will never happen, because everybody knows how destructive it will be, so nobody uses weapons. What bullshit",
   				"Romney — I have a Gucci store that's worth more than Romney.",
   				"Donald Trump said to Trump while playing Trumps, “did u Trump…Trump?” He replied “No Trump I didn’t Trump while playing Trumps…Trump”, Trump then said “sounded like a Trumpet Trump, or did u do a Trump Trump that sounded like a Trumpet playing Trumps…Trump”, He replied “Hey is that Brian Kibbler, Kibbler Brian of Brian Kibbler Gaming…Kibbler Kibbler Brian Kibbler…?"
   					};
}
