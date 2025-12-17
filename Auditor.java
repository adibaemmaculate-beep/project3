package auditor;

import java.util.List;

public class Auditor {

    public AuditResult audit(List<User> users, List<AccessRule> rules) {
        AuditResult result = new AuditResult();

        for (User user : users) {
            AccessRule rule = findRuleForRole(user.getRole(), rules);
            if (rule == null) {
                result.addViolation(
                        "User " + user.getName() +
                                " has undefined role: " + user.getRole()
                );
                continue;
            }

            for (String permission : user.getPermissions()) {
                if (!rule.getAllowedPermissions().contains(permission)) {
                    result.addViolation(
                            "User " + user.getName() +
                                    " has unauthorized permission: " + permission
                    );
                }
            }
        }

        return result;
    }

    private AccessRule findRuleForRole(String role, List<AccessRule> rules) {
        for (AccessRule rule : rules) {
            if (rule.getRole().equals(role)) {
                return rule;
            }
        }
        return null;
    }
}
