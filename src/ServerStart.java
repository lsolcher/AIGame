public class ServerStart {
	public static void main(String[] args) {
		//java -Djava.library.path=lib/native -jar bogapr.jar
		String[] arg = { "1200", "860", "5" };
		lenz.htw.bogapr.Server.main(arg);
	}
}
