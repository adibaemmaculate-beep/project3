package auditor;

import java.util.Set;

public class User {
    private final String name;
    private final String role;
    private final Set<String> permissions;

    public User(String name, String role, Set<String> permissions) {
        this.name = name;
        this.role = role;
        this.permissions = permissions;
    }

    public String getName() {
        return name;
    }

    public String getRole() {
        return role;
    }

    public Set<String> getPermissions() {
        return permissions;
    }
}
