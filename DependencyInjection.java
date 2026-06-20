interface MessageService {
    void sendMessage();
}

class EmailService implements MessageService {

    public void sendMessage() {
       System.out.println("Sending email ");
    }
}

class UserController {
    private MessageService messageService;
    public UserController(MessageService messageService) {
        this.messageService = messageService;
    }
    public void registerUser(){
        messageService.sendMessage();
    }
}

class DependencyInjection {
    
    public static void main(String args[]) {
        MessageService emailMsg = new EmailService();
        UserController user =new UserController(emailMsg);

        user.registerUser();
    }
}