package me.gnat008.perworldinventory.permission;

public enum AdminPermission implements PermissionNode {

    CONVERT("perworldinventory.convert", DefaultPermission.OP_ONLY),

    NOTIFY("perworldinventory.notify", DefaultPermission.OP_ONLY),

    RELOAD("perworldinventory.reload", DefaultPermission.OP_ONLY),

    SETDEFAULTS("perworldinventory.setdefaults", DefaultPermission.OP_ONLY);

    private String node;
    private DefaultPermission defaultPermission;

    AdminPermission(String node, DefaultPermission defaultPermission) {
        this.node = node;
        this.defaultPermission = defaultPermission;
    }


    @Override
    public String getNode() {
        return this.node;
    }

    @Override
    public DefaultPermission getDefaultPermission() {
        return this.defaultPermission;
    }
}
