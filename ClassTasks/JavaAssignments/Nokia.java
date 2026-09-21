import java.util.Scanner;

public class Nokia {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        boolean phone = true;

        while (phone == true) {
            System.out.print("""

            ===========================================
            -----------NOKIA 3310 MENU-----------------
            ===========================================
            1.  Phone book
            2.  Messages
            3.  Chat
            4.  Call register
            5.  Tones
            6.  Settings
            7.  Call divert
            8.  Music
            9.  Games
            10. Calculator
            11. Reminders
            12. Clock
            13. Profiles
            14. Services
            15. SIM services
            ===========================================
            --------TYPE THE NUMBER TO NAVIGATE--------
            ===========================================
            """);
            String mainMenu = scanner.nextLine();

            switch (mainMenu) {
                case "1" -> {
                    System.out.print("""
                    ====================================
                    -----------PHONE BOOK---------------
                    ====================================
                    1.  Search
                    2.  Service Nos.
                    3.  Add Name
                    4.  Erase
                    5.  Edit
                    6.  Copy
                    7.  Assign tone
                    8.  Send business card
                    9.  Options
                    10. Speed dials
                    11. Voice tags
                    ====================================
                    """);
                    String phoneBook = scanner.nextLine();

                    switch (phoneBook) {
                        case "9" -> {
                            System.out.print("""
                            ==================================
                            -------------OPTIONS--------------
                            ==================================
                            1.  Memory in use
                            2.  Type of view
                            3.  Memory status
                            ==================================
                            """);
                            String phoneBookOptions = scanner.nextLine();

                            switch (phoneBookOptions) {
                                default -> System.out.println("CANNOT NAVIGATE FURTHER");
                            }
                        }
                        default -> System.out.println("HINT: 9");
                    }
                }

                case "2" -> {
                    System.out.print("""
                    =================================
                    ------------MESSAGES-------------
                    =================================
                    1.  Write messages
                    2.  Inbox
                    3.  Outbox
                    4.  Picture messages
                    5.  Templates
                    6.  Smileys
                    7.  Message settings
                    8.  Info service
                    9.  Voice mailbox number
                    10. Service command editor
                    =================================
                    """);
                    String messages = scanner.nextLine();

                    switch (messages) {
                        case "7" -> {
                            System.out.print("""
                            ================================
                            --------MESSAGE SETTINGS--------
                            ================================
                            1.  Set
                            2.  Common
                            ================================
                            """);
                            String messageSettings = scanner.nextLine();

                            switch (messageSettings) {
                                case "1" -> {
                                    System.out.print("""
                                    =================================
                                    ---------------SET---------------
                                    =================================
                                    1.  Message centre number
                                    2.  Message sent as
                                    3.  Message validity
                                    =================================
                                    """);
                                    String messageSettingsSet = scanner.nextLine();

                                    switch (messageSettingsSet) {
                                        default -> System.out.println("CANNOT NAVIGATE FURTHER");
                                    }
                                }
                                case "2" -> {
                                    System.out.print("""
                                    =================================
                                    ------------COMMON---------------
                                    =================================
                                    1.  Delivery reports
                                    2.  Reply via same route
                                    3.  Character support
                                    =================================
                                    """);
                                    String messageSettingsCommon = scanner.nextLine();

                                    switch (messageSettingsCommon) {
                                        default -> System.out.println("CANNOT NAVIGATE FURTHER");
                                    }
                                }
                                default -> System.out.println("HINTS: 1 and 2");
                            }
                        }
                        default -> System.out.println("HINT: 7");
                    }
                }

                case "3" -> System.out.println("CANNOT NAVIGATE FURTHER");

                case "4" -> {
                    System.out.print("""
                    =================================
                    ---------CALL REGISTER-----------
                    =================================
                    1.  Missed calls
                    2.  Received calls
                    3.  Dialled numbers
                    4.  Erase recent call lists
                    5.  Show call duration
                    6.  Show call costs
                    7.  Call cost settings
                    8.  Prepaid credit
                    =================================
                    """);
                    String callRegister = scanner.nextLine();

                    switch (callRegister) {
                        case "5" -> {
                            System.out.print("""
                            ================================
                            -------SHOW CALL DURATION-------
                            ================================
                            1.  Last call duration
                            2.  All calls' duration
                            3.  Received calls' duration
                            4.  Dialled calls' duration
                            5.  Clear timers
                            ================================
                            """);
                            String showCallDuration = scanner.nextLine();

                            switch (showCallDuration) {
                                default -> System.out.println("CANNOT NAVIGATE FURTHER");
        }
                        }
                        case "6" -> {
                            System.out.print("""
                            ================================
                            ---------SHOW CALL COSTS--------
                            ================================
                            1.  Last call cost
                            2.  All calls' cost
                            3.  Clear counters
                            ================================
                            """);
                            String showCallCosts = scanner.nextLine();

                            switch (showCallCosts) {
                                default -> System.out.println("CANNOT NAVIGATE FURTHER");
                            }
                        }
                        case "7" -> {
                            System.out.print("""
                            ================================
                            --------CALL COST SETTINGS------
                            ================================
                            1.  Call cost limit
                            2.  Show costs in
                            ================================
                            """);
                            String callCostSettings = scanner.nextLine();

                            switch (callCostSettings) {
                                default -> System.out.println("CANNOT NAVIGATE FURTHER");
                            }
                }
                        default -> System.out.println("HINTS: 5, 6 and 7");
                    }
                }

                case "5" -> {
                    System.out.print("""
                    =================================
                    -------------TONES---------------
                    =================================
                    1.  Ringing tone
                    2.  Ringing volume
                    3.  Incoming call alert
                    4.  Message alert tone
                    5.  Keypad tones
                    6.  Warning tones
                    7.  Vibrating alert
                    8.  Screen saver
                    =================================
                    """);
                    String tones = scanner.nextLine();

                    switch (tones) {
                        default -> System.out.println("CANNOT NAVIGATE FURTHER");
                    }
                }

                case "6" -> {
                    System.out.print("""
                    =================================
                    ------------SETTINGS-------------
                    =================================
                    1.  Call settings
                    2.  Phone settings
                    3.  Security settings
                    4.  Restore factory settings
                    =================================
                    """);
                    String settings = scanner.nextLine();

                    switch (settings) {
                        case "1" -> {
                            System.out.print("""
                            ================================
                            ----------CALL SETTINGS---------
                            ================================
                            1.  Automatic redial
                            2.  Speed dialling
                            3.  Call waiting options
                            4.  Own number sending
                            5.  Phone line in use
                            6.  Automatic answer
                            ================================
                            """);
                            String callSettings = scanner.nextLine();

                            switch (callSettings) {
                                default -> System.out.println("CANNOT NAVIGATE FURTHER");
                            }
                        }
                        case "2" -> {
                            System.out.print("""
                            ================================
                            ----------PHONE SETTINGS--------
                            ================================
                            1.  Language
                            2.  Cell info display
                            3.  Welcome note
                            4.  Network selection
                            5.  Confirm SIM service actions
                            ================================
                            """);
                            String phoneSettings = scanner.nextLine();

                            switch (phoneSettings) {
                                default -> System.out.println("CANNOT NAVIGATE FURTHER");
                            }
                        }
                        case "3" -> {
                            System.out.print("""
                            ================================
                            --------SECURITY SETTINGS-------
                            ================================
                            1.  PIN code request
                            2.  Call barring service
                            3.  Fixed dialling
                            4.  Closed user group
                            5.  Security level
                            6.  Change access codes
                            ================================
                            """);
                            String securitySettings = scanner.nextLine();

                            switch (securitySettings) {
                                default -> System.out.println("CANNOT NAVIGATE FURTHER");
                            }
                        }
                        default -> System.out.println("HINTS: 1, 2 and 3");
                    }
                }

                case "7" -> System.out.println("CANNOT NAVIGATE FURTHER");

                case "8" -> {
                    System.out.print("""
                    =================================
                    -------------MUSIC---------------
                    =================================
                    1.  Music player
                    2.  Radio
                    3.  Recorder
                    4.  Track list
                    =================================
                    """);
                    String music = scanner.nextLine();

                    switch (music) {
                        default -> System.out.println("CANNOT NAVIGATE FURTHER");
                    }
                }

                case "9" -> System.out.println("CANNOT NAVIGATE FURTHER");

                case "10" -> System.out.println("CANNOT NAVIGATE FURTHER");

                case "11" -> System.out.println("CANNOT NAVIGATE FURTHER");

                case "12" -> {
                    System.out.print("""
                    =================================
                    -------------CLOCK---------------
                    =================================
                    1.  Alarm clock
                    2.  Clock settings
                    3.  Date settings
                    4.  Stopwatch
                    5.  Countdown timer
                    6.  Auto update of date and time
                    =================================
                    """);
                    String clock = scanner.nextLine();

                    switch (clock) {
                        default -> System.out.println("CANNOT NAVIGATE FURTHER");
                    }
                }

                case "13" -> System.out.println("CANNOT NAVIGATE FURTHER");

                case "14" -> System.out.println("CANNOT NAVIGATE FURTHER");

                case "15" -> System.out.println("CANNOT NAVIGATE FURTHER");

                default -> System.out.println("Invalid choice");
        }
    }
    }
}
