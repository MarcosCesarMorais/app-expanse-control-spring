package br.com.mcm.app_expanse_control.utils;

import java.util.UUID;

public final class IdUtils {

    private IdUtils (){}

    public static String uuid() {
        return UUID.randomUUID().toString().toLowerCase().replace("-", "");
    }
}
