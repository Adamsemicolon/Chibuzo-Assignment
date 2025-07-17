import java.util.Scanner;
public class Nokia{
 public static void main(String[]args){

String messageInput;
String menu = """
       				MENU
           1-> Phone Book
           2-> Messages
           3-> Chat
           4-> Call Register
           5-> Tones
           6-> Settings
           7-> Call Divert
           8-> Games
           9-> Calculator
           10-> Reminders
           11-> Clock
           12-> Profiles
           13-> Sim Services
""";
   System.out.println(menu);
   Scanner inputReceiver = new Scanner(System.in);
   int userInput = inputReceiver.nextInt();
   switch(userInput){
           case 1-> {System.out.println("Phone Book");
String phoneBook = """
           1-> Search
	   2-> Service Nos.
	   3-> Add name
	   4-> Erase
	   5-> Edit
  	   6-> Assign tone
	   7-> Send b'card
	   8-> Options
	   9-> Speed dials
	   10-> Voice tags
""";
     System.out.println(phoneBook);
     userInput = inputReceiver.nextInt();
messageInput = String.valueOf(userInput);
     switch(userInput){
	   case 1-> System.out.print("Search");
           case 2-> System.out.print("Service Nos.");
	   case 3-> System.out.print("Add name");
	   case 4-> System.out.print("Erase");
	   case 5-> System.out.print("Edit");
	   case 6-> System.out.print("Assign tone");
	   case 7-> System.out.print("Send b'card");
	   case 8-> {System.out.print("Options");
String options= """
           1-> Type of view
           2-> Memory status
""";
    System.out.println(options);
    userInput = inputReceiver.nextInt();
    switch(userInput){
           case 1-> System.out.print("Type of view");
           case 2-> System.out.print("Memory status");
}
}
           case 9-> System.out.print("Speed dials");
	   case 10-> System.out.print("Voice tags");
}
}
	   case 2-> {System.out.println("Messages");
String messages = """
           1-> Write messages
	   2-> Inbox
	   3-> Outbox
	   4-> Picture messages
	   5-> Templates
	   6-> Smileys
	   7-> Message settings
	   8-> Info services
	   9-> Voice Mailbox number
	   10-> Service command editor
""";
    System.out.println(messages);
    userInput = inputReceiver.nextInt();
    switch(userInput){
          case 1-> System.out.print("Write messages");
          case 2-> System.out.print("Inbox");
          case 3-> System.out.print("Outbox");
	  case 4-> System.out.print("Picture messages");
	  case 5-> System.out.print("Templates");
	  case 6-> System.out.print("Smileys");
	  case 7-> {System.out.print("Message settings");
String messageSettings = """
          1-> Set1
	  2-> Common
""";
    System.out.println(messageSettings);
    userInput = inputReceiver.nextInt();
    switch(userInput){
          case 1-> {System.out.print("Set1");
String set1 = """
           1-> Message centre number
           2-> Messages sent as 
	   3-> Message validity
""";
    System.out.println(set1);
    userInput = inputReceiver.nextInt();
    switch(userInput){
          case 1-> System.out.print("Message centre number");
	  case 2-> System.out.print("Messages sent as");
	  case 3-> System.out.print("Message validity");
}
}
	  case 2-> {System.out.print("Common");
String common = """
          1-> Delivery reports
	  2-> Reply same centre
	  3-> Character support
""";
    System.out.println(common);
    userInput = inputReceiver.nextInt();
    switch(userInput){
          case 1-> System.out.print("Delivery reports");
	  case 2-> System.out.print("Reply same centre");
	  case 3-> System.out.print("Character support");
}
}
}
}
	  case 8-> System.out.print("Info services");
	  case 9-> System.out.print("Voice mailbox number");
	  case 10-> System.out.print("Service command editor");
}
}
	   case 3-> System.out.println("Chat");
	   case 4-> {System.out.println("Call Register");
String callRegister = """
	   1-> Missed calls
	   2-> Received calls
	   3-> Dialled numbers
	   4-> Erase recent calls
	   5-> Show call duration
	   6-> Show call costs
	   7-> Call cost settings
	   8-> Prepaid credit
""";
    System.out.println(callRegister);
    userInput = inputReceiver.nextInt();
    switch(userInput){
           case 1-> System.out.print("Missed calls");
	   case 2-> System.out.print("Received calls");
	   case 3-> System.out.print("Dialled numbers");
           case 4-> System.out.print("Erase recent calls");
	   case 5-> {System.out.print("Show call duration");
String showCallDuration = """
           1-> Last call duration
	   2-> All call's duration
	   3-> Received call's duration
	   4-> Dialled call's duration
	   5-> Clear timers
""";
    System.out.println(showCallDuration);
    userInput = inputReceiver.nextInt();
    switch(userInput){
    	   case 1-> System.out.print("Last call duration");
    	   case 2-> System.out.print("All call's duration");
 	   case 3-> System.out.print("Received call's duration");
	   case 4-> System.out.print("Dialled call's duration");
	   case 5-> System.out.print("Clear timers");
}
}
   	   case 6-> {System.out.print("Show call costs");
String showCallCosts = """
           1-> Last call cost
	   2-> All call's cost
	   3-> Clear counters
""";
    System.out.println(showCallCosts);
    userInput = inputReceiver.nextInt();
    switch(userInput){
	   case 1-> System.out.print("Last call costs");
	   case 2-> System.out.print("All call's cost");
	   case 3-> System.out.print("Clear counters");
}
}
	   case 7-> {System.out.print("Call cost settings");
String callCostSettings = """
           1-> Call cost limit
	   2-> Show costs in
""";
    System.out.println(callCostSettings);
    userInput = inputReceiver.nextInt();
    switch(userInput){
    	   case 1-> System.out.print("Call cost limit");
	   case 2-> System.out.print("Show costs in");

}
}
	   case 8-> System.out.print("Prepaid credit");
}
}
	   case 5-> {System.out.println("Tones");
String tones = """
           1-> Ringing tone
	   2-> Ringing volume
	   3-> Incoming call alert
	   4-> Composer
	   5-> Message alert tone
	   6-> Keypad tones
	   7-> Warning and games tones
	   8-> Vibrating alert
	   9-> Screen saver 
""";
    System.out.println(tones);
    userInput = inputReceiver.nextInt();
    switch(userInput){
           case 1-> System.out.print("Ringing tone");
	   case 2-> System.out.print("Rinigin volume");
	   case 3-> System.out.print("Incoming call alert");
	   case 4-> System.out.print("Composer");
	   case 5-> System.out.print("Message alert tone");
	   case 6-> System.out.print("Keypad tones");
	   case 7-> System.out.print("Warning and games tones");
	   case 8-> System.out.print("Vibrating alert");
	   case 9-> System.out.print("Screen saver");
}
}
	   case 6-> {System.out.println("Settings");
String settings = """
           1-> Call settings
	   2-> Phone settings
	   3-> Security settings
	   4-> Restore factory settings
""";
    System.out.println(settings);
    userInput = inputReceiver.nextInt();
    switch(userInput){
           case 1-> {System.out.print("Call settings");
String callSettings = """
           1-> Automatic redial
	   2-> Speed dialling
	   3->Call waiting options
	   4-> Own number sending
	   5-> Phone line in use
	   6-> Automatic answer
""";
    System.out.println(callSettings);
    userInput = inputReceiver.nextInt();
    switch(userInput){
           case 1-> System.out.print("Automatic redial");
	   case 2-> System.out.print("Speed dialling");
	   case 3-> System.out.print("Call waiting options");
	   case 4-> System.out.print("Own number sending");
	   case 5-> System.out.print("Phone line in use");
	   case 6-> System.out.print("Automatic answer");
}
}
	   case 2-> {System.out.print("Phone settings");
String phoneSettings = """
           1-> Language
	   2-> Cell info display
           3-> Welcome note
	   4-> Network selection
	   5-> Lights
	   6-> Confirm SIM service actions	   
""";
    System.out.println(phoneSettings);
    userInput = inputReceiver.nextInt();
    switch(userInput){
           case 1-> System.out.print("Language");
	   case 2-> System.out.print("Cell info display");
	   case 3-> System.out.print("Welcome note");
	   case 4-> System.out.print("Network selection");
	   case 5-> System.out.print("Lights");
	   case 6-> System.out.print("Confirm SIM service actions");
}
}
	   case 3-> {System.out.print("Security settings");
String securitySettings = """
           1-> Pin code request
	   2-> Call barring service
	   3-> Fixed dialling
	   4-> Closed user group
	   5-> Phone security
	   6-> Change access codes
""";
    System.out.println(securitySettings);
    userInput = inputReceiver.nextInt();
    switch(userInput){
	   case 1-> System.out.print("Pin code request");
	   case 2-> System.out.print("Call barring service");
	   case 3-> System.out.print("Fixed dialling");
	   case 4-> System.out.print("Closed user group");
	   case 5-> System.out.print("Phone security");
	   case 6-> System.out.print("Change access codes");
}
}
	   case 4-> System.out.print("Restore factory settings");
}
}
	   case 7-> System.out.println("Call Divert");
	   case 8-> System.out.println("Games");
	   case 9-> System.out.println("Calculator");
	   case 10-> System.out.println("Reminders");
	   case 11-> {System.out.println("Clock");
String clock = """
           1-> Alarm clock
	   2-> Clock settings
	   3-> Date settings
	   4-> Stopwatch
	   5-> Countdown timers
	   6-> Auto update of date and time
""";
    System.out.print(clock);
    userInput = inputReceiver.nextInt();
    switch(userInput){
           case 1-> System.out.print("Alarm clock");
	   case 2-> System.out.print("Clock settings");
	   case 3-> System.out.print("Date settings");
	   case 4-> System.out.print("Stopwatch");
	   case 5-> System.out.print("Countdown timers");
	   case 6-> System.out.print("Auto update of date and time");
}
}
    	   case 12-> System.out.println("Profiles");
	   case 13-> System.out.println("Sim Services");
}

}
}