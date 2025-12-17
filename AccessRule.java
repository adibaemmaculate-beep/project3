package auditor;

import java.util.Set;

public class AccessRule {
    private final String role;
    private final Set<String> allowedPermissions;

    public AccessRule(String role, Set<String> allowedPermissions) {
        this.role = role;
        this.allowedPermissions = allowedPermissions;
    }

    public String getRole() {
        return role;
    }

    public Set<String> getAllowedPermissions() {
        return allowedPermissions;
    }
}
