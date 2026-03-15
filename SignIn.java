



public void handleSignUp() {
    System.out.println("SIGN UP");
    
    

    String name = readString("Full Name: ");
    String email = readString("Email Address: ");
    String password = readString("Password: ");
    String phone = readString("Phone Number: ");

    
    boolean emailFound = false;
    for (int counter = 0; counter < userCount; counter++) {
        if (userEmails[counter].equalsIgnoreCase(email)) {
            emailFound = true;
        }
    }




    if (emailFound) {
        System.out.println("This email is already registered.");
        return;
    }

    
    userNames[userCount]     = name;
    userEmails[userCount]    = email;
    userPasswords[userCount] = password;
    userPhones[userCount]    = phone;
    userCount++;

    System.out.println("Account created! Please sign in.");
    
}


public void handleSignIn() {

    System.out.println("SIGN IN");

    String email    = readString("Email: ");
    String password = readString("Password: ");

    
    boolean loginSuccess = false;
    for (int counter = 0; counter < userCount; counter++) {
        if (userEmails[counter].equalsIgnoreCase(email) && userPasswords[counter].equals(password)) {
            currentUserIndex = counter;
            loginSuccess = true;
        }
    }

    if (loginSuccess) {
        System.out.println("Welcome, " + userNames[currentUserIndex] + "!");
    } else {
        System.out.println("Wrong email or password.");
    }
}


public void handleSignOut() {
    System.out.println("You have been signed out.");
    currentUserIndex = -1; 
}
