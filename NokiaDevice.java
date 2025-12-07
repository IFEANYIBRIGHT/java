import java.util.Scanner;
public class NokiaDevice{
    public static void main(String... args){
    Scanner input = new Scanner(System.in);

   
    String nokiaPhoneBook = """

        list of phoneBook functions
            
               1.Phone book
               2.Messages
               3.Chat
               4.Call register
               5.Tones
               6.Settings
               7.Call divert
               8.Games           
               9. Calculator
               10.Reminders  
               11. Clock
               12. Profiles
               13. SIM services 
   """;
     
     System.out.println(nokiaPhoneBook);
    System.out.println(" Enter options:");
    int phone = input.nextInt();
    switch(phone) {
      
        case 1:            
              String options = """
                Phone book
                  press 1- Search
                  press 2- Service Nos
                  press 3- Add name
                  press 4- Erase
                  press 5- Edit
                  press 6- Assign tone
                  press 7- Send b’card
                  press 8- Options
                  press 9- Speed dials
                  press 10- Voice tags
                  """; 

    System.out.println(options);
    System.out.println("press a number: ");
    int search = input.nextInt();
    switch(search) {
             case 1:
                    System.out.println("Search for your option...  ");
                    break;
             case 2:
                     System.out.println(" Service Nos ");
                    break;
             case 3:        
                    System.out.println(" Add name ");
                    break;
             case 4:
                    System.out.println("Erase ");
                    break;
             case 5:
                    System.out.println("Edit ");
                    break;
             case 6: 
                  System.out.println(" Assign tone");
                    break;
  
             case 7:
                  System.out.println("Send b’card ");
                    break;
   
             case 8:
                   System.out.println(" options");
                   
                 break; 
                
      
             default:
                     System.out.println("What else are u looking for");
    
    
    }
                        String menuOptions = """
                            Menu options
                                 1. Type of view
                                 2. Memory status
                                  """;
                        System.out.print(menuOptions);
                        System.out.println("Choose an option");
                        int choose = input.nextInt();  
    
        switch(choose) {      
            case 1:
                  System.out.println(" Type of view required ");
                    break;
            case 2:
                  System.out.println(" memory status ");
                    break;
        default :
                 System.out.println("invalid button  ");
                        
                    
    

                case 9:
                      System.out.println(" Speed dials  ");
                    break;
                case 10:
                       System.out.println("Voice tags ");
                    break;
                
                     
      }

    }        

                     String messages ="""
                        Messages
                        1. Write messages
                        2. Inbox
                        3. Outbox
                        4. Picture messages
                        5. Templates
                        6. Smileys
                        7. Message settings 
                        8. Info service
                        9. Voice mailbox number
                        10.Service command editor
                        """;
                           System.out.println(messages);
                           System.out.println("press an option: ");
                           int writemessage = input.nextInt();

    
        switch(writemessage) {
            case 1:
                  System.out.println(" Write message ");
                    break;
                  
            case 2:
                  System.out.println("Inbox ");
                    break;
            case 3:
                  System.out.println(" Outbox ");
                    break;
            case 4:
                   System.out.println(" Picture messages ");
                    break;
            case 5:
                   System.out.println(" Templates ");
                    break;
            case 6:
                   System.out.println("Smiley ");
                    break;
            case 7:
                   System.out.println(" Message settings ");
                    break;
            default :
                 System.out.println("invalid button  ");
                      
                String Set1 = """
                               Sets
                                 1.Message centre number
                                 2.Messages sent as
                                 3.Message validity
                                  """;
                        System.out.print(Set1);
                        System.out.println("Message settings:");
                        int messageSetting = input.nextInt();  
    
         switch(messageSetting) {
                        case 1:
                             System.out.println(" Message centre number");
                             break; 
                        case 2:
                             System.out.println(" Messages sent as  ");
                             break;
                        case 3:
                             System.out.println(" Message validity  ");
                             break;
                        default:
                            System.out.println("invalid button  ");
             
                 String Common = """
                                 Common
                                 1.Delivery reports
                                 2.Reply via same centre
                                 3.Character support
                                  """;
                        System.out.print(Common);
                        System.out.println("Issues and reports: ");
                        int deliveryReport  = input.nextInt();        
        switch(deliveryReport) {
                           case 1:
                                System.out.println("Delivery reports :");
                             break; 
                            case 2:
                                System.out.println(" Reply via same centre: ");
                             break; 
                            case 3:
                                 System.out.println(" Character support: ");
                             break; 
                         default:
                            System.out.println("invalid button  ");

                            case 8:
                                System.out.println("Info service :");
                             break; 
                             case 9:
                               System.out.println("Voice mailbox number:");
                             break; 
                            case 10:
                                 System.out.println("Service command editor:");
                             break; 
                               
                                                                                                                                                
  }



    }

  }


                      
                String Set1 = """
                           lets talk
                             1.Chat
                                """;
                        System.out.print(Set1);
                        System.out.println("lets talk ");
                        int chat = input.nextInt();  
    
        switch(chat) {
                  case 1:
                     System.out.println(" Chat");
                      break; 
                      default:
                        System.out.println("end of the road");
   }                             


               String callRegister = """
                          Call register
                            1.Missed calls
                            2. Received calls
                            3. Dialled numbers
                            4. Erase recent call lists
                            5. Show call duration 
                                """;
                        System.out.print(callRegister);
                        System.out.println("lets talk ");
                        int call = input.nextInt();  
    
        switch(call) {
                   case 1: 
                     System.out.println(" Missed calls ");
                      break; 
                   case 2:
                        System.out.println(" Received calls");
                         break; 
                   case 3:     
                         System.out.println(" Dialled numbers  ");
                         break;   
                    case 4:
                          System.out.println("Erase recent call lists");
                         break;
                    case 5:
                           System.out.println("Erase recent call lists");
                         break;
                      default:
                           System.out.println("Show call duration"); 
  }
    
                String menuOptions = """
                                 Show call duration
                                1. Missed calls  
                                2. Received calls 
                                3. Dialled numbers
                                4. Erase recent call lists
                                5. Show call duration
                                6. Show call costs
                                7. Call cost setting
                                8. Prepaid
                                  """;
                        System.out.print(menuOptions);
                        System.out.println("Choose an option");
                        int choose = input.nextInt();  
            switch(choose) {
                       case 1:
                            System.out.println("Missed calls ");
                         break;
                       case 2:
                            System.out.println(" Received calls");
                         break;
                        case 3:
                            System.out.println("Dialled numbers");                        
                           break;
                        case 4:
                           System.out.println("Erase recent call lists");                        
                           break;
                        case 5:
                           System.out.println(" Show call duration");                       
                           break;
                            default:
                           System.out.println("Show call duration"); 
                          }
                 String durations = """
                          . Show call duration
                            1. Last call duration
                            2. All calls’ duration
                            3. Received calls’ duration
                            4. Dialled calls’ duration
                            5. Clear timers
                             """;
                        System.out.print(durations);
                        System.out.println("Choose an option");
                        int showCall = input.nextInt();
         switch(showCall) {
                         case 1:
                            System.out.println("Last call duration");
                         break; 
                         case 2:
                            System.out.println("All call's duration");
                         break;           
                         case 3:
                            System.out.println("Received call's duration");
                         break; 
                         case 4:
                            System.out.println("Dialled call's duration");
                         break; 
                         case 5:
                            System.out.println("Clear timers");
                           break;
                        case 6:
                             System.out.println("Show call costs"); 
                            break; 
                          default:
                             System.out.println("invalid keyword");
                         
             String cost = """
                            Show call costs

                            1. Last call cost
                            2. All calls’ cost
                            3. Clear counters
                            """;
                           System.out.print(cost);
                           System.out.println("Select an option");
                           int showCalls = input.nextInt();
       switch(showCalls) {                 
                         case 1:
                              System.out.println("Last call duration");
                         break; 
                         case 2:
                              System.out.println("All calls's cost ");
                         break; 
                         case 3:
                              System.out.println(" Clear conters");
                         break;  
                           default:
                             System.out.println("invalid keyword");
                         
                         case 7:
                              System.out.println(" Call cost settings");
                         break; 
                            
   }
                                   
                 String settings = """
                              Call cost settings
                                1. Call cost limit
                                2. Show costs in
                             """;
                           System.out.println(settings);
                           System.out.println("choose an option");
                           int callCosts = input.nextInt();  

        switch(callCosts){
                      case 1:
                        System.out.println(" Call cost limit");
                      break;   
                      case 2:
                        System.out.println("  Show costs in");
                      break;   
                      default:
                        System.out.println("  invalid trespassing");

                       case 8:
                         System.out.println(" Prepaid credit");
                         break;   
                        
                        
   }                        
 }
  //}

                    String Tones = """
                                     Tones
                                     1. Ringing tone
                                     2. Ringing volume
                                     3. Incoming call alert
                                     4. Composer
                                     5. Message alert tone
                                     6. Keypad tones
                                     7. Warning and game tones
                                     8. Vibrating alert
                                     9. Screen saver
                                    """;  
                           System.out.println(Tones);
                           System.out.println("Choose an option");
                           int ringing = input.nextInt();  

        switch(ringing){
                        case 1: 
                        System.out.println("Ringing tone ");
                         break;
                        case 2: 
                        System.out.println("Ringing volume ");
                         break;      
                        case 3: 
                        System.out.println("Incoming call alert");
                         break;
                         case 4: 
                        System.out.println("Composer");
                         break;
                         case 6: 
                        System.out.println(" Keypad tones ");
                         break;
                         case 7:
                        System.out.println("Warning and game tones");
                         break;        
                         case 8: 
                        System.out.println("Vibrating alert ");
                         break;      
                        case 9: 
                        System.out.println("Screen saver");
                         break;
                    default:
                        System.out.println("invalid");
 

}

              String redial = """
                        
                            Call settings
                    1. Automatic redial
                    2. Speed dialling
                    3. Call waiting options
                    4. Own number sending
                    5. Phone line in use
                    6. Automatic answer
                    """;
                System.out.println(redial) ; 
                System.out.println("Choose a option");
                int phoneLine = input.nextInt();
    switch(phoneLine){
                    case 1:
                        System.out.println("Automatic redial");
                        break;
                    case 2:
                         System.out.println(" Speed dialling ");
                        break;
                    case 3:
                         System.out.println(" Call waiting options ");
                        break; 
                    case 4:
                         System.out.println(" Own number sending  ");
                        break; 
                    case 5:
                         System.out.println(" Automatic answer   ");
                        break;  
                        default:
                            System.out.println("invalid");
    
            String automatic = """
                               Phone settings
                                1. Language
                                2. Cell info display
                                3. Welcome note 
                                4. Network selection
                                5. Lights 
                                6. Confirm SIM service actions 
                                """;

                            System.out.println(automatic);
                            System.out.println("choose an option");
                            int phoneSetting = input.nextInt();
        switch(phoneSetting){                            
                            case 1:
                               System.out.println("Language ");
                                break;  
                            case 2:
                                System.out.println(" Cell info display ");
                                break;          
                             case 3:
                                System.out.println("Welcome notes");
                                 break; 
                             case 4:
                                System.out.println(" Network selection");
                                 break;
                             case 5:
                                 System.out.println("Lights ");
                                break;
                             case 6:
                                  System.out.println(" Confirm SIM service actions ");
                               break;
                               default:
                                    System.out.println("invalid");

    }                         
                
}

                String security = """
                                 
                                 Security settings
                                1. PIN code request
                                2. Call barring service
                                3. Fixed dialling
                                4. Closed user group
                                5. Phone security
                                6. Change access codes
                                """;
                        
                            System.out.println(security);
                            System.out.println("choose an option");
                            int securitySetting = input.nextInt();
      
                        
        switch(securitySetting){
                              case 1:
                                System.out.println("PIN code request ");
                                break;
                              case 2:
                                System.out.println(" Call barring service");
                                 break; 
                              case 3:
                               System.out.println("Fixed dialling");
                                break; 
                              case 4:
                                   System.out.println("Closed user group");
                                break; 
                              case 5:
                                System.out.println("Phone security");
                                 break; 
                               case 6:
                                System.out.println("Change access codes");
                                 break; 
                                default:
                                  System.out.println("invalid");

               String restore = """
                               1. Restore factory setting
                                """;
                             System.out.println(restore);
                             System.out.println("Choose an option");
                             int factorySetting = input.nextInt();
        switch(factorySetting){  
                          case 1:
                             System.out.println("Change access codes");
                              break;
                            default:
                               System.out.println("invalid");

            

}
    }


                   String divert = """
                                 1.Call divert   
                                 """;
                             System.out.println(divert);
                             System.out.println("Choose an option");
                             int callDivert = input.nextInt();
         switch(callDivert){                                  
                          case 1:
                                 System.out.println("Change access codes");
                                 break;   
                                 default:
                                  System.out.println("invalid"); 
    
        }

                  String play = """  
                                1.Games
                                """;
                             System.out.println(play);
                             System.out.println("Choose an option");
                             int games = input.nextInt();
                        
         switch(games){                       
                      case 1:
                          System.out.println("Games");
                           break;  
                         default:
                             System.out.println("invalid");

 }      

                 String solve = """ 
                                 1.Calculator
                                """;
                             System.out.println(solve);
                             System.out.println("Choose an option");
                             int calculator = input.nextInt();
                        
        switch(calculator){
                        case 1:
                            System.out.println("Calculator");
                               break; 
  }

                String remember = """
                                1.Reminder
                               """;
                             System.out.println(remember);
                             System.out.println("Choose an option");
                             int remainder = input.nextInt();
                        
        switch(remainder){
                         case 1:
                            System.out.println("Calculator");
                              break;
 }

                String time = """
                                 Clock
                                1. Alarm clock
                                2. Clock settings
                                3. Date setting
                                4. Stopwatch
                                5. Countdown timer
                                6. Auto update of date and time
                                   """;
                             System.out.println(time);
                             System.out.println("Choose an option");
                             int clock = input.nextInt();
             switch(clock){
                             case 1:
                             System.out.println("Alarm clock");
                             break;
                            case 2:
                               System.out.println("Clock setting");
                            break;
                            case 3:
                               System.out.println("Date setting");
                              break;
                              case 4:
                              System.out.println("Stopwatch");
                              break;
                             case 5:
                            System.out.println("Countdown timer");
                              break;
                             case 6:
                            System.out.println(" Auto update of date and time");
                              break;
                             default:
                                    System.out.println("invalid");

    }


                    String name = """
                               profiles
                               """;
            
                               System.out.println(name);
                               
                     String network = """       
                                     SIM services
                                     """;
                                System.out.println(network);

























}




  }


 

 
   










































    
  

         
          
















    





















































































      
