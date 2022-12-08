package stackjava.design.pattern.behavior.observer;

import java.util.Arrays;

public class Application {
	public static void main(String[] args) {
		UserService fst = new UserService(new User("fst"));
		AdminService admin = new AdminService(new Admin("admin", Arrays.asList("all")));

		Logger logger = new Logger();
		Mailer mailer = new Mailer();

		fst.attach(logger);
		fst.changeUserName("ist");
		fst.detach(logger);
		fst.changeUserName("Le Xuan Hoa");

		admin.attach(logger);
		admin.attach(mailer);
		admin.login();
		admin.detach(mailer);
		admin.login();
	}
}
