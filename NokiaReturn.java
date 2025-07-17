import java.util.Scanner;
public class NokiaReturn{
 public static void main(String[]args){

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
while(true){
   System.out.println(menu);
   Scanner inputReceiver = new Scanner(System.in);
   System.out.println("Select an option or press 0 to exit");
   int userInput = inputReceiver.nextInt();
   if(userInput == 30) return;
   if(userInput == 0){
   System.out.println("End");
   break;
}
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
while(true){
     System.out.println(phoneBook);
     System.out.println("Select an option or press 0 to go backward, 30 to exit");
     userInput = inputReceiver.nextInt();
     if(userInput == 30) return;
     if(userInput == 0) break;
     switch(userInput){
	   case 1-> {System.out.println("Search");
     System.out.println("Press 0 to go back, 30 to exit");
     while(true){
     userInput = inputReceiver.nextInt();
     if(userInput == 30) return;
     if(userInput == 0) break;
     switch(userInput){
            default-> System.out.println("");
}
}
}

           case 2-> {System.out.println("Service Nos.");
     System.out.println("Press 0 to go back, 30 to exit");
     while(true){
     userInput = inputReceiver.nextInt();
     if(userInput == 30) return;
     if(userInput == 0) break;
     switch(userInput){
            default-> System.out.println("");
}
}
}
	   case 3-> {System.out.println("Add name");
     System.out.println("Press 0 to go back, 30 to exit");
     while(true){
     userInput = inputReceiver.nextInt();
     if(userInput == 30) return;
     if(userInput == 0) break;
     switch(userInput){
            default-> System.out.println("");
}
}
}
	   case 4-> {System.out.println("Erase");
     System.out.println("Press 0 to go back, 30 to exit");
     while(true){
     userInput = inputReceiver.nextInt();
     if(userInput == 30) return;
     if(userInput == 0) break;
     switch(userInput){
            default-> System.out.println("");
}
}
}
	   case 5-> {System.out.println("Edit");
     System.out.println("Press 0 to go back, 30 to exit");
     while(true){
     userInput = inputReceiver.nextInt();
     if(userInput == 30) return;
     if(userInput == 0)break;
     switch(userInput){
            default-> System.out.println("");
}
}
}
	   case 6-> {System.out.println("Assign tone");
     System.out.println("Press 0 to go back, 30 to exit");
     while(true){
     userInput = inputReceiver.nextInt();
     if(userInput == 30) return;
     if(userInput == 0) break;
     switch(userInput){
            default-> System.out.println("");
}
}
}
	   case 7-> {System.out.println("Send b'card");
     System.out.println("Press 0 to go back, 30 to exit");
     while(true){
     userInput = inputReceiver.nextInt();
     if(userInput == 30) return;
     if(userInput == 0) break;
     switch(userInput){
            default-> System.out.println("");
}
}
}
	   case 8-> {System.out.println("Options");
String options= """
           1-> Type of view
           2-> Memory status
""";
while(true){
     System.out.println(options);
     System.out.println("Select an option or press 0 to go backward, 30 to exit");
     userInput = inputReceiver.nextInt();
     if(userInput == 30) return;
     if(userInput == 0) break;
     switch(userInput){
           case 1-> {System.out.println("Type of view");
     System.out.println("Press 0 to go back, 30 to exit");
     while(true){
     userInput = inputReceiver.nextInt();
     if(userInput == 30) return;
     if(userInput == 0) break;
     switch(userInput){
            default-> System.out.println("");
}
}
}
           case 2-> {System.out.println("Memory status");
     System.out.println("Press 0 to go back, 30 to exit");
     while(true){
     userInput = inputReceiver.nextInt();
     if(userInput == 30) return;
     if(userInput == 0) break;
     switch(userInput){
            default-> System.out.println("");
}
}
}
	   default-> System.out.println("");
}
}
}
           case 9-> {System.out.println("Speed dials");
     System.out.println("Press 0 to go back, 30 to exit");
     while(true){
     userInput = inputReceiver.nextInt();
     if(userInput == 30) return;
     if(userInput == 0)break;
     switch(userInput){
            default-> System.out.println("");
}
}
}
	   case 10-> {System.out.println("Voice tags");
     while(true){
     System.out.println("Press 0 to go back, 30 to exit");
     //while(true){
     userInput = inputReceiver.nextInt();
     if(userInput == 30) return;
     if(userInput == 0) break;
     switch(userInput){
            default-> System.out.println("");
}
}
}
           default-> System.out.println("");
}
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
while(true){
    System.out.println(messages);
    System.out.println("Select an option or press 0 to go backward, 30 to exit");
    userInput = inputReceiver.nextInt();
    if(userInput == 30) return;
    if(userInput == 0) break;
    switch(userInput){
          case 1-> {System.out.println("Write messages");
     while(true){
     System.out.println("Press 0 to go back, 30 to exit");
     userInput = inputReceiver.nextInt();
     if(userInput == 30) return;
     if(userInput == 0) break;
     switch(userInput){
            default-> System.out.println("");
}
}
}
          case 2-> {System.out.println("Inbox");
     while(true){
     System.out.println("Press 0 to go back, 30 to exit");
     userInput = inputReceiver.nextInt();
     if(userInput == 30) return;
     if(userInput == 0) break;
     switch(userInput){
            default-> System.out.println("");
}
}
}
          case 3-> {System.out.println("Outbox");
     while(true){
     System.out.println("Press 0 to go back, 30 to exit");
     userInput = inputReceiver.nextInt();
     if(userInput == 30) return;
     if(userInput == 0) break;
     switch(userInput){
            default-> System.out.println("");
}
}
}
	  case 4-> {System.out.println("Picture messages");
     while(true){
     System.out.println("Press 0 to go back, 30 to exit");
     userInput = inputReceiver.nextInt();
     if(userInput == 30) return;
     if(userInput == 0) break;
     switch(userInput){
            default-> System.out.println("");
}
}
}
	  case 5-> {System.out.print("Templates");
     while(true){
     System.out.println("Press 0 to go back, 30 to exit");
     userInput = inputReceiver.nextInt();
     if(userInput == 30) return;
     if(userInput == 0) break;
     switch(userInput){
            default-> System.out.println("");
}
}
}
	  case 6-> {System.out.println("Smileys");
     while(true){
     System.out.println("Press 0 to go back, 30 to exit");
     userInput = inputReceiver.nextInt();
     if(userInput == 30) return;
     if(userInput == 0) break;
     switch(userInput){
            default-> System.out.println("");
}
}
}
	  case 7-> {System.out.print("Message settings");
String messageSettings = """
          1-> Set1
	  2-> Common
""";
while(true){
    System.out.println(messageSettings);
    System.out.println("Select an option or press 0 to go backward, 30 to exit");
    userInput = inputReceiver.nextInt();
    if(userInput == 30) return;
    if(userInput == 0) break;
    switch(userInput){
          case 1-> {System.out.println("Set1");
String set1 = """
           1-> Message centre number
           2-> Messages sent as 
	   3-> Message validity
""";
while(true){
    System.out.println(set1);
    System.out.println("Select an option or press 0 to backward, 30 to exit");
    userInput = inputReceiver.nextInt();
    if(userInput == 30) return;
    if(userInput == 0) break;
    switch(userInput){
          case 1-> {System.out.println("Message centre number");
    while(true){
    System.out.println("Press 0 to go back, 30 to exit");
    userInput = inputReceiver.nextInt();
    if(userInput == 30) return;
    if(userInput == 0) break;
    switch(userInput){
            default-> System.out.println("");
}
}
}
	  case 2-> {System.out.println("Messages sent as");
     while(true){
     System.out.println("Press 0 to go back, 30 to exit");
     userInput = inputReceiver.nextInt();
     if(userInput == 30) return;
     if(userInput == 0) break;
     switch(userInput){
            default-> System.out.println("");
}
}
}
	  case 3-> {System.out.println("Message validity");
     while(true){
     System.out.println("Press 0 to go back, 30 to exit");
     userInput = inputReceiver.nextInt();
     if(userInput == 30) return;
     if(userInput == 0) break;
     switch(userInput){
            default-> System.out.println("");
}
}
}
	  default-> System.out.println("");
}
}
}
	  case 2-> {System.out.println("Common");
String common = """
          1-> Delivery reports
	  2-> Reply same centre
	  3-> Character support
""";
while(true){
    System.out.println(common);
    System.out.println("Select an option or press 0 to backward, 30 to exit");
    userInput = inputReceiver.nextInt();
    if(userInput == 30) return;
    if(userInput == 0) break;
    switch(userInput){
          case 1-> {System.out.println("Delivery reports");
    while(true){
    System.out.println("Press 0 to go back, 30 to exit");
    userInput = inputReceiver.nextInt();
    if(userInput == 30) return;
    if(userInput == 0) break;
    switch(userInput){
            default-> System.out.println("");
}
}
}
	  case 2-> {System.out.println("Reply same centre");
    while(true){
    System.out.println("Press 0 to go back, 30 to exit");
    userInput = inputReceiver.nextInt();
    if(userInput == 30) return;
    if(userInput == 0) break;
    switch(userInput){
            default-> System.out.println("");
}
}
}
	  case 3-> {System.out.println("Character support");
     while(true){
     System.out.println("Press 0 to go back, 30 to exit");
     userInput = inputReceiver.nextInt();
     if(userInput == 30) return;
     if(userInput == 0) break;
     switch(userInput){
            default-> System.out.println("");
}
}
}
	  default-> System.out.println("");
}
}
}
}
}
}
	  case 8-> {System.out.println("Info services");
     while(true){
     System.out.println("Press 0 to go back, 30 to exit");
     userInput = inputReceiver.nextInt();
     if(userInput == 30) return;
     if(userInput == 0) break;
     switch(userInput){
            default-> System.out.println("");
}
}
}
	  case 9-> {System.out.print("Voice mailbox number");
     while(true){
     System.out.println("Press 0 to go back");
     userInput = inputReceiver.nextInt();
     if(userInput == 30) return;
     if(userInput == 0) break;
     switch(userInput){
            default-> System.out.println("");
}
}
}
	  case 10-> {System.out.println("Service command editor");
     while(true){
     System.out.println("Press 0 to go back, 30 to exit");
     userInput = inputReceiver.nextInt();
     if(userInput == 30) return;
     if(userInput == 0) break;
     switch(userInput){
            default-> System.out.println("");
}
}
}
	  default-> System.out.println("");
}
}
}
	   case 3-> {System.out.println("Chat");
     while(true){
     System.out.println("Press 0 to go back, 30 to exit");
     userInput = inputReceiver.nextInt();
     if(userInput == 30) return;
     if(userInput == 0) break;
     switch(userInput){
            default-> System.out.println("");
}
}
}
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
    while(true){
    System.out.println(callRegister);
    System.out.println("Select an option or press 0 to go backward, 30 to exit");
    userInput = inputReceiver.nextInt();
    if(userInput == 30) return;
    if(userInput == 0) break;
    switch(userInput){
           case 1-> {System.out.println("Missed calls");
while(true){
     System.out.println("Press 0 to go back, 30 to exit");
     userInput = inputReceiver.nextInt();
     if(userInput == 30) return;
     if(userInput == 0) break;
     switch(userInput){
            default-> System.out.println("");
}
}
}
	   case 2-> {System.out.println("Received calls");
while(true){
     System.out.println("Press 0 to go back, 30 to exit");
     userInput = inputReceiver.nextInt();
     if(userInput == 30) return;
     if(userInput == 0) break;
     switch(userInput){
            default-> System.out.println("");
}
}
}
	   case 3-> {System.out.println("Dialled numbers");
while(true){
     System.out.println("Press 0 to go back, 30 to exit");
     userInput = inputReceiver.nextInt();
     if(userInput == 30) return;
     if(userInput == 0) break;
     switch(userInput){
            default-> System.out.println("");
}
}
}
           case 4-> {System.out.println("Erase recent calls");
while(true){
     System.out.println("Press 0 to go back, 30 to exit");
     userInput = inputReceiver.nextInt();
     if(userInput == 30) return;
     if(userInput == 0) break;
     switch(userInput){
            default-> System.out.println("");
}
}
}
	   case 5-> {System.out.println("Show call duration");
String showCallDuration = """
           1-> Last call duration
	   2-> All call's duration
	   3-> Received call's duration
	   4-> Dialled call's duration
	   5-> Clear timers
""";
    while(true){
    System.out.println(showCallDuration);
    System.out.println("Select an option or press 0 to go backward, 30 to exit");
    userInput = inputReceiver.nextInt();
    if(userInput == 30) return;
    if(userInput == 0) break;
    switch(userInput){
    	   case 1-> {System.out.println("Last call duration");
while(true){
     System.out.println("Press 0 to go back, 30 to exit");
     userInput = inputReceiver.nextInt();
     if(userInput == 30) return;
     if(userInput == 0) break;
     switch(userInput){
            default-> System.out.println("");
}
}
}
    	   case 2-> {System.out.print("All call's duration");
while(true){
     System.out.println("Press 0 to go back, 30 to exit");
     userInput = inputReceiver.nextInt();
     if(userInput == 30) return;
     if(userInput == 0) break;
     switch(userInput){
            default-> System.out.println("");
}
}
}
 	   case 3-> {System.out.println("Received call's duration");
while(true){
     System.out.println("Press 0 to go back, 30 to exit");
     userInput = inputReceiver.nextInt();
     if(userInput == 30) return;
     if(userInput == 0) break;
     switch(userInput){
            default-> System.out.println("");
}
}
}
	   case 4-> {System.out.println("Dialled call's duration");
while(true){
     System.out.println("Press 0 to go back, 30 to exit");
     userInput = inputReceiver.nextInt();
     if(userInput == 30) return;
     if(userInput == 0) break;
     switch(userInput){
            default-> System.out.println("");
}
}
}
	   case 5-> {System.out.println("Clear timers");
while(true){
     System.out.println("Press 0 to go back, 30 to exit");
     userInput = inputReceiver.nextInt();
     if(userInput == 30) return;
     if(userInput == 0) break;
     switch(userInput){
            default-> System.out.println("");
}
}
}
	   default-> System.out.println("");
}
}
}
   	   case 6-> {System.out.print("Show call costs");
String showCallCosts = """
           1-> Last call cost
	   2-> All call's cost
	   3-> Clear counters
""";
    while(true){
    System.out.println(showCallCosts);
    System.out.println("Select an option or press 0 to go backward, 30 to exit");
    userInput = inputReceiver.nextInt();
    if(userInput == 30) return;
    if(userInput == 0) break;
    switch(userInput){
	   case 1-> {System.out.println("Last call costs");
while(true){
     System.out.println("Press 0 to go back, 30 to exit");
     userInput = inputReceiver.nextInt();
     if(userInput == 30) return;
     if(userInput == 0) break;
     switch(userInput){
            default-> System.out.println("");
}
}
}
	   case 2-> {System.out.println("All call's cost");
while(true){
     System.out.println("Press 0 to go back, 30 to exit");
     userInput = inputReceiver.nextInt();
     if(userInput == 30) return;
     if(userInput == 0) break;
     switch(userInput){
            default-> System.out.println("");
}
}
}
	   case 3-> {System.out.println("Clear counters");
while(true){
     System.out.println("Press 0 to go back, 30 to exit");
     userInput = inputReceiver.nextInt();
     if(userInput == 30) return;
     if(userInput == 0) break;
     switch(userInput){
            default-> System.out.println("");
}
}
}
	   default-> System.out.println("");
}
}
}
	   case 7-> {System.out.println("Call cost settings");
String callCostSettings = """
           1-> Call cost limit
	   2-> Show costs in
""";
    while(true){
    System.out.println(callCostSettings);
    System.out.println("Select an option or press 0 to go backward, 30 to exit");
    userInput = inputReceiver.nextInt();
    if(userInput == 30) return;
    if(userInput == 0) break;
    switch(userInput){
    	   case 1-> {System.out.println("Call cost limit");
while(true){
     System.out.println("Press 0 to go back, 30 to exit");
     userInput = inputReceiver.nextInt();
     if(userInput == 30) return;
     if(userInput == 0) break;
     switch(userInput){
            default-> System.out.println("");
}
}
}
	   case 2-> {System.out.println("Show costs in");
while(true){
     System.out.println("Press 0 to go back, 30 to exit");
     userInput = inputReceiver.nextInt();
     if(userInput == 30) return;
     if(userInput == 0) break;
     switch(userInput){
            default-> System.out.println("");
}
}
}
	   default-> System.out.println("");

}
}
}
	   case 8-> {System.out.println("Prepaid credit");
while(true){
     System.out.println("Press 0 to go back, 30 to exit");
     userInput = inputReceiver.nextInt();
     if(userInput == 30) return;
     if(userInput == 0) break;
     switch(userInput){
            default-> System.out.println("");
}
}
}
	   default-> System.out.println("");
}
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
    while(true){
    System.out.println(tones);
    System.out.println("Select an option or press 0 to go backward, 30 to exit");
    userInput = inputReceiver.nextInt();
    if(userInput == 30) return;
    if(userInput == 0) break;
    switch(userInput){
           case 1-> {System.out.println("Ringing tone");
while(true){
     System.out.println("Press 0 to go back, 30 to exit");
     userInput = inputReceiver.nextInt();
     if(userInput == 30) return;
     if(userInput == 0) break;
     switch(userInput){
            default-> System.out.println("");
}
}
}
	   case 2-> {System.out.println("Ringing volume");
while(true){
     System.out.println("Press 0 to go back, 30 to exit");
     userInput = inputReceiver.nextInt();
     if(userInput == 30) return;
     if(userInput == 0) break;
     switch(userInput){
            default-> System.out.println("");
}
}
}
	   case 3-> {System.out.println("Incoming call alert");
while(true){
     System.out.println("Press 0 to go back, 30 to exit");
     userInput = inputReceiver.nextInt();
     if(userInput == 30) return;
     if(userInput == 0) break;
     switch(userInput){
            default-> System.out.println("");
}
}
}
	   case 4-> {System.out.println("Composer");
while(true){
     System.out.println("Press 0 to go back, 30 to exit");
     userInput = inputReceiver.nextInt();
     if(userInput == 30) return;
     if(userInput == 0) break;
     switch(userInput){
            default-> System.out.println("");
}
}
}
	   case 5-> {System.out.println("Message alert tone");
while(true){
     System.out.println("Press 0 to go back, 30 to exit");
     userInput = inputReceiver.nextInt();
     if(userInput == 30) return;
     if(userInput == 0) break;
     switch(userInput){
            default-> System.out.println("");
}
}
}
	   case 6-> {System.out.println("Keypad tones");
while(true){
     System.out.println("Press 0 to go back, 30 to exit");
     userInput = inputReceiver.nextInt();
     if(userInput == 30) return;
     if(userInput == 0) break;
     switch(userInput){
            default-> System.out.println("");
}
}
}
	   case 7-> {System.out.println("Warning and games tones");
while(true){
     System.out.println("Press 0 to go back, 30 to exit");
     userInput = inputReceiver.nextInt();
     if(userInput == 30) return;
     if(userInput == 0) break;
     switch(userInput){
            default-> System.out.println("");
}
}
}
	   case 8-> {System.out.println("Vibrating alert");
while(true){
     System.out.println("Press 0 to go back, 30 to exit");
     userInput = inputReceiver.nextInt();
     if(userInput == 30) return;
     if(userInput == 0) break;
     switch(userInput){
            default-> System.out.println("");
}
}
}
	   case 9-> {System.out.println("Screen saver");
while(true){
     System.out.println("Press 0 to go back, 30 to exit");
     userInput = inputReceiver.nextInt();
     if(userInput == 30) return;
     if(userInput == 0) break;
     switch(userInput){
            default-> System.out.println("");
}
}
}
	   default-> System.out.println("");
}
}
}
	   case 6-> {System.out.println("Settings");
String settings = """
           1-> Call settings
	   2-> Phone settings
	   3-> Security settings
	   4-> Restore factory settings
""";
    while(true){
    System.out.println(settings);
    System.out.println("Select an option or press 0 to go backward, 30 to exit");
    userInput = inputReceiver.nextInt();
    if(userInput == 30) return;
    if(userInput == 0) break;
    switch(userInput){
           case 1-> {System.out.println("Call settings");
String callSettings = """
           1-> Automatic redial
	   2-> Speed dialling
	   3->Call waiting options
	   4-> Own number sending
	   5-> Phone line in use
	   6-> Automatic answer
""";
    while(true){
    System.out.println(callSettings);
    System.out.println("Select an option or press 0 to go backward, 30 to exit");
    userInput = inputReceiver.nextInt();
    if(userInput == 30) return;
    if(userInput == 0)break;
    switch(userInput){
           case 1-> {System.out.println("Automatic redial");
while(true){
     System.out.println("Press 0 to go back, 30 to exit");
     userInput = inputReceiver.nextInt();
     if(userInput == 30) return;
     if(userInput == 0) break;
     switch(userInput){
            default-> System.out.println("");
}
}
}
	   case 2-> {System.out.println("Speed dialling");
while(true){
     System.out.println("Press 0 to go back, 30 to exit");
     userInput = inputReceiver.nextInt();
     if(userInput == 30) return;
     if(userInput == 0) break;
     switch(userInput){
            default-> System.out.println("");
}
}
}
	   case 3-> {System.out.println("Call waiting options");
while(true){
     System.out.println("Press 0 to go back, 30 to exit");
     userInput = inputReceiver.nextInt();
     if(userInput == 30) return;
     if(userInput == 0) break;
     switch(userInput){
            default-> System.out.println("");
}
}
}
	   case 4-> {System.out.println("Own number sending");
while(true){
     System.out.println("Press 0 to go back, 30 to exit");
     userInput = inputReceiver.nextInt();
     if(userInput == 30) return;
     if(userInput == 0) break;
     switch(userInput){
            default-> System.out.println("");
}
}
}
	   case 5-> {System.out.println("Phone line in use");
while(true){
     System.out.println("Press 0 to go back, 30 to exit");
     userInput = inputReceiver.nextInt();
     if(userInput == 30) return;
     if(userInput == 0) break;
     switch(userInput){
            default-> System.out.println("");
}
}
}
	   case 6-> {System.out.println("Automatic answer");
while(true){
     System.out.println("Press 0 to go back, 30 to exit");
     userInput = inputReceiver.nextInt();
     if(userInput == 30) return;
     if(userInput == 0) break;
     switch(userInput){
            default-> System.out.println("");
}
}
}
   	   default-> System.out.println("");
}
}
}
	   case 2-> {System.out.println("Phone settings");
String phoneSettings = """
           1-> Language
	   2-> Cell info display
           3-> Welcome note
	   4-> Network selection
	   5-> Lights
	   6-> Confirm SIM service actions	   
""";
    while(true){
    System.out.println(phoneSettings);
    System.out.println("Select an option or press 0 to go backward, 30 to exit");
    userInput = inputReceiver.nextInt();
    if(userInput == 30) return;
    if(userInput == 0) break;
    switch(userInput){
           case 1-> {System.out.println("Language");
while(true){
     System.out.println("Press 0 to go back, 30 to exit");
     userInput = inputReceiver.nextInt();
     if(userInput == 30) return;
     if(userInput == 0) break;
     switch(userInput){
            default-> System.out.println("");
}
}
}
	   case 2-> {System.out.println("Cell info display");
while(true){
     System.out.println("Press 0 to go back, 30 to exit");
     userInput = inputReceiver.nextInt();
     if(userInput == 30) return;
     if(userInput == 0) break;
     switch(userInput){
            default-> System.out.println("");
}
}
}
	   case 3-> {System.out.println("Welcome note");
while(true){
     System.out.println("Press 0 to go back, 30 to exit");
     userInput = inputReceiver.nextInt();
     if(userInput == 30) return;
     if(userInput == 0) break;
     switch(userInput){
            default-> System.out.println("");
}
}
}
	   case 4-> {System.out.println("Network selection");
while(true){
     System.out.println("Press 0 to go back, 30 to exit");
     userInput = inputReceiver.nextInt();
     if(userInput == 30) return;
     if(userInput == 0) break;
     switch(userInput){
            default-> System.out.println("");
}
}
}
	   case 5-> {System.out.println("Lights");
while(true){
     System.out.println("Press 0 to go back, 30 to exit");
     userInput = inputReceiver.nextInt();
     if(userInput == 30) return;
     if(userInput == 0) break;
     switch(userInput){
            default-> System.out.println("");
}
}
}
	   case 6-> {System.out.println("Confirm SIM service actions");
while(true){
     System.out.println("Press 0 to go back, 30 to exit");
     userInput = inputReceiver.nextInt();
     if(userInput == 30) return;
     if(userInput == 0) break;
     switch(userInput){
            default-> System.out.println("");
}
}
}
           default-> System.out.println("");
}
}
}
	   case 3-> {System.out.println("Security settings");
String securitySettings = """
           1-> Pin code request
	   2-> Call barring service
	   3-> Fixed dialling
	   4-> Closed user group
	   5-> Phone security
	   6-> Change access codes
""";
    while(true){
    System.out.println(securitySettings);
    System.out.println("Select an option or press 0 to go backward, 30 to exit");
    userInput = inputReceiver.nextInt();
    if(userInput == 30) return;
    if(userInput == 0) break;
    switch(userInput){
	   case 1-> {System.out.println("Pin code request");
while(true){
     System.out.println("Press 0 to go back, 30 to exit");
     userInput = inputReceiver.nextInt();
     if(userInput == 30) return;
     if(userInput == 0) break;
     switch(userInput){
            default-> System.out.println("");
}
}
}
	   case 2-> {System.out.println("Call barring service");
while(true){
     System.out.println("Press 0 to go back, 30 to exit");
     userInput = inputReceiver.nextInt();
     if(userInput == 30) return;
     if(userInput == 0) break;
     switch(userInput){
            default-> System.out.println("");
}
}
}
	   case 3-> {System.out.println("Fixed dialling");
while(true){
     System.out.println("Press 0 to go back, 30 to exit");
     userInput = inputReceiver.nextInt();
     if(userInput == 30) return;
     if(userInput == 0) break;
     switch(userInput){
            default-> System.out.println("");
}
}
}
	   case 4-> {System.out.println("Closed user group");
while(true){
     System.out.println("Press 0 to go back, 30 to exit");
     userInput = inputReceiver.nextInt();
     if(userInput == 30) return;
     if(userInput == 0) break;
     switch(userInput){
            default-> System.out.println("");
}
}
}
	   case 5-> {System.out.println("Phone security");
while(true){
     System.out.println("Press 0 to go back, 30 to exit");
     userInput = inputReceiver.nextInt();
     if(userInput == 30) return;
     if(userInput == 0) break;
     switch(userInput){
            default-> System.out.println("");
}
}
}
	   case 6-> {System.out.println("Change access codes");
while(true){
     System.out.println("Press 0 to go back, 30 to exit");
     userInput = inputReceiver.nextInt();
     if(userInput == 30) return;
     if(userInput == 0) break;
     switch(userInput){
            default-> System.out.println("");
}
}
}
           default-> System.out.println("");
}
}
}
	   case 4-> {System.out.println("Restore factory settings");
while(true){
     System.out.println("Press 0 to go back, 30 to exit");
     userInput = inputReceiver.nextInt();
     if(userInput == 0) return;
     if(userInput == 0) break;
     switch(userInput){
            default-> System.out.println("");
}
}
}
}
}
}
	   case 7-> {System.out.println("Call Divert");
while(true){
     System.out.println("Press 0 to go back, 30 to exit");
     userInput = inputReceiver.nextInt();
     if(userInput == 30) return;
     if(userInput == 0) break;
     switch(userInput){
            default-> System.out.println("");
}
}
}
	   case 8-> {System.out.println("Games");
while(true){
     System.out.println("Press 0 to go back, 30 to exit");
     userInput = inputReceiver.nextInt();
     if(userInput == 30) return;
     if(userInput == 0) break;
     switch(userInput){
            default-> System.out.println("");
}
}
}
	   case 9-> {System.out.println("Calculator");
while(true){
     System.out.println("Press 0 to go back, 30 to exit");
     userInput = inputReceiver.nextInt();
     if(userInput == 30) return;
     if(userInput == 0)break;
     switch(userInput){
            default-> System.out.println("");
}
}
}
	   case 10-> {System.out.println("Reminders");
while(true){
     System.out.println("Press 0 to go back, 30 to exit");
     userInput = inputReceiver.nextInt();
     if(userInput == 30) return;
     if(userInput == 0) break;
     switch(userInput){
            default-> System.out.println("");
}
}
}
	   case 11-> {System.out.println("Clock");
String clock = """
           1-> Alarm clock
	   2-> Clock settings
	   3-> Date settings
	   4-> Stopwatch
	   5-> Countdown timers
	   6-> Auto update of date and time
""";
    while(true){
    System.out.print(clock);
    System.out.println("Select an option or press 0 to go backward, 30 to exit");
    userInput = inputReceiver.nextInt();
    if(userInput == 30) return;
    if(userInput == 0) break;
    switch(userInput){
           case 1-> {System.out.println("Alarm clock");
while(true){
     System.out.println("Press 0 to go back, 30 to exit");
     userInput = inputReceiver.nextInt();
     if(userInput == 30) return;
     if(userInput == 0) break;
     switch(userInput){
            default-> System.out.println("");
}
}
}
	   case 2-> {System.out.println("Clock settings");
while(true){
     System.out.println("Press 0 to go back, 30 to exit");
     userInput = inputReceiver.nextInt();
     if(userInput == 30) return;
     if(userInput == 0) break;
     switch(userInput){
            default-> System.out.println("");
}
}
}
	   case 3-> {System.out.println("Date settings");
while(true){
     System.out.println("Press 0 to go back, 30 to exit");
     userInput = inputReceiver.nextInt();
     if(userInput == 30) return;
     if(userInput == 0) break;
     switch(userInput){
            default-> System.out.println("");
}
}
}
	   case 4-> {System.out.println("Stopwatch");
while(true){
     System.out.println("Press 0 to go back, 30 to exit");
     userInput = inputReceiver.nextInt();
     if(userInput == 30) return;
     if(userInput == 0) break;
     switch(userInput){
            default-> System.out.println("");
}
}
}
	   case 5-> {System.out.println("Countdown timers");
while(true){
     System.out.println("Press 0 to go back, 30 to exit");
     userInput = inputReceiver.nextInt();
     if(userInput == 30)return;
     if(userInput == 0)break;
     switch(userInput){
            default-> System.out.println("");
}
}
}
	   case 6-> {System.out.println("Auto update of date and time");
while(true){
     System.out.println("Press 0 to go back, 30 to exit");
     userInput = inputReceiver.nextInt();
     if(userInput == 30) return;
     if(userInput == 0)break;
     switch(userInput){
            default-> System.out.println("");
}
}
}
           default-> System.out.println("");
}
}
}
    	   case 12-> {System.out.println("Profiles");
while(true){
     System.out.println("Press 0 to go back, 30 to exit");
     userInput = inputReceiver.nextInt();
     if(userInput == 30) return;
     if(userInput == 0) break;
     switch(userInput){
            default-> System.out.println("");
}
}
}
	   case 13-> {System.out.println("Sim Services");
while(true){
     System.out.println("Press 0 to go back, 30 to exit");
     userInput = inputReceiver.nextInt();
     if(userInput == 30) return;
     if(userInput == 0) break;
     switch(userInput){
            default-> System.out.println("");
}
}
}
           default-> System.out.println("");
}
}
}
}