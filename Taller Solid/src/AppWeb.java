public class AppWeb {
    private DatabaseConnector databaseConnector;

    public AppWeb(DatabaseConnector databaseConnector) {
        this.databaseConnector = databaseConnector;
    }

    public void connectToDatabase() {
        databaseConnector.connect();
    }
}
