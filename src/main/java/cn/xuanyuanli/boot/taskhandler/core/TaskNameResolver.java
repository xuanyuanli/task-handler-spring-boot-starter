package cn.xuanyuanli.boot.taskhandler.core;

/**
 * @author xuanyuanli
 */
public abstract class TaskNameResolver {
    protected String body;

    public TaskNameResolver(String body) {
        this.body = body;
    }

    public abstract String getTaskName();

    public abstract String[] getTaskParam();

}
