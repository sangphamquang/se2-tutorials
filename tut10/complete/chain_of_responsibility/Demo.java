package tuts.tut10.complete.chain_of_responsibility;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

import tuts.tut10.complete.chain_of_responsibility.middleware.Middleware;
import tuts.tut10.complete.chain_of_responsibility.middleware.RoleCheckMiddleware;
import tuts.tut10.complete.chain_of_responsibility.middleware.ThrottlingMiddleware;
import tuts.tut10.complete.chain_of_responsibility.middleware.UserExistsMiddleware;
import tuts.tut10.complete.chain_of_responsibility.server.Server;

/**
 * Demo class. Everything comes together here.
 */
public class Demo {

    private static BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
    private static Server server;

    private static void init() {
        server = new Server();
        //TO-DO: Register email & pass for 2 account types: admin & user
        server.register("admin@example.com", "1");
        server.register("user@example.com", "1");

        // All checks are linked. Client can build various chains using the same components.
        Middleware middleware = new ThrottlingMiddleware(2);
        middleware.linkWith(new UserExistsMiddleware(server))
                .linkWith(new RoleCheckMiddleware());

        // Server gets a chain from client code.
        server.setMiddleware(middleware);
    }

    public static void main(String[] args) throws IOException {
        init();

        boolean success = false;
        Server server = new Server();

        do {
            //TO-DO: Ask for email & password then save to suitable variables
            Scanner sc = new Scanner(System.in);
            System.out.println("Enter email: ");
            String email = sc.nextLine();
            System.out.println("Enter password: ");
            String password = sc.nextLine();
            sc.close();
            //TO-DO: Try to login to server with given email & password
            success = server.logIn(email, password);
        	//then store the result to variable 'success'

        } while (!success);
    }
}
