package utils;

import java.util.Random;

public class ClassUtils {

    private static ClassUtils classUtils;
    private Random random = new Random();

    private ClassUtils() {}

    public static ClassUtils getInstance() {
        if(classUtils == null)
            classUtils = new ClassUtils();

        return classUtils;
    }

    public <T extends Enum<?>> T randomEnum(Class<T> clazz){
        return clazz.getEnumConstants()[random.nextInt(clazz.getEnumConstants().length)];
    }
}
