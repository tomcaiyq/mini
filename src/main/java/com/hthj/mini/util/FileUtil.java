package com.hthj.mini.util;

import java.util.UUID;

public class FileUtil {

    public static String getSuffix(String fileName) {
        return fileName.substring(fileName.lastIndexOf("."));
    }

    public static String getUUIDFileName() {
        return UUID.randomUUID().toString();
    }

    public static String genFileName(String name) {
        return getUUIDFileName() + getSuffix(name);
    }
    
}
