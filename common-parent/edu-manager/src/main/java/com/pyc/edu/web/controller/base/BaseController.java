package com.pyc.edu.web.controller.base;

import java.lang.reflect.ParameterizedType;

public abstract class BaseController<T> {

    public static String MANAGE_PAGE;
    public static String INFO_PAGE;
    public static String EDIT_PAGE;

    public static final String MANAGE = "manage";
    public static final String INFO = "info";
    public static final String EDIT = "edit";

    public BaseController() {
        //获取完整对象名
        ParameterizedType type = (ParameterizedType) this.getClass().getGenericSuperclass();
        //获取T完整名字
        Class<?> modelClass = (Class<?>) type.getActualTypeArguments()[0];
        //获取T的名字  user manager...
        String moduleName = modelClass.getSimpleName().toLowerCase();

        MANAGE_PAGE = moduleName + "/" + MANAGE;
        INFO_PAGE = moduleName + "/" + INFO;
        EDIT_PAGE = moduleName + "/" + EDIT;
    }
}
