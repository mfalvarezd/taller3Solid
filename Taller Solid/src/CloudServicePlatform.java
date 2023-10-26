public class CloudServicePlatform {
	private CloudProvider cloudProvider;

    public CloudServicePlatform(CloudProvider cloudProvider) {
        this.cloudProvider = cloudProvider;
    }

    public void hostingTo(AppWeb app) {
        cloudProvider.host(app);
    }
}
