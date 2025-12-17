package auditor;

import java.util.List;
import java.util.Set;

public class Main {

    public static void main(String[] args) {
        List<User> users = List.of(
                new User("Alice", "ADMIN", Set.of("READ", "WRITE", "DELETE")),
                new User("Bob", "USER", Set.of("READ", "WRITE")),
                new User("Charlie", "USER", Set.of("READ", "DELETE"))
        );

        List<AccessRule> rules = List.of(
                new AccessRule("ADMIN", Set.of("READ", "WRITE", "DELETE")),
                new AccessRule("USER", Set.of("READ"))
        );

        Auditor auditor = new Auditor();
        AuditResult result = auditor.audit(users, rules);

        result.printReport();
    }
}
