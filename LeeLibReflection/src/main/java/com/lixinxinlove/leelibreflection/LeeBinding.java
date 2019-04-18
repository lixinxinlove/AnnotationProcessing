package com.lixinxinlove.leelibreflection;

import android.app.Activity;

import java.lang.reflect.Field;

/**
 * 通过反射实现依赖注入
 */
public class LeeBinding {
    public static void bind(Activity activity) {

        for (Field field : activity.getClass().getDeclaredFields()) {
            BindView bindView = field.getAnnotation(BindView.class);
            if (bindView != null) {
                try {
                    field.setAccessible(true);
                    field.set(activity, activity.findViewById(bindView.value()));
                } catch (IllegalAccessException e) {
                    e.printStackTrace();
                }
            }
        }
    }
}
