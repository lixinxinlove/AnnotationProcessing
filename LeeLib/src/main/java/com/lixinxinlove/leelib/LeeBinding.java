package com.lixinxinlove.leelib;

import android.app.Activity;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;

/**
 * @description:
 * @author: lixinxin
 * @date: 2019/4/18 11:21
 * @version: 1.0
 */
public class LeeBinding {

    public static void bind(Activity activity) {
        try {
            // new MainActivityBinding(activity);
            Class bindingClass = Class.forName(activity.getClass().getCanonicalName() + "$LeeBinding");
            Class activityClass = Class.forName(activity.getClass().getCanonicalName());
            Constructor constructor = bindingClass.getDeclaredConstructor(activityClass);
            constructor.newInstance(activity);
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        } catch (NoSuchMethodException e) {
            e.printStackTrace();
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        } catch (InstantiationException e) {
            e.printStackTrace();
        } catch (InvocationTargetException e) {
            e.printStackTrace();
        }
    }



}
