package runtimeexception39;

import exception38.LoginRequest;
import runtimeexception39.util.ValidationUtil;

public class RuntimeExcApp {
    public static void main(String[] args) {
        LoginRequest loginRequest = new LoginRequest(null,null);
        ValidationUtil.validateRuntime(loginRequest);
    }
}
