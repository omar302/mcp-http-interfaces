package dev.ot.todos_mcp_server;

public class TodoNotFoundException extends RuntimeException {

    public TodoNotFoundException(String path) {
        super("No todo found at " + path);
    }

}
