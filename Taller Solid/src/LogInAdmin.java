public class LogInAdmin extends LogIn {
    private boolean userIsAdmin;

    @Override
    public void log(User user) {
        this.userIsAdmin = verifyIfTheUserIsAdmin(user);
        if (userIsAdmin) {
            System.out.println("Has access to the website in admin mode");
            // Lógica adicional para inicio de sesión de administrador
        } else {
            // Lógica para inicio de sesión no administrador
        }
    }

    private boolean verifyIfTheUserIsAdmin(User user) {
        // Lógica para verificar si el usuario es administrador
        return true; // 
    }
}

