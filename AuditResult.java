package auditor;

import java.util.ArrayList;
import java.util.List;

public class AuditResult {
    private final List<String> violations = new ArrayList<>();

    public void addViolation(String violation) {
        violations.add(violation);
    }

    public boolean hasViolations() {
        return !violations.isEmpty();
    }

    public void printReport() {
        System.out.println("Access Control Audit Report");
        System.out.println("----------------------------");

        if (!hasViolations()) {
            System.out.println("No violations found.");
            return;
        }

        for (String violation : violations) {
            System.out.println(violation);
        }
    }
}
